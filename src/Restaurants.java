import java.util.Scanner;

public class Restaurants
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[] s = new String[]{"tea","coffee","snack","idli","dosa","bill","view all transactions","exit"};
        int[] rate = new int[]{15,20,20,8,15,0,0,0,0};
        int[] qt = new int[8];
        int sum=0;
        boolean quit=true;


        do
        {
            System.out.println("ITEM"+"\t\t\tPrice");
            for(int i=0;i<8;i++)
                System.out.println((i+1)+"."+s[i]+"\t\t"+rate[i]);
            System.out.println("Choose an option");
            int ch=input.nextInt();
            if(ch>0 && ch<6)
            {
                System.out.println("enter the no of quantites of "+s[ch-1]);
                int q=input.nextInt();
                qt[ch-1]+=q;
            }
            else if(ch == 7)
            {
                System.out.println("All the previous transactions are: ");
                break;
            }
            else if(ch == 8)
            {
                System.out.println("Thank you");
                System.exit(0);
            }
            else
            {
                quit=false;
            }

        }
        while(quit);

        System.out.println("Your Orders are:\n");
        for(int i=0;i<8;i++)
        {
            if(qt[i]!=0)
            {
                sum+=qt[i]*rate[i];
                System.out.println(s[i]+"*   "+qt[i]+"=="+qt[i]*rate[i]+"rs");
                System.out.println("Total bill to be paid " + sum + "rs");
                System.out.println("Thank you");
            }
        }

    }

}