import Interface.Phone;

public class Apple implements Phone {
    private int volume;
    private boolean isPowerOn;

    public Apple() {
        this.volume = 50;
    }

    public void powerOn() {
        isPowerOn = true;
        System.out.println("Apple Turning On");
    }

    public void powerOff() {
        isPowerOn = false;
        System.out.println("Apple Turning Off");
    }

    public void volumeUp() {
        if (isPowerOn) {
            if (this.volume == MAX_VOLUME) {
                System.out.println("Max Volume !!!");
                System.out.println("Volume = " + this.volume + "%");
            } else {
                this.volume += 10;
                System.out.println("Volume sekarang " + this.volume);
            }
        } else {
            System.out.println("Handphone mati, nyalain dulu :)");
        }
    }

    public void volumeDown() {
        if (isPowerOn) {
            if (this.volume == MIN_VOLUME) {
                System.out.println("Volume = " + this.volume + "%");
            } else {
                this.volume -= 10;
                System.out.println("Volume sekarang " + this.volume);
            }
        } else {
            System.out.println("Handphone mati, nyalain dulu :)");
        }
    }

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isPowerOn() {
        return this.isPowerOn;
    }

    public void setPowerOn(boolean isPowerOn) {
        this.isPowerOn = isPowerOn;
    }
}
