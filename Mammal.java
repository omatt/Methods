
/**
 * Sample of using implementing an interface.
 * 
 * @author Reyes, Omar Matthew B.
 * @version 2013/09/17
 */
public class Mammal implements AnimalInterfaceSample{
    public void eat(){
        System.out.println("Mammal eats.");
    }
    public void travel(){
        System.out.println("Mammal travels.");
    }
    public int numOfLegs(){
        int legs = 4;
        return legs;
    }
    public static void main(String [] args){
        Mammal mml = new Mammal();
        mml.eat();
        mml.travel();
        System.out.println("Number of legs: "+mml.numOfLegs());
    }
}
