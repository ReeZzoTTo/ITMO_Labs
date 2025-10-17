package pokemonAttacks;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Type;

public class AirSlash extends SpecialMove {
    public AirSlash() {
        super(Type.FLYING, 75, 95);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.3) {
            Effect.flinch(p);
        }
    }

    @Override
    public String describe() {
        return "разрывает соперника воздушным ударом";
    }
}

