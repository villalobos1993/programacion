package entidadSTRING;

public class ejercicio1 {

	public static void main(String[] args) {

		// Escribe la función “NúmeroEspacios” a la que le pasamos una
		// cadena y nos devuelve el número de espacios que contiene esa
		// cadena (tanto al principio y al final como intercalados).

		String cadena = " hola mundo que tal estais ";
		System.out.println(NumeroEspacios(cadena));

	}

	public static int NumeroEspacios(String cadena) {
		int NumeroEspacio = 0;
		char espacio = ' ';
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == espacio) {
				NumeroEspacio += 1;
			}
		}

		return NumeroEspacio;

	}

}
