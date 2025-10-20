package org.example.Collection.Set;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/**
 *  @Overview:
 *      Hash table + Double-Linked list (3 reference)
 *
 *  @Feature:
 *      Không trùng lặp
 *      Kiểm soát thứ tự
 *
 *  @Method:
 *      add(e)
 *      remove(o)
 *      contain(o)
 *      clear(), isEmpty(), size(),...
 *
 *  @Advantage/Disadvantage:
 *      + o(1), thứ tự chèn
 *      + Tốn bộ nhớ
 */
public class LinkedHashSet1 {
    public static void main(String[] args) {
        LinkedHashSet<String> a = new LinkedHashSet<>();
    }
}
