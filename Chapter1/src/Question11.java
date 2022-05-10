import java.util.Scanner;

public class Question11 {
    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        if(year>=1000&&3000>=year) {
           System.out.println(year-543);
        }
        else{
            System.out.println("입력수치오류");
        }
    }

}
