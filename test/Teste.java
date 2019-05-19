/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Model.Class.Cliente;
import Model.Class.Endereco;
import Model.Dao.EnderecoDAO;
import Util.ConnectionFactory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author wmartins
 */
public class Teste {
    
    public Teste() {
    }
    
    @Test
    public void DeveriaPuxarEndereco() throws SQLException, ClassNotFoundException{
        Cliente cliente = new Cliente();
        cliente = ConsultaPorCpf(1);
        assertEquals("Av.Francisco Rodrigues Filho",cliente.getEndereco().getLogradouro());
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
}
