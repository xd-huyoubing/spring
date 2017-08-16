/**
 * <p>Title: CustomerDaoImpl.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2017</p>
 * <p>University: xidian.edu</p>
 * @author 胡有兵
 * @date 2017年8月14日下午5:03:48
 * @version 1.0
 */
package xidian.edu.spring.aspect;

import org.springframework.stereotype.Service;

/**
 * <p>
 * Title: CustomerDaoImpl
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * University: xidian.edu
 * </p>
 * 
 * @author 胡有兵
 * @date 2017年8月14日下午5:03:48
 * @version 1.0
 */

@Service(value = "customerDao")
public class CustomerDaoImpl implements CustomerDao {

	public void save() {
		System.out.println("save.......");
	}

	public void update() {
		System.out.println("update.......");
	}

}
