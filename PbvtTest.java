
public class PbvtTest
{
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		swap(a,b);
		/*As java is pass by value. A copy of a will be created and 
		modifications will happen on that copy not on the original a value.
		The scope of a declared inside the function will remain inside the 
		function not on the whole program*/
		System.out.print("a = "+a+", b = "+b);
	
	}
static	void swap(int c, int d){
	    c = c+d;
	    d = c-d;
	    c = c-d;
	    System.out.println("c = "+c+", d = "+d);
	    
	}
}
