package java_basic;

import java.util.Scanner;

public class Conversion{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = scanner.nextInt();
        System.out.println("Given Number: " + num);

        System.out.println("Binary equivalent: " + decimalToBinary(num)); //Integer.toBinaryString(num))
        System.out.println("Octal equivalent: " + decimalToOctal(num));  //Integer.toOctalString(num))
        System.out.println("Hexadecimal equivalent: " + decimalToHexadecimal(num)); //Integer.toHexString(num))
    }

    public static String decimalToBinary(int num) {
        StringBuilder binary = new StringBuilder();
        while (num > 0) {
            int remainder = num % 2;
            binary.insert(0, remainder);
            num = num / 2;
        }
        return binary.toString();
    }

    public static String decimalToOctal(int num) {
        StringBuilder octal = new StringBuilder();
        if (num < 8) {
            return Integer.toString(num);
        } else {
            return decimalToOctal(num / 8) + (num % 8);
        }
    }

    public static String decimalToHexadecimal(int num) {
        if (num < 16) {
            if (num < 10) {
                return Integer.toString(num);
            } else {
                return Character.toString((char) ('A' + num - 10));
            }
        } else {
            int remainder = num % 16;
            if (remainder < 10) {
                return decimalToHexadecimal(num / 16) + remainder;
            } else {
                return decimalToHexadecimal(num / 16) + (char) ('A' + remainder - 10);
            }
        }
    }
}
