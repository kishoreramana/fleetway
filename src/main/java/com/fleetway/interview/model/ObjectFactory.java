//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.23 at 12:16:07 AM BST 
//


package com.fleetway.interview.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.fleetway.interview.model package. 
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

    private final static QName _DataEntities_QNAME = new QName("http://www.fleetway.com/ts/2016/03", "DataEntities");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.fleetway.interview.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DataEntities }
     * 
     */
    public DataEntities createDataEntities() {
        return new DataEntities();
    }

    /**
     * Create an instance of {@link Status }
     * 
     */
    public Status createStatus() {
        return new Status();
    }

    /**
     * Create an instance of {@link DataEntity }
     * 
     */
    public DataEntity createDataEntity() {
        return new DataEntity();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataEntities }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fleetway.com/ts/2016/03", name = "DataEntities")
    public JAXBElement<DataEntities> createDataEntities(DataEntities value) {
        return new JAXBElement<DataEntities>(_DataEntities_QNAME, DataEntities.class, null, value);
    }

}
