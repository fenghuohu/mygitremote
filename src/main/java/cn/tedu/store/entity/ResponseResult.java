package cn.tedu.store.entity;

public class ResponseResult<T> {
	private Integer state = 200;	//操作状态
	private String message;	//提示信息
	private T data;
	
	public ResponseResult(){}
	
	public ResponseResult(Integer state, String message) {
		super();
		this.state = state;
		this.message = message;
	}

	public ResponseResult(Integer state, Exception e) {
		this.state = state;
		this.message = e.getMessage();
	}
	
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	
}
