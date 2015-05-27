package Invoice;

import java.util.ArrayList;

/**
 * Created by Brandon Kirklen on 5/26/2015.
 */
public class Invoice {

    private Address billingAddress;
    private ArrayList<LineItem> items = new ArrayList<>();

    public Invoice(Address billingAddress){
        this.billingAddress = billingAddress;
    }

    public void add(Product newProduct, int quantity){
        LineItem newLineItem = new LineItem(newProduct, quantity);
        items.add(newLineItem);
    }

    public double getAmountDue(){
        double amountDue =0;
        for (LineItem item : items){
            amountDue += item.getTotalPrice();
        }
        return amountDue;
    }

    public String getAddress(){
        return billingAddress.format();
    }

    public String getItems(){
        String itemList = "";
        for (LineItem item : items){
            itemList += item.format() + "\n";
        }
        return itemList;
    }
}
