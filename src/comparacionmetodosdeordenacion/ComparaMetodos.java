package comparacionmetodosdeordenacion;
public class ComparaMetodos {
    static int[] sizes = {1000,2000,4000,8000,16000,32000};
    
    public static void main(String[] args) {
        table(new Ordenar1Vector());
        System.out.println("--------------------------------");
        table(new Ordenar2Vector());
    }
    
    private static void table(OrdenarVector ov){
        System.out.println(ov.nombreMetodo());
        DatosEstadisticos[] deVecInverso = CalculadorEstadisticas.estadisticasOrdenaVectoresInversos(ov, sizes);
        MediaDatosEstadisticos[] mediaDeVecRnd = CalculadorEstadisticas.estadisticasOrdenaVectoresAleatorios(ov, sizes);
        
        System.out.println("\nVector inversamente ordenado\n");
        System.out.printf("        %-10s %-15s %-10s\n", "Tiempo", "Comparaciones", "Movimientos");
        
        for(int i = 0; i<sizes.length; i++){
            System.out.printf("%8d %10f %15d %10d\n",
                sizes[i],
                deVecInverso[i].dameTiempo(),
                deVecInverso[i].dameComparaciones(),
                deVecInverso[i].dameMovimientos());
        }
        
        System.out.println("\nVector aleatorio\n");
        System.out.printf("        %-10s %-15s %-10s\n", "Tiempo", "Comparaciones", "Movimientos");
        
        for (int i = 0; i<sizes.length; i++){
            System.out.printf("%8d %10f %15f %10f\n",
                sizes[i],
                mediaDeVecRnd[i].dameMediaTiempos(),
                mediaDeVecRnd[i].dameMediaComparaciones(),
                mediaDeVecRnd[i].dameMediaMovimientos());
        }
    }
}