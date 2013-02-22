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
 * The env-entryType is used to declare an application's environment entry. The declaration consists of an optional
 * description, the name of the environment entry, and an optional value. If a value is not specified, one must be
 * supplied during deployment.
 * 
 * It is used by env-entry elements.
 * 
 * 
 * 
 * <p>
 * Java class for env-entryType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="env-entryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://java.sun.com/xml/ns/j2ee}descriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="env-entry-name" type="{http://java.sun.com/xml/ns/j2ee}jndi-nameType"/>
 *         &lt;element name="env-entry-type" type="{http://java.sun.com/xml/ns/j2ee}env-entry-type-valuesType"/>
 *         &lt;element name="env-entry-value" type="{http://java.sun.com/xml/ns/j2ee}xsdStringType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "env-entryType", propOrder = { "description", "envEntryName", "envEntryType", "envEntryValue" })
public class EnvEntryType {

    protected List<DescriptionType> description;

    @XmlElement(name = "env-entry-name", required = true)
    protected JndiNameType envEntryName;

    @XmlElement(name = "env-entry-type", required = true)
    protected EnvEntryTypeValuesType envEntryType;

    @XmlElement(name = "env-entry-value")
    protected XsdStringType envEntryValue;

    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected java.lang.String id;

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
     * Gets the value of the envEntryName property.
     * 
     * @return possible object is {@link JndiNameType }
     * 
     */
    public JndiNameType getEnvEntryName() {
        return this.envEntryName;
    }

    /**
     * Sets the value of the envEntryName property.
     * 
     * @param value allowed object is {@link JndiNameType }
     * 
     */
    public void setEnvEntryName(JndiNameType value) {
        this.envEntryName = value;
    }

    /**
     * Gets the value of the envEntryType property.
     * 
     * @return possible object is {@link EnvEntryTypeValuesType }
     * 
     */
    public EnvEntryTypeValuesType getEnvEntryType() {
        return this.envEntryType;
    }

    /**
     * Sets the value of the envEntryType property.
     * 
     * @param value allowed object is {@link EnvEntryTypeValuesType }
     * 
     */
    public void setEnvEntryType(EnvEntryTypeValuesType value) {
        this.envEntryType = value;
    }

    /**
     * Gets the value of the envEntryValue property.
     * 
     * @return possible object is {@link XsdStringType }
     * 
     */
    public XsdStringType getEnvEntryValue() {
        return this.envEntryValue;
    }

    /**
     * Sets the value of the envEntryValue property.
     * 
     * @param value allowed object is {@link XsdStringType }
     * 
     */
    public void setEnvEntryValue(XsdStringType value) {
        this.envEntryValue = value;
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
