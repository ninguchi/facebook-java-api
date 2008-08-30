//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.0 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.10.27 at 03:31:33 PM PDT 
//


package com.facebook.api.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for object_assoc_info complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="object_assoc_info">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="assoc_type" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="assoc_info1" type="{http://api.facebook.com/1.0/}assoc_object_type"/>
 *         &lt;element name="assoc_info2" type="{http://api.facebook.com/1.0/}assoc_object_type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "object_assoc_info", propOrder = {
    "name",
    "assocType",
    "assocInfo1",
    "assocInfo2"
})
public class ObjectAssocInfo {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(name = "assoc_type")
    protected int assocType;
    @XmlElement(name = "assoc_info1", required = true)
    protected AssocObjectType assocInfo1;
    @XmlElement(name = "assoc_info2", required = true)
    protected AssocObjectType assocInfo2;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the assocType property.
     * 
     */
    public int getAssocType() {
        return assocType;
    }

    /**
     * Sets the value of the assocType property.
     * 
     */
    public void setAssocType(int value) {
        this.assocType = value;
    }

    /**
     * Gets the value of the assocInfo1 property.
     * 
     * @return
     *     possible object is
     *     {@link AssocObjectType }
     *     
     */
    public AssocObjectType getAssocInfo1() {
        return assocInfo1;
    }

    /**
     * Sets the value of the assocInfo1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssocObjectType }
     *     
     */
    public void setAssocInfo1(AssocObjectType value) {
        this.assocInfo1 = value;
    }

    /**
     * Gets the value of the assocInfo2 property.
     * 
     * @return
     *     possible object is
     *     {@link AssocObjectType }
     *     
     */
    public AssocObjectType getAssocInfo2() {
        return assocInfo2;
    }

    /**
     * Sets the value of the assocInfo2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssocObjectType }
     *     
     */
    public void setAssocInfo2(AssocObjectType value) {
        this.assocInfo2 = value;
    }

}
