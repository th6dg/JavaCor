package org.example.Collection.Queue;

import java.util.ArrayDeque;
import java.util.ArrayList;

/**
 *  @Overview: Double-ended Queue + Dynamic Array
 *
 *  @Feature:
 *      Dynamic size
 *      High Performance ( > Stack, > LinkedList )
 *      Not null
 *      Not thread-safe
 *
 *  @Method:
 *      addFirst(e) / poolFirst(e) / peekFirst(e)
 *      addLast(e) / poolLast(e) / peekLast(e)
 *      push(e) / pop()
 *
 *  @Compare:
 *      ArrayDeque vs Stack
 *      ArrayDeque vs Vector
 *      ArrayDeque vs LinkedList
 */
public class ArrayDequeue1 {
    public static void main(String[] args) {
        ArrayDeque<String> a = new ArrayDeque<>();
        ArrayList<String> b = new ArrayList<>();
    }
}
