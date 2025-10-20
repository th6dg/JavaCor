package org.example.Networking;

import java.io.*;
import java.net.Socket;

public class NC {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 8080);

        // Gửi msg đến server
        OutputStream output = socket.getOutputStream();
        PrintWriter writer = new PrintWriter(output, true);
        writer.println("Hello from client");

        // Nhận dữ liệu I/O từ client
        InputStream input = socket.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(input));
        String msg = reader.readLine();
        System.out.println("Msg from server: "+ msg);

        socket.close();


    }
}
