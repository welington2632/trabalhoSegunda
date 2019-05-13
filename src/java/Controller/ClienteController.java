
package Controller;

import Model.Class.Cliente;
import Model.Class.Endereco;
import Model.Dao.ClienteDAO;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ClienteController", urlPatterns = {"/ClienteController"})
public class ClienteController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response){

    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response){

    }
    
    public void CadastrarPessoa(HttpServletRequest request, HttpServletResponse response) throws SQLException, ClassNotFoundException{
        Cliente cliente = new Cliente();
        cliente.setNome(request.getParameter("nome"));
        cliente.setNumeroDeCompras(0);
        ClienteDAO dao = new ClienteDAO();
        dao.Cadastrar(cliente);
    }
}
