package designpattern.state.carrier;

public interface PackageState {
	
	public void next(Package pkg);
    
	public void previous(Package pkg);
    
	public void printStatus();

}
