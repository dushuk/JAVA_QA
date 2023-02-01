public class Main {
    public static void main(String[] args) {

        int[] array2 = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int summ1 = 0;
        for (int i = 0; i < array2.length; i++) {
            summ1 += array2[i];
        }
        System.out.println(summ1);
    }
}