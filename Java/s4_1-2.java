import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Класс, реализующий операции умножения и сложения двух чисел в виде связанных списков.
 */
public class NumberOperations {

    /**
     * Метод для умножения двух чисел, представленных в виде связанных списков.
     *
     * @param num1 Первое число в виде связанного списка.
     * @param num2 Второе число в виде связанного списка.
     * @return Произведение двух чисел в виде связанного списка.
     */
    public static Deque<Integer> multiply(Deque<Integer> num1, Deque<Integer> num2) {
        // Создаем новый связанный список для хранения результата умножения
        Deque<Integer> result = new ArrayDeque<>();

        // Проверяем, является ли одно из чисел отрицательным
        boolean isNegative = (num1.getLast() < 0) ^ (num2.getLast() < 0);

        // Убираем знаки минус из чисел
        num1.removeLast();
        num2.removeLast();

        // Инициализируем массив для хранения промежуточных результатов умножения
        int[] intermediateResults = new int[num1.size() + num2.size()];

        // Выполняем умножение цифр
        for (int i = 0; i < num1.size(); i++) {
            int digit1 = num1.removeFirst();
            int carry = 0;

            for (int j = 0; j < num2.size(); j++) {
                int digit2 = num2.removeFirst();
                int product = digit1 * digit2 + intermediateResults[i + j] + carry;

                intermediateResults[i + j] = product % 10;
                carry = product / 10;
                num2.addLast(digit2);
            }

            if (carry > 0) {
                intermediateResults[i + num2.size()] += carry;
            }

            num1.addLast(digit1);
        }

        // Удаляем ведущие нули из промежуточных результатов
        int i = intermediateResults.length - 1;
        while (i >= 0 && intermediateResults[i] == 0) {
            i--;
        }

        // Формируем итоговый связанный список
        if (isNegative) {
            result.addLast(-1);
        }

        while (i >= 0) {
            result.addLast(intermediateResults[i]);
            i--;
        }

        return result;
    }

    /**
     * Метод для сложения двух чисел, представленных в виде связанных списков.
     *
     * @param num1 Первое число в виде связанного списка.
     * @param num2 Второе число в виде связанного списка.
     * @return Сумма двух чисел в виде связанного списка.
     */
    public static Deque<Integer> add(Deque<Integer> num1, Deque<Integer> num2) {
        // Создаем новый связанный список для хранения результата сложения
        Deque<Integer> result = new ArrayDeque<>();

        // Проверяем, является ли одно из чисел отрицательным
        boolean isNegative = (num1.getLast() < 0) ^ (num2.getLast() < 0);

        // Убираем знаки минус из чисел
        num1.removeLast();
        num2.removeLast();

        int carry = 0;

        // Выполняем сложение цифр
        while (!num1.isEmpty() || !num2.isEmpty()) {
            int digit1 = num1.isEmpty() ? 0 : num1.removeFirst();
            int digit2 = num2.isEmpty() ? 0 : num2.removeFirst();
            int sum = digit1 + digit2 + carry;

            result.addLast(sum % 10);
            carry = sum / 10;
        }

        if (carry > 0) {
            result.addLast(carry);
        }

        // Добавляем знак минус, если необходимо
        if (isNegative) {
            result.addLast(-1);
        }

        return result;
    }

    /**
     * Главный метод программы.
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        // Пример использования методов multiply() и add()

        // Создаем первое число: -123
        Deque<Integer> num1 = new ArrayDeque<>();
        num1.addLast(3);
        num1.addLast(2);
        num1.addLast(1);
        num1.addLast(-1); // Минус перед числом

        // Создаем второе число: 345
        Deque<Integer> num2 = new ArrayDeque<>();
        num2.addLast(5);
        num2.addLast(4);
        num2.addLast(3);

        // Умножение чисел
        Deque<Integer> product = multiply(num1, num2);
        System.out.println("Умножение: " + product);

        // Сложение чисел
        Deque<Integer> sum = add(num1, num2);
        System.out.println("Сложение: " + sum);
    }
}
