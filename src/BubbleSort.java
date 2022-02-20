import java.util.Scanner;

public class BubbleSort {
    public static void bubbleSort(int[] n)
    {
        for (int i = 0; i < n.length-1; i++)
            for (int j = 0; j < n.length-i-1; j++)
                if (n[j] > n[j+1])
                {
                    // swap arr[j+1] and arr[j]
                    int temp = n[j];
                    n[j] =n[j+1];
                    n[j+1] = temp;
                }
        System.out.println("------------------------------------------");
        System.out.println("              Sorted Order                ");
        System.out.println("------------------------------------------");
        for(int i=0;i<n.length;i++)
        {
            System.out.print(i+" ->");
            System.out.println(n[i]);
        }
        System.out.println("=============================================================");

    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("=========================Bubble sort=========================");
        System.out.print("Enter the length of Numbers to Sort :");
        int UserInput = sc.nextInt();
        System.out.println("Enter "+UserInput+" Numbers below :");
        int[] Array1 = new int[UserInput];
        for(int i=0;i<UserInput;i++)
        {
            System.out.print(i+" ->");
            int UserArrayInput = sc.nextInt();
            Array1[i] = UserArrayInput;

        }
        bubbleSort(Array1);
        }

    }

