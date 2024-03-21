import java.sql.SQLOutput;
import java.util.Scanner;

public class main {
    public static void main(String[] args){
        /*System.out.println("Hello World");

        double b = 3.2;
        long a = 5*999999999999L;
        System.out.println(b);

        String name = "Ivan";
        System.out.println(a);*/
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int zadumannoeChislo = 102;

        int guessNumber = scanner.nextInt();

        int tr = 10;
        int fl = 15;




        if (guessNumber<zadumannoeChislo){
            System.out.println("Введенное число меньше загаданного");
        } else if (guessNumber==zadumannoeChislo){
            System.out.println("Вы угадали");
        }else{
            System.out.println("Введенное число больше загаданного");
        }

        System.out.println(5&8);
    }
}
