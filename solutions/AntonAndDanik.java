import java.io.*;

public class AntonAndDanik {
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int aCounter = 0;
        int dCounter = 0;
        in.readLine();
        String outcome = in.readLine();

        for (int i = 0; i < outcome.length(); i++) {
            if (outcome.charAt(i) == 'A') {
                aCounter++;
            } else {
                dCounter++;
            }
        }

        if (aCounter > dCounter) {
            System.out.println("Anton");
        } else if (aCounter < dCounter) {
            System.out.println("Danik");
        } else {
            System.out.println("Friendship");
        }
    }    
}
