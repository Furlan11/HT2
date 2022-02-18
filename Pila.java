package lab2Estructuras;

import java.util.LinkedList;

public class Pila<T> {
private LinkedList<T> lista;

public Pila() {
	lista= new LinkedList<T>();
}
public void agregar (T o) {
	lista.addFirst(o);
}

public T obtener() {
return lista.removeFirst();

}

public boolean esVacia() {
	return lista.isEmpty();
}

public String toString() {
	return lista.toString();
}
}

