package cn.tedu.store.test.mapper;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.tedu.store.mapper.CartMapper;
import cn.tedu.store.vo.CartVO;

public class CartMapperTestCase {

	private AbstractApplicationContext ac;
	private CartMapper cartMapper;
	
	@Test
	public void getList() {
		Integer uid = 18;
		List<CartVO> list = cartMapper.getList(uid);
		System.out.println("Begin: ");
		for (CartVO cartVO : list) {
			System.out.println(cartVO);
		}
		System.out.println("End.");
	}
	
	@Test
	public void getListByIds() {
		Integer[] ids = {3,4,5};
		List<CartVO> list = cartMapper.getListByIds(ids);
		System.out.println("Begin: ");
		for (CartVO cartVO : list) {
			System.out.println(cartVO.getGoodsTitle());
		}
		System.out.println("End.");
	}
	
	@Before
	public void doBefore() {
		ac = new ClassPathXmlApplicationContext(
			"spring-dao.xml");
		cartMapper = ac.getBean("cartMapper",
				CartMapper.class);
	}
	
	@After
	public void doAfter() {
		ac.close();
	}
}
