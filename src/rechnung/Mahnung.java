package rechnung;

import rechnungen.jaxb.*;

import javax.xml.bind.*;
import java.io.File;

public class Mahnung {
    public static void main(String args[]) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance("rechnungen.jaxb");
        Unmarshaller unmarshaller = context.createUnmarshaller();
        Rechnungssammlung rechnungssammlung = (Rechnungssammlung) JAXBIntrospector.getValue(unmarshaller.unmarshal(new File("rechneraufgabe_4_rechnungssammlung.xml")));
        for (Rechnungssammlung.Rechnung rechnung : (rechnungssammlung.getRechnung())) {
            String output = printRechnung(rechnung);
            System.out.println(output);
        }
    }

    /**
     * Returns a message for the given rechnung
     *
     * @param rechnung The rechnung that shall be parsed into a message text.
     * @return A String containing multiple lines.
     */
    private static String printRechnung(Rechnungssammlung.Rechnung rechnung) {
        String s = "----------------------------------------------------\n";
        s += rechnung.getLeistungsempfaenger().getAnrede() + " " + rechnung.getLeistungsempfaenger().getName() + "\n";
        s += "Bitte zahlen Sie endlich den gefordeten Betrag\n";
        s += "von " + rechnung.getKosten().getNettobetrag().getBetrag() + " " + rechnung.getKosten().getNettobetrag().getWaehrung() + " auf das Konto\n";
        for (JAXBElement element : rechnung.getZahlungsmoeglichkeiten().getBankverbindung().get(0).getContent()) {
            s += element.getName().toString() + ": " + element.getValue().toString() + " ";
        }
        s += "ein.\n";
        s += "Falls sie trotzdem noch unverschaemt genug sind\n";
        s += "und Fragen haben, koennen Sie mich jederzeit\n";
        s += "unter " + rechnung.getLeistungssteller().getTelefon() + " erreichen\n";
        s += "Hochachtungsvoll\n";
        s += rechnung.getLeistungssteller().getName();
        return s;
    }
}
