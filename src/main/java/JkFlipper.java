public class JkFlipper {

    private boolean j;
    private boolean k;
    private boolean q;

    public JkFlipper(boolean j, boolean k, boolean q) {
        this.j = j;
        this.k = k;
        this.q = q;
    }

    public boolean isJ() {
        return j;
    }

    public boolean isK() {
        return k;
    }

    public boolean isQ() {
        return q;
    }

    public void setJ(boolean j) {
        this.j = j;
    }

    public void setK(boolean k) {
        this.k = k;
    }

    public boolean flipQ(boolean j, boolean k) {
        if (!j && !k) {
            return this.q;
        } else if (!j && k) {
            this.q = false;
            return false;
        } else if (j && !k) {
            this.q = true;
            return true;
        } else {
            this.q = !this.q;
            return this.q;
        }
    }

    @Override
    public String toString() {
        return "Dane przerzutnika: j = " + convertBoolToBinary(this.j) +
                " k = " + convertBoolToBinary(this.k) +
                " q = " + convertBoolToBinary(this.q);
    }

    private String convertBoolToBinary(boolean value) {
        return value ? "1" : "0";
    }
}
