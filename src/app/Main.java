package app;

import transformers.Decepticon;
import transformers.Transformer;
import transformers.autobot.Autobot;
import transformers.autobot.Dinobot;
import transformers.characters.*;
import weapons.*;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize Autobots and Decepticons
        Autobot optimusPrime = new OptimusPrime(2000);
        Autobot bumbleBee = new BumbleBee(1000);
        Dinobot grimlock = new Grimlock(1500);

        Decepticon megatron = new Megatron(2000);
        Decepticon starscream = new Starscream(1500);

        // Initialize Autobots and Decepticons Weapon
        optimusPrime.setWeapon(new IonBlaster(20, 10));
        bumbleBee.setWeapon(new PlasmaCannon(10, 5));
        grimlock.setWeapon(new SpikedClub(10), new Flamethrower(10));

        megatron.setWeapon(new FusionCannon(10, 10));
        starscream.setWeapon(new MachineGun(5, 50));

        // War Begin!
        optimusPrime.attack(megatron);
        megatron.attack(bumbleBee);
        grimlock.attack(starscream);
        ((Grimlock) grimlock).comboAttack(starscream);
        grimlock.transform();
        grimlock.tailAttack(megatron);
        grimlock.attack(List.of(megatron, starscream));
        bumbleBee.attack(starscream);
        starscream.attack(optimusPrime);
        ((Starscream) starscream).reload();
        starscream.attack(grimlock);
        megatron.attack(grimlock);
        ((Megatron) megatron).reload();
        megatron.attack(bumbleBee);
        megatron.transform();
        ((Megatron) megatron).fire(optimusPrime);
        optimusPrime.attack(starscream);

        // War Over!
        optimusPrime.transform();
        ((OptimusPrime) optimusPrime).drive();

        bumbleBee.transform();
        ((BumbleBee) bumbleBee).drive();

        ((Megatron) megatron).drive();

        starscream.transform();
        ((Starscream) starscream).fly();

        grimlock.run();

        // War Summary
        Map<String, Transformer> transformers = Map.of(
                "Optimus Prime", optimusPrime,
                "Bumble Bee", bumbleBee,
                "Grimlock", grimlock,
                "Megatron", megatron,
                "Starscream", starscream
        );

        transformers.forEach((name, transformer) -> {
            System.out.printf("%s:\n", name);
            System.out.printf("\t- Health: %d\n", transformer.getHealth());
            System.out.printf("\t- Max Health: %d\n", transformer.getMaxHealth());
        });

    }
}