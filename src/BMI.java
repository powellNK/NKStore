import java.util.Scanner;

public class BMI {
    public static void main(String[] args){
        //Индекс массы тела
        Scanner reader = new Scanner(System.in);

        System.out.println("Введите вес (кг): ");
        float weight = reader.nextFloat();
        System.out.println("Введите рост (см): ");
        float height = reader.nextFloat()/100;

        float bmi = weight/(float)Math.pow(height,2);
        System.out.println("BMI " + bmi);
        if (bmi <=18.5){
            System.out.println("Недовес");
        }else if (bmi<=25.0){
            System.out.println("Все в норме");
        }else if (bmi<=30.0){
            System.out.println("Лишний вес");
        }else{
            System.out.println("Ожирение");
        }
    }
}
