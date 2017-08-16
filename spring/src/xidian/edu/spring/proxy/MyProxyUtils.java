/**
 * <p>Title: MyProxyUtils.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2017</p>
 * <p>University: xidian.edu</p>
 * @author 胡有兵
 * @date 2017年8月14日上午10:54:19
 * @version 1.0
 */
package xidian.edu.spring.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * <p>Title: MyProxyUtils</p>
 * <p>Description: </p>
 * <p>University: xidian.edu</p> 
 * @author	胡有兵
 * @date	2017年8月14日上午10:54:19
 * @version 1.0
 */
public class MyProxyUtils {
	
	public static UserDao getProxy(UserDao userDao){
		
		UserDao proxy = (UserDao) Proxy.newProxyInstance(userDao.getClass().getClassLoader(), userDao.getClass().getInterfaces(), new InvocationHandler() {
			
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				
				System.out.println("添加日志.........");
				
				
				return method.invoke(userDao, args);
			}
		});
		
		
		
		return proxy;
	}
}
