package pokemonClasses;

import pokemonAttacks.Tackle;
import pokemonAttacks.RockPolish;
import pokemonAttacks.StoneEdge;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Bergmite extends Pokemon {
    public Bergmite(String name, int lvl) {
        super(name, lvl);
        this.setType(Type.ICE);
        this.setStats(55, 69, 85, 32, 35, 28);
        this.setMove(new StoneEdge(),
                     new RockPolish(),
                     new Tackle());
    }
}
