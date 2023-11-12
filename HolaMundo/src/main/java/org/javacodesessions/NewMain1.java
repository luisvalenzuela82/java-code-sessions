package org.javacodesessions;

/**
 *
 * @author Java Code Sessions
 */
public class NewMain1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola Mundo " + args[0]);
        
        for (String s : args) {
            System.out.println(s);
        }
        NewMain2.main(new String[]{"A", "B", "C"});
    }
    
}
