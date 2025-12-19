public abstract class Pokemon implements Attaquant {
    protected String nom;
    protected int niveau;



    public Pokemon(String nom, int niveau) {
        this.nom = nom;
        this.niveau = niveau;
    }

    public void afficherInfos(){
        System.out.println("Nom : "+nom+ " niveau : "+niveau);
    }
}
