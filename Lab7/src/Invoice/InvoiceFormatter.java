package Invoice;


/**
 * Created by Brandon Kirklen on 5/26/2015.
 */
public class InvoiceFormatter {
    private Invoice anInvoice;

    public InvoiceFormatter(Invoice newInvoice){
        anInvoice=newInvoice;
    }

    public String format(){
        String output;
        output = "                     I N V O I C E\n";
        output += "\n";
        output += anInvoice.getAddress();
        output += "\n\n";
        output += String.format("\n%-30s%6s%6s%10s\n", "Description", "Price", "Qty", "Total");
        output += anInvoice.getItems();

        output += String.format("\n" + "AMOUNT DUE: $  " + anInvoice.getAmountDue());
        return output;
    }
}
