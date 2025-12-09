import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        System.out.println("Welcome to my app!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so can doc >= 0: ");
        int number = scanner.nextInt();
        if (number < 0){
            System.out.println("So khong hop le!");
            return;
        }
        // doc so: 0,1,2,3,...9
        if (number < 10) {
            switch (number) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
        } else if (number < 20) { // doc cac so >= 10 vs < 20
            switch (number) {
                case 10:
                    System.out.println("Ten");
                    break;
                case 11:
                    System.out.println("Eleven");
                    break;
                case 12:
                    System.out.println("Twelve");
                    break;
                case 13:
                    System.out.println("Thirteen");
                    break;
                case 14:
                    System.out.println("Fourteen");
                    break;
                case 15:
                    System.out.println("Fifteen");
                    break;
                case 16:
                    System.out.println("Sixteen");
                    break;
                case 17:
                    System.out.println("Seventeen");
                    break;
                case 18:
                    System.out.println("Eighteen");
                    break;
                case 19:
                    System.out.println("Nineteen");
                    break;
            }
        } else if (number < 100) { // doc cac so 2 chu so >= 20 va < 100
            int tens = number / 10;
            int ones = number % 10;

            // y tuong doc hang chuc truoc + hang don vi sau
            String text = "";
            switch (tens) {
                case 2:
                    text += "Twenty";
                    break;
                case 3:
                    text += "Thirty";
                    break;
                case 4:
                    text += "Forty";
                    break;
                case 5:
                    text += "Fifty";
                    break;
                case 6:
                    text += "Sixty";
                    break;
                case 7:
                    text += "Seventy";
                    break;
                case 8:
                    text += "Eighty";
                    break;
                case 9:
                    text += "Ninety";
                    break;
            }

            if (ones != 0) {
                switch (ones) {
                    case 1:
                        text += " One";
                        break;
                    case 2:
                        text += " Two";
                        break;
                    case 3:
                        text += " Three";
                        break;
                    case 4:
                        text += " Four";
                        break;
                    case 5:
                        text += " Five";
                        break;
                    case 6:
                        text += " Six";
                        break;
                    case 7:
                        text += " Seven";
                        break;
                    case 8:
                        text += " Eight";
                        break;
                    case 9:
                        text += " Nine";
                        break;
                }
            }
            System.out.println(text);
        } else if (number < 1000) {
            // doc hang tram  + hang chuc + hang don vi
            int hundreds = number / 100;
            int tens = (number % 100) / 10;
            int ones = number % 10;

            // doc so hang tram
            String text = "";
            switch (hundreds) {
                case 1:
                    text += "One Hundred";
                    break;
                case 2:
                    text += "Two Hundred";
                    break;
                case 3:
                    text += "Three Hundred";
                    break;
                case 4:
                    text += "Four Hundred";
                    break;
                case 5:
                    text += "Five Hundred";
                    break;
                case 6:
                    text += "Six Hundred";
                    break;
                case 7:
                    text += "Seven Hundred";
                    break;
                case 8:
                    text += "Eight Hundred";
                    break;
                case 9:
                    text += "Nine Hundred";
                    break;
            }

            text += " and ";
            switch (tens) {
                case 2:
                    text += "Twenty";
                    break;
                case 3:
                    text += "Thirty";
                    break;
                case 4:
                    text += "Forty";
                    break;
                case 5:
                    text += "Fifty";
                    break;
                case 6:
                    text += "Sixty";
                    break;
                case 7:
                    text += "Seventy";
                    break;
                case 8:
                    text += "Eighty";
                    break;
                case 9:
                    text += "Ninety";
                    break;
            }

            if (ones != 0) {
                switch (ones) {
                    case 1:
                        text += " One";
                        break;
                    case 2:
                        text += " Two";
                        break;
                    case 3:
                        text += " Three";
                        break;
                    case 4:
                        text += " Four";
                        break;
                    case 5:
                        text += " Five";
                        break;
                    case 6:
                        text += " Six";
                        break;
                    case 7:
                        text += " Seven";
                        break;
                    case 8:
                        text += " Eight";
                        break;
                    case 9:
                        text += " Nine";
                        break;
                }
            }

            System.out.println(text);
        }else {
            System.out.println("So vuot qua gioi han! so nhap vao < 1000");
        }
    }
}