/*
 * Lenguajes de programación I
 * Facultad de Ingeniería
 * Universidad Autónoma de Campeche
 */
package arregloslp1;

/**
 *
 * @author danieljaimes
 */
public class ArreglosLP1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Declarar el arreglo y asignarle la cantidad fija de elementos
        int promedios[] = new int[5];

        
        //asignamos un valor
        promedios[3] = 8;
        
        for (int i = 0; i < 5; i++) {
            System.out.println("promedios = [" + i + "] = " + promedios[i]);
        }
        
        // longitud del arreglo
        System.out.println("Elementos = " + promedios.length);
        
        // Matriz, arreglo bidimensional
        int matriz[][] = new int[5][5];
        
        // asignar un valor
        matriz[2][4] = 10;
        
        int k= 0;
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                k = i +j;
                System.out.println("matriz = [" + i + "]" + "[" + j + "] = " + matriz[i][j]);
                
            }
        }
    }
    
}
