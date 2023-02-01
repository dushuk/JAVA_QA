public class HomeWork1 {

    // сделать массив длиной 22
    int [] array1= new int [22];

    // обойти массив циклом и посчитать сумму элементов с начала и до конца
    public static int getSumFor(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            sum += arr[i];
        }
        return sum;
    }

    // обойти массив циклом и посчитать сумму элементов с конца в начало
    public static int getSumBack(int[] arr){
        int sum = 0;
        for (int i = arr.length-1; i >=0; i--) {
            sum += arr[i];
        }
        return sum;
    }

    // посчитать сумму элементов с четными, а потом с нечетными индексами
    public static int getSumEven(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (i % 2 == 0) sum +=arr[i];
        }
        return sum;
    }

    //  посчитать сумму элементов с нечетными индексами
    public static int getSumOdd(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (i % 2 != 0) sum += arr[i];
        }
        return sum;
    }

    // пройтись циклом так что бы суммировались первый и последний, потом второй и предпоследний итд
    public static int getSum(int[] arr) {
        int sum = 0;
        int start = 0;
        int end = arr.length -1;
        while (start <= end) {
            if(start == end){
                sum = sum + arr[start];
                break;
            }
            sum += (arr[start] + arr[end]);
            start++;
            end--;
        }
        return sum;
    }

}
