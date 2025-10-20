package org.example;

/**
 *  Why basic syntax, this is byte-code
 *
 * | Nhóm                       | Ví dụ                                          | Vai trò                                   |
 * | -------------------------- | ---------------------------------------------- | ----------------------------------------- |
 * | Khai báo, toán tử          | `int`, `class`, +, -, *, /, %, &&,             | Định nghĩa dữ liệu, kiểu, hành vi         |
 * | Điều khiển luồng           | `if`, `for`, `while`, `switch`, `return`       | Quyết định hướng thực thi                 |
 * | Xử lý lỗi                  | `try`, `catch`, `finally`, `throw`             | Quản lý exception                         |
 * | Tổ chức code               | `package`, `import`                            | Đặt namespace và tái sử dụng              |
 * | Đồng bộ hóa                | `synchronized`, `volatile`                     | Điều khiển truy cập đa luồng              |
 * | Trừu tượng hóa             | `class`, `interface`, `abstract`, `implements` | OOP foundation                            |
 * | Khởi tạo / tham chiếu      | `new`, `this`, `super`, `static`               | Tạo đối tượng, gọi method                 |
 * | Cấu trúc ngữ nghĩa mới     | `lambda`, `var`, `record`, `enum`              | Cải tiến cú pháp để ngắn gọn, an toàn hơn |
 *
 *
 *
 *      LIBRARY CORE
 * |         Nhóm                   |         Package chính                                    |       Mục đích                         | “Gần máy” đến đâu |
 * | -------------------------------| ---------------------------------------------------------| -------------------------------------- | ----------------- |
 * |  Ngôn ngữ & đối tượng cơ bản   | `java.lang.*`                                            | String, Object, Thread, System, Math   | Cực gần           |
 * |  Collection & cấu trúc dữ liệu | `java.util.*`, `java.util.concurrent.*`                  | Map, List, Queue, Concurrent DS        | Trung bình        |
 * |  Concurrency / Threading       | `java.util.concurrent.*`                                 | ThreadPool, Lock, Future, Atomic       | Gần               |
 * |  I/O truyền thống (blocking)   | `java.io.*`                                              | File, Stream, Reader/Writer            | Gần               |
 * |  NIO (non-blocking I/O)        | `java.nio.*`, `java.nio.channels.*`, `java.nio.file.*`   | Buffer, Channel, Selector, FileChannel | Rất gần           |
 * |  Memory & Unsafe access        | `sun.misc.Unsafe`, `VarHandle`                           | Truy cập trực tiếp vùng nhớ            | Rất gần           |
 * |  Networking                    | `java.net.*`, `java.nio.channels.SocketChannel`          | TCP, UDP, HTTP, multicast              | Gần               |
 * |  Serialization / Reflection    | `java.io.Serializable`, `java.lang.reflect.*`            | Serialize object, inspect class        | Xa hơn            |
 * |  Security / Crypto             | `java.security.*`, `javax.crypto.*`                      | KeyPair, Cipher, Signature             | Trung bình        |
 * |  Process / OS Integration      | `java.lang.Process`, `ProcessBuilder`, `System.getenv()` | Chạy lệnh hệ điều hành, env var        | Gần               |
 * |  Utilities & Time              | `java.util.*`, `java.time.*`                             | DateTime API, Random, Formatter        | Trung bình        |
 */

public class Main {
    public static void main(String[] args) {

    }
}