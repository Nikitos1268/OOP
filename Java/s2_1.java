//Task_1
// Вам дается строка S и целочисленный массив индексов int index[s.length].
// Напишите программу, которая перетасует символы в S таким образом,
// что символ c i-й позиции переместится на индекс index[i] в результирующей строке.
//Пример: s = “cba”, index = [3,2,1] result “abc”

import java.util.Scanner;

public class s2_1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите строку s: ");
        String s = iScanner.next();
        System.out.printf("Введите массив index запятых и пробелов: ");
        String index = iScanner.next();
        char[] res = new char[100];
        for (int i = 0; i < index.length(); i++) {
            res[index.charAt(i)] = s.charAt(i);
        }
        System.out.println(res);
    }
}


