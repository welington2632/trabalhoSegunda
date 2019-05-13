package Model.Dao;

import Model.Class.Cliente;
import Util.ConnectionFactory;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;

/**
 *
 * @author wmartins
 */
public class ClienteDAO {
    public void Cadastrar (Cliente cliente) throws SQLException, ClassNotFoundException {
        // Conexão com o banco
        Connection conn = ConnectionFactory.getConnection();
        // Preparação de código
        PreparedStatement pr = (PreparedStatement) conn.prepareStatement("insert into Cliente (nome,endereco,numeroDeCompras,ultimaDataCompra) values(?,?,?,?)");
        pr.setString(1, cliente.getNome());
        pr.setInt(2, cliente.getEndereco().getId());
        pr.setInt(3, cliente.getNumeroDeCompras());
        pr.setDate(4, (Date) cliente.getUltimaDataCompra()); 
        // Executa comando
        pr.execute();
    }
}
