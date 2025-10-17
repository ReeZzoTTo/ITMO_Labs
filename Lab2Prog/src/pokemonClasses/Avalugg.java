package pokemonClasses;

import pokemonAttacks.IronDefense;

public final class Avalugg extends Bergmite {
    public Avalugg(String name, int lvl) {
        super(name, lvl);
        this.setStats(95, 117, 184, 44, 46, 28);
        this.addMove(new IronDefense());
    }
}
