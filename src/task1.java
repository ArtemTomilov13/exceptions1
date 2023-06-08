//Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
public class task1 {
    public static void main(String[] args) {
       metod1(1,0);
       metod2();
       metod3();
    }
    public static int metod1(int a, int b) {
        return a / b;
    }
    public static void metod2() {
        String str = null;
        System.out.println(str.length());
    }
    public static void metod3() {
        int a = Integer.parseInt("1111f222");
    }
}
