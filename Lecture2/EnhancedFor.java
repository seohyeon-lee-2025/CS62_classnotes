/**
 * Illustration of the enhanced for flow
 * @author https://docs.oracle.com/javase/tutorial/java/nutsandbolts/for.html
 *
 */
public class EnhancedFor {
    public static void main(String[] args){
         int[] numbers = 
             {1,2,3,4,5,6,7,8,9,10};
        String[] cs62= {"Seohyeon", "Arsum", "Abrar"};

         for (int item : numbers) {
             System.out.println("Count is: " + item);
         }

         for(String person: cs62) { //like python for item in iterable
            System.out.println(person + " is taking CS62 and is in p-fraud");
         }
    }
}