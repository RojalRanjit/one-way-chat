import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 12345);

            InputStream inputStream = socket.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);

            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            while (true)
            {
                System.out.println(bufferedReader.readLine());

//                System.out.println("Enter any string:");

            }
//            System.out.println((char)inputStreamReader.read());


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
