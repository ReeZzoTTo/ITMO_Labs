package pokemonClasses;

import pokemonAttacks.SludgeBomb;
import pokemonAttacks.Venoshock;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Oddish extends Pokemon {
    public Oddish(String name, int lvl) {
        super(name, lvl);
        this.setType(Type.GRASS, Type.POISON);
        this.setStats(45, 50, 55, 75, 65, 30);
        this.setMove(new SludgeBomb(),
                     new Venoshock());
    }
}
