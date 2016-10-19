
package br.com.fiap.endpoint;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.fiap.endpoint package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Password_QNAME = new QName("http://endpoint.fiap.com.br/", "password");
    private final static QName _Cliente_QNAME = new QName("http://endpoint.fiap.com.br/", "cliente");
    private final static QName _CobrarMensalidade_QNAME = new QName("http://endpoint.fiap.com.br/", "cobrarMensalidade");
    private final static QName _Cobrar_QNAME = new QName("http://endpoint.fiap.com.br/", "cobrar");
    private final static QName _SaldoResponse_QNAME = new QName("http://endpoint.fiap.com.br/", "saldoResponse");
    private final static QName _Username_QNAME = new QName("http://endpoint.fiap.com.br/", "username");
    private final static QName _CadastrarCliente_QNAME = new QName("http://endpoint.fiap.com.br/", "cadastrarCliente");
    private final static QName _CadastrarClienteResponse_QNAME = new QName("http://endpoint.fiap.com.br/", "cadastrarClienteResponse");
    private final static QName _CobrarResponse_QNAME = new QName("http://endpoint.fiap.com.br/", "cobrarResponse");
    private final static QName _ListarClientes_QNAME = new QName("http://endpoint.fiap.com.br/", "listarClientes");
    private final static QName _Saldo_QNAME = new QName("http://endpoint.fiap.com.br/", "saldo");
    private final static QName _ListarClientesResponse_QNAME = new QName("http://endpoint.fiap.com.br/", "listarClientesResponse");
    private final static QName _Exception_QNAME = new QName("http://endpoint.fiap.com.br/", "Exception");
    private final static QName _CobrarMensalidadeResponse_QNAME = new QName("http://endpoint.fiap.com.br/", "cobrarMensalidadeResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.fiap.endpoint
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListarClientes }
     * 
     */
    public ListarClientes createListarClientes() {
        return new ListarClientes();
    }

    /**
     * Create an instance of {@link CadastrarClienteResponse }
     * 
     */
    public CadastrarClienteResponse createCadastrarClienteResponse() {
        return new CadastrarClienteResponse();
    }

    /**
     * Create an instance of {@link CobrarResponse }
     * 
     */
    public CobrarResponse createCobrarResponse() {
        return new CobrarResponse();
    }

    /**
     * Create an instance of {@link ListarClientesResponse }
     * 
     */
    public ListarClientesResponse createListarClientesResponse() {
        return new ListarClientesResponse();
    }

    /**
     * Create an instance of {@link Saldo }
     * 
     */
    public Saldo createSaldo() {
        return new Saldo();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link CobrarMensalidadeResponse }
     * 
     */
    public CobrarMensalidadeResponse createCobrarMensalidadeResponse() {
        return new CobrarMensalidadeResponse();
    }

    /**
     * Create an instance of {@link Cliente }
     * 
     */
    public Cliente createCliente() {
        return new Cliente();
    }

    /**
     * Create an instance of {@link CobrarMensalidade }
     * 
     */
    public CobrarMensalidade createCobrarMensalidade() {
        return new CobrarMensalidade();
    }

    /**
     * Create an instance of {@link Cobrar }
     * 
     */
    public Cobrar createCobrar() {
        return new Cobrar();
    }

    /**
     * Create an instance of {@link CadastrarCliente }
     * 
     */
    public CadastrarCliente createCadastrarCliente() {
        return new CadastrarCliente();
    }

    /**
     * Create an instance of {@link SaldoResponse }
     * 
     */
    public SaldoResponse createSaldoResponse() {
        return new SaldoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.fiap.com.br/", name = "password")
    public JAXBElement<String> createPassword(String value) {
        return new JAXBElement<String>(_Password_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.fiap.com.br/", name = "cliente")
    public JAXBElement<Cliente> createCliente(Cliente value) {
        return new JAXBElement<Cliente>(_Cliente_QNAME, Cliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CobrarMensalidade }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.fiap.com.br/", name = "cobrarMensalidade")
    public JAXBElement<CobrarMensalidade> createCobrarMensalidade(CobrarMensalidade value) {
        return new JAXBElement<CobrarMensalidade>(_CobrarMensalidade_QNAME, CobrarMensalidade.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cobrar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.fiap.com.br/", name = "cobrar")
    public JAXBElement<Cobrar> createCobrar(Cobrar value) {
        return new JAXBElement<Cobrar>(_Cobrar_QNAME, Cobrar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaldoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.fiap.com.br/", name = "saldoResponse")
    public JAXBElement<SaldoResponse> createSaldoResponse(SaldoResponse value) {
        return new JAXBElement<SaldoResponse>(_SaldoResponse_QNAME, SaldoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.fiap.com.br/", name = "username")
    public JAXBElement<String> createUsername(String value) {
        return new JAXBElement<String>(_Username_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarCliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.fiap.com.br/", name = "cadastrarCliente")
    public JAXBElement<CadastrarCliente> createCadastrarCliente(CadastrarCliente value) {
        return new JAXBElement<CadastrarCliente>(_CadastrarCliente_QNAME, CadastrarCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarClienteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.fiap.com.br/", name = "cadastrarClienteResponse")
    public JAXBElement<CadastrarClienteResponse> createCadastrarClienteResponse(CadastrarClienteResponse value) {
        return new JAXBElement<CadastrarClienteResponse>(_CadastrarClienteResponse_QNAME, CadastrarClienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CobrarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.fiap.com.br/", name = "cobrarResponse")
    public JAXBElement<CobrarResponse> createCobrarResponse(CobrarResponse value) {
        return new JAXBElement<CobrarResponse>(_CobrarResponse_QNAME, CobrarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarClientes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.fiap.com.br/", name = "listarClientes")
    public JAXBElement<ListarClientes> createListarClientes(ListarClientes value) {
        return new JAXBElement<ListarClientes>(_ListarClientes_QNAME, ListarClientes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Saldo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.fiap.com.br/", name = "saldo")
    public JAXBElement<Saldo> createSaldo(Saldo value) {
        return new JAXBElement<Saldo>(_Saldo_QNAME, Saldo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarClientesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.fiap.com.br/", name = "listarClientesResponse")
    public JAXBElement<ListarClientesResponse> createListarClientesResponse(ListarClientesResponse value) {
        return new JAXBElement<ListarClientesResponse>(_ListarClientesResponse_QNAME, ListarClientesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.fiap.com.br/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CobrarMensalidadeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.fiap.com.br/", name = "cobrarMensalidadeResponse")
    public JAXBElement<CobrarMensalidadeResponse> createCobrarMensalidadeResponse(CobrarMensalidadeResponse value) {
        return new JAXBElement<CobrarMensalidadeResponse>(_CobrarMensalidadeResponse_QNAME, CobrarMensalidadeResponse.class, null, value);
    }

}
