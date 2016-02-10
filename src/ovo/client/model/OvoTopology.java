package ovo.client.model;

import java.util.ArrayList;

public class OvoTopology {
	private ArrayList<OvoTopologyNode> nodes;
	
	public OvoTopology() {
		this.nodes = new ArrayList<OvoTopologyNode>();
	}

	public ArrayList<OvoTopologyNode> getNodes() {
		return nodes;
	}

	public void setNodes(ArrayList<OvoTopologyNode> nodes) {
		this.nodes = nodes;
	}
	
	public ArrayList<OvoTopologyNode> GetTwins(String[] nodeNames){
		ArrayList<OvoTopologyNode> twins = new ArrayList<OvoTopologyNode>();
		for(String name : nodeNames) {
			for(OvoTopologyNode node : nodes) {
				if (name.equals(node.getName())) twins.add(node);
			}
		}
		return twins;
	}
	
}
