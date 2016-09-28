package site.trons.jlex.php;

/**
 * Created by trons on 16/9/28.
 */
public class Utils {

    public static boolean isBlank(char c) {
        return ('\b' == c
                || '\t' == c
                || '\n' == c
                || '\f' == c
                || '\r' == c
                || ' ' == c);
    }

    public static void main(String[] args) {
        System.out.println(Utils.isBlank('\b'));
    }
}
