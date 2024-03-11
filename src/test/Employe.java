package test;

public class Employe {
	final int idService = 1010;
	static int salaire = 200000;
	
	public Employe(int salaire) {
		this.salaire = salaire;
	}
	
	public void infosEmploye() {
		System.out.println("Votre identifiant est "+this.idService);
		System.out.println("Et votre salaire est "+this.salaire);

	}
}
