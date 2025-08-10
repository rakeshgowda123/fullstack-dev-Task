// This program prints odd numbers up to 'a', but only prints the count of odd numbers <= a
public class Problem3 {
    public static void main(String[] args) {
        int a = 6; 
        for (int i = 1; i <= a; i += 2) {
            System.out.print(i + (i + 2 <= a ? ", " : ""));
        }
    }
}
