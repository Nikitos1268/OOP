
// 3) Реализовать простой калькулятор 
// Минимум -- > Условия + Цикл; Введите число; Введите число; Выберите операцию; 1 - сложить; 2 - умножить
import java.util.Scanner;

public class s1_3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        int n1 = iScanner.nextInt();
        System.out.printf("Введите второе число: ");
        int n2 = iScanner.nextInt();
        System.out.printf("Введите 1 для сложения или 2 для умножения: ");
        int n3 = iScanner.nextInt();
        iScanner.close();
        if (n3 == 1) {
            int c = n1 + n2;
            System.out.printf("%d + %d = %d \n", n1, n2, c);
        } else {
            if (n3 == 2) {
                int c = n1 * n2;
                System.out.printf("%d * %d = %d \n", n1, n2, c);
            }else{
                System.out.println("Некорректный ввод");
            }
        }
    }
}
