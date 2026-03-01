import java.util.Scanner;

public class Reversenumber
{

    public static int reversing(int num){
        int digit = 0;
        int reverseddigit = 0;
        while(num!=0){
            digit = num%10;
            reverseddigit = (reverseddigit * 10)+digit;
            num = num/10;
        }
        return reverseddigit;


    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int result = reversing(num);
        System.out.println("Reversed array would be : "+ result);



    }
}
