package beans;

import beans.Ponente;

public class Ponente {
	private int id;
	private String nomcomp;
	private String sexo;
	private String foto;
	private String cv;
	private String nivacd;
	private String cuenta;
	private String pwd;
	private String correo;
	
	public Ponente(int id, String nomcomp, String sexo, String foto, String cv, String nivacd, String cuenta,
			String pwd, String correo) {
		super();
		this.id = id;
		this.nomcomp = nomcomp;
		this.sexo = sexo;
		this.foto = foto;
		this.cv = cv;
		this.nivacd = nivacd;
		this.cuenta = cuenta;
		this.pwd = pwd;
		this.correo = correo;
	}

	public Ponente() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomcomp() {
		return nomcomp;
	}

	public void setNomcomp(String nomcomp) {
		this.nomcomp = nomcomp;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getCv() {
		return cv;
	}

	public void setCv(String cv) {
		this.cv = cv;
	}

	public String getNivacd() {
		return nivacd;
	}

	public void setNivacd(String nivacd) {
		this.nivacd = nivacd;
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	
	
	
}
