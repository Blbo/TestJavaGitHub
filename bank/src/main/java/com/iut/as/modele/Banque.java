package com.iut.as.modele;
import java.util.ArrayList;

public class Banque {

	private ArrayList<Client> listeClient = new ArrayList<Client>();

	public Banque() {
		super();
		// À récupérer de la DAO, pour test
		listeClient.add(new Client( "56565", "katia","Metz 57000"));
		listeClient.add(new Client( "1919", "arwa","Metz 57000"));
		Compte compte1 = new Compte();
		Compte compte2= new Compte();

	}

	public ArrayList getListeClient(){
		return listeClient;
	}


	/*@Override
	public String toString() {
			return "Bank [compte=" + compte + ", client=" + client + "]";
		}*/

}

