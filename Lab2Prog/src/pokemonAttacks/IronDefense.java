package pokemonAttacks;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class IronDefense extends StatusMove {
    public IronDefense() {
        super(Type.STEEL, 0, 0); 
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        Effect ironDefenseEffect = new Effect().stat(Stat.DEFENSE, 2);
        p.addEffect(ironDefenseEffect);
    }

    @Override
    protected String describe() {
        return "использует стальную защиту и усиливает свою броню";
    }
}