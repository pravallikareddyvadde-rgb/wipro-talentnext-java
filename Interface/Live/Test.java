package Interface.Live;

import Interface.Music.Playable;
import Interface.Music.Veena;
import Interface.Music.Saxophone;

public class Test {

    public static void main(String[] args) {

        // a. Create an instance of Veena and call play()
        Veena v = new Veena();
        v.play();

        // b. Create an instance of Saxophone and call play()
        Saxophone s = new Saxophone();
        s.play();

        // c. Store the objects in Playable reference and call play()
        Playable p;

        p = v;
        p.play();

        p = s;
        p.play();
    }
}