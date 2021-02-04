public class findDuplicateNumber {
    public static void main(String[] args) {

        int a[] = {1, 7, 5, 3, 123};
        int b[] = {2, 8, 6, 4, 12,73,54,34};
        System.out.println(findDupl(a, b));

    }

    public static Boolean findDupl(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}

