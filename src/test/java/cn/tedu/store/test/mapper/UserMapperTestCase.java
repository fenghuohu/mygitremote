package cn.tedu.store.test.mapper;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.tedu.store.entity.User;
import cn.tedu.store.mapper.UserMapper;

public class UserMapperTestCase {
	
	private AbstractApplicationContext ac;
	private UserMapper userMapper;
	
	@Test
	public void updateInfo() {
		User user = new User();
		user.setId(5);
		user.setModifiedUser("TeduStore");
		user.setModifiedTime(new Date());
		user.setPhone("");
		Integer rows
			= userMapper.updateInfo(user);
		System.out.println("rows=" + rows);
	}
	
	@Test
	public void updatePassword() {
		Integer id = 5;
		String password = "1234";
		Integer rows
			= userMapper.updatePassword(id, password);
		System.out.println("rows=" + rows);
	}
	
	@Test
	public void findUserById() {
		Integer id = 18;
		User user = userMapper.findUserById(id);
		System.out.println(user);
	}
	
	@Test
	public void insert() {
		User user = new User();
		user.setUsername("root");
		user.setPassword("1234");
		Integer rows = userMapper.insert(user);
		System.out.println("rows=" + rows);
		System.out.println(user);
	}
	
	@Test
	public void findUserByUsername() {
		String username = "root1";
		User user
			= userMapper.findUserByUsername(username );
		System.out.println(user);
	}

	@Before
	public void doBefore() {
		ac = new ClassPathXmlApplicationContext(
			"spring-dao.xml");
		userMapper = ac.getBean("userMapper",
			UserMapper.class);
	}
	
	@After
	public void doAfter() {
		ac.close();
	}
	
}
