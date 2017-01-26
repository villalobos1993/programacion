import java.util.Scanner;

public class Ejercicio3Entiadad4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int []array={1,2,3,4,5};
		int array4[]=null;
		
		array4=change(array);
		for(int i=0; i<array.length; i++){
			System.out.print(array4[i]);
		}
	
	}

	public static int [] change(int [] array){
		int numero;
		int posicion;
		int array2[]=new int[array.length+2];
		for(int i=0; i<array.length; i++){
		     array2[i]=array[i];
		     array2[array.length]=0;
			}
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce el numero que quiere introducir en el array: ");
		numero=teclado.nextInt();
		System.out.println("introduce la posicion que quiere ponerlo: ");
		posicion=teclado.nextInt();
		int aux;
		for(int i=posicion; i<array2.length; i++){
		   if (i==posicion){
			  aux = array2[i];
			  array2[i]=numero;
			  array2[i+1]=aux;			   
		  }
			
		}
		return array2;}}

