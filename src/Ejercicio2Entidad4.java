
public class Ejercicio2Entidad4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []array={1,2,3,4,5,6,7,8,9,10};
		int array3[];
		array3=copiaArray(array);
		for(int i=0; i<array.length; i++){
		System.out.println(array3[i]);}
		
		
	}
	public static int[] copiaArray(int[]array){
		int array2[] =new int [array.length];	
		for(int i=0; i<array.length; i++){
			array2[i]=array[i];
		}
		
		return array2;
	}

}
