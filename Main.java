import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        for (int i = 100; i<1e9; i += 1e7) {
            long t_n = arraySortRuntime(i);
            long n = i;
            System.out.println("Array size: " + n + " Runtime: " + t_n + " T(n)/n: " + (t_n / (n)) + " T(n)/n^2: " + (t_n/(n*n)) + " T(n)/nlogn: " + (t_n / (n * Math.log(n))));
        }
    }

    public static long arraySortRuntime( int maxSize ) {
        int[] arr = new int[maxSize];
        // populate the array with random values
        for (int i = 0; i < maxSize; i++) {
            arr[i] = (int)(Math.random() * 1000);
        }

        long startTime = System.nanoTime();
        Arrays.sort(arr);
        long endTime = System.nanoTime();
        return endTime - startTime; 
    }
}