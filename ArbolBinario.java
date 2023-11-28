public class ArbolBinario{

	Node raiz;

	public ArbolBinario(String dato){
		//Crear raiz
		this.raiz = new Node();
		this.raiz.name = dato;
		this.raiz.izquierdo = null;
		this.raiz.derecho = null;
	}

	public void agregarHijoIzquierdo(String dato, Node arbol){
		//Crear nodo
		Node hijo = new Node();
		hijo.name = dato;
		hijo.izquierdo = null;
		hijo.derecho = null;

		//Agregar como hijo izquierdo
		arbol.izquierdo = hijo;

		//liberar la referencia auxiliar
		hijo = null;
	}

	public void agregarHijoDerecho(String dato, Node arbol){
		//Crear nodo
		Node hijo = new Node();
		hijo.name = dato;
		hijo.izquierdo = null;
		hijo.derecho = null;

		//Agregar como hijo izquierdo
		arbol.derecho = hijo;

		//liberar la referencia auxiliar
		hijo = null;
	}

	public String imprimirSubarbol(Node raizSubarbol){

		String cadena = "";

		if (raizSubarbol != null) {
			cadena = "raiz: " + raizSubarbol.name;

			if (raizSubarbol.izquierdo != null)
				cadena = cadena + " izq: " + raizSubarbol.izquierdo.name;

			if (raizSubarbol.derecho != null)
				cadena = cadena + " der: " + raizSubarbol.derecho.name;
		}

		return cadena;
	}

	//TODO: Hacer el recorrido en preorden
	

	//TODO: Hacer el recorrido en inorden
	

	//TODO: Hacer el recorrido en postorden
}














