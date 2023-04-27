import java.util.Objects;
import java.util.Scanner;

public class Task4 {
    /**
     * Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
     * Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
     */


    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        try{
            System.out.println("Вы ввели: " + getString());
        }
        catch (Exception e){
            System.out.println(e);
        }
    }


    static String getString() throws Exception{
        System.out.println("Введите строку:");
        String res = scanner.nextLine();
        if (Objects.equals(res, "")){
            throw new Exception("Пустые строки вводить нельзя.");
        }
        return res;
    }
}
