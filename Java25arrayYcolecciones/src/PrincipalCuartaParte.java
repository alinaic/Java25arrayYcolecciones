import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PrincipalCuartaParte {

	public static void main(String[] args) {
		// vamos a ver iteradores

		List<String> lista = new ArrayList<String>();
		// lista.add("primero");
		lista.add("segundo");
		// lista.add("tercero");
		// un iterador me vale para recorrer una coleccion:

		Iterator<String> miIterator = lista.iterator();
		System.out.println("miIterator hasNext: " + miIterator.hasNext());
		System.out.println("saco un elemento...");
		String elemento = miIterator.next();
		System.out.println("he sacado: " + elemento);
		System.out.println("saco otro elemento...");
		//String otroElemento = miIterator.next();

		// lo siguiente daria error si la lista solo tenia un elemento
		// System.out.println("he sacado: " + otroElemento);

		// while (miIterator.hasNext()) {

		List<String> ultimoList = new ArrayList<String>();
		ultimoList.add("primero");
		ultimoList.add("segundo");
		ultimoList.add("tercero");

		System.out.println("recorro la ultima lista: ");
		Iterator<String> iteratorUltimaLista = ultimoList.iterator();
		while (iteratorUltimaLista.hasNext()) {
			String elementoIterator = iteratorUltimaLista.next();
			System.out.println("elemento: " + elementoIterator);
		}
	}//
}//
