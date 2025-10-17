package pokemonClasses;

import pokemonAttacks.AirSlash;
import pokemonAttacks.Peck;
import pokemonAttacks.SandAttack;
import pokemonAttacks.Slash;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class Farfetchd extends Pokemon {
    public Farfetchd(String name, int lvl) {
        super(name, lvl);            
        this.setStats(52, 90, 55, 58, 62, 60);
        this.setType(Type.NORMAL, Type.FLYING);

        this.setMove(new Slash(),
                    new SandAttack(),
                    new Peck(),
                    new AirSlash());
    }
}

