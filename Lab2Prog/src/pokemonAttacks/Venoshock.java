package pokemonAttacks;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Type;

public class Venoshock extends SpecialMove {
    public Venoshock() {
        super(Type.POISON, 65, 100);
    }

    @Override
    protected double calcBaseDamage(Pokemon att,
                                     Pokemon def) {
        double baseDamage = super.calcBaseDamage(att, def);
        
        if (def.getCondition() == Status.POISON)
            return baseDamage * 2;
        return baseDamage;
    }    

    @Override
    protected String describe() {
        return "использует ВЕНОШОК";
    }    
}
