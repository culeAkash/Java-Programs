
public class StringToInt {

	public static void main(String[] args) {
		String s= "1234";
		int sum=0;
		int output = string_to_int(s,sum);
		System.out.println(output);

	}
	
	public static int  string_to_int(String s,int sum)
	{
		if(s.length()<=1)
		{if(s.length()==0)
		{
			return 0;
		}
			return (sum*10)+s.charAt(0);
		}
		
		int smallAns= string_to_int(s.substring(1),sum);
		sum= (sum*10)+(s.charAt(0)*10*(s.length()-1))+smallAns;
		return sum;
		
	}
	

}
