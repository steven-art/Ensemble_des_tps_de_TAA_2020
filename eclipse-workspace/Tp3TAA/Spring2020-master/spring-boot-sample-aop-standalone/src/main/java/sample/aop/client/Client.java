package sample.aop.client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import sample.aop.store.IFastLane;
import sample.aop.store.IJustHaveALook;
import sample.aop.store.ILane;
import sample.aop.store.Store;

@Component
public class Client implements IRun{

	

//	private String adresse;
	private long numCB;
	private Compte compte;
	private Store store;
	
	@Autowired
	IFastLane ifast;
	@Autowired
	ILane ilane;
	@Autowired
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
//	haveALook.isAvailable(1);
//  ifast.oneShotOrder(store.getProduct("banane"), 3);
//	ilane.addItemToCart(store.getProduct("banane"));
//	ilane.pay(45);
	ifast.getTransfert();
	ilane.reaprovisionnement(15);
	
}
}
