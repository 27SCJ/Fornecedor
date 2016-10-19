
package br.com.fiap.endpoint;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para cobrarMensalidade complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cobrarMensalidade">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="indentificador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cobrarMensalidade", propOrder = {
    "indentificador"
})
public class CobrarMensalidade {

    protected String indentificador;

    /**
     * Obtiene el valor de la propiedad indentificador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndentificador() {
        return indentificador;
    }

    /**
     * Define el valor de la propiedad indentificador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndentificador(String value) {
        this.indentificador = value;
    }

}
