
public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodsDemo d = new MethodsDemo();
		String name = d.getData();
		getData2();
		System.out.println(name);
		MethodsDemo2 d1 = new MethodsDemo2();
		d1.getUserData();
		

	}
	
	//This Method is run on demand
	public String getData()
	{
		System.out.println("hello world");
		System.out.println("hello world1");
		System.out.println("hello world2");
		//feree
		System.out.println("hello world");
		System.out.println("hello world1");
		System.out.println("hello world2");
		return "Sylvia";
		
	}
	public static  String getData2()
	{
		System.out.println("hello world2");
		System.out.println("hello world2");
		System.out.println("hello world2");
		System.out.println("hello world2");
		return "Sylvia";
		
	}

}
