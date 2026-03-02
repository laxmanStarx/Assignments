import java.util.Scanner;

public class unitCount {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int unit = sc.nextInt();
        int totalValues = 0;
        for(int i =1;i<=unit;i++){
            if(i < 101){
                totalValues+=1;
            }else if(i<201){
                totalValues+=2;
            }else if(i<301){
                totalValues+=3;
            }else{
                totalValues +=4;
            }

        }
        System.out.println(totalValues+ "Rs");






    }
}
