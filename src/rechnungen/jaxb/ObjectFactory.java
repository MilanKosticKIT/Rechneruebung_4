//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.05.27 um 02:08:14 PM CEST 
//


package rechnungen.jaxb;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the rechnungen.jaxb package. 
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

    private final static QName _RechnungssammlungRechnungZahlungsmoeglichkeitenBankverbindungBLZ_QNAME = new QName("", "BLZ");
    private final static QName _RechnungssammlungRechnungZahlungsmoeglichkeitenBankverbindungBank_QNAME = new QName("", "Bank");
    private final static QName _RechnungssammlungRechnungZahlungsmoeglichkeitenBankverbindungIBAN_QNAME = new QName("", "IBAN");
    private final static QName _RechnungssammlungRechnungZahlungsmoeglichkeitenBankverbindungBitcoinAdresse_QNAME = new QName("", "BitcoinAdresse");
    private final static QName _RechnungssammlungRechnungZahlungsmoeglichkeitenBankverbindungKontonummer_QNAME = new QName("", "Kontonummer");
    private final static QName _RechnungssammlungRechnungZahlungsmoeglichkeitenBankverbindungBIC_QNAME = new QName("", "BIC");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: rechnungen.jaxb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Rechnungssammlung }
     * 
     */
    public Rechnungssammlung createRechnungssammlung() {
        return new Rechnungssammlung();
    }

    /**
     * Create an instance of {@link Rechnungssammlung.Rechnung }
     * 
     */
    public Rechnungssammlung.Rechnung createRechnungssammlungRechnung() {
        return new Rechnungssammlung.Rechnung();
    }

    /**
     * Create an instance of {@link Rechnungssammlung.Rechnung.Zahlungsmoeglichkeiten }
     * 
     */
    public Rechnungssammlung.Rechnung.Zahlungsmoeglichkeiten createRechnungssammlungRechnungZahlungsmoeglichkeiten() {
        return new Rechnungssammlung.Rechnung.Zahlungsmoeglichkeiten();
    }

    /**
     * Create an instance of {@link Rechnungssammlung.Rechnung.Kosten }
     * 
     */
    public Rechnungssammlung.Rechnung.Kosten createRechnungssammlungRechnungKosten() {
        return new Rechnungssammlung.Rechnung.Kosten();
    }

    /**
     * Create an instance of {@link Rechnungssammlung.Rechnung.Dienstleistungen }
     * 
     */
    public Rechnungssammlung.Rechnung.Dienstleistungen createRechnungssammlungRechnungDienstleistungen() {
        return new Rechnungssammlung.Rechnung.Dienstleistungen();
    }

    /**
     * Create an instance of {@link Rechnungssammlung.Rechnung.Dienstleistungen.Dienstleistung }
     * 
     */
    public Rechnungssammlung.Rechnung.Dienstleistungen.Dienstleistung createRechnungssammlungRechnungDienstleistungenDienstleistung() {
        return new Rechnungssammlung.Rechnung.Dienstleistungen.Dienstleistung();
    }

    /**
     * Create an instance of {@link Rechnungssammlung.Rechnung.Leistungsempfaenger }
     * 
     */
    public Rechnungssammlung.Rechnung.Leistungsempfaenger createRechnungssammlungRechnungLeistungsempfaenger() {
        return new Rechnungssammlung.Rechnung.Leistungsempfaenger();
    }

    /**
     * Create an instance of {@link Rechnungssammlung.Rechnung.Leistungssteller }
     * 
     */
    public Rechnungssammlung.Rechnung.Leistungssteller createRechnungssammlungRechnungLeistungssteller() {
        return new Rechnungssammlung.Rechnung.Leistungssteller();
    }

    /**
     * Create an instance of {@link Rechnungssammlung.Rechnung.Zahlungsmoeglichkeiten.Bankverbindung }
     * 
     */
    public Rechnungssammlung.Rechnung.Zahlungsmoeglichkeiten.Bankverbindung createRechnungssammlungRechnungZahlungsmoeglichkeitenBankverbindung() {
        return new Rechnungssammlung.Rechnung.Zahlungsmoeglichkeiten.Bankverbindung();
    }

    /**
     * Create an instance of {@link Rechnungssammlung.Rechnung.Kosten.Steuerbetrag }
     * 
     */
    public Rechnungssammlung.Rechnung.Kosten.Steuerbetrag createRechnungssammlungRechnungKostenSteuerbetrag() {
        return new Rechnungssammlung.Rechnung.Kosten.Steuerbetrag();
    }

    /**
     * Create an instance of {@link Rechnungssammlung.Rechnung.Kosten.Entgeld }
     * 
     */
    public Rechnungssammlung.Rechnung.Kosten.Entgeld createRechnungssammlungRechnungKostenEntgeld() {
        return new Rechnungssammlung.Rechnung.Kosten.Entgeld();
    }

    /**
     * Create an instance of {@link Rechnungssammlung.Rechnung.Kosten.Nettobetrag }
     * 
     */
    public Rechnungssammlung.Rechnung.Kosten.Nettobetrag createRechnungssammlungRechnungKostenNettobetrag() {
        return new Rechnungssammlung.Rechnung.Kosten.Nettobetrag();
    }

    /**
     * Create an instance of {@link Rechnungssammlung.Rechnung.Dienstleistungen.Dienstleistung.Einzelpreis }
     * 
     */
    public Rechnungssammlung.Rechnung.Dienstleistungen.Dienstleistung.Einzelpreis createRechnungssammlungRechnungDienstleistungenDienstleistungEinzelpreis() {
        return new Rechnungssammlung.Rechnung.Dienstleistungen.Dienstleistung.Einzelpreis();
    }

    /**
     * Create an instance of {@link Rechnungssammlung.Rechnung.Dienstleistungen.Dienstleistung.Gesamtpreis }
     * 
     */
    public Rechnungssammlung.Rechnung.Dienstleistungen.Dienstleistung.Gesamtpreis createRechnungssammlungRechnungDienstleistungenDienstleistungGesamtpreis() {
        return new Rechnungssammlung.Rechnung.Dienstleistungen.Dienstleistung.Gesamtpreis();
    }

    /**
     * Create an instance of {@link Rechnungssammlung.Rechnung.Leistungsempfaenger.Adresse }
     * 
     */
    public Rechnungssammlung.Rechnung.Leistungsempfaenger.Adresse createRechnungssammlungRechnungLeistungsempfaengerAdresse() {
        return new Rechnungssammlung.Rechnung.Leistungsempfaenger.Adresse();
    }

    /**
     * Create an instance of {@link Rechnungssammlung.Rechnung.Leistungssteller.Adresse }
     * 
     */
    public Rechnungssammlung.Rechnung.Leistungssteller.Adresse createRechnungssammlungRechnungLeistungsstellerAdresse() {
        return new Rechnungssammlung.Rechnung.Leistungssteller.Adresse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BLZ", scope = Rechnungssammlung.Rechnung.Zahlungsmoeglichkeiten.Bankverbindung.class)
    public JAXBElement<BigInteger> createRechnungssammlungRechnungZahlungsmoeglichkeitenBankverbindungBLZ(BigInteger value) {
        return new JAXBElement<BigInteger>(_RechnungssammlungRechnungZahlungsmoeglichkeitenBankverbindungBLZ_QNAME, BigInteger.class, Rechnungssammlung.Rechnung.Zahlungsmoeglichkeiten.Bankverbindung.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Bank", scope = Rechnungssammlung.Rechnung.Zahlungsmoeglichkeiten.Bankverbindung.class)
    public JAXBElement<String> createRechnungssammlungRechnungZahlungsmoeglichkeitenBankverbindungBank(String value) {
        return new JAXBElement<String>(_RechnungssammlungRechnungZahlungsmoeglichkeitenBankverbindungBank_QNAME, String.class, Rechnungssammlung.Rechnung.Zahlungsmoeglichkeiten.Bankverbindung.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "IBAN", scope = Rechnungssammlung.Rechnung.Zahlungsmoeglichkeiten.Bankverbindung.class)
    public JAXBElement<String> createRechnungssammlungRechnungZahlungsmoeglichkeitenBankverbindungIBAN(String value) {
        return new JAXBElement<String>(_RechnungssammlungRechnungZahlungsmoeglichkeitenBankverbindungIBAN_QNAME, String.class, Rechnungssammlung.Rechnung.Zahlungsmoeglichkeiten.Bankverbindung.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BitcoinAdresse", scope = Rechnungssammlung.Rechnung.Zahlungsmoeglichkeiten.Bankverbindung.class)
    public JAXBElement<String> createRechnungssammlungRechnungZahlungsmoeglichkeitenBankverbindungBitcoinAdresse(String value) {
        return new JAXBElement<String>(_RechnungssammlungRechnungZahlungsmoeglichkeitenBankverbindungBitcoinAdresse_QNAME, String.class, Rechnungssammlung.Rechnung.Zahlungsmoeglichkeiten.Bankverbindung.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Kontonummer", scope = Rechnungssammlung.Rechnung.Zahlungsmoeglichkeiten.Bankverbindung.class)
    public JAXBElement<BigInteger> createRechnungssammlungRechnungZahlungsmoeglichkeitenBankverbindungKontonummer(BigInteger value) {
        return new JAXBElement<BigInteger>(_RechnungssammlungRechnungZahlungsmoeglichkeitenBankverbindungKontonummer_QNAME, BigInteger.class, Rechnungssammlung.Rechnung.Zahlungsmoeglichkeiten.Bankverbindung.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BIC", scope = Rechnungssammlung.Rechnung.Zahlungsmoeglichkeiten.Bankverbindung.class)
    public JAXBElement<String> createRechnungssammlungRechnungZahlungsmoeglichkeitenBankverbindungBIC(String value) {
        return new JAXBElement<String>(_RechnungssammlungRechnungZahlungsmoeglichkeitenBankverbindungBIC_QNAME, String.class, Rechnungssammlung.Rechnung.Zahlungsmoeglichkeiten.Bankverbindung.class, value);
    }

}
