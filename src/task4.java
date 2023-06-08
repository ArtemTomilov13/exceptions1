import java.util.Arrays;
import java.util.Random;

public class task4 {
    public static void main(String[] args) {
        Random random = new Random();
        int n = 4;
        int m = 4;
        int max;
        if (n > m) {
            max = n;
        } else {
            max = m;
        }
        int[] array1 = new int[n];
        int[] array2 = new int[m];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(5);
        }
        for (int i = 0; i < array2.length; i++) {
            array2[i] = random.nextInt(5);
        }
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println((Arrays.toString(division(array1, array2, max))));
    }
    public static int[] division(int[] array1, int[] array2, int max) {
        try {
            int[] array3 = new int[max];
            for (int i = 0; i < max; i++) {
                array3[i] = array1[i] / array2[i];
            }
            return array3;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Длины массивов не равны!");
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль!");
        }
        return null;
    }
}