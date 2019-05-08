//3. to string
class Student { 
    String name; 
    int age; 
    String college; 
    String course; 
    String address; 
   Student 
    (String nm, int ag, String colg, String cou, String add) 
    { 
        name = nm; 
        age = ag; 
        college = colg; 
        course = cou; 
        address = add; 
    } 
public String toString() 
    { 
        return name + " " + age + " " + college + " " + course + " " + address; 
    } 
    
 }

public class q3{

public static void main(String[] args) 
    { 
        Student b =  new Student("Arihant", 22, "MITS", "Btech", "Kochi"); 
        System.out.println(b); 
        System.out.println(b.toString()); 
    } 
} 

