package com.pavan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Entity
@Table(name = "share")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Share {
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	private String qtoken;
	private String page;
	private String query;
	private String toW;
	private String fromH;
	private String prof;
	private String status;
	private String ans;
	
	public Share() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getQtoken() {
		return qtoken;
	}

	public void setQtoken(String qtoken) {
		this.qtoken = qtoken;
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public String getToW() {
		return toW;
	}

	public void setToW(String toW) {
		this.toW = toW;
	}

	public String getFromH() {
		return fromH;
	}

	public void setFromH(String fromH) {
		this.fromH = fromH;
	}

	public String getProf() {
		return prof;
	}

	public void setProf(String prof) {
		this.prof = prof;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getAns() {
		return ans;
	}

	public void setAns(String ans) {
		this.ans = ans;
	}
}
