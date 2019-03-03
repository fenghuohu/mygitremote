package cn.tedu.store.service;

public interface IOrderService {
	
	void createOrder(Integer uid, Integer addressId, Integer[] cartIds);
}
