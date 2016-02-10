package ovo.client.model;

public class OvoTopologyNode {
	private String name;
	private int[] hashRange;
	private String host;
	private int port;
	private String state;
	private String[] twins;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getHashRange() {
		return hashRange;
	}
	public void setHashRange(int[] hashRange) {
		this.hashRange = hashRange;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String[] getTwins() {
		return twins;
	}
	public void setTwins(String[] twins) {
		this.twins = twins;
	}
}
