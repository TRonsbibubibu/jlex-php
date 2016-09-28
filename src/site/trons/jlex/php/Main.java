package site.trons.jlex.php;

/**
 * Created by trons on 16/9/28.
 */
public class Main {
    public static void main(String[] args) {
        LexGenerator lg;
        if(args.length < 1){
            System.out.println("请输入文件路径");
            return;
        }

        try {
            lg = new LexGenerator(args[0]);
            lg.parser();
        }catch (Exception e){
            System.out.println(e.getStackTrace());
        }

    }
}
