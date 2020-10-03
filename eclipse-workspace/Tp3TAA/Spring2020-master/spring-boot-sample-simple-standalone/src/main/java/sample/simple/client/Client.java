package sample.simple.client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import sample.simple.store.IFastLane;
import sample.simple.store.IJustHaveALook;
import sample.simple.store.ILane;
import sample.simple.store.Store;

@Component
public class Client implements IRun{



	//	private String adresse;
	private long numCB;
	private Compte compte;
	private Store store;

	@Autowired(required = true)
	IFastLane ifast;
	@Autowired(required = true)
	ILane ilane;
	@Autowired(required = true)
	IJustHaveALook haveALook;

	public Client() {
		this.compte = new Compte(1500);
	}

	public int getCompte() {
		return compte.getArgentCompte();
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}

	public void choseArticles() {

	}
	public void TermineCommande(String Adresse , long numCB) {

	}

	@Override
	public void run() {

		// TODO Auto-generated method stub

		haveALook.getCompte(compte.getArgentCompte());
		haveALook.getPrice(1);
		haveALook.getQuantity(15);
		haveALook.isAvailable(1);
		ifast.oneShotOrder("banane", 3);
		//	ilane.addItemToCart(store.getProduct("banane"));
		ilane.pay(45);
		ifast.getTransfert();
		ilane.reaprovisionnement(15);

	}
}
