
/**
 * Invoke methods from ThisSample and ThisTest class,
 * 
 * @author Reyes, Omar Matthew B.
 * @version 2013/09/17
 */
public class AccessThisSample
{
    public static void main (String [] args){
        System.out.println("ThisSample result:");
        ThisSample th = new ThisSample();
        th.Assign(2,5);
        System.out.println("Value of x from ThisSample: " + th.getX()
            + "\nValue of y from ThisSample: " + th.getY());
            
        System.out.println("\nThisTest result:");
        ThisTest thtest = new ThisTest();   // Instantiate ThisTest class
        thtest.frobnicate();                // Invoke frobnicate method
    }
}
