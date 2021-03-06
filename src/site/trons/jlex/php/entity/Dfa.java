package site.trons.jlex.php.entity;

/**
 * Created by trons on 16/9/28.
 */
public class Dfa {

    /**
     * 下一个状态的值
     * null 为 ε输入
     */
    private char value;

    /**
     * 输入之后的转移状态
     */
    private Dfa next;

    /**
     * 是否终态
     */
    private boolean isEnd;

    public char getValue() {
        return value;
    }

    public void setValue(char value) {
        this.value = value;
    }

    public Dfa getNext() {
        return next;
    }

    public void setNext(Dfa next) {
        this.next = next;
    }

    public boolean isEnd() {
        return isEnd;
    }

    public void setEnd(boolean end) {
        isEnd = end;
    }
}
