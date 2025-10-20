package org.example.InputOutput;

import java.io.*;

/**
 * @1.Overview:
     * Java cung cấp các API để đọc dữ liệu từ input và ghi dữ liệu ra output. <p>
 *   * Hệ thống I/O chủ yếu là “API dùng sẵn”<p>
     *      Bàn phím, màn hình (console)<p>
     *      File<p>
     *      Mạng (network socket)<p>
     *      Bộ nhớ (memory stream)<p>
 * @Flow: Input Stream   ---->   Java App  ---->   Output Stream<p>
 * Ổ cứng ──▶ (OS read ?KB) ──▶ Buffer trong RAM ──▶ Ứng dụng Java<p>
 * [Ổ cứng] <p>
 *   &ensp;&ensp;│<p>
 *   &ensp;&nbsp;▼<p>
 * FileInputStream (đọc byte từ OS)<p>
 *   &ensp;&ensp;│<p>
 *   &ensp;&nbsp;▼<p>
 * BufferedInputStream (đọc khối dữ liệu vào RAM)<p>
 *   &ensp;&ensp;│<p>
 *   &ensp;&nbsp;▼<p>
 * Ứng dụng Java (xử lý chuỗi)<p>
 * @ByteStream: Đọc ghi dữ liệu dạng byte(8-bit)<p>
     * Use case: Dùng khi dữ liệu không phải là text thuần (mp3, png, pdf,...)<p>
     * InputStream-base: FileInputStream, BufferInputStream, ByteArrayInputStream<p>
     * OutputStream-base: FileOutputStream, BufferOutputStream, ByteArrayOutputStream<p>
 * @CharacterStream: Đọc ghi dữ liệu dạng ký tự (16-bit Unicode)<p>
     * Use Case: Dùng khi dữ liệu là text (chữ, số, ký tự) (txt, html, json, xml) + encoding utf-16
     * Reader-based: FileReader, BufferReader, InputStreamReader<p>
     * Writer-based: FileWriter, BufferWriter, InputStreamWriter<p>
 * @BufferIO: Cải thiện hiệu năng
 * @FileIO:
 * @Serialization: Biến đổi đối tượng thành byte để save/truyền qua mạng
 * @DataStream
 *
 * @2.Non-IO
 */
public class IO {
    public static void main(String[] args) {
        /*
        Mỗi try-with-resources block tự động đóng reader hoặc writer.
        Đọc và ghi được tách riêng → không xung đột file handle.
        flush() đảm bảo dữ liệu thực sự được ghi ra đĩa.
         */
        try {
            BufferedReader reader = new BufferedReader(new FileReader("/home/duong/test-java3/AdvanceJava/src/main/java/org/example/InputOutput/text.txt"));
            String line;
            while ((line = reader.readLine())!=null){
                System.out.println(line);
                System.out.println("End Line");
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("/home/duong/test-java3/AdvanceJava/src/main/java/org/example/InputOutput/textOutput.txt", true));
            writer.write("This is line 1 writing in JavaIO API\n");
            writer.write("This is line 2 writing in JavaIO API\n");
            writer.write("This is line 3 writing in JavaIO API\n");
            writer.write("This is line 4 writing in JavaIO API\n");
            writer.flush(); // bảo đảm ghi xong
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
