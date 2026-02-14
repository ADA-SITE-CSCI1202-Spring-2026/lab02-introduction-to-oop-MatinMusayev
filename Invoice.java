package week03.invoice;

public class Invoice {

    String partNumber;
    String partDescription;
    int quantity;
    double pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {

        this.partNumber=partNumber;
        this.partDescription=partDescription;

        if (quantity>0) {
            this.quantity=quantity;
        } else {
            this.quantity=0;
        }

        if (pricePerItem>0) {
            this.pricePerItem=pricePerItem;
        } else {
            this.pricePerItem=0.0;
        }
    }

    public void setPartNumber(String partNumber) {
        this.partNumber=partNumber;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription=partDescription;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setQuantity(int quantity) {
        if (quantity>0) {
            this.quantity=quantity;
        } else {
            this.quantity=0;
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPricePerItem(double pricePerItem) {
        if (pricePerItem>0) {
            this.pricePerItem=pricePerItem;
        } else {
            this.pricePerItem=0.0;
        }
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public double getInvoiceAmount() {
        double total=quantity * pricePerItem;
        return total;
    }
}
