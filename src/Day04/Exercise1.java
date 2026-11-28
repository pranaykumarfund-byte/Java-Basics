package Day04;
import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks1:");
        float mark1 = sc.nextInt();
        System.out.println("Enter marks2:");
        float mark2 = sc.nextInt();
        System.out.println("Enter marks3:");
        float mark3 = sc.nextInt();
        System.out.println("Enter mark4:");
        float mark4 = sc.nextInt();
        System.out.println("Enter marks5");
        float mark5 = sc.nextInt();
        float persentage = (mark1+mark2+mark3+mark4+mark5)/500*100;
        System.out.println(persentage);

    }

}
