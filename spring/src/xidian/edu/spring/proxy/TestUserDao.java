/**
 * <p>Title: TestUserDao.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2017</p>
 * <p>University: xidian.edu</p>
 * @author 胡有兵
 * @date 2017年8月14日上午10:51:12
 * @version 1.0
 */
package xidian.edu.spring.proxy;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * <p>Title: TestUserDao</p>
 * <p>Description: </p>
 * <p>University: xidian.edu</p> 
 * @author	胡有兵
 * @date	2017年8月14日上午10:51:12
 * @version 1.0
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestUserDao {
	
	@Resource(name="userDao")
	private UserDao userDao;
	
	
	@Test
	public void testApplication() throws Exception {
		UserDao proxy = MyProxyUtils.getProxy(userDao);
		proxy.hello();
	}
}
