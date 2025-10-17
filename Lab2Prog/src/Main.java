import pokemonClasses.Avalugg;
import pokemonClasses.Bergmite;
import pokemonClasses.Farfetchd;
import pokemonClasses.Gloom;
import pokemonClasses.Oddish;
import pokemonClasses.Vileplume;
import ru.ifmo.se.pokemon.Battle;


public class Main {
    public static void main(String[] args) { 
        Battle battle = new Battle();

        Farfetchd pFarfetchd = new Farfetchd("Фарфэч", 1);
        Avalugg pAvalugg = new Avalugg("Авалугг", 1);
        Bergmite pBergmite = new Bergmite("Бергмит", 1);
        Oddish pOddish = new Oddish("Одиш", 1);
        Gloom pGloom = new Gloom("Глум", 1);
        Vileplume pVileplume = new Vileplume("Вильплум", 1);

        battle.addAlly(pFarfetchd);
        battle.addAlly(pAvalugg);
        battle.addAlly(pGloom);

        battle.addFoe(pBergmite);        
        battle.addFoe(pVileplume);
        battle.addFoe(pOddish);

        battle.go();
    }
}




// scp -P 2222 Pokemon.jar s501178@se.ifmo.ru:~/lab2prog
// scp -P 2222 Main.java s501178@se.ifmo.ru:~/lab2prog
// scp -r -P 2222 pokemonAttacks s501178@se.ifmo.ru:~/lab2prog
// scp -r -P 2222 pokemonClasses s501178@se.ifmo.ru:~/lab2prog

// ssh -p 2222 s501178@se.ifmo.ru
// cd lab2prog
// javac -cp .:Pokemon.jar Main.java pokemonAttacks/*.java pokemonClasses/*.java
// touch manifest.txt
// echo "Main-Class: Main" >> manifest.txt
// echo "Class-Path: Pokemon.jar" >> manifest.txt
// jar cfm MyPokemonBattle.jar manifest.txt Main.class pokemonAttacks/*.class pokemonClasses/*.class
