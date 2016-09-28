package site.trons.jlex.php;

import site.trons.jlex.php.entity.Dfa;
import site.trons.jlex.php.entity.Nfa;

/**
 * Created by trons on 16/9/28.
 */
public class Nfa2Dfa {

    private Nfa NStart;
    private Dfa DStart;

    public Nfa2Dfa(Nfa NStart, Dfa DStart) {
        this.NStart = NStart;
        this.DStart = DStart;
    }

    public static void main(String[] args) {
        Nfa Nstart = new Nfa();
    }
}
