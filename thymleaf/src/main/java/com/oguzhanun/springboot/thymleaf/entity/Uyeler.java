package com.oguzhanun.springboot.thymleaf.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="uyeler")
public class Uyeler implements Serializable 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="uye_id")
	private String uye_id;
	
	@Column(name="password")
	private String password;
	
	@Column(name="aktif")
	private boolean aktif;

	@OneToOne(mappedBy="uye_id", cascade=CascadeType.ALL)
	private Roller roller;
	
	public Uyeler() 
	{
		// TODO Auto-generated constructor stub
	}

	public Uyeler(String uye_id, String password, boolean aktif) 
	{
		this.uye_id = uye_id;
		this.password = password;
		this.aktif = aktif;
	}

	
	public Roller getRoller() {
		return roller;
	}

	public void setRoller(Roller roller) {
		this.roller = roller;
	}

	public String getUye_id() {
		return uye_id;
	}

	public void setUye_id(String uye_id) {
		this.uye_id = uye_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isAktif() {
		return aktif;
	}

	public void setAktif(boolean aktif) {
		this.aktif = aktif;
	}

	@Override
	public String toString() {
		return "Uyeler [uye_id=" + uye_id + ", password=" + password + ", aktif=" + aktif + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (aktif ? 1231 : 1237);
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((uye_id == null) ? 0 : uye_id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Uyeler other = (Uyeler) obj;
		if (aktif != other.aktif)
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (uye_id == null) {
			if (other.uye_id != null)
				return false;
		} else if (!uye_id.equals(other.uye_id))
			return false;
		return true;
	}
	
	
}
