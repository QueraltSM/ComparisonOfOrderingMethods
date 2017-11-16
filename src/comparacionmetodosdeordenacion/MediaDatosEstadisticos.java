package comparacionmetodosdeordenacion;
public class MediaDatosEstadisticos{
    
    private int nDatosEstadisticos;
    private float tiempoTotal, nComparaciones, nMovimientos;
    
    public MediaDatosEstadisticos(){}
    
    public void añadeDatosEstadisticos(DatosEstadisticos de){
        tiempoTotal += de.dameTiempo();
        nComparaciones += de.dameComparaciones();
        nMovimientos += de.dameMovimientos();
        nDatosEstadisticos++;
    }
    
    public float dameMediaTiempos(){
        return tiempoTotal/nDatosEstadisticos;
    }
    
    
    public float dameMediaComparaciones(){
        return nComparaciones/nDatosEstadisticos;
    }
    
    public float dameMediaMovimientos(){
        return nMovimientos/nDatosEstadisticos;
    } 
}