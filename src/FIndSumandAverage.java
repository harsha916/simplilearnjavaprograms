import java.util.Scanner;

public class FIndSumandAverage {
    public static void findAverage(int[] n)
    {int sum = 0;
        for(int i=0;i<n.length;i++)
        {
            sum += n[i];
        }
        int avg = sum/n.length;
        System.out.println("Sum -------> "+sum);
        System.out.println("Average ---> "+avg);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=========================Finding Sum and Average=========================");
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
        System.out.println("====================Sum and Average of Given Array==================");
        findAverage(Array1);
        System.out.println("=====================================================================");
    }
}
