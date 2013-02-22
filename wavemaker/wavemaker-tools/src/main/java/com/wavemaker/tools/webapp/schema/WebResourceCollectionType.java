/*
 *  Copyright (C) 2008-2013 VMware, Inc. All rights reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.4-10/02/2007 10:39 AM(ffu)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.12.20 at 10:31:30 AM PST 
//

package com.wavemaker.tools.webapp.schema;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * 
 * 
 * The web-resource-collectionType is used to identify a subset of the resources and HTTP methods on those resources
 * within a web application to which a security constraint applies. If no HTTP methods are specified, then the security
 * constraint applies to all HTTP methods.
 * 
 * Used in: security-constraint
 * 
 * 
 * 
 * <p>
 * Java class for web-resource-collectionType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="web-resource-collectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="web-resource-name" type="{http://java.sun.com/xml/ns/j2ee}string"/>
 *         &lt;element name="description" type="{http://java.sun.com/xml/ns/j2ee}descriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="url-pattern" type="{http://java.sun.com/xml/ns/j2ee}url-patternType" maxOccurs="unbounded"/>
 *         &lt;element name="http-method" type="{http://java.sun.com/xml/ns/j2ee}http-methodType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "web-resource-collectionType", propOrder = { "webResourceName", "description", "urlPattern", "httpMethod" })
public class WebResourceCollectionType {

    @XmlElement(name = "web-resource-name", required = true)
    protected com.wavemaker.tools.webapp.schema.String webResourceName;

    protected List<DescriptionType> description;

    @XmlElement(name = "url-pattern", required = true)
    protected List<UrlPatternType> urlPattern;

    @XmlElement(name = "http-method")
    protected List<HttpMethodType> httpMethod;

    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected java.lang.String id;

    /**
     * Gets the value of the webResourceName property.
     * 
     * @return possible object is {@link com.wavemaker.tools.webapp.schema.String }
     * 
     */
    public com.wavemaker.tools.webapp.schema.String getWebResourceName() {
        return this.webResourceName;
    }

    /**
     * Sets the value of the webResourceName property.
     * 
     * @param value allowed object is {@link com.wavemaker.tools.webapp.schema.String }
     * 
     */
    public void setWebResourceName(com.wavemaker.tools.webapp.schema.String value) {
        this.webResourceName = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
     * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
     * the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link DescriptionType }
     * 
     * 
     */
    public List<DescriptionType> getDescription() {
        if (this.description == null) {
            this.description = new ArrayList<DescriptionType>();
        }
        return this.description;
    }

    /**
     * Gets the value of the urlPattern property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
     * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
     * the urlPattern property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getUrlPattern().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link UrlPatternType }
     * 
     * 
     */
    public List<UrlPatternType> getUrlPattern() {
        if (this.urlPattern == null) {
            this.urlPattern = new ArrayList<UrlPatternType>();
        }
        return this.urlPattern;
    }

    /**
     * Gets the value of the httpMethod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
     * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
     * the httpMethod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getHttpMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link HttpMethodType }
     * 
     * 
     */
    public List<HttpMethodType> getHttpMethod() {
        if (this.httpMethod == null) {
            this.httpMethod = new ArrayList<HttpMethodType>();
        }
        return this.httpMethod;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return possible object is {@link java.lang.String }
     * 
     */
    public java.lang.String getId() {
        return this.id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value allowed object is {@link java.lang.String }
     * 
     */
    public void setId(java.lang.String value) {
        this.id = value;
    }

}
