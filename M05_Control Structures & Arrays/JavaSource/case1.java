import java.util.Scanner;

public class case1 {

    public static void main(String[] args) {
        System.out.println("""
        Item Code           Item Name \n
        AP                  Apple\n
        BN                  Banana\n
        CH                  Cherry""");
        System.out.print("Enter Code: ");
        
        Scanner obj = new Scanner(System.in);
        String code = obj.next();

        switch(code){
            case "AP":
                System.out.println("Item name: Apple.");
                break;
            case "BN":
                System.out.println("Item name: Banana.");
                break;
            case "CH":
                System.out.println("Item name: Cherry.");
                break;
            default:
                System.out.println("Invalid code.");
                break;
        }
    }
}