import java.util.*;
public class BorderRectangle{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Length : ");
        int len=sc.nextInt();
        System.out.print("Enter Height : ");
        int hei=sc.nextInt();

        for(int i=1;i<=hei;i++){
            for(int j=1;j<=len;j++){
                if(i==1 || j==1 || i==hei || j==len){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        return;
    }
}