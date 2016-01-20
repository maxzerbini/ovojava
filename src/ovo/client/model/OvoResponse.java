package ovo.client.model;

public class OvoResponse<T> {
	private String Status;
	private String Code;
	private T Data;
	
	public String getStatus() {
		return Status;
	}
	
	public void setStatus(String status) {
		Status = status;
	}
	
	public String getCode() {
		return Code;
	}
	
	public void setCode(String code) {
		Code = code;
	}
	
	public T getData() {
		return Data;
	}
	
	public void setData(T data) {
		Data = data;
	}
}
