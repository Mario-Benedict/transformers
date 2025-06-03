package transformers.characters;

import interfaces.mode.IVehicle;
import transformers.autobot.Commander;

public class OptimusPrime extends Commander implements IVehicle {
    public OptimusPrime(int health) {
        super(health);
    }

    @Override
    public void drive() {
        if (!isAltMode) return;

        System.out.println("Optimus Prime is running away");
    }
}
