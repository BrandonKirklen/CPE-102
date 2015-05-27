package Phone;

/**
 * Created by Brandon Kirklen on 5/26/2015.
 */
public class Item{
    private String name;
    private int number;

    public Item(String name, int number){
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString()
    {
        return this.name + "\n" + this.number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }
}
