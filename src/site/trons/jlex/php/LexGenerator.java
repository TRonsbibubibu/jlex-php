package site.trons.jlex.php;

import java.io.*;

/**
 * Created by trons on 16/9/28.
 */
public class LexGenerator {

    private Input input;
    private PrintWriter output;

    public LexGenerator(String filename) throws IOException {

        /**
         * 初始化输入流
         */
        this.input = new Input(new FileReader(filename));
        if (null == this.input) {
            System.out.println("输入流初始化失败!!!");
            return;
        }

        /**
         * 初始化输出流
         */
        this.output = new PrintWriter(
                new BufferedWriter(
                        new FileWriter(filename + ".php")
                )
        );
        if(null == this.output){
            System.out.println("输出流初始化失败!!!");
            return;
        }
    }

    public void parser() throws IOException {

        for(int i = 0 ;i<= 1;i++){
            input.getLine();
            System.out.println(input.line);
        }
    }
}
