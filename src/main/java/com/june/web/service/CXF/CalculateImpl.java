/**
 * 中科方德软件有限公司<br>
 * june.web.service:com.june.web.service.CXF.CalculateImpl.java
 * 日期:2017年3月26日
 */
package com.june.web.service.CXF;

/**
 * CalculateImpl <br>
 * 
 * @author 王俊伟 wjw.happy.love@163.com
 * @blog https://www.github.com/junehappylove
 * @date 2017年3月26日 上午2:34:16
 * @version 1.0.0
 */
public class CalculateImpl implements Calculate {
	// 加法
	public float plus(float x, float y) {
		return x + y;
	}

	// 减法
	public float minus(float x, float y) {
		return x - y;
	}

	// 乘法
	public float multiply(float x, float y) {
		return x * y;
	}

	// 除法
	public float divide(float x, float y) {
		if (y != 0) {
			return x / y;
		} else
			return -1;
	}
}
