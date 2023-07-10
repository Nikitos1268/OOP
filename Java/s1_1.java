// 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;
public class s1_1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("n: ");
        int n = iScanner.nextInt();
        iScanner.close(); 
        int res = 0;
        for (int i = 1; i <= n; i++) {
            res+=i;
        }
        System.out.println(res);
    }
    
}