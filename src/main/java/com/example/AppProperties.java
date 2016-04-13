package com.example;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 *
 * @author Stephane Nicoll
 */
@ConfigurationProperties("myapp")
public class AppProperties {

	/**
	 * Pooling delay for my super awesome service.
	 */
	private long poolingDelay = 1000;

	public long getPoolingDelay() {
		return poolingDelay;
	}

	public void setPoolingDelay(long poolingDelay) {
		this.poolingDelay = poolingDelay;
	}
}
