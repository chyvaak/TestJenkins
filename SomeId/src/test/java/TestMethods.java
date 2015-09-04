import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

import brains.Metod;


public class TestMethods {

	@Test
	public void test() {
		Assert.assertEquals(44, new Metod().sum(12, 32));
	}

}
