import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1-2");
        int[] mas = new int[]{1, 2, 3};
        double[] mas2 = {1.57, 7.654, 9.986};
        String[] mas3 = new String[]{"январь", "февраль", "март", "апрель"};
        for (int i = 0; i <= 2; i++) {
            System.out.print(mas[i] + ", ");
        }
        System.out.println(" ");
        for (int b = 0; b <= 2; b++) {
            System.out.print(mas2[b] + ", ");
        }
        System.out.println(" ");
        for (int c = 0; c <= 2; c++) {
            System.out.print(mas3[c] + ", ");
        }
    }
}

