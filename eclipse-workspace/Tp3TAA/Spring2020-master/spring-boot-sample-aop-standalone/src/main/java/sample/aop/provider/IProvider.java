package sample.aop.provider;



public interface IProvider {
	
//	int order(Products p);
//	double getPrice(int p);
	double getPrice(Long articleId);

	void order(Long storeId, Long articleId, int quantity);
	
}
