package comparacionmetodosdeordenacion;
public class Ordenar2Vector implements OrdenarVector{
    
    @Override
    public String nombreMetodo(){
        return "Contadores de distribución";
    }
    
    @Override
    public void ordena(int[] vec, DatosEstadisticos de){
        System.arraycopy(ordena2(vec, de),0,vec,0,vec.length);
    }
    
    private int maximo(int[] vec){
        int res = 0;
        for (int i : vec) {
            if(i > res) res = i;
        }
        return res;
    }
    
    private int[] ordena2(int[] vec, DatosEstadisticos de){
        int[] vecs = new int[vec.length];
        int[] frec = new int[maximo(vec)+2];
        double time = System.currentTimeMillis();
        for (int i = 0; i < frec.length; i++) {
            frec[i] = 0;
        }
        
        for (int i = 0; i < vec.length; i++) {
            frec[vec[i]+1] = frec[vec[i]+1]+1;
            de.añadeMovimiento();
        }
        
        frec[0] = 1;
        
        for (int i = 1; i < frec.length-1; i++) {
            frec[i] = frec[i] + frec[i-1];
            de.añadeMovimiento();
        }
        
        for (int i = 0; i < vec.length; i++) {
            vecs[frec[vec[i]]-1] = vec[i];
            frec[vec[i]] = frec[vec[i]]+1;
            de.añadeMovimiento();
            de.añadeMovimiento();
        }
        de.estableceTiempo(System.currentTimeMillis() - time);
        return vecs;
    }
}