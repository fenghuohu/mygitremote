package cn.tedu.store.service;

import java.util.List;

import cn.tedu.store.entity.Goods;

public interface IGoodsService {

	/**
	 * ��ȡ������Ʒ�б�
	 * @return �ȶ���ߵ�4����Ʒ���б�
	 */
	List<Goods> getHotGoodsList();
	
	/**
	 * ����id��ѯ��Ʒ����
	 * @param id ��Ʒ��id
	 * @return ƥ�����Ʒ���ݣ����û��ƥ������ݣ��򷵻�null
	 */
	Goods getGoodsById(String id);
}
