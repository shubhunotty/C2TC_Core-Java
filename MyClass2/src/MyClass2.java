public class MyClass2 {

	public static void main(String[] args) {
		try {
			String arr[] = new String[10];
			arr = null;
			arr[0] = "one";
			System.out.println(arr[0]);
		}
	catch(Exception ex)
		{
		System.out.println("exception");
		}
catch(NullPointerException nex)
		{
		System.out.println("null pointer exception");
		
	}
		
	}
	
}
