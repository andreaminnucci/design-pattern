package designpattern.adapter;

import designpattern.adapter.school.AssignmentWork;
import designpattern.adapter.school.Pen;
import designpattern.adapter.school.PenAdapter;

public class AdapterMain {

	public static void main(String[] args) {
		
		Pen pen = new PenAdapter();
		
		AssignmentWork aw = new AssignmentWork();
		
		aw.setPen(pen);
		
		aw.writeAssignment("I'm bit tired to write an Assignment");
	}

}
