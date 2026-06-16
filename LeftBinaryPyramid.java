import java.util.*;
public class LeftBinaryPyramid{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Height : ");
        int hei=sc.nextInt();

        for(int i=1;i<=hei;i++){
            for(int j=1;j<=i;j++){
                int sum=i+j;
                if(sum%2==0){
                    System.out.print("0 ");
                }
                else{
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }

        return;
    }
}