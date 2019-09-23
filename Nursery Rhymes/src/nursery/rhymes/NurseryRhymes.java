/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nursery.rhymes;

/**
 *
 * @author mlarrubia
 */
public class NurseryRhymes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //farm("cow", "moo");
        //farm("duck", "quack");        
        // TODO: add another animal to the farm here
        hickory_dickory(1);
        hickory_dickory(2);
        // TODO: make the clock strike three here
        
        // TODO: call your new methods here ( you must write them first! ) 
        
        
    }
    
    
    
    
    
    
    
    public static void farm(String animal, String sound){
        System.out.println("Old MacDonald had a farm, E-I-E-I-O" );
        System.out.println("and on his farm he had a " + animal + ", E-I-E-I-O");
        System.out.println("With a " + sound + "-" + sound + "here and a " + sound + "-" + sound + "there");
        System.out.println("Here a " + sound );
        System.out.println("There a " + sound );
        System.out.println("Everywhere" + sound + "-" + sound);
        System.out.println("Old MacDonald had a farm, E-I-E-I-O" );
    }
    
    public static void monkeys(int number){
        
        while (number > 0){
          System.out.println(number + " little mokeys jumping on the bed");
          System.out.println( "One fell off and bumped his head");
          System.out.println( "Mama called the doctor, the doctor said");
          System.out.println( "\"No more mokeys jumping on the bed\"");
          number -= 1;
        }
    }
    
    public static void hickory_dickory(int time){
        while (time < 13){
            System.out.println("Hickory dickory dock");
            System.out.println("The mouse ran up the clock");
            System.out.println("The clock struck" + time);
            System.out.println("The mouse ran down");
            System.out.println("Hickory dickory dock");
            time += 1;
        }
    }
    
    // TODO add your new methods here
    
    public static void milk(int a){
    
        while (a > 0){
          System.out.println(a + "bottles of milk on the wall");
          System.out.println(a + "bottles of milk");
          System.out.println("Take one down, pass it around"); 
          a -= 1;
          
        }
    }
}
    