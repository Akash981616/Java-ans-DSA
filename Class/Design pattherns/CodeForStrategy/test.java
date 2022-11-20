package CodeForStrategy;

import CodeForStrategy.Kicks.NoKicking;
import CodeForStrategy.Punch.UpperCut;
import CodeForStrategy.Wrestling.ChokeSlen;

public class test {
    public static void main(String[] args) {
        Fighter o1 = new Fighter();
        o1.kb = new NoKicking();
        o1.pb = new UpperCut();
        o1.wb = new ChokeSlen();
        o1.fight();
    }
    
}




