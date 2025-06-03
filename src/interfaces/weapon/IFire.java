package interfaces.weapon;

import transformers.Transformer;

import java.util.List;

public interface IFire extends IWeapon {
    void infernoBurst(List<Transformer> targets);
}
