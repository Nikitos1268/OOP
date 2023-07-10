// Task_2

// На первой строке записывается натуральное число n - количество строчек в книге. Затем вводится n строк - строки книги. потом вводится натуральное число m - количество продуктов, на которые у человека аллергия. Потом вводится m строк - вида "продукт1 - продукт2", где продукт1 - продукт, на который у человека аллергия и продукт2 - продукт, на который следует заменить продукт1. Гарантируется что любой продукт состоит из 1 слова. название продуктов написаны строчными буквами. Гарантируется, что продукты, на которые нужно выполнить замену, не встречаются изначально в тексте.

// Выходные данные
// Замените все продукты в поваренной книге Васи и выведите их построчно на экран. На окончания не обращайте внимание. ВАЖНО!!! Если продукт, который следует заменить написан с большой буквы, то и замена тоже должна начинаться с большой буквы!

// Sample Input:

// 2
// Рецепт 1. Арахис 100гр, мороженое 200гр. Возьмите арахис и измелчите его. Посыпьте измельчённый арахис на мороженое.
// Рецепт 2. Клубника 100гр, сгущенка 3кг. Смешать, есть) Радоваться жизни.
// 3
// арахис - колбаса
// клубника - вишня
// сгущенка - молоко
// Sample Output:

// Рецепт 1. Колбаса 100гр, мороженое 200гр. Возьмите колбаса и измелчите его. Посыпьте измельчённый колбаса на мороженое.
// Рецепт 2. Вишня 100гр, молоко 3кг. Смешать, есть) Радоваться жизни.


import java.util.Scanner;

public class s2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("n: ");
        int n = sc.nextInt();
        Scanner sc2 = new Scanner(System.in);
        String[] cookbook = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Вседите строку %s: ",(i+1));
            cookbook[i] = sc2.nextLine();
        }

        System.out.printf("m: ");
        int m = sc.nextInt();
        String[] allergy = new String[m];
        for (int i = 0; i < m; i++) {
            System.out.printf("Введите строку с исключениями %s : ",(i+1));
            allergy[i] = sc2.nextLine();
        }
        
        String[] allergy_exception = new String[m];
        String[] allergy_replacement = new String[m];
        for (int i = 0; i < m; i++) {
            String[] arr = allergy[i].split("-");
            allergy_exception[i] = arr[0];
            allergy_replacement[i] = arr[1];
        }

        for (int i = 0; i < cookbook.length; i++) {
            String[] line = cookbook[i].split(" ");
            for (int j = 0; j < line.length; j++) {
                for (int k = 0; k < allergy_exception.length; k++) {
                    if (allergy_exception[k].equalsIgnoreCase(line[j])) {
                        line[j] = allergy_replacement[k];
                    }
                }
            }
            String res = new String();
            for (int j = 0; j < line.length; j++) {
                res += line[j] + " ";
            }
            System.out.println(res);
        }

        
    }
}
