package Main;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();

		main.teste();

	}

	public void teste() {
		String[] array = { "Carlos", "Gabriel", "José", "Pedro", "Abimael", "Roberto", "Jeferson", "Rafael", "Anderson", "Rodrigo" };
		String[] arraycerto = Sort(array);		
		String chave = "Abimael";
		String chave2 = "Unibrasil";
		System.out.println("Busca ABIMAEL:");
		BinarySearch(chave, arraycerto);
		System.out.println("Busca UNIBRASIL:");
		BinarySearch(chave2, arraycerto);

	}

	public String[] Sort(String[] array) {

		System.out.println(Arrays.toString(array));

		int n = array.length;
		String temp;
		for ( int i = 0; i<n-1; i++) {
			for ( int j = 0; j<n-1; j++) {
				if(array[j].compareTo(array[j+1]) > 0 ) {
					temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp;
				}
			}
		}

		

		System.out.println(Arrays.toString(array));

		return array;

	}


	public String BinarySearch(String chave, String[] array) {

		int p = 0;
		int n = array.length;
		int u = n - 1;
		int m = 0;

		while (p <= u) {
			m = (p + u) / 2;
			if (chave == array[m]) {
				System.out.println("Encontrado\n");
				return chave;
			} else {
				if (chave.compareTo(array[m]) < 0) {
					u = m - 1;

				} else {
					p = m + 1;
				}
			}
		}
		System.out.println("Não encontrada\n");
		return "";
	}

}