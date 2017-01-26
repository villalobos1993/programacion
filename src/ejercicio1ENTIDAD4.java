import java.lang.reflect.Array;

public class ejercicio1ENTIDAD4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[];
		array=ConcatenArraysPro();
		
		
		
	}

	public static int[] ConcatenArraysPro (){
		int array1[]={1,2,3};
		int array2[]={4,5,6,7,2};
		int suma;
		
		suma=array1.length+array2.length;
		int array3[]=new int [suma];
		for(int i=0; i<array1.length;i++){
			array3[i]=array1[i];
		}
		int contador=0;
		
		for(int i=array1.length;i<suma;i++){
			array3[i]=array2[contador];
			contador=contador+1;
		}
		
		for(int i=0;i<array3.length;i++){
		System.out.println(array3[i]);}
		return array3;
	}
}
