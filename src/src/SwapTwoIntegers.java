import java.util.Scanner;
//Swapping two integers without using a temporary variable.
public class SwapTwoIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int integerOne = sc.nextInt();
        int integerTwo = sc.nextInt();
        System.out.println("IntegerOne = " + integerOne + " IntegerTwo = " + integerTwo);
        integerOne = integerOne + integerTwo;
        integerTwo = integerOne - integerTwo;
        integerOne = integerOne - integerTwo;

        System.out.println("IntegerOne = " + integerOne + " IntegerTwo = " + integerTwo);
    }


}
