
/**
 * Write a description of class SubclassSample here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SubclassSample extends SuperclassSample{
    public void printSubMethod(){
        // printMethod() from the super class should be declared as public to be accessed.
        super.printSuperMethod();    // Invokes printMethod from SuperclassSample.
        System.out.println("Printed from Subclass");
    }
    public static void main (String [] args){
        SubclassSample sub = new SubclassSample();  // Instantiate SubclassSample.
        sub.printSubMethod();  // Invoke printMethod from this class.
    }
}
