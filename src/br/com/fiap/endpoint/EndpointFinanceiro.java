
package br.com.fiap.endpoint;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "EndpointFinanceiro", targetNamespace = "http://endpoint.fiap.com.br/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface EndpointFinanceiro {


    /**
     * 
     * @param password
     * @param parameters
     * @param username
     * @return
     *     returns br.com.fiap.endpoint.SaldoResponse
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(name = "saldoResponse", targetNamespace = "http://endpoint.fiap.com.br/", partName = "parameters")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public SaldoResponse saldo(
        @WebParam(name = "saldo", targetNamespace = "http://endpoint.fiap.com.br/", partName = "parameters")
        Saldo parameters,
        @WebParam(name = "username", targetNamespace = "http://endpoint.fiap.com.br/", header = true, partName = "username")
        String username,
        @WebParam(name = "password", targetNamespace = "http://endpoint.fiap.com.br/", header = true, partName = "password")
        String password)
        throws Exception_Exception
    ;

    /**
     * 
     * @param password
     * @param parameters
     * @param username
     * @return
     *     returns br.com.fiap.endpoint.ListarClientesResponse
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(name = "listarClientesResponse", targetNamespace = "http://endpoint.fiap.com.br/", partName = "parameters")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public ListarClientesResponse listarClientes(
        @WebParam(name = "listarClientes", targetNamespace = "http://endpoint.fiap.com.br/", partName = "parameters")
        ListarClientes parameters,
        @WebParam(name = "username", targetNamespace = "http://endpoint.fiap.com.br/", header = true, partName = "username")
        String username,
        @WebParam(name = "password", targetNamespace = "http://endpoint.fiap.com.br/", header = true, partName = "password")
        String password)
        throws Exception_Exception
    ;

    /**
     * 
     * @param password
     * @param parameters
     * @param username
     * @return
     *     returns br.com.fiap.endpoint.CobrarMensalidadeResponse
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(name = "cobrarMensalidadeResponse", targetNamespace = "http://endpoint.fiap.com.br/", partName = "result")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public CobrarMensalidadeResponse cobrarMensalidade(
        @WebParam(name = "cobrarMensalidade", targetNamespace = "http://endpoint.fiap.com.br/", partName = "parameters")
        CobrarMensalidade parameters,
        @WebParam(name = "username", targetNamespace = "http://endpoint.fiap.com.br/", header = true, partName = "username")
        String username,
        @WebParam(name = "password", targetNamespace = "http://endpoint.fiap.com.br/", header = true, partName = "password")
        String password)
        throws Exception_Exception
    ;

    /**
     * 
     * @param indentificador
     * @param valor
     * @return
     *     returns boolean
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "cobrar", targetNamespace = "http://endpoint.fiap.com.br/", className = "br.com.fiap.endpoint.Cobrar")
    @ResponseWrapper(localName = "cobrarResponse", targetNamespace = "http://endpoint.fiap.com.br/", className = "br.com.fiap.endpoint.CobrarResponse")
    public boolean cobrar(
        @WebParam(name = "indentificador", targetNamespace = "")
        String indentificador,
        @WebParam(name = "valor", targetNamespace = "")
        Double valor)
        throws Exception_Exception
    ;

    /**
     * 
     * @param cliente
     * @return
     *     returns br.com.fiap.endpoint.Cliente
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "cadastrarCliente", targetNamespace = "http://endpoint.fiap.com.br/", className = "br.com.fiap.endpoint.CadastrarCliente")
    @ResponseWrapper(localName = "cadastrarClienteResponse", targetNamespace = "http://endpoint.fiap.com.br/", className = "br.com.fiap.endpoint.CadastrarClienteResponse")
    public Cliente cadastrarCliente(
        @WebParam(name = "cliente", targetNamespace = "")
        Cliente cliente)
        throws Exception_Exception
    ;

}
