// This program prints the first 'a' odd numbers starting from 1
public class Problem2 {
    public static void main(String[] args) {
        int a = 5; 
        int count = 0;
        int number = 1;

        while (count < a) {
            System.out.print(number + (count < a - 1 ? ", " : ""));
            number += 2;
            count++;
        }
    }
}
