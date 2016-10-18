
package br.com.governo.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para notaFiscal complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="notaFiscal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cnpjEmissor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cnpjReceptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cpfEmissor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cpfReceptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valorTotal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "notaFiscal", propOrder = {
    "cnpjEmissor",
    "cnpjReceptor",
    "cpfEmissor",
    "cpfReceptor",
    "valorTotal"
})
public class NotaFiscal {

    protected String cnpjEmissor;
    protected String cnpjReceptor;
    protected String cpfEmissor;
    protected String cpfReceptor;
    protected Double valorTotal;

    /**
     * Obtiene el valor de la propiedad cnpjEmissor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnpjEmissor() {
        return cnpjEmissor;
    }

    /**
     * Define el valor de la propiedad cnpjEmissor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCnpjEmissor(String value) {
        this.cnpjEmissor = value;
    }

    /**
     * Obtiene el valor de la propiedad cnpjReceptor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnpjReceptor() {
        return cnpjReceptor;
    }

    /**
     * Define el valor de la propiedad cnpjReceptor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCnpjReceptor(String value) {
        this.cnpjReceptor = value;
    }

    /**
     * Obtiene el valor de la propiedad cpfEmissor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpfEmissor() {
        return cpfEmissor;
    }

    /**
     * Define el valor de la propiedad cpfEmissor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpfEmissor(String value) {
        this.cpfEmissor = value;
    }

    /**
     * Obtiene el valor de la propiedad cpfReceptor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpfReceptor() {
        return cpfReceptor;
    }

    /**
     * Define el valor de la propiedad cpfReceptor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpfReceptor(String value) {
        this.cpfReceptor = value;
    }

    /**
     * Obtiene el valor de la propiedad valorTotal.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValorTotal() {
        return valorTotal;
    }

    /**
     * Define el valor de la propiedad valorTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValorTotal(Double value) {
        this.valorTotal = value;
    }

}
