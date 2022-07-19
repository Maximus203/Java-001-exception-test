package test;

import java.util.*;

public class Application {
	public static void main(String[] args)
	{
		int id;
		String nom;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Id ?");
		id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Nom ?");
		nom = sc.nextLine();
		
		Etudiant etudiant = null;
		
		try {
			etudiant = new Etudiant(id, nom);

		}
		catch (IdNegatifException err)
		{
			System.out.println(err.getMessage()); 
		}
		catch (NomCourtException err1)
		{
			System.out.println(err1.getMessage());
		}
		finally
		{
			if (etudiant == null)
				etudiant = new Etudiant();
			System.out.println("Id: "+ etudiant.getId());
			System.out.println("Nom: "+ etudiant.getNom());
		}
		
	}
	
}
