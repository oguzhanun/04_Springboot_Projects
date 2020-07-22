package com.oguzhanun.springboot.experimental.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="sinif")
public class Sinif 
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="sinif_adi")
	private String sinif_adi;

	@Column(name="ogrenci_sayisi")
	private int ogrenci_sayisi;
	
	@Column(name="ogretmen")
	private String ogretmen;
	

	public Sinif() 
	{
		
	}

	public Sinif(int id, String sinif_adi, int ogrenci_sayisi, String ogretmen) 
	{
		this.id = id;
		this.sinif_adi = sinif_adi;
		this.ogrenci_sayisi = ogrenci_sayisi;
		this.ogretmen = ogretmen;
	}

	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public String getSinif_adi() 
	{
		return sinif_adi;
	}

	public void setSinif_adi(String sinif_adi) 
	{
		this.sinif_adi = sinif_adi;
	}

	public int getOgrenci_sayisi() 
	{
		return ogrenci_sayisi;
	}

	public void setOgrenci_sayisi(int ogrenci_sayisi) 
	{
		this.ogrenci_sayisi = ogrenci_sayisi;
	}

	public String getOgretmen() 
	{
		return ogretmen;
	}

	public void setOgretmen(String ogretmen) 
	{
		this.ogretmen = ogretmen;
	}

}
