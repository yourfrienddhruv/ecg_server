//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.01.09 at 03:53:07 PM EST 
//


package parser;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="mmHg" type="{http://www3.medical.philips.com}TYPEbp"/>
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
    "mmHg"
})
@XmlRootElement(name = "diastolic")
public class Diastolic {

    @XmlElement(required = true)
    protected String mmHg;

    /**
     * Gets the value of the mmHg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMmHg() {
        return mmHg;
    }

    /**
     * Sets the value of the mmHg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMmHg(String value) {
        this.mmHg = value;
    }

}
