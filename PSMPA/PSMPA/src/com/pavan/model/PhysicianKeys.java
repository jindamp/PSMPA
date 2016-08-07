package com.pavan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Entity
@Table(name = "physician_keys")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class PhysicianKeys {
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
		private String email;
		private String pk;
		private String sk;
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPk() {
			return pk;
		}
		public void setPk(String pk) {
			this.pk = pk;
		}
		public String getSk() {
			return sk;
		}
		public void setSk(String sk) {
			this.sk = sk;
		}
}
