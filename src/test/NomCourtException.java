package test;

public class NomCourtException extends Exception{

	public NomCourtException() {
		super();
		System.out.println("Vous avez donner un nom de moins de 3 caracteres");
	}

	public NomCourtException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}


}
