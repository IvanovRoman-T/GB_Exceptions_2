import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Вы ввели " + getFloat());
//        System.out.println("Вы ввели " + getFloat_1());
//        task2();
    }

    static Scanner scanner = new Scanner(System.in);

    /**
     * 1) Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
     * и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
     * вместо этого, необходимо повторно запросить у пользователя ввод данных.
     */


    // С использованием Exception
    static float getFloat() {
        while (true) {
            System.out.print("Введите число типа float:\t");
            String a = scanner.nextLine();
            float num;
            try {
                num = Float.parseFloat(a);
                return num;
            } catch (NumberFormatException e) {
                System.out.println("Неверный формат числа.");
            } catch (NullPointerException e) {
                System.out.println("Путой ввод.");
            }

        }
    }

    // Без использование Exception
    static float getFloat_1() {
        System.out.print("Введите число типа float:\t");
        while (!scanner.hasNextFloat()) {
            scanner.next();
            System.out.println("Неверный формат ввода. Попробуйте ещё раз:\t");
        }
        return scanner.nextFloat();
    }


    /**
     * Задание 2
     * Если необходимо, исправьте данный код
     */
    static void task2() {
        try {
            int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}; //Массив не был проинициализирован
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException |
                 IndexOutOfBoundsException e) { // Не отлавливалось исключение IndexOutOfBoundsException
            System.out.println("Catching exception: " + e);
        }
    }
}