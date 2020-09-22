package sample.aop.client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import sample.aop.store.IFastLane;
import sample.aop.store.IJustHaveALook;
import sample.aop.store.ILane;

@Component
public class Client implements IRun{

	

//	private String adresse;
	private long numCB;
	private Compte compte;
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
//public int getQuantity() {
//	return quantity;
//}
//public void setQuantity(int quantity) {
//	this.quantity = quantity;
//}
//public String getAdresse() {
//	return adresse;
//}
//public void setAdresse(String adresse) {
//	this.adresse = adresse;
//}
//public Long getNumCB() {
//	return numCB;
//}
//public void setNumCB(Long numCB) {
//	this.numCB = numCB;
//}
@Override
public void run() {
	
	// TODO Auto-generated method stub
	haveALook.getQuantity(15);
	haveALook.getCompte(compte.getArgentCompte());
	ilane.reaprovisionnement(0);
}
}
