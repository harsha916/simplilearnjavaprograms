import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=========================Reading Array from user=========================");
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
        System.out.println("=======Printed using For Loop===================");
        for(int i=0;i<UserInput;i++)
        {
            System.out.println(i+" --> "+Array1[i]);
        }
        System.out.println("=======Printed using For Each Loop=============");
        for(int i:Array1)
            System.out.println("--> "+i);
        System.out.println("===============================================");
    }
}
