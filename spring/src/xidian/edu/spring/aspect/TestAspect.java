/**
 * <p>Title: TestAspect.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2017</p>
 * <p>University: xidian.edu</p>
 * @author 胡有兵
 * @date 2017年8月14日下午5:22:33
 * @version 1.0
 */
package xidian.edu.spring.aspect;


import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * <p>Title: TestAspect</p>
 * <p>Description: </p>
 * <p>University: xidian.edu</p> 
 * @author	胡有兵
 * @date	2017年8月14日下午5:22:33
 * @version 1.0
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestAspect {

	@Resource(name="customerDao")
	private CustomerDao customerDao;
	
	
	@Test
	public void testApplication() throws Exception {
		customerDao.save();
		customerDao.update();
	}
}
