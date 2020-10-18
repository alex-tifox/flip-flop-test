public class TFlipper {
    private boolean t;
    private boolean q;

    public TFlipper(boolean t, boolean q) {
        this.t = t;
        this.q = q;
    }

    public TFlipper() {

    }

    public void setT(boolean t) {
        this.t = t;
    }

    public boolean isT() {
        return t;
    }

    public void setQ(boolean q) {
        this.q = q;
    }

    public boolean isQ() {
        return q;
    }

    public boolean flipQ(boolean t) {
        if (t) {
            this.q = !this.q;
        }
        return this.q;
    }

    @Override
    public String toString() {
        return "Dane przerzutnika: t = " + convertBoolToBinary(this.t) +
                " q = " + convertBoolToBinary(this.q);
    }

    private String convertBoolToBinary(boolean value) {
        return value ? "1" : "0";
    }
}
