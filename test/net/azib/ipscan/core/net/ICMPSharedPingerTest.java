package net.azib.ipscan.core.net;

import net.azib.ipscan.core.ScanningSubject;
import org.junit.Ignore;
import org.junit.Test;

import java.net.InetAddress;

import static org.junit.Assert.assertTrue;

public class ICMPSharedPingerTest {
	@Test @Ignore("this test works only under root")
	public void testPing() throws Exception {
		Pinger pinger = new ICMPSharedPinger(1000);
		PingResult result = pinger.ping(new ScanningSubject(InetAddress.getLocalHost()), 3);
		assertTrue(result.getAverageTime() >= 0);
		assertTrue(result.getAverageTime() < 50);
		assertTrue(result.getTTL() >= 0);
	}
}
