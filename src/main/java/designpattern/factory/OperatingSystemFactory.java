package designpattern.factory;

import designpattern.factory.phone.Android;
import designpattern.factory.phone.IOS;
import designpattern.factory.phone.OS;
import designpattern.factory.phone.OSType;
import designpattern.factory.phone.Windows;

public class OperatingSystemFactory {

	public OS getInstance(OSType osType) {
		assert osType != null;
		
		switch (osType) {
		case Android:
			return new Android();
		case IOS:
			return new IOS();
		case Windows:
			return new Windows();
		default:
			break;
		}
		return null;
	}
}
