package Phone;

/**
 * Created by Brandon Kirklen on 5/26/2015.
 *  A table for lookups and reverse lookups
 */
import java.util.ArrayList;
import java.util.Scanner;

public class LookupTable {
    ArrayList<Item> phoneEntries = new ArrayList<>();
    /**
     Constructs a LookupTable object.
     */
    public LookupTable(){

    }

    /**
     Reads key/value pairs.
     @param in the scanner for reading the input
     */
    public void read(Scanner in){
        while (in.hasNextLine()) {
            String name = in.nextLine();
            String numberString = in.nextLine();
            numberString = numberString.replace("-","");
            int number = Integer.parseInt(numberString);
            Item newItem = new Item(name, number);
            phoneEntries.add(newItem);
        }
        in.close();
    }

    /**
     Looks up an item in the table.
     @param k the key to find
     @return the value with the given key, or null if no
     such item was found.
     */
    public String lookup(String k){
        Integer phoneNumber = null;
        for(Item entry : phoneEntries){
            if ( entry.getName().equals(k) ){
                phoneNumber = entry.getNumber();
            }
        }
        if (phoneNumber == null){
            return "Name not found";
        }
        else {
            String number = phoneNumber.toString();
            String finalNumber = number.substring(0,3) + "-" + number.substring(3);
            return finalNumber;
        }
    }

    /**
     Looks up an item in the table.
     @param v the value to find
     @return the key with the given value, or null if no
     such item was found.
     */
    public String reverseLookup(String v){
        v = v.replace("-", "");
        int phoneNumber = Integer.parseInt(v);
        String name = null;
        for(Item entry : phoneEntries){
            if ( entry.getNumber() == phoneNumber ){
                name = entry.getName();
            }
        }
        if (name == null){
            return "Number not found";
        }
        else {
            return name;
        }
    }
}