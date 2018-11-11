public class PhoneNumber {
    public Integer countryDialingCode;
    public Integer regionaleDialingCode;
    public Integer subscriber;

    public PhoneNumber(Integer countryDialingCode, Integer regionaleDialingCode, Integer subscriber) {
        this.countryDialingCode = countryDialingCode;
        this.regionaleDialingCode = regionaleDialingCode;
        this.subscriber = subscriber;
    }
}
