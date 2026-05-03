import java.util.Scanner;
public class case3 {

    public static void main(String[] args) {
        
        System.out.println("""
                                Item Price
        Item code   Item Name   Med     Lrg
        TS          TShirt      300     350
        ST          Shorts      200     250
        CP          Cap         100     150
        BG          Bag         300     400""");
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Code: ");
        String code = obj.nextLine();
        float price  =  0;
        switch(code){
            case "TS":
                System.out.println("Item name: Tshirt");
                System.out.print("Size: ");
                code = obj.next();
                switch (code){
                    case "Lrg":
                        price = 350;
                        break;
                    case "Med":
                        price = 300;
                        break;
                    default:
                        System.out.println("Invalid code.");
                        break;
                }
                break;  
            case "ST":
                System.out.println("Item name: Shorts");
                System.out.print("Size: ");
                code = obj.next();
                switch (code){
                    case "Lrg":
                        price = 250;
                        break;
                    case "Med":
                        price = 200;
                        break;
                    default:
                        System.out.println("Invalid code.");
                        break;
                }
                break; 
            case "CP":
                System.out.println("Item name: Cap");
                System.out.print("Size: ");
                code = obj.next();
                switch (code){
                    case "Lrg":
                        price = 150;
                        break;
                    case "Med":
                        price = 100;
                        break;
                    default:
                        System.out.println("Invalid code.");
                        break;
                }
                break; 
            case "BG":
                System.out.println("Item name: Bag");
                System.out.print("Size: ");
                code = obj.next();
                switch (code){
                    case "Lrg":
                        price = 400;
                        break;
                    case "Med":
                        price = 300;
                        break;
                    default:
                        System.out.println("Invalid code.");
                        break;
                }
                break; 
            default:
                System.out.println("Invalid code");
                break; 
        } 
        System.out.println("Item price: "+ price);
        System.out.print("QTY: ");
        int qty = obj.nextInt();
        float amt = qty * price;
        System.out.println("Amt purchase: " + amt);
        System.out.print("Amt paid: ");
        float pay = obj.nextInt();
        float change = 0;


        if(pay >= amt){
            change = pay - amt;
        } else {
            System.out.println("Insufficient amount :(");
        }
        System.out.println("Change: "+ change);
    }
}
