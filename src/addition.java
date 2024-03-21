import java.util.Scanner;

public class addition {
    public static void main(String[] args){
        // сложить два целых числа А и В
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите число a: ");
        int a = reader.nextInt();
        System.out.println("Введите число b: ");
        int b = reader.nextInt();
        System.out.println("a+b="+(a+b));
    }
}
