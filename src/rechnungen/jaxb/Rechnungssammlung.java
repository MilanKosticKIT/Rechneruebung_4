//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.05.27 um 02:08:14 PM CEST 
//


package rechnungen.jaxb;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rechnung" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="leistungssteller">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="adresse">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="strasse" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="hausnummer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="postleitzahl" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                       &lt;element name="ort" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="telefon" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="fax" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="e-mail" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="steuernummer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="leistungsempfaenger">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="anrede" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="adresse">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="strasse" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="hausnummer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="postleitzahl" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                       &lt;element name="ort" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="rechnungsdatum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="rechnungsnummer">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;pattern value="[0-9]([0-9/ \-])+[0-9]"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="dienstleistungen">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="dienstleistung" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="position" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                       &lt;element name="menge-oder-umfang" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="art-der-dienstleistung" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="einzelpreis">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="betrag" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                                                 &lt;element name="waehrung" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="gesamtpreis">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="betrag" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                                                 &lt;element name="waehrung" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="mwst" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="datum" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="kosten">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="steuerbetrag">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="betrag" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                                       &lt;element name="waehrung" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="entgeld">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="betrag" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                                       &lt;element name="waehrung" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="nettobetrag">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="betrag" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                                       &lt;element name="waehrung" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="zahlungsmoeglichkeiten">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="bankverbindung" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;choice>
 *                                       &lt;sequence>
 *                                         &lt;element name="IBAN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                         &lt;element name="BIC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                       &lt;sequence>
 *                                         &lt;element name="BLZ" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *                                         &lt;element name="Kontonummer" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *                                         &lt;element name="Bank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                       &lt;sequence>
 *                                         &lt;element name="BitcoinAdresse" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;/sequence>
 *                                       &lt;sequence>
 *                                         &lt;element name="BIC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                         &lt;element name="Kontonummer" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *                                       &lt;/sequence>
 *                                     &lt;/choice>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "rechnung"
})
@XmlRootElement(name = "rechnungssammlung")
public class Rechnungssammlung {

    @XmlElement(required = true)
    protected List<Rechnungssammlung.Rechnung> rechnung;

