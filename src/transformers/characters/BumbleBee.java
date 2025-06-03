package transformers.characters;

import interfaces.mode.IVehicle;
import transformers.autobot.Commander;

public class BumbleBee extends Commander implements IVehicle {
    public BumbleBee(int health) {
        super(health);
    }

    @Override
    public void drive() {
        if (!isAltMode) return;

        System.out.println("Bumble Bee is following Optimus Prime");
    }
}
