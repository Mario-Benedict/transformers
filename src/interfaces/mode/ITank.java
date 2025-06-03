package interfaces.mode;

import transformers.Transformer;

public interface ITank extends IVehicle {
    void fire(Transformer target);
}
