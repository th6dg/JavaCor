package org.example.String;

/**
 *  String: Object acts like char[] (java8), byte[] value (java 9+)
 *  String / StringBuilder / String Buffer
 *
 *   { String } fixed size, immutable -> thay đổi String sẽ tạo instance mới
 *
 *  ----------------------------------------------------------------
 *  | String s1, s2 = "Hello world";  -> 2 reference to 1 instance |
 *  | String s1 = new String("Hello");                             |
 *  ----------------------------------------------------------------
 *
 *  Method: charAt, length(), format, substring,
 *          contains, join, equals, isEmpty,
 *          trim, concat, replace, split,
 *          toUpperCase, toLowerCase, valueOf,...
 *
 *  StringBuilder: String with dynamic size, mutable, not synchronize
 *
 *  StringBuffer: StringBuilder but synchronize(thread-safe)
 *
 */
public class S {
    public static void main(S[] args) {
        String s = new String("Hello world");
        StringBuilder sb = new StringBuilder("HW");
        StringBuffer stringBuffer = new StringBuffer("Hw");
    }
}
