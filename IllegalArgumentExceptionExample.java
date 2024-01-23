/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ilegalargumenexceptionexample;

/**
 *
 * @author Owner
 */
public class IllegalArgumentExceptionExample {
    public static void main(String[] args) {
        try {
            int result = calculateSquareRoot(-1); // Memanggil metode yang mungkin menyebabkan IllegalArgumentException
            System.out.println("Akar kuadrat: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Terjadi IllegalArgumentException: " + e.getMessage());
            // Penanganan kesalahan di sini
        }
    }

    public static int calculateSquareRoot(int number) {
        if (number < 0) {
            // Mungkin menyebabkan IllegalArgumentException
            throw new IllegalArgumentException("Angka tidak boleh negatif");
        }
        return (int) Math.sqrt(number);
    }
}

