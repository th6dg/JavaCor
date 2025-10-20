package org.example.Networking;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *  @Use-Case:
 *      Client-Server<p>
 *      Peer-to-Peer</p>
 *      <p>Distribution</p>
 *
 *  @Package(java.net):
 *
 *      <p>InetAddress: Đại diện cho 1 địa chỉ IP</p>
 *      <p>URL: Cho phép truy xuất dữ liệu từ tài nguyên trên mạng</p>
 *      <p>URL Connection</p>
 *      <p>Socket: Sử dụng TCP</p>
 *      <p>ServerSocket: Tạo 1 server</p>
 *      <p>DatagramSocket DatagramPagcket</p>
 *
 *  @Protocol:
 *      TCP <p> UDP</p>
 *
 *
 *  @Socket-Programming
 *
 *  @URL
 *
 *  @SSL
 *
 */

public class NS {
    public static void main(String[] args) throws IOException {
        // Tạo server socket
        ServerSocket serverSocket = new ServerSocket(8080);

        // Chờ client kết nối
        Socket socket = serverSocket.accept();

        // Nhận dữ liệu I/O từ client
        InputStream input = socket.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(input));
        String msg = reader.readLine();
        System.out.println("Msg from client: "+ msg);

        // Gửi phản hồi đến client
        OutputStream output = socket.getOutputStream();
        PrintWriter writer = new PrintWriter(output, true);
        writer.println("Hello from server");

        socket.close();
        serverSocket.close();

    }
}
