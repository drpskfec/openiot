//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.13 at 04:10:11 
//


package org.openiot.commons.sdum.serviceresultset.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element ref="{urn:openiot:sdum:serviceresultset:xsd:1}presentationAttr" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="widgetID" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "presentationAttr"
})
@XmlRootElement(name = "widget")
public class Widget {

    @XmlElement(required = true)
    protected List<PresentationAttr> presentationAttr;
    @XmlAttribute(name = "widgetID", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String widgetID;

    /**
     * Gets the value of the presentationAttr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the presentationAttr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPresentationAttr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PresentationAttr }
     * 
     * 
     */
    public List<PresentationAttr> getPresentationAttr() {
        if (presentationAttr == null) {
            presentationAttr = new ArrayList<PresentationAttr>();
        }
        return this.presentationAttr;
    }

    /**
     * Gets the value of the widgetID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWidgetID() {
        return widgetID;
    }

    /**
     * Sets the value of the widgetID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWidgetID(String value) {
        this.widgetID = value;
    }

}
