package com.oguzhanun.springboot.thymleaf.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="roller")
//@IdClass(com.oguzhanun.springboot.thymleaf.entity.Uyeler.class)
public class Roller implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// tablo da herhangi bir id olmadığında bunu kullanabiliyoruz...
	@Id
	//@Transient
    private String id;
	
	
	// eğer Uyeler tablosunun id si bu tablonun da id si olacak ise @MapsId yi kullanıyoruz...
	//uye_id sini başlangıçta atama yapılmadan bir başka değere atamaya çalışıyor...????...???....
	//@MapsId
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="uye_id")
	private Uyeler uye_id;
	
	
	
	@Column(name="rol")
	private String rol;

	public Roller() 
	{
		// TODO Auto-generated constructor stub
	}

	public Roller(Uyeler uye_id, String rol) 
	{
		this.uye_id = uye_id;
		this.rol = rol;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Uyeler getUye_id() {
		return uye_id;
	}

	public void setUye_id(Uyeler uye_id) {
		this.uye_id = uye_id;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	@Override
	public String toString() {
		return "Roller [uye_id=" + uye_id + ", rol=" + rol + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((rol == null) ? 0 : rol.hashCode());
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
		Roller other = (Roller) obj;
		if (rol == null) {
			if (other.rol != null)
				return false;
		} else if (!rol.equals(other.rol))
			return false;
		if (uye_id == null) {
			if (other.uye_id != null)
				return false;
		} else if (!uye_id.equals(other.uye_id))
			return false;
		return true;
	}
	
}
