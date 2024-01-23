/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arithmeticexceptionexample;

/**
 *
 * @author Owner
 */
public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        try {
            int result = divideByZero(); // Memanggil metode yang mungkin menyebabkan ArithmeticException
            System.out.println("Hasil: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Terjadi ArithmeticException: " + e.getMessage());
            // Penanganan kesalahan di sini
        }
    }

    public static int divideByZero() {
        int numerator = 10;
        int denominator = 0;
        
        // Mungkin menyebabkan ArithmeticException
        return numerator / denominator;
    }
}

