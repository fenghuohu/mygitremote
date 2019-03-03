package cn.tedu.store.service;

import java.util.List;

import cn.tedu.store.entity.Address;
import cn.tedu.store.service.ex.AddressAccessException;
import cn.tedu.store.service.ex.AddressNotFoundException;
import cn.tedu.store.service.ex.UpdateDataException;

public interface IAddressService {

	/**
	 * �����µ��ջ���ַ
	 * 
	 * @param address
	 * @return
	 */
	Address addnew(Address address);

	/**
	 * ��ȡĳ�û����ջ���ַ�б�
	 * 
	 * @param uid
	 *            �û���id
	 * @return �ջ���ַ�б����û��ƥ������ݣ��򷵻���Ԫ�صĿ��б�
	 */
	List<Address> getList(Integer uid);

	/**
	 * ����Ĭ���ջ���ַ
	 * 
	 * @param id
	 *            Ĭ�ϵ��ջ���ַ��id
	 * @param uid
	 *            ��ַ��Ϣ�������û�
	 * @throws AddressNotFoundException
	 *             ���Է��ʵ��ջ���ַ���ݲ�����
	 * @throws AddressAccessException
	 *             �ջ���ַ���ݹ�������
	 * @throws UpdateDataException
	 *             ���������쳣
	 */
	void setDefaultAddress(Integer id, Integer uid)
			throws AddressNotFoundException, AddressAccessException, UpdateDataException;
	
	void delete(Integer id, Integer uid);
	
	Address getAddressById(Integer id);
}
