import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class WunderClient {
    public static void main(String[] args) {
        try (
                Socket so = new Socket("132.176.108.140", 7892)) {
            BufferedReader in = new BufferedReader(new InputStreamReader(so.getInputStream(), "UTF-8"));
            OutputStreamWriter out = new OutputStreamWriter(so.getOutputStream(), "UTF-8");

            Boolean shallrun = true;
            while (shallrun) {
                String line = in.readLine();
                System.out.println(line);
                if (line.startsWith("FRAGE")) {

                }

                if (line.startsWith("ENDE")) {
                    shallrun = false;
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
