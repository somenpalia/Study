import java.util.*;

public class BoxStacking {

	static Scanner scan = new Scanner(System.in);
	static ArrayList<Box> list = new ArrayList<Box>();
	
	static class Box implements Comparable{
		int length;
		int width;
		int height;
		int area;
	
		Box(int length, int width, int height){
			this.length = length;
			this.width = width;
			this.height = height;
			
			this.area = length*width;
			
			
		}
		
		public void BoxUtil() {
			ArrayList<Box> permutationList = new ArrayList<>();
			int arr[] = {length,width,height};
			permutation(arr,0,2,permutationList);
			
			System.out.println("permutaionList : " + permutationList);
			for (Box b : permutationList) {
				if(b.length >= b.width){
					list.add(b);
				}
			}
			
		}//BoxUtil
		
		 public void permutation(int [] arr, int startIndex , int endIndex, ArrayList<Box> list){
			 
			 if(startIndex == endIndex){
				 list.add(new Box(arr[0],arr[1],arr[2]));
			 }//if
			 
			 for (int i = startIndex; i <= endIndex; i++) {
				
				swap(arr, startIndex, i );
				permutation(arr,startIndex+1,endIndex,list);
				swap(arr, startIndex, i);
			}
			 
		 }//permutation

		private void swap(int[] arr, int startIndex, int i) {
			
			int temp = arr[startIndex];
			arr[startIndex] = arr[i];
			arr[i] = temp;
			
		}

		@Override
		public String toString(){
			return "\nLength : " + length + " Width : " + width + " Height : " + height + "\n";
		}
		
		@Override
		public int compareTo(Object o){
			Box b = (Box) o;
			
			if(this.area > b.area)
				return -1;
			else if(this.area < b.area)
				return 1;
			else
				return 0;
			
			
		}
	}//box

	public static void main(String[] args) {

		System.out.println("Enter no of boxes : ");
		int noOfBoxes = scan.nextInt();
		

		
		
		for (int i = 0; i < noOfBoxes; i++) {
			int length = scan.nextInt();
			int width = scan.nextInt();
			int height = scan.nextInt();
			
			new Box(length,width,height).BoxUtil();
			
		}//j
		
		Collections.sort(list);
		System.out.println();
		System.out.println("list : " + list);
		
		Integer height[] = new Integer[list.size()];
		Integer result[] = new Integer[list.size()];
		
		for(int i = 0; i < list.size() ; i++){
			height[i] = list.get(i).height;
			result[i] = i;
		}
		
		lis(height,result,list);
 
	}//main

	private static void lis(Integer[] height, Integer[] result, ArrayList<Box> list) {
		Integer temp[] = new Integer[height.length];
		
		for (int i = 0; i < temp.length; i++) {
			temp[i] = height[i];
		}
		for (int i = 1; i < height.length; i++) {
			for (int j = 0; j < i; j++) {
				if(list.get(i).length < list.get(j).length && 
				   list.get(i).width < list.get(j).width){
					
					height[i] = Math.max(height[i], height[j]+temp[i]);
					result[i] = j;
				}//if
			}//j
		}//i
		
		System.out.println();
		System.out.println("height[] : " + Arrays.toString(height));
		System.out.println("result[] : " + Arrays.toString(result));
		System.out.println("Max height : " + Collections.max(Arrays.asList(height)));
		System.out.println("Total boxes : " + Collections.max(Arrays.asList(result)));
		
	}
}//class