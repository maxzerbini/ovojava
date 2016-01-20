package ovo.client.model;

public class OvoCounter {
	private String Key;
	private long Value;
	private int TTL;
	private int Hash;
	
	public String getKey() {
		return Key;
	}
	public void setKey(String key) {
		Key = key;
	}
	public long getValue() {
		return Value;
	}
	public void setValue(long value) {
		Value = value;
	}
	public int getTTL() {
		return TTL;
	}
	public void setTTL(int tTL) {
		TTL = tTL;
	}
	public int getHash() {
		return Hash;
	}
	public void setHash(int hash) {
		Hash = hash;
	}
}
