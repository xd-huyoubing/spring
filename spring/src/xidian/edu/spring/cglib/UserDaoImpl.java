/**
 * <p>Title: UserDaoImpl.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2017</p>
 * <p>University: xidian.edu</p>
 * @author 胡有兵
 * @date 2017年8月14日上午10:50:11
 * @version 1.0
 */
package xidian.edu.spring.cglib;

import org.springframework.stereotype.Repository;

/**
 * <p>Title: UserDaoImpl</p>
 * <p>Description: </p>
 * <p>University: xidian.edu</p> 
 * @author	胡有兵
 * @date	2017年8月14日上午10:50:11
 * @version 1.0
 */
@Repository(value="userDao")
public class UserDaoImpl implements UserDao {

	/**
	 * <p>Title: hello</p>
	 * <p>Description: </p>
	 * @see xidian.edu.spring.proxy.UserDao#hello()
	 */
	@Override
	public void hello() {
		System.out.println("Hello spring !!");
	}
	
}
