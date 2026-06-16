import java.util.*;
public class DistinctNumberPyramidLeft{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Height : ");
        int hei=sc.nextInt();
        int counter=1;

        for(int i=1;i<=hei;i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
        return;
    }
}