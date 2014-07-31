package Trees;

public abstract class Node {
	
	private Node[] children; // class member
	
	public Node (Node[] children) {
	
		this.children = children;
	}

	
	public int getNumberOfChildren () {
		return children.length;
	}
	
	
	public Node getChild(int index) {
		return children[index];
	}
}
