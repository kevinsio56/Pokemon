import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        Pokemon p1 = new PokemonFeu("Salamèche", 12);
        Pokemon p2 = new PokemonEau("Carapuce", 11);
        Pokemon p3 = new PokemonElectrik("Pikachu", 100);

        List<Pokemon> l = new ArrayList<>();
        l.add(p1);
        l.add(p2);
        l.add(p3);

        for (Pokemon p : l) {
            p.attaquer();
        }


    }
}