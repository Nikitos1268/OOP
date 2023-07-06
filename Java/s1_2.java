// 2) Вывести все простые числа от 1 до 1000

public class s1_2 {
    public static void main(String[] args) {
        System.out.print("2 ");
        for (int i = 2; i <= 1000; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0){
                    break;
                }
                if (j==i-1){
                    System.out.print(i);
                    System.out.print(" ");
                }
            }
        }
    }
}

