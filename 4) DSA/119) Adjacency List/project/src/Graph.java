import java.util.*;

public class Graph {

	ArrayList<LinkedList<Node>> alist;
	
	Graph(){
		alist = new ArrayList<>();
	}
	
	public void addNode(Node node) {
		LinkedList<Node> list = new LinkedList<>();
		list.add(node);
		alist.add(list);
	}
	public void addEdge(int src, int dst) {
		LinkedList<Node> srcList = alist.get(src);
		Node dstNode = alist.get(dst).get(0);         //I am getting the node object from here.
		srcList.add(dstNode);
	}
	public boolean checkEdge(int src, int dst) {
		LinkedList<Node> srcList = alist.get(src);
		Node dstNode = alist.get(dst).get(0);         //I am getting the node object from here.
		
		for(Node node : srcList) {
			if(node == dstNode) {
				return true;
			}
		}
		return false;
	}
	public void print() {
		for(LinkedList<Node> nodeList : alist) {
			for(Node node : nodeList) {
				System.out.print(node.data + " -> ");
			}
			System.out.println();
		}
	}
}