//Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
import java.util.Random;
public class task2 {
    public static void main(String[] args) {
        int n = 4;
        int m = 3;
        String[][] arr = new String[n][m];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = String.valueOf(random.nextInt(10));
//                  arr[i][j] = "fff";
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(sum2d(arr));
    }
    public static int sum2d(String[][] arr) {
        int sum = 0;
        try {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    int val = Integer.parseInt(arr[i][j]);
                    sum += val;
                }
            }
            return sum;
        } catch (Exception e) {
            System.out.println("Поймано исключение: " + e.getClass());
        }
        return -1;
    }
}
// Получил два исключения:
// 1.NumberFormatException
// 2.ArrayIndexOutOfBoundsException