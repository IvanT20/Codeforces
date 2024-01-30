import java.io.*;

public class Elephant {
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(in.readLine());
        
        System.out.print((num + 4) / 5);
    }   
}
