import java.io.*;

public class Petya {
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String one = in.readLine().toLowerCase();
        String two = in.readLine().toLowerCase();
        
        if (one.equals(two)) {
            System.out.println(0);
        } else if (one.compareTo(two) > 0) {
            System.out.println(1);
        } else {
            System.out.println(-1);
        }
        

    }    
}
