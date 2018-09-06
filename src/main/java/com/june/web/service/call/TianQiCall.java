/**
 * 中科方德软件有限公司<br>
 * june.web.service:com.june.web.service.call.TianQiCall.java
 * 日期:2017年3月31日
 */
package com.june.web.service.call;

import javax.xml.namespace.QName;

import org.apache.axis2.AxisFault;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.rpc.client.RPCServiceClient;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

/**
 * TianQiCall <br>
 * 
 * @author 王俊伟 wjw.happy.love@163.com
 * @blog https://www.github.com/junehappylove
 * @date 2017年3月31日 下午2:54:16
 * @version 1.0.0
 */
public class TianQiCall {

	/**
	 * @param args
	 * @throws Exception 
	 * @date 2017年3月31日 下午2:54:16
	 * @writer junehappylove
	 */
	public static void main(String[] args) throws Exception {
		callByRPC();
	}
	
	static void callByRPC() throws AxisFault {
		// 使用RPC方式调用WebService
		RPCServiceClient serviceClient = new RPCServiceClient();
		Options options = serviceClient.getOptions();
		// 指定调用WebService的URL
		EndpointReference targetEPR = new EndpointReference(
				"http://ws.webxml.com.cn/WebServices/WeatherWS.asmx?wsdl");
		options.setTo(targetEPR);

		QName opEntry = new QName("http://WebXml.com.cn/", "getWeather");
		Object[] opEntryArgs = new Object[] {"青岛"};
		Class[] classes = new Class[] { String.class };
		System.out.println(serviceClient.invokeBlocking(opEntry, opEntryArgs, classes)[0]);
	}
	
	static void callByReflect() throws Exception{
		JaxWsDynamicClientFactory factory = JaxWsDynamicClientFactory.newInstance();  
        Client client = factory.createClient("http://ws.webxml.com.cn/WebServices/WeatherWS.asmx?wsdl");  
        Object[] inputs = {};  
        inputs = new Object[]{"青岛"};
        Object[] result = client.invoke("getWeather", inputs);  
        System.out.println(result[0]); 
	}

}
