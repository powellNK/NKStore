import java.util.Scanner;

public class compare {
    public static void main(String[] args){
        //сравнить два целых числа
        Scanner reader = new Scanner(System.in);
        int a = reader.nextInt();
        int b = reader.nextInt();

        if (a<b){
            System.out.println("<");
        }else if(a>b){
            System.out.println(">");
        }else{
            System.out.println("=");

        }
    }
}
