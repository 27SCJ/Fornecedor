
package br.com.governo.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para emitirNotaFiscal complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="emitirNotaFiscal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cpfOuCnpjDestinatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valorTotalProdutos" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "emitirNotaFiscal", propOrder = {
    "cpfOuCnpjDestinatario",
    "valorTotalProdutos"
})
public class EmitirNotaFiscal {

    protected String cpfOuCnpjDestinatario;
    protected Double valorTotalProdutos;

    /**
     * Obtiene el valor de la propiedad cpfOuCnpjDestinatario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpfOuCnpjDestinatario() {
        return cpfOuCnpjDestinatario;
    }

    /**
     * Define el valor de la propiedad cpfOuCnpjDestinatario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpfOuCnpjDestinatario(String value) {
        this.cpfOuCnpjDestinatario = value;
    }

    /**
     * Obtiene el valor de la propiedad valorTotalProdutos.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValorTotalProdutos() {
        return valorTotalProdutos;
    }

    /**
     * Define el valor de la propiedad valorTotalProdutos.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValorTotalProdutos(Double value) {
        this.valorTotalProdutos = value;
    }

}
