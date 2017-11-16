package comparacionmetodosdeordenacion;
public class CalculadorEstadisticas {
    
    public static DatosEstadisticos estadisticaOrdenaVector(OrdenarVector m, int tam_vector, boolean modo){
        DatosEstadisticos de = new DatosEstadisticos();
        int[] v = GeneraCaso.generaVector(tam_vector, modo);
        m.ordena(v, de);
        CompruebaCaso.compruebaVector(v, tam_vector);
        return de;
    }
    
    public static MediaDatosEstadisticos estadisticaOrdenaVectorAleatorio(OrdenarVector m, int tam_vector){
        MediaDatosEstadisticos mediaDe = new MediaDatosEstadisticos();
        
        for (int i = 0; i < 11; i++){
            mediaDe.añadeDatosEstadisticos(estadisticaOrdenaVector(m, tam_vector, true));
        }
        return mediaDe;
    }
    
    public static DatosEstadisticos[] estadisticasOrdenaVectoresInversos(OrdenarVector m, int[] tam_vectores){
        DatosEstadisticos[] vecDe = new DatosEstadisticos[tam_vectores.length];
        
        for (int i = 0; i < tam_vectores.length; i++){
            vecDe[i] = estadisticaOrdenaVector(m, tam_vectores[i], false);
        }
        return vecDe;
    }
    
    public static MediaDatosEstadisticos[] estadisticasOrdenaVectoresAleatorios(OrdenarVector m, int[] tam_vectores){
        MediaDatosEstadisticos[] vecMediaDe = new MediaDatosEstadisticos[tam_vectores.length];
        for (int i = 0; i < tam_vectores.length; i++){
            vecMediaDe[i] = estadisticaOrdenaVectorAleatorio(m, tam_vectores[i]);
        }
        return vecMediaDe;
    }
}