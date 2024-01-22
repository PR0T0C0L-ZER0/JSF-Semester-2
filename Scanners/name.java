import java.util.Scanner;

class name

{
    public static void main(String[] args)
    {
        //obtaining first middle and last names

        Scanner one = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String first = one.nextLine();

        Scanner two = new Scanner(System.in);
        System.out.print("Enter your middle name: ");
        String second = two.nextLine();

        Scanner three = new Scanner(System.in);
        System.out.print("Enter your last name: ");
        String third = three.nextLine();



        //printing statement with names

        System.out.println("Hello, " + first + " " + second + " " + third + "!");



        //closing scanners

        one.close();
        two.close();
        three.close();
    }
}