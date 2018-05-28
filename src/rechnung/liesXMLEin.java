package rechnung;

import rechnungen.jaxb.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.JAXBIntrospector;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class liesXMLEin {

    public static void main(String args[]) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance("rechnungen.jaxb");
        Unmarshaller unmarshaller = context.createUnmarshaller();

        Rechnungssammlung rechnungssammlung = (Rechnungssammlung) JAXBIntrospector.getValue(unmarshaller.unmarshal(new File("rechneraufgabe_4_rechnungssammlung.xml")));
        System.out.println("Hello World");
        for (Rechnungssammlung.Rechnung rechnung : (rechnungssammlung.getRechnung())) {
            for (Rechnungssammlung.Rechnung.Dienstleistungen.Dienstleistung dienstleistung : rechnung.getDienstleistungen().getDienstleistung()) {
                System.out.println(dienstleistung.getArtDerDienstleistung());
            }
        }

    }
}
