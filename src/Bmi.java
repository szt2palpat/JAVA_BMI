import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner bmi=new Scanner(System.in);
        System.out.println("add meg a testsúlyod:");
        double weight=bmi.nextDouble();
        System.out.println("add meg a magasságod:");
        double height=bmi.nextDouble();
        System.out.println((double) (weight/Math.pow(height,2)));
    }
}