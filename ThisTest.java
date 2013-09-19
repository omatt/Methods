
/**
 * Another sample of using the "this" keyword.
 * 
 * @author Reyes, Omar Matthew
 * @version 2013/09/17
 */
public class ThisTest{
    private int num;
    public ThisTest(){
        this(42);   // Calls the other constructor.
    }
    public ThisTest(int num){
        this.num = num; 
        // Assigns the value of the parameter "num" 
        // to the field of the same name.
    }
    public void frobnicate(){
        int num = 1;
        
        System.out.println(num);        // Refers to the local variable num
        System.out.println(this.num);   // Refers to the field num
        System.out.println(this);       // Refers to this entire object
    }
    public String toString(){
        return "ThisTest num = " + num; // Refers to the field num
    }
}
