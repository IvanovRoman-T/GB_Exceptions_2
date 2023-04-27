import java.io.FileNotFoundException;

public class Task3 {

    /**
     * Задание 3
     * Дан следующий код, исправьте его там, где требуется
     */


//    main Выбрасывал исключение Exception выше, соответственно оно  нигде бы не обрабатывалось
    public static void main(String[] args) {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[3] = 9;
//      Throwable отлавливался самым первым из-за чего все последующие catch не выполняются ни при каком условии
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }


    //    Класс FileNotFoundException не был импортирован
    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
        System.out.println(a + b);
    }
}
