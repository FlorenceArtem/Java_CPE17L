import java.util.Scanner;
public class case3_ifelse {

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
        float price = 0;

        if (code.equals("TS") || code.equals("ts")){
  System.out.println("Item Name: Tshirt");
  System.out.print("Size: ");
String size = obj.next();
  if (size.equals("Lrg") || size.equals("lrg")){
     price = 350;
  }  else if (size.equals("Med") || size.equals("med")){
    price = 300;
  }
}
else if (code.equals("ST") || code.equals("st")){
  System.out.println("Item Name: Shorts");
  System.out.print("Size: ");
String size = obj.next();
  if (size.equals("Lrg") || size.equals("lrg")){
    price = 250;
  }  else if (size.equals("Med") || size.equals("med")){
    price = 200;
  }
}
else if (code.equals("BG") || code.equals("bg")){
  System.out.println("Item Name: Bag");
  System.out.print("Size: ");
String size = obj.next();
  if (size.equals("Lrg") || size.equals("lrg")){
    price = 400;
  }  else if (size.equals("Med") || size.equals("med")){
    price = 300;
  }
}
else if (code.equals("CP") || code.equals("cp")){
  System.out.println("Item Name: Cap");
  System.out.print("Size: ");
String size = obj.next();
  if (size.equals("Lrg") || size.equals("lrg")){
    price = 150;
  }  else if (size.equals("Med") || size.equals("med")){
    price = 100;
  }
}
else {
  System.out.println("Unsupported code :(");
}

System.out.println("Item price: "+ price);
        System.out.print("QTY: ");
        int qty = obj.nextInt();
        float amt = qty * price;
    System.out.println("Amt purchase: " + amt);
        System.out.print("Amt paid: ");
        float pay = obj.nextFloat();
        float change = 0;


        if(pay >= amt){
            change = pay - amt;
        } else {
            System.out.println("Insufficient amount :(");
        }
        System.out.println("Change: "+ change);
}
}