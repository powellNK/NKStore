import java.util.Scanner;

public class twoBandits {
    public static void main(String[] args){
        //сколько банок не прострелил Гарри и сколько банок не прострелил Ларри
        Scanner reader = new Scanner(System.in);
        byte banksGarrys = reader.nextByte();
        byte banksLarrys = reader.nextByte();

        byte countBanks = (byte) (banksGarrys+banksLarrys);
        System.out.println("Не прострелил Гарри: "+(countBanks-banksGarrys-1));
        System.out.println("Не прострелил Ларри: "+(countBanks-banksLarrys-1));
    }
}
