public class PokemonElectrik extends Pokemon implements Attaquant{

    public PokemonElectrik(String nom, int niveau) {
        super(nom, niveau);
    }

    @Override
    public void attaquer() {
        System.out.println(nom +" utilise fatale-foudre");
    }
}
