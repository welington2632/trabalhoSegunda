
package Builder;

import Model.Class.Cliente;
import Model.Class.Endereco;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ClienteBuilder {
    private Cliente cliente = new Cliente();
    private Endereco endereco = new Endereco();
    
    public ClienteBuilder () {
        
    }
    
    public static ClienteBuilder novoClienteBuilder(){
        return new ClienteBuilder();
    }
    
    public ClienteBuilder comCpf(int cpf){
        cliente.setCpf(cpf);
        return this;
    }
    
    public ClienteBuilder comNome(String nome){
        cliente.setNome(nome);
        return this;
    }
    
    public ClienteBuilder comNumeroDeCompras(int valor){
        cliente.setNumeroDeCompras(valor);
        return this;
    }
    
    public ClienteBuilder ultimaDataDeCompraEm(String data) throws ParseException {
        Date dataUltimaCompra = new SimpleDateFormat("dd/MM/yyyy").parse(data);
        cliente.setUltimaDataCompra(dataUltimaCompra);
        return this;
    }
    
    public ClienteBuilder moraNoLogradouro(String logradouro){
        endereco.setLogradouro(logradouro);
        return this;
    }
    
    public ClienteBuilder noNumero(int numero) {
        endereco.setNumero(numero);
        return this;
    }
    
    public ClienteBuilder comComplemento(String complemento){
        endereco.setComplemento(complemento);
        return this;
    }
    
    public ClienteBuilder comReferencia(String referencia) {
        endereco.setReferencia(referencia);
        return this;
    }
    
    public Cliente controi(){
        cliente.setEndereco(endereco);
        return cliente;
    }
}
