package test;

public class Etudiant 
	
{
	private int id;
	private String nom;
	public Etudiant(int id, String nom)
		throws IdNegatifException, NomCourtException
	{
		super();
		if (id < 0)
		{
			throw new IdNegatifException("Vous avez donner un identifiant negatif: " + id);
		}
		if (nom.length() < 3)
		{
			throw new NomCourtException("Vous avez donner un nom de moins de 3 caracteres: " + nom);
		}
		else
		{		
			this.id = id;
			this.nom = nom;	
		}

	}
	
	public Etudiant()
	{
		this.id = 0;
		this.nom = "VIDE !";			
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
}
