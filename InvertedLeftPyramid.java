import java.util.*;
public class InvertedLeftPyramid{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Height : ");
        int hei=sc.nextInt();

        for(int i=hei;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        return;
    }
}