import java.util.Scanner;

public class Beads {
    public static void main(String[] args){
        //принцип Дирихле
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите количество цветов бусин: ");
        int colorCount = reader.nextInt();

        System.out.println(++colorCount);
    }
}
