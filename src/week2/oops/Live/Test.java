package week2.oops.Live;

import week2.oops.music.Playable;
import week2.oops.music.String.Veena;
import week2.oops.music.wind.Saxophone ;

public class Test {

    public static void main(String[] args) {
        Veena v = new Veena();
        v.play();
        Saxophone s = new Saxophone();
        s.play();
        Playable p;

        p = new Veena();
        p.play();

        p = new Saxophone();
        p.play();
    }
}