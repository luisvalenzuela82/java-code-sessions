/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package org.javacodesessions.ejemplosplit;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.ArrayUtils;

/**
 *
 * @author Luis Valenzuela
 */
public class EjemploSplit {

    private static String[] splitWorker(final String str, final char separatorChar, final boolean preserveAllTokens) {
        // Performance tuned for 2.0 (JDK1.4)

        if (str == null) {
            return null;
        }
        final int len = str.length();
        if (len == 0) {
            return ArrayUtils.EMPTY_STRING_ARRAY;
        }
        final List<String> list = new ArrayList<>();
        int i = 0;
        int start = 0;
        boolean match = false;
        boolean lastMatch = false;
        while (i < len) {
            if (str.charAt(i) == separatorChar) {
                if (match || preserveAllTokens) {
                    list.add(str.substring(start, i));
                    match = false;
                    lastMatch = true;
                }
                start = ++i;
                continue;
            }
            lastMatch = false;
            match = true;
            i++;
        }
        if (match || preserveAllTokens && lastMatch) {
            list.add(str.substring(start, i));
        }
        return list.toArray(ArrayUtils.EMPTY_STRING_ARRAY);
    }

    public static void main(String[] args) {
        String testString = "Hello,World,,This,Is,A,Test";
        char separatorChar = ',';
        boolean preserveAllTokens = true;

        String[] result = splitWorker(testString, separatorChar, preserveAllTokens);

        for (int i = 0; i < result.length; i++) {
            System.out.println("Subcadena " + i + ": " + result[i]);
        }
    }
}
