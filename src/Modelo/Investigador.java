package Modelo;
import Lugar.Lugar;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class Investigador extends Personaje{
    
    protected String tipo;
    protected  int voluntad;
    protected   int intelecto;
    protected  int comodin;
    protected int acciones;
    protected int numeroPistas;
    protected  String habilidadPropia;
    protected  MazoInvestigador mazo;
    protected int numeroRecursos = 5;

    abstract int  efectoEstrella();
    
    public void moverPersonaje(ArrayList<Lugar> lugares, int posicion, Personaje personaje) {
       Lugar lugar=lugares.get(posicion);
       personaje.setLugar(lugar);
    }
     
     public void getRecursoFase() {
         
         setNumeroRecursos(getNumeroRecursos() + 1);
         System.out.println("Tienes "+getNumeroRecursos()+" recursos");
     }
     
     public void getRecursoRobo() {
         
         setNumeroRecursos(getNumeroRecursos() + 1);
         System.out.println("Tienes "+getNumeroRecursos()+" recursos");
     }
     
     public void getRecursoEfecto() {
         
         System.out.println("¿Cuántos recursos tienes que obtener?");
         Scanner sq=new Scanner(System.in);
         int numero=sq.nextInt();
         int contador=0;
         while (contador<numero){
             
             setNumeroRecursos(getNumeroRecursos() + 1);
             contador++;
         }
         
         System.out.println("Tienes "+getNumeroRecursos()+" recursos");
     }

    public int getNumeroRecursos() {
        return numeroRecursos;
    }

    @Override
    public String toString() {
        return "Investigador{" + "tipo=" + tipo + ", voluntad=" + voluntad + ", intelecto=" + intelecto + ", comodin=" + comodin + ", acciones=" + acciones + ", numeroPistas=" + numeroPistas + ", habilidadPropia=" + habilidadPropia + ", mazo=" + mazo + ", numeroRecursos=" + numeroRecursos + '}';
    }
     
     
    

  public Investigador(){
      
  }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the voluntad
     */
    public int getVoluntad() {
        return voluntad;
    }

    /**
     * @param voluntad the voluntad to set
     */
    public void setVoluntad(int voluntad) {
        this.voluntad = voluntad;
    }

    /**
     * @return the intelecto
     */
    public int getIntelecto() {
        return intelecto;
    }

    /**
     * @param intelecto the intelecto to set
     */
    public void setIntelecto(int intelecto) {
        this.intelecto = intelecto;
    }

    /**
     * @return the comodin
     */
    public int getComodin() {
        return comodin;
    }

    /**
     * @param comodin the comodin to set
     */
    public void setComodin(int comodin) {
        this.comodin = comodin;
    }

    /**
     * @return the acciones
     */
    public int getAcciones() {
        return acciones;
    }

    /**
     * @param acciones the acciones to set
     */
    public void setAcciones(int acciones) {
        this.acciones = acciones;
    }

    /**
     * @return the numeroPistas
     */
    public int getNumeroPistas() {
        return numeroPistas;
    }

    /**
     * @param numeroPistas the numeroPistas to set
     */
    public void setNumeroPistas(int numeroPistas) {
        this.numeroPistas = numeroPistas;
    }

    /**
     * @return the habilidadPropia
     */
    public String getHabilidadPropia() {
        return habilidadPropia;
    }

    /**
     * @param habilidadPropia the habilidadPropia to set
     */
    public void setHabilidadPropia(String habilidadPropia) {
        this.habilidadPropia = habilidadPropia;
    }

    /**
     * @return the mazo
     */
    public MazoInvestigador getMazo() {
        return mazo;
    }

    /**
     * @param mazo the mazo to set
     */
    public void setMazo(MazoInvestigador mazo) {
        this.mazo = mazo;
    }

    /**
     * @param numeroRecursos the numeroRecursos to set
     */
    public void setNumeroRecursos(int numeroRecursos) {
        this.numeroRecursos = numeroRecursos;
    }
}
