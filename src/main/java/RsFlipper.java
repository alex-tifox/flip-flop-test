public class RsFlipper {
    private boolean s;
    private boolean r;
    private boolean q;

    public RsFlipper(boolean q) {
        this.q = q;
    }

    public RsFlipper() {
    }

    public boolean isS() {
        return s;
    }

    public void setS(boolean s) {
        this.s = s;
    }

    public boolean isR() {
        return r;
    }

    public void setR(boolean r) {
        this.r = r;
    }

    public boolean isQ() {
        return q;
    }

    public void setQ(boolean q) {
        this.q = q;
    }

    public boolean flipQ(boolean s, boolean r) {
        if (!s && !r) {
            return this.q;
        } else if (s && !r) {
            this.q = true;
            return true;
        } else if (!s && r) {
            this.q = false;
            return false;
        } else if (s && r){
            throw new IllegalArgumentException();
        } else {
            return this.q;
        }
    }

    @Override
    public String toString() {
        return "Dane przerzutnika: s = " + convertBoolToBinary(this.s) +
                " r = " + convertBoolToBinary(this.r) +
                " q = " + convertBoolToBinary(this.q);
    }

    private String convertBoolToBinary(boolean value) {
        return value ? "1" : "0";
    }
}
