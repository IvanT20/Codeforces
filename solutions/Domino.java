import java.io.*;

public class Domino {
    public static void main(String[] args) throws IOException {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = in.readLine().split(" ");

        System.out.println((Integer.parseInt(arr[0]) * Integer.parseInt(arr[1])) / 2);
    }
}
