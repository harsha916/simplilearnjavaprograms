import java.util.Scanner;

public class EvenOrOdd {

    public static void evenorodd(int n)
    {
        if(n%2 == 0)
        {
            System.out.println(n+" is Even");
        }
        else
        {
            System.out.println(n+" is odd");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check odd or even :");
        int n = sc.nextInt();
        evenorodd(n);
    }
}
