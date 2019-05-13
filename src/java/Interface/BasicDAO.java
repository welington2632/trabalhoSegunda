
package Interface;

import java.util.List;

public interface BasicDAO {
    
    public void Cadastrar(Object obj);
    
    public void ConsultarPorID(int id);
    
    public void IniciarEdicao(Object obj);
    
    public void Editar(Object obj);
    
    public void Excluir(Object obj);
    
    public List<Object> Listar();
}
