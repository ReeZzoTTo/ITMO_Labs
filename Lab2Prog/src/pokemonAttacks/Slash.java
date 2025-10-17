package pokemonAttacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Slash extends PhysicalMove{
    public Slash() {
        super(Type.NORMAL, 70, 100);              
    }

    @Override
    protected double calcCriticalHit(Pokemon att,
                                     Pokemon def) {
        if (Math.random() < 1.0/8.0) 
            return 2.0;
        return 1.0;

    }

    @Override
    public String describe() {
        return "рассекает соперника";
    }    
}
