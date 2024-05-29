package serverCilentNetwork;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class jclient {
    private Socket socket = null;
    private DataInputStream input = null;
    private DataOutputStream output = null;

    @SuppressWarnings("deprecation") // 127.0.0.1 --> localhost
    jclient(String addr, int port) {
        try {
            socket = new Socket(addr, port);
            System.out.println("Connected");
            System.out.print("Enter the data: ");
            // takes the input
            input = new DataInputStream(System.in);
            // output
            output = new DataOutputStream(socket.getOutputStream());

            String data = input.readLine(); // "Hello world"
            output.writeUTF(data);

            input.close();
            output.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        jclient cJclient = new jclient("127.0.0.1", 8080);
    }
}