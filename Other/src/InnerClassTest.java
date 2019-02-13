import java.util.*;

class Foo{
	
	class Demo{
		
	}
	
}
public class InnerClassTest {
	static Scanner scan = new Scanner(System.in);

	public static void main(String args[]) {
		Foo foo = new Foo();
		 //foo.Demo d =  new foo.Demo();
		Foo.Demo d = foo.new Demo();
		
		System.out.println(d);
	}//main

}
