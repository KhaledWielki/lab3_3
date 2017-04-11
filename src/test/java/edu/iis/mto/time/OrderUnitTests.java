package edu.iis.mto.time;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.iis.mto.fakeTime.AdvancedTimeSrc;
import edu.iis.mto.fakeTime.DefaultTimeSrc;
import edu.iis.mto.time.Order;
import edu.iis.mto.time.OrderExpiredException;

public class OrderUnitTests {

	@Test
	 public void confirmDefaultTime() {
  		Order order = new Order(new DefaultTimeSrc());
  		order.submit();
  		order.confirm();
	}
	
	@Test(expected = OrderExpiredException.class)
 	public void confirmAdvancedTime() {
 		Order order = new Order(new AdvancedTimeSrc());
 		order.submit();
 		order.confirm();
	 }
}
