package com.book.tx;

import java.util.List;

public class Book {

	private String names;
	private String url;
	private List<BokeName>  BokeName;
	public String getNames() {
		return names;
	}
	public void setNames(String names) {
		this.names = names;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public List<BokeName> getBokeName() {
		return BokeName;
	}
	public void setBokeName(List<BokeName> bokeName) {
		BokeName = bokeName;
	}
	
	
}
