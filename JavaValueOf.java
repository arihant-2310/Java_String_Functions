import java.io.*;
class JavaValueOf
{
public static void main( String[] ar )
{
	String val = String.valueOf(10);
	System.out.println("Value of 10:"+val);
	int empID = 1534; 
	String myString = String.valueOf(empID); 
	System.out.println(val + myString);
}
}