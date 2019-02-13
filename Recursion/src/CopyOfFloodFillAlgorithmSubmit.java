import java.util.LinkedList;
import java.util.Queue;


public class CopyOfFloodFillAlgorithmSubmit {
	static final int [][] arr = {
		{2, 1, 1, 1, 1, 1, 1, 1},
		{1, 1, 1, 1, 1, 1, 0, 0},
		{1, 0, 0, 1, 1, 0, 1, 1},
		{1, 2, 2, 2, 2, 0, 1, 0},
		{1, 1, 1, 2, 2, 0, 1, 0},
		{1, 1, 1, 2, 2, 2, 2, 0},
		{1, 1, 1, 1, 1, 2, 1, 1},
		{1, 1, 1, 1, 1, 2, 2, 1},
	    };
	
	public static void main(String[] args) {
		
		changeColor(3,1,3,arr[3][1]);
		print();
						
	}
	static void print(){
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}//j
		System.out.println();
	}
	static class Element{
		int x;
		int y;
		
		public Element(int x, int y){
			this.x = x;
			this.y = y;
		}
	}//Element
	
	public static boolean isValid(int x, int y){
		return (x>=0 && y>=0 && x<arr.length && y<arr[0].length);
	}
	
	private static void changeColor(int x, int y, int k, int currentColor) {

		
		arr[x][y] = k;
		
		//left
		if(isValid(x,y-1) && arr[x][y-1] == currentColor){
			arr[x][y-1] = k;
			System.out.println("left : ");
			print();
			changeColor(x, y-1, k, currentColor);
		}
		
		//right
		if(isValid(x,y+1) && arr[x][y+1] == currentColor){
			arr[x][y+1] = k;
			System.out.println("right : ");
			print();
			changeColor(x, y+1, k, currentColor);
		}

		//up
		if(isValid(x-1,y) && arr[x-1][y] == currentColor){
			arr[x-1][y] = k;
			System.out.println("up : ");
			print();
			changeColor(x-1, y, k, currentColor);
		}
		
		//down
		if(isValid(x+1,y) && arr[x+1][y] == currentColor){
			arr[x+1][y] = k;
			System.out.println("down : ");
			print();
			changeColor(x+1, y, k, currentColor);
		}		
		
		return;
	}//changeColor

}
