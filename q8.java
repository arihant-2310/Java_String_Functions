// equals and equalsIgnorecase()
public class q8
{
	public static void main(String args[])
	{
		String s="hello";
		if(s.equals("HELLO"))
		{
	    	System.out.println("compare with s.equals() Return True");
		}
		else
		{
	    	System.out.println("compare with s.equals() Return False");
		}
		
		
		if(s.equalsIgnoreCase("HELLO"))
		{
    		System.out.println("compare with s.equalIngoreCase() Return True");
		}
		else
		{
    		System.out.println("compare with s.equalIgnoreCase Return False");
		}
	}
}
