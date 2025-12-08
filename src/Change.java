import java.util.Scanner;

public class Change {
    public static void main(String[] args) {
        double VND = 23000;
        double USD ;
        Scanner input = new Scanner(System.in);
        System.out.print("Hãy nhập số tiền USD: ");
        USD = input.nextDouble();
        double Change = USD * 23000;
        System.out.print( "Giá trị VND: " + Change);

    }
}
