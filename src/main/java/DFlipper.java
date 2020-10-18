public class DFlipper {
    private boolean d;
    private boolean q;


    public boolean isD() {
        return d;
    }

    public void setD(boolean d) {
        this.d = d;
    }

    public boolean isQ() {
        return q;
    }

    public void setQ(boolean q) {
        this.q = q;
    }

    public boolean flipQ(boolean d) {
        if (!d && !this.q) {
            this.q = false;
            return this.q;
        } else if (!d && this.q) {
            this.q = false;
            return this.q;
        } else if (d && !this.q) {
            this.q = !this.q;
            return this.q;
        } else {
            return this.q;
        }
    }

    @Override
    public String toString() {
        return "Dane przerzutnika: d = " + convertBoolToBinary(this.d) +
                " q = " + convertBoolToBinary(this.q);
    }

    private String convertBoolToBinary(boolean value) {
        return value ? "1" : "0";
    }
}
