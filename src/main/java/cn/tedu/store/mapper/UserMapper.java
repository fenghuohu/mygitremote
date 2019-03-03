package cn.tedu.store.mapper;

import org.apache.ibatis.annotations.Param;

import cn.tedu.store.entity.User;

public interface UserMapper {
	
	/**
	 * 插入用户数据
	 * @param user 用户数据
	 * @return 返回受影响行数
	 */
	Integer insert(User user);
	
	/**
	 * 根据用户名查询用户数据
	 * @param username 用户名
	 * @return 返回用户数据
	 */
	User findUserByUsername(String username);
	
	/**
	 * 根据ID查询用户数据
	 * @param id	用户id
	 * @return 返回用户数据
	 */
	User findUserById(Integer id);
	
	/**
	 * 修改用户密码
	 * @param id	用户id
	 * @param password	更新密码
	 * @return 返回受影响行数
	 */
	Integer updatePassword(
			@Param("id") Integer id,
			@Param("password") String password);
	
	/**
	 * 修改用户资料
	 * @param user	用户数据
	 * @return 返回受影响行数
	 */
	Integer updateInfo(User user);
	
	/**
	 * 修改用户头像
	 * @param id
	 * @param avatar
	 * @return
	 */
	Integer updataAvatar(
			@Param("id") Integer id,
			@Param("avatar") String avatar);
}
