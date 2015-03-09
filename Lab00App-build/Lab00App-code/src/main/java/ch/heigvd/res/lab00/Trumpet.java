package ch.heigvd.res.lab00;

/**
 * Created by alexandreperez on 09.03.15.
 */
public class Trumpet implements IInstrument {

    @Override
    public String play() {
        return "pouet";
    }

    @Override
    public String getColor() {
        return "golden";
    }

    @Override
    public Integer getSoundVolume() {
        return 2;
    }
}
