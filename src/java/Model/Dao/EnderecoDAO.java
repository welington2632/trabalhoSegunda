
package Model.Dao;

import Model.Class.Endereco;
import Util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EnderecoDAO {
    
    public Endereco ConsultaPorId(int id) throws SQLException, ClassNotFoundException {
        Connection conn = ConnectionFactory.getConnection();
        String sqlCommand = "select * from endereco where id = ?";
        
        PreparedStatement comando = conn.prepareStatement(sqlCommand);
        comando.setInt(1, id);
        
        Endereco endereco = new Endereco();
        ResultSet resultado = comando.executeQuery();
        
        if (resultado.next()){
            endereco.setId(id);
            endereco.setComplemento(resultado.getString("complemento"));
            endereco.setLogradouro(resultado.getString("logradouro"));
            endereco.setNumero(resultado.getInt("numero"));
            endereco.setReferencia(resultado.getString("complemento"));
        }
        
        conn.close();
        
        return endereco;
    }
    
}
