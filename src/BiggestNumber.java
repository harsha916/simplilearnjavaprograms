import java.util.Scanner;

public class BiggestNumber {
    public static void biggestNumber(int[] n)
    {
        int temp = n[0];
        for(int i=1;i < n.length;i++)
        {
            if(n[i] > temp)
            {
                temp = n[i];
            }
        }
        System.out.println("========================================================================");
        System.out.println("Highest number is "+temp);
        System.out.println("========================================================================");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=========================Finding Biggest Number=========================");
        System.out.print("Enter the length of Numbers in Array :");
        int UserInput = sc.nextInt();
        System.out.println("Enter "+UserInput+" Numbers below :");
        int[] Array1 = new int[UserInput];
        for(int i=0;i<UserInput;i++)
        {
            System.out.print(i+" ->");
            int UserArrayInput = sc.nextInt();
            Array1[i] = UserArrayInput;

        }
        biggestNumber(Array1);
    }
}
