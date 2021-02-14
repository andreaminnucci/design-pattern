package designpattern.state;

import designpattern.state.carrier.DeliveredState;
import designpattern.state.carrier.OrderedState;
import designpattern.state.carrier.Package;
import designpattern.state.carrier.ReceivedState;

/**
 * https://www.baeldung.com/java-state-design-pattern
 * 
 * @author Andrea
 *
 */
public class StateMain {

	public static void main(String[] args) {
		Package pkg = new Package();
		
		assert pkg.getState() instanceof OrderedState;
		pkg.printStatus();
		
	    pkg.nextState();	    
	    assert pkg.getState() instanceof DeliveredState;
	    pkg.printStatus();

	    pkg.nextState();	    
	    assert pkg.getState() instanceof ReceivedState;
	    pkg.printStatus();
	    
	    pkg.previousState();
	    assert pkg.getState() instanceof DeliveredState;
	    pkg.printStatus();
	}

}
