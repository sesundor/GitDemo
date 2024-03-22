
public class CoreJavaBrushUp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//string is an object // String literal
		//String s = "Sylvia Academy";
		String s1 = "Sylvia Academy";
				
		
		//new memory alocate operator
		String s2 = new String("Welcome");
		String s3 = new String("Welcome");
		
		String s = "Sylvia Academy School";
		//Split" " become an Array
		String[] splittedString = s.split(" ");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[2]);
		
		//Split Academy will left empty on the from need to be trim
		String[] splitAcademy = s.split("Academy");
		System.out.println(splitAcademy[0]);
		System.out.println(splitAcademy[1]);
		System.out.println(splitAcademy[1].trim());
		
		//Print each char 
		for(int i=0; i<s.length(); i++)
		{
			System.out.println(s.charAt(i));
		}
		
		
		//Print each char from reverse
		for(int i=s.length()-1; i>=0; i--)
		{
			System.out.println(s.charAt(i));
		}
			
			
		

	}

}
