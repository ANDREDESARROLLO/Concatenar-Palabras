import java.security.PublicKey;

/*
En este ejercicio tenéis que crear un bucle que permita concatenar textos
e imprima el resultado final por consola.

Tened en cuenta que los textos pueden venir de un array de tipo String.
 */
public class Main {
    public static void main (String[] args){
        String[] texto = { "felipe" , "carlos", "messi" , "ronaldo" };
        String resultadi = " ";

        for( String resul : texto){
            resultadi += resul;


            }
        System.out.println( resultadi);


        }

    }


