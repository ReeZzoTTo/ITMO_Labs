package pokemonClasses;

import pokemonAttacks.Absorb;

public class Gloom extends Oddish {
    public Gloom(String name, int lvl) {
        super(name, lvl);
        this.setStats(60, 65, 70, 85, 75, 40);
        this.addMove(new Absorb());
    }
}
