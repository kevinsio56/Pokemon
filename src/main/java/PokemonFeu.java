public class PokemonFeu extends Pokemon implements Attaquant{

    public PokemonFeu(String nom, int niveau) {
        super(nom, niveau);
    }

    @Override
    public void attaquer() {
        System.out.println(nom+" utilise lance flamme");
    }
}
