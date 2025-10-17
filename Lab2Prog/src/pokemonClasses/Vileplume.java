package pokemonClasses;

import pokemonAttacks.DoubleTeam;

public final class Vileplume extends Gloom {
    public Vileplume(String name, int lvl) {
        super(name, lvl);
        this.setStats(75, 80, 85, 110, 90, 50);
        this.addMove(new DoubleTeam());
    }
}
