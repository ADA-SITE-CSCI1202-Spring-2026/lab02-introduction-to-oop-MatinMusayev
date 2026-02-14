package week03.invoice;

public class InvoiceTest {

    public static void main(String[] args) {

        Invoice obj=new Invoice("P1000000", "Keyboard", 3, 25.5);
        System.out.println("Part number: "+obj.getPartNumber());
        System.out.println("Description: "+obj.getPartDescription());
        System.out.println("Quantity: "+obj.getQuantity());
        System.out.println("Price: "+obj.getPricePerItem());
        System.out.println("Total amount: "+obj.getInvoiceAmount());

        Invoice obj2 = new Invoice("P200", "Mouse", -5, -10);

        System.out.println("\nSecond invoice test:");
        System.out.println("Quantity: "+obj2.getQuantity());
        System.out.println("Price: "+obj2.getPricePerItem());
        System.out.println("Total amount: "+obj2.getInvoiceAmount());
    }
}
