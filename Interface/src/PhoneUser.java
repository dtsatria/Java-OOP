import Interface.Phone;

public class PhoneUser {
    private Phone phone;

    public PhoneUser(Phone phone) {
        this.phone = phone;
    }

    public void turnOnThePhone() {
        this.phone.powerOn();
    }

    public void tunOffThePhone() {
        this.phone.powerOff();
    }

    public void makePhoneLouder() {
        this.phone.volumeUp();
    }

    public void makePhoneSilent() {
        this.phone.volumeDown();
    }

    public Phone getPhone() {
        return this.phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }
}
