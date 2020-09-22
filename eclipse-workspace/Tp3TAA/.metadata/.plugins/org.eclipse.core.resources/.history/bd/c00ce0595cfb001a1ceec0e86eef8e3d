package sample.aop.store;
import javax.annotation.processing.Generated;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sample.aop.bank.IBank;
import sample.aop.provider.IProvider;

@Component
public class Store implements IFastLane, ILane, IJustHaveALook{

	IBank bank;
	IProvider provider;
	
	@Autowired
	ILane ilane;

	//Verifié le stock
	public void verifierStock() {


	}
	//fait le tranfert bancaire
	public void tranfertArgent(int price) {
		bank.transfert(price);
	}
	//met a jour le stock
	public void miseAJourStock() {

	}
	//augmenter le stock
	public void reaprovisionnement(int quantity) {
			if (quantity>0) {
				System.out.println("stock sufisant");
			}else {
				quantity = quantity + 15;
				System.out.println("le stock à été réaprovisionné");
			}
	}
	@Override
	public int getQuantity(int quantity) {
		// TODO Auto-generated method stub
		if (quantity>0) {
			System.out.println("la quantité est de :"+ quantity);
			return quantity;
		}else {
			System.out.println("le produit n'est plus en stock");
			return quantity;
		}
	}
	@Override
	public void getCompte(int argentCompte) {
		// TODO Auto-generated method stub
		System.out.println("Somme sur le compte :"+argentCompte);
	}
	
	
}
