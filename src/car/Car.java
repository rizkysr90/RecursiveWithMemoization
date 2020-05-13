package car;
import java.util.Scanner;
import java.io.Console;
public class Car { 
    static int arr[] = new int[50]; 
    public static void insertArr()
    {
        for(int i=0; i<50; i++)
        {
            arr[i] = -1;
        }
    }
    public static void main (String[] args)
    {
        insertArr();
        Scanner scan = new Scanner(System.in);
        Console out =  System.console();
        String firstString = out.readLine("Masukkan Fibonacci Ke : ");
        int convertedString = Integer.parseInt(firstString);
        out.printf("History Fibonacci Ke %-5d= ",convertedString);
        historyFib(convertedString);
        out.printf("\n");
        int result = instantFib(convertedString);
        out.printf("Instant Fibonacci Ke %-5d= %d \n",convertedString,result);
        System.out.println("Index Array Ke 0 = " + arr[3]);
    }
    private static void historyFib(int parameter)
    {
        for (int i =0; i<1; i++)
        {
            int f1 = 0;
            int f2 = 1;
            int result = 1;
            for(int j=0; j<parameter; j++)
            {
                System.out.printf("%d ",result);
                result = f1 + f2;
                f1 = f2;
                f2 = result;
            }
        }
    }
    static int instantFib(int n)
    {
        int total;
        if (n == 0 || n == 1)
        {
            return n;
        }
        else if (arr[n] != -1)
        {
            return arr[n];
        }
        arr[n] = instantFib(n-1) + instantFib(n-2);
       
        return arr[n];
    }
    

        
}
