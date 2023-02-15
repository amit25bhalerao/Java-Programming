import java.io.*;
import java.util.Scanner;

class CyclicRedundancyCheck
{
    static void divide_to_find_remainder(int[] a, int k)
    {
        int[] gp = {1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1};  //Generator Polynomial: x^16 + x^12 + x^5 + x^0 Of Length 17
        int count = 0;

        for(int i = 0; i < k; i++)
        {
            if(a[i] == gp[0])
            {
                for(int j = i; j < 17 + i; j++)
                {
                    a[j] = a[j] ^ gp[count++];
                }
                count = 0;
            }
        }

        System.out.print("Remainder Obtained: ");
        for(int i = 0; i < 17 + k; i++)
        {
            System.out.print(a[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int a[] = new int[100], b[] = new int[100], len, flag = 0, k;

        System.out.print("Enter The Length Of Data Frame: ");
        len = s.nextInt();

        System.out.print("Enter The Message Present Within The Data Frame Bit By Bit: ");
        for(int i = 0; i < len; i++)
        {
            a[i] = s.nextInt();             // Accepting Input Message
        }

        for(int i = 0; i < 16; i++)
        {
            a[len++] = 0;                   // Appending Zero's
        }

        k = len - 16;

        for(int i = 0; i < len; i++)
        {
            b[i] = a[i];
        }

        divide_to_find_remainder(a, k);

        for(int i = 0; i < len; i++)
        {
            a[i] = a[i] ^ b[i];             // Adding Remainder To The Given Input Message To Generate CRC Code
        }

        System.out.print("Data To Be Transmitted Is: ");
        for(int i = 0; i < len; i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();

        System.out.print("Enter The Received Data Bit By Bit: ");
        for(int i = 0; i < len; i++)
        {
            a[i] = s.nextInt();
        }

        divide_to_find_remainder(a, k);

        for(int i = 0; i < len; i++)
        {
            if(a[i] != 0)
            {
                flag = 1;
                break;
            }
        }

        if(flag == 1)
            System.out.println("Error During Transmission Has Occurred");
        else
            System.out.println("No Error During Transmission");
    }
}
