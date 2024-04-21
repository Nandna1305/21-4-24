import java.util.Scanner;
class daisy
{
    public static void main(String args[]) 
    {
        //using scanner as an object to get salary,age and loan as a input from the user
        Scanner scan = new Scanner(System.in);
        int salary = scan.nextInt();
        int age = scan.nextInt();
        if(salary>=20000 || age<=25)
        {
            System.out.println("eligible for loan");
            int loan = scan.nextInt();
            //using if else statement
            if (loan<50000)
            {
                System.out.println("available");
            }
            else
            {
                System.out.println("not available");
            }
        }
        else
        {
            System.out.println("not eligible");
        }

    }
}


