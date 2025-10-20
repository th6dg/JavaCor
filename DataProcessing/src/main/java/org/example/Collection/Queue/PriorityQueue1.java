package org.example.Collection.Queue;

import java.util.PriorityQueue;

/**
 *  @Overview:
 *      Cây nhị phân - Binary Heap
 *      Sắp xếp theo độ ưu tiên
 *      Thường lưu bằng mảng (Object[])
 *
 *  @Feature:
 *      Heap chỉ đảm bảo phần tử nhỏ nhất (hoặc lớn nhất) ở gốc (queue[0])
 *      Các phần tử còn lại không được sắp xếp toàn bộ, chỉ tuân thủ quy tắc cha–con
 *      Comparator
 *
 *  @Method:
 *      add() / offer(): O(logn)
 *      poll(): O(logn)
 *      peek(): O(1)
 *      remove(o)
 *      size(),...
 *
 *  @UseCase:
 *      Khi cần xử lý theo mức độ ưu tiên
 */
public class PriorityQueue1 {
    public static void main(String[] args) {
        PriorityQueue<Integer>  a = new PriorityQueue<>();
    }
}

