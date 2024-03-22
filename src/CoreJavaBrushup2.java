import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushup2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr2 = {1,2,4,5,6,7,8,10,20,122};
		
		//Even #
		for (int i =0; i<arr2.length; i++)
		{
			if(arr2[i] % 2 == 0)
			{
				System.out.println(arr2[i]);
				break;
				
			}
			else
			{
				System.out.println(arr2[i] + " is not multiple of 2");
			}
		}
		
		//create object of the class - object.method
		//Store String value
		ArrayList<String> a = new ArrayList<String>();
		a.add("Sylvia");
		a.add("Sundoro");
		
		//Call index
		System.out.println(a.get(1));
		
		for(int i=0; i<a.size(); i++)
		{
			System.out.println(a.get(i));
		}
		System.out.println("**********");
		for(String val: a)
		{
			System.out.println(val);
		}	
		
		//item is present in ArrayList
		System.out.println(a.contains("selenium"));
		
		
		String [] name = {"Sylvia","Sundoro","Selenium-java"};
		List<String> nameArrayList = Arrays.asList(name);
		
		System.out.println(nameArrayList.get(1));
		System.out.println(nameArrayList.contains("selenium"));
		
		
		
	}


}


