package designpattern.adapter.school;

public class PenAdapter implements Pen {

	private PilotPen pilotPen = new PilotPen();
	
	@Override
	public void write(String word) {
		pilotPen.mark(word);
	}

}
