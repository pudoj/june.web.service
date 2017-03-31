/**
 * 中科方德软件有限公司<br>
 * june.web.service:com.june.web.service.CXF.Calculate.java
 * 日期:2017年3月26日
 */
package com.june.web.service.CXF;

import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Calculate <br>
 * 
 * @author 王俊伟 wjw.happy.love@163.com
 * @blog https://www.github.com/junehappylove
 * @date 2017年3月26日 上午2:30:46
 * @version 1.0.0
 */
@WebService
public interface Calculate {
	public float plus(@WebParam(name="x")float x, @WebParam(name="y")float y);
	public float minus(@WebParam(name="x")float x, @WebParam(name="y")float y);
	public float multiply(@WebParam(name="x")float x, @WebParam(name="y")float y);
	public float divide(@WebParam(name="x")float x, @WebParam(name="y")float y);
}
