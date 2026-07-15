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
                    String answer = wunderAnswer(line);
                    System.out.println(answer);
                    out.write(answer + "\n");
                    out.flush();

                }

                if (line.startsWith("ENDE")) {
                    shallrun = false;
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String wunderAnswer(String frage) {
        System.out.println(frage.substring(5));
        int nr = Integer.parseInt(frage.substring(5));
        if (nr < 1) {
            throw new IllegalArgumentException("this is not a Natürliche Zahl");
        }
        int i = 0;
        while (nr != 1) {
            if (nr % 2 == 0) {
                nr = nr / 2;
                i++;
            } else {
                nr = nr * 3 + 1;
                i++;
            }
        }
        return String.valueOf(i);
    }
}
