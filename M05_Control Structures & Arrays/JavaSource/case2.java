import java.util.Scanner;
public class case2 {

    public static void main(String[] args) {
        System.out.println("""
        ***MATH***
        [1] ADD
        [2] SUB
        [3] MUL
        [4] DIV""");
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter code: ");
        String code = obj.next();
        int a = 0;
        int b = 0;
        switch(code){
            case "1":
                System.out.println("Math operation: Addition");
                System.out.print("Enter first integer: ");
                a = obj.nextInt();
                System.out.print("Enter second integer: ");
                b = obj.nextInt(); 
                System.out.println("Result = " + (a + b));
                break;
            case "2":
                System.out.println("Math operation: Subtraction");
                System.out.print("Enter first integer: ");
                a = obj.nextInt();
                System.out.print("Enter second integer: ");
                b = obj.nextInt(); 
                System.out.println("Result = " + (a - b));
                break;
            case "3":
                System.out.println("Math operation: Multiplication");
                System.out.print("Enter first integer: ");
                a = obj.nextInt();
                System.out.print("Enter second integer: ");
                b = obj.nextInt(); 
                System.out.println("Result = " + (a * b));
                break;
            case "4":
                System.out.println("Math operation: Division");
                System.out.print("Enter first integer: ");
                a = obj.nextInt();
                System.out.print("Enter second integer: ");
                b = obj.nextInt(); 
                System.out.println("Result = " + (a / b));
                break;
            default:
                System.out.println("Invalid code.");
                break;
    }
}
}