package Trees;

public class IntNode extends Node {

	private int value;
	
	public IntNode(Node[] children, int val) {
		super(children);
		value = val;
	}
	
	public int getValue() {
		return value;
	}
}
