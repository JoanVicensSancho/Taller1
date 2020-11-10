public class Autor {
    
    private String nom;
    private Obra[] obres = new Obra[2];


    //CONSTRUCTOR
    public Autor(String nom, Obra[] obres){
        this.nom = nom;
        this.obres = obres;
    }

    //OBRA MES LLARGA
    public void obraMesLlarga(){
        int comparador = 0;

        for (int i = 0; i < obres.length; i++){
            if (comparador <= obres[i].getNumPagines()){
                comparador = obres[i].getNumPagines();
            }
        }
    }
}
