package pokemonAttacks;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class RockPolish extends StatusMove {
    public RockPolish() {
        super(Type.ROCK, 0, 0);
    }
    
    @Override
    protected void applySelfEffects(Pokemon p) {
        Effect highUpSpeed = new Effect().stat(Stat.SPEED, 2);
        p.addEffect(highUpSpeed);
    }

    @Override
    protected String describe() {
        return "использует Rock Polish";
    }
}
