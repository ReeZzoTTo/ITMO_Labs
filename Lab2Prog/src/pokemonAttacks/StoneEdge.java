package pokemonAttacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class StoneEdge extends PhysicalMove {
    public StoneEdge() {
        super(Type.ROCK, 100, 80);
    }

    @Override
    protected double calcCriticalHit(Pokemon att,
                                     Pokemon def) {
        if (Math.random() < 1.0/8.0) {
            return 2.0;
        }
        return 1.0;
    }

    @Override
    protected String describe() {
        return "атакует соперника каменной глыбой";
    }
}
