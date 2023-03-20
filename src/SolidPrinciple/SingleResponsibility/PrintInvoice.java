package SolidPrinciple.SingleResponsibility;

public class PrintInvoice {
    private Invoice invoice;
    PrintInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    void printReceipt() {
        System.out.println("[Printing Invoice details] :: Invoice cost for Marker is $"+this.invoice.calculateTotal());
    }
}
