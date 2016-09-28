package site.trons.jlex.php;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

/**
 * Created by trons on 16/9/28.
 */
public class Input {

    /**
     * 读取buffer
     */
    public char[] line;
    /**
     * 读取行数
     */
    private long lineNumber;

    private final boolean EOF = false;
    private final boolean NOT_EOF = true;
    /**
     * 输入源
     */
    private BufferedReader input;

    public Input(Reader input) {
        if(input == null)
            System.out.println("input source init fail!!!!");
        this.input = new BufferedReader(input);

        this.line = null;
        this.lineNumber = 0;
    }

    public boolean getLine() throws IOException {
        String lineStr;


        while (true) {
            /**
             * 判断是否获取到
             */
            if (null == (lineStr = input.readLine()))
                return EOF;

            line = (lineStr + "\n").toCharArray();
            ++lineNumber;

            /**
             * 丢弃空行
             */
            int elem = 0;
            int lineLength = line.length;
            while (Utils.isBlank(line[elem])) {
                ++elem;
                if (elem == lineLength) {
                    break;
                }
            }

            if (elem < lineLength) {
                break;
            }
        }

        return NOT_EOF;
    }

    public long getLineNumber() {
        return lineNumber;
    }
}
