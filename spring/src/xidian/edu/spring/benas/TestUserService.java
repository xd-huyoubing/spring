/**
 * <p>Title: TestUserService.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2017</p>
 * <p>University: xidian.edu</p>
 * @author 胡有兵
 * @date 2017年8月14日上午9:19:40
 * @version 1.0
 */
package xidian.edu.spring.benas;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * <p>Title: TestUserService</p>
 * <p>Description: </p>
 * <p>University: xidian.edu</p> 
 * @author	胡有兵
 * @date	2017年8月14日上午9:19:40
 * @version 1.0
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestUserService {
	
	@Resource(name="userService")
	private UserService userService;
	
	
	@Test
	public void testApplication() throws Exception {
		userService.hello();
	}
}