    /**
     * Gets the value of the rechnung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rechnung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRechnung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Rechnungssammlung.Rechnung }
     * 
     * 
     */
    public List<Rechnungssammlung.Rechnung> getRechnung() {
        if (rechnung == null) {
            rechnung = new ArrayList<Rechnungssammlung.Rechnung>();
        }
        return this.rechnung;
    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="leistungssteller">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="adresse">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="strasse" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="hausnummer" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="postleitzahl" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                             &lt;element name="ort" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="telefon" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="fax" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="e-mail" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="steuernummer" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="leistungsempfaenger">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="anrede" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="adresse">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="strasse" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="hausnummer" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="postleitzahl" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                             &lt;element name="ort" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="rechnungsdatum" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="rechnungsnummer">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;pattern value="[0-9]([0-9/ \-])+[0-9]"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="dienstleistungen">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="dienstleistung" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="position" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                             &lt;element name="menge-oder-umfang" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="art-der-dienstleistung" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="einzelpreis">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="betrag" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                                       &lt;element name="waehrung" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="gesamtpreis">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="betrag" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                                       &lt;element name="waehrung" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="mwst" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="datum" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="kosten">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="steuerbetrag">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="betrag" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                             &lt;element name="waehrung" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="entgeld">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="betrag" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                             &lt;element name="waehrung" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="nettobetrag">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="betrag" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                             &lt;element name="waehrung" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="zahlungsmoeglichkeiten">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="bankverbindung" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;choice>
     *                             &lt;sequence>
     *                               &lt;element name="IBAN" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                               &lt;element name="BIC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;/sequence>
     *                             &lt;sequence>
     *                               &lt;element name="BLZ" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
     *                               &lt;element name="Kontonummer" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
     *                               &lt;element name="Bank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;/sequence>
     *                             &lt;sequence>
     *                               &lt;element name="BitcoinAdresse" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;/sequence>
     *                             &lt;sequence>
     *                               &lt;element name="BIC" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                               &lt;element name="Kontonummer" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
     *                             &lt;/sequence>
     *                           &lt;/choice>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "leistungssteller",
        "leistungsempfaenger",
        "rechnungsdatum",
        "rechnungsnummer",
        "dienstleistungen",
        "kosten",
        "zahlungsmoeglichkeiten"
    })
    public static class Rechnung {

        @XmlElement(required = true)
        protected Rechnungssammlung.Rechnung.Leistungssteller leistungssteller;
        @XmlElement(required = true)
        protected Rechnungssammlung.Rechnung.Leistungsempfaenger leistungsempfaenger;
        @XmlElement(required = true)
        protected String rechnungsdatum;
        @XmlElement(required = true)
        protected String rechnungsnummer;
        @XmlElement(required = true)
        protected Rechnungssammlung.Rechnung.Dienstleistungen dienstleistungen;
        @XmlElement(required = true)
        protected Rechnungssammlung.Rechnung.Kosten kosten;
        @XmlElement(required = true)
        protected Rechnungssammlung.Rechnung.Zahlungsmoeglichkeiten zahlungsmoeglichkeiten;

        /**
         * Ruft den Wert der leistungssteller-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Rechnungssammlung.Rechnung.Leistungssteller }
         *     
         */
        public Rechnungssammlung.Rechnung.Leistungssteller getLeistungssteller() {
            return leistungssteller;
        }

        /**
         * Legt den Wert der leistungssteller-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Rechnungssammlung.Rechnung.Leistungssteller }
         *     
         */
        public void setLeistungssteller(Rechnungssammlung.Rechnung.Leistungssteller value) {
            this.leistungssteller = value;
        }

        /**
         * Ruft den Wert der leistungsempfaenger-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Rechnungssammlung.Rechnung.Leistungsempfaenger }
         *     
         */
        public Rechnungssammlung.Rechnung.Leistungsempfaenger getLeistungsempfaenger() {
            return leistungsempfaenger;
        }

        /**
         * Legt den Wert der leistungsempfaenger-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Rechnungssammlung.Rechnung.Leistungsempfaenger }
         *     
         */
        public void setLeistungsempfaenger(Rechnungssammlung.Rechnung.Leistungsempfaenger value) {
            this.leistungsempfaenger = value;
        }

        /**
         * Ruft den Wert der rechnungsdatum-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRechnungsdatum() {
            return rechnungsdatum;
        }

        /**
         * Legt den Wert der rechnungsdatum-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRechnungsdatum(String value) {
            this.rechnungsdatum = value;
        }

        /**
         * Ruft den Wert der rechnungsnummer-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRechnungsnummer() {
            return rechnungsnummer;
        }

        /**
         * Legt den Wert der rechnungsnummer-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRechnungsnummer(String value) {
            this.rechnungsnummer = value;
        }

        /**
         * Ruft den Wert der dienstleistungen-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Rechnungssammlung.Rechnung.Dienstleistungen }
         *     
         */
        public Rechnungssammlung.Rechnung.Dienstleistungen getDienstleistungen() {
            return dienstleistungen;
        }

        /**
         * Legt den Wert der dienstleistungen-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Rechnungssammlung.Rechnung.Dienstleistungen }
         *     
         */
        public void setDienstleistungen(Rechnungssammlung.Rechnung.Dienstleistungen value) {
            this.dienstleistungen = value;
        }

        /**
         * Ruft den Wert der kosten-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Rechnungssammlung.Rechnung.Kosten }
         *     
         */
        public Rechnungssammlung.Rechnung.Kosten getKosten() {
            return kosten;
        }

        /**
         * Legt den Wert der kosten-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Rechnungssammlung.Rechnung.Kosten }
         *     
         */
        public void setKosten(Rechnungssammlung.Rechnung.Kosten value) {
            this.kosten = value;
        }

        /**
         * Ruft den Wert der zahlungsmoeglichkeiten-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Rechnungssammlung.Rechnung.Zahlungsmoeglichkeiten }
         *     
         */
        public Rechnungssammlung.Rechnung.Zahlungsmoeglichkeiten getZahlungsmoeglichkeiten() {
            return zahlungsmoeglichkeiten;
        }

        /**
         * Legt den Wert der zahlungsmoeglichkeiten-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Rechnungssammlung.Rechnung.Zahlungsmoeglichkeiten }
         *     
         */
        public void setZahlungsmoeglichkeiten(Rechnungssammlung.Rechnung.Zahlungsmoeglichkeiten value) {
            this.zahlungsmoeglichkeiten = value;
        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="dienstleistung" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="position" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                   &lt;element name="menge-oder-umfang" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="art-der-dienstleistung" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="einzelpreis">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="betrag" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *                             &lt;element name="waehrung" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="gesamtpreis">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="betrag" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *                             &lt;element name="waehrung" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="mwst" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="datum" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "dienstleistung"
        })
        public static class Dienstleistungen {

            @XmlElement(required = true)
            protected List<Rechnungssammlung.Rechnung.Dienstleistungen.Dienstleistung> dienstleistung;

            /**
             * Gets the value of the dienstleistung property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the dienstleistung property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDienstleistung().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Rechnungssammlung.Rechnung.Dienstleistungen.Dienstleistung }
             * 
             * 
             */
            public List<Rechnungssammlung.Rechnung.Dienstleistungen.Dienstleistung> getDienstleistung() {
                if (dienstleistung == null) {
                    dienstleistung = new ArrayList<Rechnungssammlung.Rechnung.Dienstleistungen.Dienstleistung>();
                }
                return this.dienstleistung;
            }


            /**
             * <p>Java-Klasse für anonymous complex type.
             * 
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="position" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *         &lt;element name="menge-oder-umfang" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="art-der-dienstleistung" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="einzelpreis">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="betrag" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
             *                   &lt;element name="waehrung" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="gesamtpreis">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="betrag" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
             *                   &lt;element name="waehrung" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="mwst" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *       &lt;attribute name="datum" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "position",
                "mengeOderUmfang",
                "artDerDienstleistung",
                "einzelpreis",
                "gesamtpreis",
                "mwst"
            })
            public static class Dienstleistung {

                protected int position;
                @XmlElement(name = "menge-oder-umfang", required = true)
                protected String mengeOderUmfang;
                @XmlElement(name = "art-der-dienstleistung", required = true)
                protected String artDerDienstleistung;
                @XmlElement(required = true)
                protected Rechnungssammlung.Rechnung.Dienstleistungen.Dienstleistung.Einzelpreis einzelpreis;
                @XmlElement(required = true)
                protected Rechnungssammlung.Rechnung.Dienstleistungen.Dienstleistung.Gesamtpreis gesamtpreis;
                @XmlElement(required = true)
                protected String mwst;
                @XmlAttribute(name = "datum")
                protected String datum;

                /**
                 * Ruft den Wert der position-Eigenschaft ab.
                 * 
                 */
                public int getPosition() {
                    return position;
                }

                /**
                 * Legt den Wert der position-Eigenschaft fest.
                 * 
                 */
                public void setPosition(int value) {
                    this.position = value;
                }

                /**
                 * Ruft den Wert der mengeOderUmfang-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMengeOderUmfang() {
                    return mengeOderUmfang;
                }

                /**
                 * Legt den Wert der mengeOderUmfang-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMengeOderUmfang(String value) {
                    this.mengeOderUmfang = value;
                }

                /**
                 * Ruft den Wert der artDerDienstleistung-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getArtDerDienstleistung() {
                    return artDerDienstleistung;
                }

                /**
                 * Legt den Wert der artDerDienstleistung-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setArtDerDienstleistung(String value) {
                    this.artDerDienstleistung = value;
                }

                /**
                 * Ruft den Wert der einzelpreis-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Rechnungssammlung.Rechnung.Dienstleistungen.Dienstleistung.Einzelpreis }
                 *     
                 */
                public Rechnungssammlung.Rechnung.Dienstleistungen.Dienstleistung.Einzelpreis getEinzelpreis() {
                    return einzelpreis;
                }

                /**
                 * Legt den Wert der einzelpreis-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Rechnungssammlung.Rechnung.Dienstleistungen.Dienstleistung.Einzelpreis }
                 *     
                 */
                public void setEinzelpreis(Rechnungssammlung.Rechnung.Dienstleistungen.Dienstleistung.Einzelpreis value) {
                    this.einzelpreis = value;
                }

                /**
                 * Ruft den Wert der gesamtpreis-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Rechnungssammlung.Rechnung.Dienstleistungen.Dienstleistung.Gesamtpreis }
                 *     
                 */
                public Rechnungssammlung.Rechnung.Dienstleistungen.Dienstleistung.Gesamtpreis getGesamtpreis() {
                    return gesamtpreis;
                }

                /**
                 * Legt den Wert der gesamtpreis-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Rechnungssammlung.Rechnung.Dienstleistungen.Dienstleistung.Gesamtpreis }
                 *     
                 */
                public void setGesamtpreis(Rechnungssammlung.Rechnung.Dienstleistungen.Dienstleistung.Gesamtpreis value) {
                    this.gesamtpreis = value;
                }

                /**
                 * Ruft den Wert der mwst-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMwst() {
                    return mwst;
                }

                /**
                 * Legt den Wert der mwst-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMwst(String value) {
                    this.mwst = value;
                }

                /**
                 * Ruft den Wert der datum-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDatum() {
                    return datum;
                }

                /**
                 * Legt den Wert der datum-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDatum(String value) {
                    this.datum = value;
                }


                /**
                 * <p>Java-Klasse für anonymous complex type.
                 * 
                 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="betrag" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
                 *         &lt;element name="waehrung" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                    "betrag",
                    "waehrung"
                })
                public static class Einzelpreis {

                    @XmlElement(required = true)
                    protected BigDecimal betrag;
                    @XmlElement(required = true)
                    protected String waehrung;

                    /**
                     * Ruft den Wert der betrag-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getBetrag() {
                        return betrag;
                    }

                    /**
                     * Legt den Wert der betrag-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setBetrag(BigDecimal value) {
                        this.betrag = value;
                    }

                    /**
                     * Ruft den Wert der waehrung-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getWaehrung() {
                        return waehrung;
                    }

                    /**
                     * Legt den Wert der waehrung-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setWaehrung(String value) {
                        this.waehrung = value;
                    }

                }


                /**
                 * <p>Java-Klasse für anonymous complex type.
                 * 
                 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="betrag" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
                 *         &lt;element name="waehrung" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                    "betrag",
                    "waehrung"
                })
                public static class Gesamtpreis {

                    @XmlElement(required = true)
                    protected BigDecimal betrag;
                    @XmlElement(required = true)
                    protected String waehrung;

                    /**
                     * Ruft den Wert der betrag-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getBetrag() {
                        return betrag;
                    }

                    /**
                     * Legt den Wert der betrag-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setBetrag(BigDecimal value) {
                        this.betrag = value;
                    }

                    /**
                     * Ruft den Wert der waehrung-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getWaehrung() {
                        return waehrung;
                    }

                    /**
                     * Legt den Wert der waehrung-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setWaehrung(String value) {
                        this.waehrung = value;
                    }

                }

            }

        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="steuerbetrag">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="betrag" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *                   &lt;element name="waehrung" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="entgeld">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="betrag" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *                   &lt;element name="waehrung" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="nettobetrag">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="betrag" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *                   &lt;element name="waehrung" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "steuerbetrag",
            "entgeld",
            "nettobetrag"
        })
        public static class Kosten {

            @XmlElement(required = true)
            protected Rechnungssammlung.Rechnung.Kosten.Steuerbetrag steuerbetrag;
            @XmlElement(required = true)
            protected Rechnungssammlung.Rechnung.Kosten.Entgeld entgeld;
            @XmlElement(required = true)
            protected Rechnungssammlung.Rechnung.Kosten.Nettobetrag nettobetrag;

            /**
             * Ruft den Wert der steuerbetrag-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Rechnungssammlung.Rechnung.Kosten.Steuerbetrag }
             *     
             */
            public Rechnungssammlung.Rechnung.Kosten.Steuerbetrag getSteuerbetrag() {
                return steuerbetrag;
            }

            /**
             * Legt den Wert der steuerbetrag-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Rechnungssammlung.Rechnung.Kosten.Steuerbetrag }
             *     
             */
            public void setSteuerbetrag(Rechnungssammlung.Rechnung.Kosten.Steuerbetrag value) {
                this.steuerbetrag = value;
            }

            /**
             * Ruft den Wert der entgeld-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Rechnungssammlung.Rechnung.Kosten.Entgeld }
             *     
             */
            public Rechnungssammlung.Rechnung.Kosten.Entgeld getEntgeld() {
                return entgeld;
            }

            /**
             * Legt den Wert der entgeld-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Rechnungssammlung.Rechnung.Kosten.Entgeld }
             *     
             */
            public void setEntgeld(Rechnungssammlung.Rechnung.Kosten.Entgeld value) {
                this.entgeld = value;
            }

            /**
             * Ruft den Wert der nettobetrag-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Rechnungssammlung.Rechnung.Kosten.Nettobetrag }
             *     
             */
            public Rechnungssammlung.Rechnung.Kosten.Nettobetrag getNettobetrag() {
                return nettobetrag;
            }

            /**
             * Legt den Wert der nettobetrag-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Rechnungssammlung.Rechnung.Kosten.Nettobetrag }
             *     
             */
            public void setNettobetrag(Rechnungssammlung.Rechnung.Kosten.Nettobetrag value) {
                this.nettobetrag = value;
            }


            /**
             * <p>Java-Klasse für anonymous complex type.
             * 
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="betrag" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
             *         &lt;element name="waehrung" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "betrag",
                "waehrung"
            })
            public static class Entgeld {

                @XmlElement(required = true)
                protected BigDecimal betrag;
                @XmlElement(required = true)
                protected String waehrung;

                /**
                 * Ruft den Wert der betrag-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getBetrag() {
                    return betrag;
                }

                /**
                 * Legt den Wert der betrag-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setBetrag(BigDecimal value) {
                    this.betrag = value;
                }

                /**
                 * Ruft den Wert der waehrung-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getWaehrung() {
                    return waehrung;
                }

                /**
                 * Legt den Wert der waehrung-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setWaehrung(String value) {
                    this.waehrung = value;
                }

            }


            /**
             * <p>Java-Klasse für anonymous complex type.
             * 
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="betrag" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
             *         &lt;element name="waehrung" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "betrag",
                "waehrung"
            })
            public static class Nettobetrag {

                @XmlElement(required = true)
                protected BigDecimal betrag;
                @XmlElement(required = true)
                protected String waehrung;

                /**
                 * Ruft den Wert der betrag-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getBetrag() {
                    return betrag;
                }

                /**
                 * Legt den Wert der betrag-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setBetrag(BigDecimal value) {
                    this.betrag = value;
                }

                /**
                 * Ruft den Wert der waehrung-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getWaehrung() {
                    return waehrung;
                }

                /**
                 * Legt den Wert der waehrung-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setWaehrung(String value) {
                    this.waehrung = value;
                }

            }


            /**
             * <p>Java-Klasse für anonymous complex type.
             * 
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="betrag" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
             *         &lt;element name="waehrung" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "betrag",
                "waehrung"
            })
            public static class Steuerbetrag {

                @XmlElement(required = true)
                protected BigDecimal betrag;
                @XmlElement(required = true)
                protected String waehrung;

                /**
                 * Ruft den Wert der betrag-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getBetrag() {
                    return betrag;
                }

                /**
                 * Legt den Wert der betrag-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setBetrag(BigDecimal value) {
                    this.betrag = value;
                }

                /**
                 * Ruft den Wert der waehrung-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getWaehrung() {
                    return waehrung;
                }

                /**
                 * Legt den Wert der waehrung-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setWaehrung(String value) {
                    this.waehrung = value;
                }

            }

        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="anrede" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="adresse">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="strasse" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="hausnummer" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="postleitzahl" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                   &lt;element name="ort" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "anrede",
            "name",
            "adresse"
        })
        public static class Leistungsempfaenger {

            @XmlElement(required = true)
            protected String anrede;
            @XmlElement(required = true)
            protected String name;
            @XmlElement(required = true)
            protected Rechnungssammlung.Rechnung.Leistungsempfaenger.Adresse adresse;

            /**
             * Ruft den Wert der anrede-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAnrede() {
                return anrede;
            }

            /**
             * Legt den Wert der anrede-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAnrede(String value) {
                this.anrede = value;
            }

            /**
             * Ruft den Wert der name-Eigenschaft ab.
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
             * Legt den Wert der name-Eigenschaft fest.
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
             * Ruft den Wert der adresse-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Rechnungssammlung.Rechnung.Leistungsempfaenger.Adresse }
             *     
             */
            public Rechnungssammlung.Rechnung.Leistungsempfaenger.Adresse getAdresse() {
                return adresse;
            }

            /**
             * Legt den Wert der adresse-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Rechnungssammlung.Rechnung.Leistungsempfaenger.Adresse }
             *     
             */
            public void setAdresse(Rechnungssammlung.Rechnung.Leistungsempfaenger.Adresse value) {
                this.adresse = value;
            }


            /**
             * <p>Java-Klasse für anonymous complex type.
             * 
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="strasse" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="hausnummer" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="postleitzahl" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *         &lt;element name="ort" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "strasse",
                "hausnummer",
                "postleitzahl",
                "ort"
            })
            public static class Adresse {

                @XmlElement(required = true)
                protected String strasse;
                @XmlElement(required = true)
                protected String hausnummer;
                protected int postleitzahl;
                @XmlElement(required = true)
                protected String ort;

                /**
                 * Ruft den Wert der strasse-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getStrasse() {
                    return strasse;
                }

                /**
                 * Legt den Wert der strasse-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setStrasse(String value) {
                    this.strasse = value;
                }

                /**
                 * Ruft den Wert der hausnummer-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHausnummer() {
                    return hausnummer;
                }

                /**
                 * Legt den Wert der hausnummer-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHausnummer(String value) {
                    this.hausnummer = value;
                }

                /**
                 * Ruft den Wert der postleitzahl-Eigenschaft ab.
                 * 
                 */
                public int getPostleitzahl() {
                    return postleitzahl;
                }

                /**
                 * Legt den Wert der postleitzahl-Eigenschaft fest.
                 * 
                 */
                public void setPostleitzahl(int value) {
                    this.postleitzahl = value;
                }

                /**
                 * Ruft den Wert der ort-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOrt() {
                    return ort;
                }

                /**
                 * Legt den Wert der ort-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOrt(String value) {
                    this.ort = value;
                }

            }

        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="adresse">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="strasse" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="hausnummer" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="postleitzahl" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                   &lt;element name="ort" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="telefon" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="fax" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="e-mail" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="steuernummer" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "name",
            "adresse",
            "telefon",
            "fax",
            "eMail",
            "steuernummer"
        })
        public static class Leistungssteller {

            @XmlElement(required = true)
            protected String name;
            @XmlElement(required = true)
            protected Rechnungssammlung.Rechnung.Leistungssteller.Adresse adresse;
            @XmlElement(required = true)
            protected String telefon;
            @XmlElement(required = true)
            protected String fax;
            @XmlElement(name = "e-mail", required = true)
            protected String eMail;
            @XmlElement(required = true)
            protected String steuernummer;

            /**
             * Ruft den Wert der name-Eigenschaft ab.
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
             * Legt den Wert der name-Eigenschaft fest.
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
             * Ruft den Wert der adresse-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Rechnungssammlung.Rechnung.Leistungssteller.Adresse }
             *     
             */
            public Rechnungssammlung.Rechnung.Leistungssteller.Adresse getAdresse() {
                return adresse;
            }

            /**
             * Legt den Wert der adresse-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Rechnungssammlung.Rechnung.Leistungssteller.Adresse }
             *     
             */
            public void setAdresse(Rechnungssammlung.Rechnung.Leistungssteller.Adresse value) {
                this.adresse = value;
            }

            /**
             * Ruft den Wert der telefon-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTelefon() {
                return telefon;
            }

            /**
             * Legt den Wert der telefon-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTelefon(String value) {
                this.telefon = value;
            }

            /**
             * Ruft den Wert der fax-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFax() {
                return fax;
            }

            /**
             * Legt den Wert der fax-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFax(String value) {
                this.fax = value;
            }

            /**
             * Ruft den Wert der eMail-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEMail() {
                return eMail;
            }

            /**
             * Legt den Wert der eMail-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEMail(String value) {
                this.eMail = value;
            }

            /**
             * Ruft den Wert der steuernummer-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSteuernummer() {
                return steuernummer;
            }

            /**
             * Legt den Wert der steuernummer-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSteuernummer(String value) {
                this.steuernummer = value;
            }


            /**
             * <p>Java-Klasse für anonymous complex type.
             * 
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="strasse" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="hausnummer" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="postleitzahl" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *         &lt;element name="ort" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "strasse",
                "hausnummer",
                "postleitzahl",
                "ort"
            })
            public static class Adresse {

                @XmlElement(required = true)
                protected String strasse;
                @XmlElement(required = true)
                protected String hausnummer;
                protected int postleitzahl;
                @XmlElement(required = true)
                protected String ort;

                /**
                 * Ruft den Wert der strasse-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getStrasse() {
                    return strasse;
                }

                /**
                 * Legt den Wert der strasse-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setStrasse(String value) {
                    this.strasse = value;
                }

                /**
                 * Ruft den Wert der hausnummer-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHausnummer() {
                    return hausnummer;
                }

                /**
                 * Legt den Wert der hausnummer-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHausnummer(String value) {
                    this.hausnummer = value;
                }

                /**
                 * Ruft den Wert der postleitzahl-Eigenschaft ab.
                 * 
                 */
                public int getPostleitzahl() {
                    return postleitzahl;
                }

                /**
                 * Legt den Wert der postleitzahl-Eigenschaft fest.
                 * 
                 */
                public void setPostleitzahl(int value) {
                    this.postleitzahl = value;
                }

                /**
                 * Ruft den Wert der ort-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOrt() {
                    return ort;
                }

                /**
                 * Legt den Wert der ort-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOrt(String value) {
                    this.ort = value;
                }

            }

        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="bankverbindung" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;choice>
         *                   &lt;sequence>
         *                     &lt;element name="IBAN" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                     &lt;element name="BIC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;/sequence>
         *                   &lt;sequence>
         *                     &lt;element name="BLZ" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
         *                     &lt;element name="Kontonummer" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
         *                     &lt;element name="Bank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;/sequence>
         *                   &lt;sequence>
         *                     &lt;element name="BitcoinAdresse" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;/sequence>
         *                   &lt;sequence>
         *                     &lt;element name="BIC" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                     &lt;element name="Kontonummer" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
         *                   &lt;/sequence>
         *                 &lt;/choice>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "bankverbindung"
        })
        public static class Zahlungsmoeglichkeiten {

            @XmlElement(required = true)
            protected List<Rechnungssammlung.Rechnung.Zahlungsmoeglichkeiten.Bankverbindung> bankverbindung;

            /**
             * Gets the value of the bankverbindung property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the bankverbindung property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getBankverbindung().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Rechnungssammlung.Rechnung.Zahlungsmoeglichkeiten.Bankverbindung }
             * 
             * 
             */
            public List<Rechnungssammlung.Rechnung.Zahlungsmoeglichkeiten.Bankverbindung> getBankverbindung() {
                if (bankverbindung == null) {
                    bankverbindung = new ArrayList<Rechnungssammlung.Rechnung.Zahlungsmoeglichkeiten.Bankverbindung>();
                }
                return this.bankverbindung;
            }


            /**
             * <p>Java-Klasse für anonymous complex type.
             * 
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;choice>
             *         &lt;sequence>
             *           &lt;element name="IBAN" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *           &lt;element name="BIC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;/sequence>
             *         &lt;sequence>
             *           &lt;element name="BLZ" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
             *           &lt;element name="Kontonummer" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
             *           &lt;element name="Bank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;/sequence>
             *         &lt;sequence>
             *           &lt;element name="BitcoinAdresse" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;/sequence>
             *         &lt;sequence>
             *           &lt;element name="BIC" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *           &lt;element name="Kontonummer" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
             *         &lt;/sequence>
             *       &lt;/choice>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "content"
            })
            public static class Bankverbindung {

                @XmlElementRefs({
                    @XmlElementRef(name = "Bank", type = JAXBElement.class, required = false),
                    @XmlElementRef(name = "BitcoinAdresse", type = JAXBElement.class, required = false),
                    @XmlElementRef(name = "BLZ", type = JAXBElement.class, required = false),
                    @XmlElementRef(name = "IBAN", type = JAXBElement.class, required = false),
                    @XmlElementRef(name = "BIC", type = JAXBElement.class, required = false),
                    @XmlElementRef(name = "Kontonummer", type = JAXBElement.class, required = false)
                })
                protected List<JAXBElement<? extends Serializable>> content;

                /**
                 * Ruft das restliche Contentmodell ab. 
                 * 
                 * <p>
                 * Sie rufen diese "catch-all"-Eigenschaft aus folgendem Grund ab: 
                 * Der Feldname "BIC" wird von zwei verschiedenen Teilen eines Schemas verwendet. Siehe: 
                 * Zeile 138 von file:/Users/milank/Documents/Studium/SS%202018/Deklarative%20Programmierung/Eclipse/RechnerAufgabe4/rechneraufgabe_3_schema.xsd
                 * Zeile 127 von file:/Users/milank/Documents/Studium/SS%202018/Deklarative%20Programmierung/Eclipse/RechnerAufgabe4/rechneraufgabe_3_schema.xsd
                 * <p>
                 * Um diese Eigenschaft zu entfernen, wenden Sie eine Eigenschaftenanpassung für eine
                 * der beiden folgenden Deklarationen an, um deren Namen zu ändern: 
                 * Gets the value of the content property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the content property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getContent().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link JAXBElement }{@code <}{@link String }{@code >}
                 * {@link JAXBElement }{@code <}{@link String }{@code >}
                 * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
                 * {@link JAXBElement }{@code <}{@link String }{@code >}
                 * {@link JAXBElement }{@code <}{@link String }{@code >}
                 * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
                 * 
                 * 
                 */
                public List<JAXBElement<? extends Serializable>> getContent() {
                    if (content == null) {
                        content = new ArrayList<JAXBElement<? extends Serializable>>();
                    }
                    return this.content;
                }

            }

        }

    }

}
