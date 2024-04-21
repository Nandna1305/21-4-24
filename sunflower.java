import java.util.Scanner;
class sunflower {
    public static void main(String args[]) {
        //using scanner as an object to get input from the user for 5 sub marks
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int e = scan.nextInt();
        //calculating the avg marks
        int marks = a+b+c+d+e/5;
        //usinf if else statement
        if(marks<35)
        {
            System.out.println("additional class is required");
        }
        else{
            System.out.println("you are good to go");
        }
    }
}
