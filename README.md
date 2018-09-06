## 环境搭建

环境搭建请参考：[axis2搭建参考]

## eclipse环境配置说明

首先需要下载下axis2的zip安装包(Win系统)，解到某个目下，如：`D:\java\apache\axis2-1.7.4`

在eclipse中》`Window`》`Preferences`》`Web Services`》`Axis2 Preferences`，如下图中配置好axis2的目录

![配置axis2](http://note.youdao.com/yws/api/personal/file/865F5316594C415287F2E35B3AE1551C?method=download&shareKey=0f46c5ab0498f048a94afa4988839820)

其他配置项默认

## 创建Axis2的开发包

同样在eclipse中转到》`Window`》`Preferences`》`Java`》`Build Path`》`User Libraries`，

然后新建`New...`，起名为axis2，确定后选择刚才建立的axis2包，然后`Add External JARs...`,将目录`D:\java\apache\axis2-1.7.4\lib`下的所有jar包添加进来即可。

![添加axis2的jar包](http://note.youdao.com/yws/api/personal/file/3BB6140F632144D28BD2BAB314C52DFB?method=download&shareKey=886423bbf3e62226e966dbd77b98be6c)

然后就参考[axis2搭建参考]

另外自己搭建的环境需要注意，引入jstl和standard这两个jar包


## 发布Web Service服务

一开始就提到了，参考[axis2搭建参考]，对要发布成WebService的类在eclipse中右击选择Web Services》Create Web Service，然后根据向导进行配置发布即可！

下面这几篇文章作为参考：

- [调用webService的几种方式](http://blog.csdn.net/u011165335/article/details/51345224)
- [浅淡Webservice、WSDL三种服务访问的方式](http://www.tuicool.com/articles/YbMfie)

----
发布服务注意：

要注意一个services.xml文件，位于WEB-INF/services/XXXService/META-INF/目录下,举个例子，注意写法

```xml
<service name="CalculateService" >
	<Description>
		Please Type your service description here
	</Description>
	<messageReceivers>
		<messageReceiver mep="http://www.w3.org/ns/wsdl/in-only" class="org.apache.axis2.rpc.receivers.RPCInOnlyMessageReceiver" />
		<messageReceiver mep="http://www.w3.org/ns/wsdl/in-out"  class="org.apache.axis2.rpc.receivers.RPCMessageReceiver"/>
	</messageReceivers>
	<parameter name="ServiceClass" locked="false">com.june.web.service.axis2.CalculateService</parameter>
</service>
```
跟自动生产的service.xml的区别

```xml
<operation name="hello" >
        <messageReceiver  mep="http://www.w3.org/2004/08/wsdl/in-out" class="org.apache.axis2.rpc.receivers.RPCMessageReceiver" />
    </operation>
    <operation name="add" >
        <messageReceiver  mep="http://www.w3.org/2004/08/wsdl/in-out" class="org.apache.axis2.rpc.receivers.RPCMessageReceiver" />
    </operation>
```

否则会报错误：

	The ServiceClass object does not implement the required method 
	        in the following form: OMElement xxx (OMElement e)

## 调用WebService

关于如何调用WebService服务，网上的方法简直太多了
```java
package june.web.service;

import javax.xml.namespace.QName;

import org.apache.axis2.AxisFault;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.rpc.client.RPCServiceClient;

public class Axis2Test {
	public static void main(String[] args) throws AxisFault {
		// 使用RPC方式调用WebService
		RPCServiceClient serviceClient = new RPCServiceClient();
		Options options = serviceClient.getOptions();
		// 指定调用WebService的URL
		EndpointReference targetEPR = new EndpointReference(
				"http://localhost:8090/june.web.service/services/CalculateService");
		options.setTo(targetEPR);

		// 指定要调用的计算机器中的方法及WSDL文件的命名空间：com.june.web.service。
		QName opAddEntry = new QName("http://axis2.service.web.june.com", "plus");// 加法
		QName opAddEntryminus = new QName("http://axis2.service.web.june.com", "minus");// 减法
		QName opAddEntrymultiply = new QName("http://axis2.service.web.june.com", "multiply");// 乘法
		QName opAddEntrydivide = new QName("http://axis2.service.web.june.com", "divide");// 除法
		// 指定plus方法的参数值为两个，分别是加数和被加数
		Object[] opAddEntryArgs = new Object[] { 1, 2 };
		// 指定plus方法返回值的数据类型的Class对象
		Class[] classes = new Class[] { float.class };
		// 调用plus方法并输出该方法的返回值
		System.out.println(serviceClient.invokeBlocking(opAddEntry, opAddEntryArgs, classes)[0]);
		System.out.println(serviceClient.invokeBlocking(opAddEntryminus, opAddEntryArgs, classes)[0]);
		System.out.println(serviceClient.invokeBlocking(opAddEntrymultiply, opAddEntryArgs, classes)[0]);
		System.out.println(serviceClient.invokeBlocking(opAddEntrydivide, opAddEntryArgs, classes)[0]);
	}
}

```


----
[axis2搭建参考]:http://note.youdao.com/share/?id=816314845b424e33a8ed6576011c85dc&type=note#/ '参考这里搭建axis2的开发环境'