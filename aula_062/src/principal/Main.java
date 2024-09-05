package principal;

import entidade.Cachorro;
import entidade.Gato;
import entidade.Vaca;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    Cachorro c = new Cachorro();
		System.out.print(c.emitirSom());
		
		Gato g = new Gato();
		System.out.print(g.emitirSom());
		
		Vaca v = new Vaca();
		System.out.println(v.emitirSom());
	}

}
