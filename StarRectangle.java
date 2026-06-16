import java.util.*;
public class StarRectangle{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Length : ");
        int len=sc.nextInt();
        System.out.print("Enter Height : ");
        int hei=sc.nextInt();

        for(int i=0;i<hei;i++){
            for(int j=0;j<len;j++){
                System.out.print("*"+" 8");
            }
            System.out.println();
        }       

        return;
    }
}