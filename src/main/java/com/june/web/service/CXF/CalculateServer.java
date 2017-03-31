/**
 * 中科方德软件有限公司<br>
 * june.web.service:com.june.web.service.CXF.CalculateServer.java
 * 日期:2017年3月26日
 */
package com.june.web.service.CXF;

import org.apache.cxf.frontend.ServerFactoryBean;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

/**
 * CalculateServer <br>
 * 服务端使用JaxWsServerFactoryBean类，来提供WebService服务<br>
 * 或者,使用ServerFactoryBean类<br>
 * 如果服务端使用ServerFactoryBean类，则最终生成的WSDL文件略有不同
 * 
 * @author 王俊伟 wjw.happy.love@163.com
 * @blog https://www.github.com/junehappylove
 * @date 2017年3月26日 上午2:38:24
 * @version 1.0.0
 */
public class CalculateServer {

	/**
	 * @param args
	 * @date 2017年3月26日 上午2:38:24
	 * @writer junehappylove
	 */
	public static void main(String[] args) {
		useByJaxWsServerFactoryBean();
		//useByServerFactoryBean();
	}

	/**
	 * 使用JaxWsServerFactoryBean发布WebService
	 * 
	 * @date 2017年3月26日 上午3:12:00
	 * @writer junehappylove
	 */
	static void useByJaxWsServerFactoryBean(){
		CalculateImpl calculateImpl = new CalculateImpl();

		JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();
		
		factory.setServiceClass(Calculate.class);
		factory.setAddress("http://127.0.0.1:8091/Calculate");
		factory.setServiceBean(calculateImpl);
		factory.create();
	}
	
	/**
	 * 使用ServerFactoryBean发布WebService
	 * 
	 * @date 2017年3月26日 上午3:11:37
	 * @writer junehappylove
	 */
	static void useByServerFactoryBean(){
		CalculateImpl calculateImpl = new CalculateImpl();

		ServerFactoryBean factory = new ServerFactoryBean();
		
		factory.setServiceClass(Calculate.class);
		factory.setAddress("http://127.0.0.1:8091/Calculate");
		factory.setServiceBean(calculateImpl);
		factory.create();
	}

}
