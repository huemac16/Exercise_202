package bl;

public class Sender {

    private String Sendername;
    private double Frequenz;
    private String Band;

    public Sender(String Sendername, double Frequenz, String Band) {
        this.Sendername = Sendername;
        this.Frequenz = Frequenz;
        this.Band = Band;
    }

    public String getSendername() {
        return Sendername;
    }

    public void setSendername(String Sendername) {
        this.Sendername = Sendername;
    }

    public double getFrequenz() {
        return Frequenz;
    }

    public void setFrequenz(double Frequenz) {
        this.Frequenz = Frequenz;
    }

    public String getBand() {
        return Band;
    }

    public void setBand(String Band) {
        this.Band = Band;
    }

}
