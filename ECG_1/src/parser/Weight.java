//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.01.09 at 03:53:07 PM EST 
//


package parser;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="kg" type="{http://www3.medical.philips.com}TYPEweight"/>
 *           &lt;element name="lb" type="{http://www3.medical.philips.com}TYPEweight"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "kg",
    "lb"
})
@XmlRootElement(name = "weight")
public class Weight {

    protected String kg;
    protected String lb;

    /**
     * Gets the value of the kg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKg() {
        return kg;
    }

    /**
     * Sets the value of the kg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKg(String value) {
        this.kg = value;
    }

    /**
     * Gets the value of the lb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLb() {
        return lb;
    }

    /**
     * Sets the value of the lb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLb(String value) {
        this.lb = value;
    }

}
