import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// un array no es mas que un conjunto de objectos
		// del mismo tipo, tienen un tamaño fijo y no se puede redimensionar

		// definicion de un array de dos objectos
		Cliente[] miarray = { new Cliente(), new Cliente() };

		// definicion de un array de 5 objetos
		Cliente[] otroarray = new Cliente[5];

		// en el ultimo caso hay que inicializar los objetos:
		otroarray[0] = new Cliente("Juan", "Calle Sol 4", "Salamanca",
				"123456", "25694516");

		// al array se le accede por un indice, la primera posicion es la cero
		System.out
				.println("valor de la posicion 0: " + otroarray[0].toString());

		// la ultima posicion del array es su tamaño menos uno
		// otroarray [5] = new Cliente(); esto da error, no hay indice 5
		// ya que solo hay 5 elementos y el primero es el cero
		// el ultimo indice seria el 4

		// como los array no son redimensionables, para eso en java tenemos las
		// conexiones que no son mas que objetos que guardan otros objetos.

		// en java hay muchos tipos de colecciones pero las que mas se usan son
		// las de tipo List y las de tipo Map

		// las de tipo List se comporta como un array dinamico, almacenando
		// otros objectos en posiciones
		// numericas basadas en indice como los array.

		ArrayList miArrayList = new ArrayList();
		miArrayList.add("primer elemento");
		miArrayList.add("segundo elemento");
		
		//las colecciones en las quie no hemos dicho el tipo de datos 
		//con el que va trabajar son un verdadero problema
		
		miArrayList.add( new Cliente());
		//como puedo meterles cualquier cosa yo ahora no se si en
		//cierta posicion tengo un String un cliente o cualquier cosa
		
		//estoy forzado a hacer un casting
		String primerElemento = (String) miArrayList.get(0);
		//y en este caso he tenido suerte y puede que funcione:
		
		System.out.println("primer elemento del ArrayList: " + primerElemento);
		
		miArrayList.set(0, new Cliente());
		//vamos a ver si haciendo lo mismo funciona:
		
		primerElemento = (String) miArrayList.get(0);
		
		
		

	}

}
