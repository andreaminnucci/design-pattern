package designpattern.factory;

import designpattern.factory.phone.OS;
import designpattern.factory.phone.OSType;

/**
 * https://www.youtube.com/watch?v=pt1IbV1aSZ4
 * @author Andrea
 *
 */
public class FactoryMain {

	public static void main(String[] args) {
		OperatingSystemFactory osf = new OperatingSystemFactory();
		
		OS os = osf.getInstance(OSType.IOS);
		
		os.spec();
	}

}
