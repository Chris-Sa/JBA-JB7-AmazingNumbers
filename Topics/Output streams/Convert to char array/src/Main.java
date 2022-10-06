import java.io.IOException;
import java.io.CharArrayWriter;
import java.util.Scanner;

class Converter {
    public static char[] convert(String[] words) throws IOException {
        // implement the method

        CharArrayWriter charArrayWriter = new CharArrayWriter();
        for (String word : words) {
            charArrayWriter.write(word);
        }
        char[] chars = charArrayWriter.toCharArray();
        return chars;
    }
}