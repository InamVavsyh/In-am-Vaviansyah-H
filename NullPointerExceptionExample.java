/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nullpointerexception;

/**
 *
 * @author Owner
 */
public class NullPointerExceptionExample {
    public static void main(String[] args) {
        try {
            String str = null;
            int length = getStringLength(str); // Memanggil metode yang mungkin menyebabkan NullPointerException
            System.out.println("Panjang string: " + length);
        } catch (NullPointerException e) {
            System.out.println("Terjadi NullPointerException: " + e.getMessage());
            // Penanganan kesalahan di sini
        }
    }

    public static int getStringLength(String str) {
        // Mungkin menyebabkan NullPointerException
        return str.length();
    }
}

