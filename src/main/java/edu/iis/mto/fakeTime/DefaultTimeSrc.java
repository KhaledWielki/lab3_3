/**
 * 
 */
package edu.iis.mto.fakeTime;


public class DefaultTimeSrc implements TimeSource {

	@Override
	public long currentTimeMillis() {
		return System.currentTimeMillis();
	}

}
