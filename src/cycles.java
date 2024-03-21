public class cycles {
    public static void main(String[] args) {
//        int counter = 1;
//        int countCh = 0;
//        while (counter <= 1000000) {
//            if (counter % 2 == 0) {
//                countCh++;
//            }
//            counter++;
//        }
//        System.out.println(countCh);
//        for (int j = 1; j <= 50; j++) {
//            System.out.println(j);
//
//        }

        double a = 10;
        double b = 7;
        double c = -17;

        double d = Math.pow(b, 2) - 4 * a * c;
        if (d > 0) {
            double x1 = (-1 * b + Math.sqrt(d)) / (2 * a);
            double x2 = (-1 * b - Math.sqrt(d)) / (2 * a);
            System.out.println(x1 + " " + x2);
        } else if (d == 0) {
            double x = -1 * b / (2 * a);
            System.out.println(x);
        } else {
            System.out.println("Свободен");
        }


        for (int i=100;i<=999;i++){
            int sqr = i*i;
            if (sqr%1000 == i){
                System.out.println(sqr +":"+i);
            }
        }

        for (int i=100;i<=999;i++){
            if (i%7 ==0){
                int sum = 0;
                int copyI = i;
                while (copyI>0){
                    sum+=copyI%10;
                    copyI/=10;
                }
                if (sum%7 ==0){
                    System.out.println(sum);
                }
            }
        }
        int n = 34584588;
        for (int delitel = 1; delitel<=n; delitel++){
            if (n%delitel==0){
                System.out.println(delitel);
            }
        }


    }
}
