package Acciones;

import java.sql.Connection;
import java.sql.PreparedStatement;

import beans.Ponente;
import utils.BdConexion;

public class PonenteGestion {
	
	public void RegistrarPonentes(Ponente pon){
		Connection cnx = null;
		
		PreparedStatement pstm = null;
		 		try {
			
			cnx = BdConexion.getConexion();
			String sql = "INSERT INTO ponente VALUES(?,?,?,?,?,?,?,?,?)";
			
			pstm = cnx.prepareStatement(sql);
				pstm.setInt(1, pon.getId());
				pstm.setString(2, pon.getNomcomp());
				pstm.setString(3, pon.getSexo());
				pstm.setString(4, pon.getFoto());
				pstm.setString(5, pon.getCv());
				pstm.setString(6, pon.getNivacd());
				pstm.setString(7, pon.getPwd());
				pstm.setString(8, pon.getPwd());
				pstm.setString(9, pon.getCorreo());
				
				pstm.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				if (pstm != null) {
					pstm.close();					
				}if (cnx != null){
					cnx.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
