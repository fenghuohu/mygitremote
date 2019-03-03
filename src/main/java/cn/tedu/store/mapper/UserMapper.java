package cn.tedu.store.mapper;

import org.apache.ibatis.annotations.Param;

import cn.tedu.store.entity.User;

public interface UserMapper {
	
	/**
	 * �����û�����
	 * @param user �û�����
	 * @return ������Ӱ������
	 */
	Integer insert(User user);
	
	/**
	 * �����û�����ѯ�û�����
	 * @param username �û���
	 * @return �����û�����
	 */
	User findUserByUsername(String username);
	
	/**
	 * ����ID��ѯ�û�����
	 * @param id	�û�id
	 * @return �����û�����
	 */
	User findUserById(Integer id);
	
	/**
	 * �޸��û�����
	 * @param id	�û�id
	 * @param password	��������
	 * @return ������Ӱ������
	 */
	Integer updatePassword(
			@Param("id") Integer id,
			@Param("password") String password);
	
	/**
	 * �޸��û�����
	 * @param user	�û�����
	 * @return ������Ӱ������
	 */
	Integer updateInfo(User user);
	
	/**
	 * �޸��û�ͷ��
	 * @param id
	 * @param avatar
	 * @return
	 */
	Integer updataAvatar(
			@Param("id") Integer id,
			@Param("avatar") String avatar);
}
