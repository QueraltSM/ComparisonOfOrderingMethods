package comparacionmetodosdeordenacion;
public class DatosEstadisticos{
    
    private double tiempo;
    private int comp, mov;
    
    public DatosEstadisticos(){
        tiempo = 0; comp = 0; mov = 0;
    }
    public void añadeTiempo(double tiemponuevo){
        tiempo += tiemponuevo;
    }
    public void estableceTiempo(double tiemponuevo){
        tiempo = tiemponuevo;
    }
    public double dameTiempo(){
        return tiempo;
    }
    public void añadeComparacion(){
        comp++;
    }
    public void añadeMovimiento(){
        mov++;
    }
    public void estableceComparaciones(int comp){
        this.comp = comp;
    }
    public void estableceMovimientos(int mov){
        this.mov = mov;
    }
    public int dameComparaciones(){
        return comp;
    }
    public int dameMovimientos(){
        return mov;
    }
}