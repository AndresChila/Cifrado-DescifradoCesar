package cifrado.descifradocesar;
import java.util.Scanner;
/**
 *@author Andres Chila, Anderson Suarez
 * @version 1.0
 * @since 26/02/2017
 */
public class CifradoDescifradoCesar {
    
    public CifradoDescifradoCesar(){
        //Array con el abecedario
        char abecedario[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',' ',',',';'} ;
        //objeto scanner para la entrada por teclado
        Scanner teclado = new Scanner(System.in);
        //pregunta de que desea hacer el usuario
        System.out.print("Desea Cifrar o Descifrar?: ");
        //lectura de lo que se desea hacer
        String accion = teclado.nextLine();
        //se mira si quiere Cifrar o Descifrar
        if("cifrar".equals(accion) || "Cifrar".equals(accion)){
            //usuario ingresa la palabra cifrada
            System.out.print("Cual es la palabra a descifrar? ");
            String palabra= teclado.nextLine();
            System.out.print("Cual es la clave? ");
            int clave = teclado.nextInt();
            //se convierte la clave de string a char para poder hacer la comparacion letra por letra
            char palabraArreglo[] = palabra.toCharArray();
            //aqui se guarda la nueva posicion, osea la equivalencia a la letra acrual
            int numeroDescifrado;
            for(int i=0;i<palabraArreglo.length;i++){
                int posicion = 0;
                for(int j=0;j<abecedario.length;j++){
                    //se compara letra por letra, para saber la pocision en el abacedario
                    if(palabraArreglo[i]!= abecedario[j]){
                        posicion++;
                    }
                    else{
                        //formula para saber la pocision equivalente a la letra
                        numeroDescifrado=(clave+posicion)%abecedario.length;
                        System.out.print(abecedario[numeroDescifrado]);
                        System.out.print(" ");
                    }
                }
            }
        }
        if("descifrar".equals(accion) || "Descifrar".equals(accion)){
            //usuario ingresa la palabra cifrada
            System.out.print("Cual es la palabra a Cifrar? ");
            String palabra= teclado.nextLine();
            System.out.print("Cual es la clave? ");
            int clave = teclado.nextInt();
            //se convierte la clave de string a char para poder hacer la comparacion letra por letra
            char palabraArreglo[] = palabra.toCharArray();
            //aqui se guarda la nueva posicion, osea la equivalencia a la letra acrual
            int numeroCifrado;
            for(int i=0;i<palabraArreglo.length;i++){
                int posicion = 0;
                for(int j=0;j<abecedario.length;j++){
                    //se compara letra por letra, para saber la pocision en el abacedario
                    if(palabraArreglo[i]!= abecedario[j]){
                        posicion++;
                    }
                    else{
                        //formula para saber la pocision equivalente a la letra
                        numeroCifrado=(clave-posicion)%abecedario.length;
                        //si la posicion es negativa, multiplicar por -1
                        if(numeroCifrado<0){
                            numeroCifrado*=-1;
                        }
                        System.out.print(abecedario[numeroCifrado]);
                        System.out.print(" ");
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        CifradoDescifradoCesar cifradoDescifradoCesar = new CifradoDescifradoCesar();
    }
    
}
