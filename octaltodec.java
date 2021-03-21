import java.util.*;
public class octaltodec {

    public static void main(String[] args) {
    	
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int decimal = reader.nextInt();

        int octal = convertDecimalToOctal(decimal);
        System.out.printf("%d in decimal = %d in octal", decimal, octal);
    }

    public static int convertDecimalToOctal(int decimal)
    {
        int octalNumber = 0, i = 1;

        while (decimal != 0)
        {
            octalNumber += (decimal % 8) * i;
            decimal /= 8;
            i *= 10;
        }

        return octalNumber;
    }

}
