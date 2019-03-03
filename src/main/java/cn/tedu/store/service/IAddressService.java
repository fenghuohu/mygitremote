package cn.tedu.store.service;

import java.util.List;

import cn.tedu.store.entity.Address;
import cn.tedu.store.service.ex.AddressAccessException;
import cn.tedu.store.service.ex.AddressNotFoundException;
import cn.tedu.store.service.ex.UpdateDataException;

public interface IAddressService {

	/**
	 * 新增新的收货地址
	 * 
	 * @param address
	 * @return
	 */
	Address addnew(Address address);

	/**
	 * 获取某用户的收货地址列表
	 * 
	 * @param uid
	 *            用户的id
	 * @return 收货地址列表，如果没有匹配的数据，则返回无元素的空列表
	 */
	List<Address> getList(Integer uid);

	/**
	 * 设置默认收货地址
	 * 
	 * @param id
	 *            默认的收货地址的id
	 * @param uid
	 *            地址信息归属的用户
	 * @throws AddressNotFoundException
	 *             尝试访问的收货地址数据不存在
	 * @throws AddressAccessException
	 *             收货地址数据归属错误
	 * @throws UpdateDataException
	 *             更新数据异常
	 */
	void setDefaultAddress(Integer id, Integer uid)
			throws AddressNotFoundException, AddressAccessException, UpdateDataException;
	
	void delete(Integer id, Integer uid);
	
	Address getAddressById(Integer id);
}
