//getChars()
public class q5 { 
    public static void main(String args[]) 
    { 
        String str = "Hello how are you"; 

        char[] destArray = new char[20]; 
        try { 
            str.getChars(0, 5, destArray, 0); 
            System.out.println(destArray); 
        } 
        catch (Exception ex) { 
            System.out.println(ex); 
        } 
    } 
} 

