package com.pavan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Entity
@Table(name = "requests")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Request {
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	private String qtoken;
	private String pname;
	private String pid;
	private String email;
	private String phone;
	private String page;
	private String pquery;
	private String aces;
	private String status;
	private String ans;
	private String 	skp;
	private String pkd;
	
	
	
	public Request() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getQtoken() {
		return qtoken;
	}
	public void setQtoken(String qtoken) {
		this.qtoken = qtoken;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}
	public String getPquery() {
		return pquery;
	}
	public void setPquery(String pquery) {
		this.pquery = pquery;
	}
	public String getAces() {
		return aces;
	}
	public void setAces(String aces) {
		this.aces = aces;
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
	public String getSkp() {
		return skp;
	}
	public void setSkp(String skp) {
		this.skp = skp;
	}
	public String getPkd() {
		return pkd;
	}
	public void setPkd(String pkd) {
		this.pkd = pkd;
	}
	
}
