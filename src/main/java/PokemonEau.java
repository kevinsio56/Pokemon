public class PokemonEau extends Pokemon implements Attaquant{

    public PokemonEau(String nom, int niveau) {
        super(nom, niveau);
    }

    @Override
    public void attaquer() {
        System.out.println(nom + " utilise hydrocanon");
    }
}
