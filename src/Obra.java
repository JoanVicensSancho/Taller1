public class Obra {

    private String titol;
    private String tematica;
    private int numPagines;

    //CONSTRUCTOR
    public Obra (String titol, String tematica, int numPagines){
        this.titol = titol;
        this.tematica = tematica;
        this.numPagines = numPagines;
    }

    //GETTERS
    public String getTitol(){
        return this.titol;
    }
    public int getNumPagines(){
        return this.numPagines;
    }
}
