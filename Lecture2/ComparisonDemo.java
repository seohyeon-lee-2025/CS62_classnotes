/**
 * Illustration of the equality/relational operators
 * @author https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op1.html
 *
 */
public class ComparisonDemo {

    public static void main(String[] args){
        int value1 = 1;
        int value2 = 2;
        int value3 = 1;

        int[] intArr = {1,2,1};
        int[] yourArr = {45, 67, 89};
        intArr = yourArr;
        System.out.println(intArr[0]);
        int[] yeah = new int[3];
        yeah = yourArr;
        yeah[1] = 5890;

        if(value1 == value2)
            System.out.println("value1 == value2");
        if(value1 != value2)
            System.out.println("value1 != value2");
        if(value1 > value2)
            System.out.println("value1 > value2");
        if(value1 < value2)
            System.out.println("value1 < value2");
        if(value1 <= value2)
            System.out.println("value1 <= value2");

        System.out.println(value1==value3);
        System.out.println(intArr.equals(yeah));
        System.out.println(intArr[1]);

    }
}
