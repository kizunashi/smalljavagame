package Player;

public class StaminaSys {
    public int sPValue;
    public int sPMaxValue;

    public StaminaSys(int sPMaxValue) {
        this.sPMaxValue = sPMaxValue;
    }

    public synchronized int getSpValue() {
        return sPValue;
    }

    public void setSpValue(int newSpValue) {
        if (newSpValue <= sPMaxValue) {
            this.sPValue = newSpValue;
        } else {
            throw new IllegalArgumentException("error: Max Value: " + sPMaxValue);
        }
    }

    public synchronized void increaseHP() {
        if (sPValue < sPMaxValue) {
            sPValue++;
        } else {
            throw new IllegalStateException("error2: Max Value: " + sPMaxValue);
        }
    }

    public synchronized void decreaseHP() {
        if (sPValue > 0) {
            sPValue--;
        } else {
            throw new IllegalStateException("error: value already reached 0");
        }
    }
}
