import java.util.List;

public class DataLoader {
    List<Name> firstnames;
    List<Name> lastnames;
    List<Address> adresses;
    List<PhoneNumber> phones;
    List<Domain> domains;

    public DataLoader() {
        // for every entry
        Name fname = new Name("Bernd","m", "firstname");
        Name lname = new Name("Bernd","m", "firstname");
        PhoneNumber phone = new PhoneNumber(41,44,2733822);
        Address adr = new Address("Hauptstrasse","33","9000","St. Gallen","CH", "Schweiz",phone);
    }
}
