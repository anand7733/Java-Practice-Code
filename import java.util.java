import java.util.Scanner;
public class Peramidifelse1{
    public static void main(String[]args)
    {
        Scanner input=new Scanner (System.in);
        int n= input.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=4;j>=1;j--)
            {
                if(j>i)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print(" *");
                }
            }
            System.out.println();
        }
    }
}