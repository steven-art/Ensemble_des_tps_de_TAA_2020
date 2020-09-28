package sample.aop.provider;

import org.springframework.stereotype.Component;


import sample.aop.store.Store;


@Component
public class Provider implements IProvider{

	    
		@Override
	    public double getPrice(Long articleId) {
	        return 0;
	    }
	    
		@Override
	    public void order(Long storeId, Long articleId, int quantity) {
	        System.out.println("Store n° " + storeId + " orders article n° " + articleId + " (quantity = "+ quantity +")");
	    }
	

}
