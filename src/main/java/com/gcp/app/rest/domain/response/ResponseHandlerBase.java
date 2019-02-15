package com.gcp.app.rest.domain.response;

public class ResponseHandlerBase {

	private String status;
	private int codeStatus;
	private String nativeMessage;

	public ResponseHandlerBase(String status, int codeStatus, String nativeMessage) {
		super();
		this.status = status;
		this.codeStatus = codeStatus;
		this.nativeMessage = nativeMessage;
	}

	public ResponseHandlerBase() {
		this.status = "UP";
		this.codeStatus = 200;
		this.nativeMessage = "Correct!!!!";
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getCodeStatus() {
		return codeStatus;
	}

	public void setCodeStatus(int codeStatus) {
		this.codeStatus = codeStatus;
	}

	public String getNativeMessage() {
		return nativeMessage;
	}

	public void setNativeMessage(String nativeMessage) {
		this.nativeMessage = nativeMessage;
	}

}
