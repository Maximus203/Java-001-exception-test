package test;

public class IdNegatifException extends Exception{

	public IdNegatifException() {
		super();
		System.out.println("Vous avez donner un identifiant negatif");
	}

	public IdNegatifException(int nbre) {
		super();
		System.out.println("Vous avez donner un identifiant negatif");
		System.out.println("\t" + nbre);
	}
	
	public IdNegatifException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	
}
