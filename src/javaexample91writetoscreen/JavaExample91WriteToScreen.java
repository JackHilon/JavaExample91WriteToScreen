
package javaexample91writetoscreen;

import java.io.PrintWriter;


public class JavaExample91WriteToScreen {

    
    public static void main(String[] args) {
        
        /*
        Prints formatted representations of objects to a text-output stream. 
        This class implements all of the print methods found in PrintStream. 
        It does not contain methods for writing raw bytes, for which a program 
        should use unencoded byte streams.
        
        Unlike the PrintStream class, if automatic flushing is enabled it will
        be done only when one of the println, printf, or format methods is
        invoked, rather than whenever a newline character happens to be output. 
        These methods use the platform's own notion of line separator rather 
        than the newline character.

        Methods in this class never throw I/O exceptions, although some of 
        its constructors may. The client may inquire as to whether any errors 
        have occurred by invoking checkError().
        */
        
        /*
        public PrintWriter(Writer out, boolean autoFlush);
        out - A character-output stream
        autoFlush - A boolean; if true, the println, printf, 
        or format methods will flush the output buffer
        */
        
        PrintWriter pw = new PrintWriter(System.out, true);
        
        boolean flag = true;
        byte bt = 12;
        short s = 300;
        int n = 8777;
        long l = 888888875654L;
        float f = 8776656.8765F;
        double d = 87877655.76554;
        char a = 'A';
        char[] arr = {'A', 'B', 'C', 'D', 'E'};
        String str = "abcdefgh";
        Integer m = new Integer(532);
        
        pw.println(flag);
        pw.print(bt+" ");
        pw.print(s+" ");
        pw.println(n);
        pw.print(l+" ");
        pw.print(f+" ");
        pw.print(d+" ");
        pw.println(a);
        pw.println(arr);
        pw.println(str);
        pw.println(m);
        
        pw.close();

    }
    
}
