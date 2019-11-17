package group06;

public class NumbersOdd_Even_Method {

    public static void main(String[] args) {
	// write your code here

        //NumbersOdd_Even_Method obj = new NumbersOdd_Even_Method();
       // String str = obj.OddOrEven(10);
       String str  = OddOrEven (10);

        System.out.println(str);

    }

    public static String OddOrEven(int a){

        // with Ternary way
        //return a % 2 == 0 ? "Even":"Odd";

        //With if statement way
        if (a%2==0)
            return "Even";
        else
            return "Odd";


    }
}
