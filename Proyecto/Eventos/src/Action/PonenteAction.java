package Action;

import Acciones.PonenteGestion;
import beans.Ponente;

public class PonenteAction {
	private int txtId;
	private String txtNom;
	private String rdSexo;
	private String flfoto;
	private String flcv;
	private String txtNivAcd;
	private String txtCuenta;
	private String txtPwd;
	private String txtEmail;
	
	private Ponente objPon;
	
	public String Registrar(){
		objPon = new Ponente(txtId, txtNom, rdSexo, flfoto, flcv, txtNivAcd, txtCuenta, txtPwd, txtEmail);
		
		try {
			PonenteGestion pg = new PonenteGestion();
			pg.RegistrarPonentes(objPon);
			return "exito";
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
	}
	
	public int getTxtId() {
		return txtId;
	}
	public void setTxtId(int txtId) {
		this.txtId = txtId;
	}
	public String getTxtNom() {
		return txtNom;
	}
	public void setTxtNom(String txtNom) {
		this.txtNom = txtNom;
	}
	public String getRdSexo() {
		return rdSexo;
	}
	public void setRdSexo(String rdSexo) {
		this.rdSexo = rdSexo;
	}
	public String getFlfoto() {
		return flfoto;
	}
	public void setFlfoto(String flfoto) {
		this.flfoto = flfoto;
	}
	public String getFlcv() {
		return flcv;
	}
	public void setFlcv(String flcv) {
		this.flcv = flcv;
	}
	public String getTxtNivAcd() {
		return txtNivAcd;
	}
	public void setTxtNivAcd(String txtNivAcd) {
		this.txtNivAcd = txtNivAcd;
	}
	public String getTxtCuenta() {
		return txtCuenta;
	}
	public void setTxtCuenta(String txtCuenta) {
		this.txtCuenta = txtCuenta;
	}
	public String getTxtPwd() {
		return txtPwd;
	}
	public void setTxtPwd(String txtPwd) {
		this.txtPwd = txtPwd;
	}
	public String getTxtEmail() {
		return txtEmail;
	}
	public void setTxtEmail(String txtEmail) {
		this.txtEmail = txtEmail;
	}

	public Ponente getObjPon() {
		return objPon;
	}

	public void setObjPon(Ponente objPon) {
		this.objPon = objPon;
	}
	
	

}
