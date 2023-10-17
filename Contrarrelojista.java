
package ej_4_8_carreraciclistica;

public class Contrarrelojista extends Ciclista{
    private double velocidadMaxima;
    public Contrarrelojista(int identificador, String nombre, double velocidadMaxima){
        super(identificador, nombre);
        this.velocidadMaxima=velocidadMaxima;
    }
    protected double getVelocidadMaxima(){
        return velocidadMaxima;
    }
    protected void setVelocidadMaxima(double velodidadMaxima){
        this.velocidadMaxima=velocidadMaxima;
    }
    protected void imprimir(){
        super.imprimir();
        System.out.println("Aceleracion promedio="+velocidadMaxima);
    }
    protected String imprimirTipo(){
        return "Es un contrarrelojista";
    }
}
