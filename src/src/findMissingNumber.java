public class findMissingNumber {
    // Function to find missing number
    static int getMissingNo(int a[]) {
        int i, total;

        total = (a.length + 1) * (a.length + 2) / 2;
        for (i = 0; i < a.length; i++)
            total -= a[i];
        return total;
    }


    public static void main(String args[]) {
        int a[] = {1, 2, 3, 4, 5, 6, 8};
        int miss = getMissingNo(a);
        System.out.println(miss);
    }

}