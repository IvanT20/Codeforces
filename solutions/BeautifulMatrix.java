import java.io.*;
import java.lang.Math;
import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) throws IOException {
        
        Scanner in = new Scanner(System.in);
        int value = 0;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                int x = in.nextInt();

                if (x == 1) {
                    value = (Math.abs(i-3) + Math.abs(j-3));
                }
            }
        }
        System.out.println(value);
        in.close();
    }
}
