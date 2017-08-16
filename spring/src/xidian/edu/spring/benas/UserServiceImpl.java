/**
 * <p>Title: UserServiceImpl.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2017</p>
 * <p>University: xidian.edu</p>
 * @author 胡有兵
 * @date 2017年8月14日上午9:16:56
 * @version 1.0
 */
package xidian.edu.spring.benas;

import org.springframework.stereotype.Service;

/**
 * <p>Title: UserServiceImpl</p>
 * <p>Description: </p>
 * <p>University: xidian.edu</p> 
 * @author	胡有兵
 * @date	2017年8月14日上午9:16:56
 * @version 1.0
 */

@Service(value="userService")
public class UserServiceImpl implements UserService {

	/**
	 * <p>Title: hello</p>
	 * <p>Description: </p>
	 * @see xidian.edu.spring.benas.UserService#hello()
	 */
	@Override
	public void hello() {
		System.out.println("Hello Spring!!!!!");
	}
	
}
