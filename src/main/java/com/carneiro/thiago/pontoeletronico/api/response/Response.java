package com.carneiro.thiago.pontoeletronico.api.response;

import java.util.ArrayList;
import java.util.List;

public class Response<T> {
	
	private T data;
	private List<String> errors;

	public T getData() {
		return data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
	
	public List<String> getErrors() {
		if (this.errors == null) {
			this.errors = new ArrayList<String>();
		}
		return errors;
	}
	
	public void setErrors(List<String> errors) {
		this.errors = errors;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((errors == null) ? 0 : errors.hashCode());
		return result;
	}
		
	@Override
	public String toString() {
		return "Response [data=" + data + ", errors=" + errors + "]";
	}
	
	
}
