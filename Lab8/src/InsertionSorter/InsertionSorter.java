package InsertionSorter;


/**
 * Created by Brandon Kirklen on 5/27/2015.
 */
public class InsertionSorter {
    int[] input;
    public InsertionSorter(int[] input){
        this.input = input;
    }

    public void sort()
    {
        for (int i = 1; i < input.length; i++) {
            int ins = BinarySearch (input, 0, i, input[i]);
            int value = input[i];
            for (int j = i - 1; j >= ins; j--)
                input[j + 1] = input[j];
            input[ins] = value;
        }
    }
    int BinarySearch (int a[], int low, int high, int key)
    {
        int mid;

        if (low == high)
            return low;

        mid = low + ((high - low) / 2);

        if (key > a[mid])
            return BinarySearch (a, mid + 1, high, key);
        else if (key < a[mid])
            return BinarySearch (a, low, mid, key);

        return mid;
    }
}
