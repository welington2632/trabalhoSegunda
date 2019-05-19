package Model.Dao;

import Interface.BasicDAO;
import Model.Class.Cliente;
import Model.Class.Endereco;
import Util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author wmartins
 */
public class ClienteDAO  {
    
    
    public void Cadastrar (Cliente cliente) throws SQLException, ClassNotFoundException {
        Connection conn = ConnectionFactory.getConnection();
        
        PreparedStatement pr = (PreparedStatement) conn.prepareStatement("insert into Cliente (cpf,nome,endereco,numerodecompras) values(?,?,?,0)");
        pr.setInt(1, cliente.getCpf());
        pr.setString(2, cliente.getNome());
        pr.setInt(3, cliente.getEndereco().getId());
        pr.execute();
        
        conn.close();
    }
    
    public Cliente ConsultaPorCpf (int cpf) throws SQLException, ClassNotFoundException {
        Connection conn = ConnectionFactory.getConnection();
        
        String sqlCommand = "select * from cliente where cpf = ?";
        PreparedStatement comando = (PreparedStatement) conn.prepareStatement(sqlCommand);
        comando.setInt(1, cpf);
        
        ResultSet resultado = comando.executeQuery();
        Cliente clienteConsultado = new Cliente();
        EnderecoDAO endereco = new EnderecoDAO();
        if (resultado.next()){
            clienteConsultado.setCpf(cpf);
            clienteConsultado.setNome(resultado.getString("nome"));
            clienteConsultado.setEndereco(endereco.ConsultaPorId(resultado.getInt("endereco")));
            clienteConsultado.setNumeroDeCompras(resultado.getInt("numerodecompras"));
            clienteConsultado.setUltimaDataCompra(resultado.getDate("ultimadatacompra"));
        }
        
        conn.close();
        
        return clienteConsultado;
    }
    
    public ArrayList<Cliente> Listar () throws SQLException, ClassNotFoundException {
        // Estabelecendo conexão
        Connection conn = ConnectionFactory.getConnection();
        
        // Preparando comando
        PreparedStatement pr = (PreparedStatement) conn.prepareStatement("select * from cliente");
        
        // Realizando busca e retorno
        ResultSet resultado = pr.executeQuery();
        ArrayList<Cliente> lista = new ArrayList<Cliente>();
        while (resultado.next()){
            Cliente cliente = new Cliente();
            cliente.setCpf(resultado.getInt("cpf"));
            cliente.setNome(resultado.getString("nome"));
            // Colocar endereço aqui depois
            lista.add(cliente);
        }
        
        conn.close();
        
        return lista;
    }
}
