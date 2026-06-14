package week2.oops.music.wind;

import week2.oops.music.Playable;

public class Saxophone implements Playable {

    @Override
    public void play() {
        System.out.println("Playing Saxophone");
    }
}
