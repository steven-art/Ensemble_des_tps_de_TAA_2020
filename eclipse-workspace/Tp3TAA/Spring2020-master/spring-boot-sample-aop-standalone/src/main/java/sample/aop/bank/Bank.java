package sample.aop.bank;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import sample.aop.client.Client;

@Component
public class Bank implements IBank{

	List<Client> ListClient = new ArrayList<>();



	@Override
	public void transfert(int price) {
		// TODO Auto-generated method stub

		System.out.println("tranfert de :" +price);


	}
}
