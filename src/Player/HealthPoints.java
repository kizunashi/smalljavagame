package Player;

public class HealthPoints {
    public int hPValue;
    public int hPMaxValue;
    public HealthPoints(int hPMaxValue) {
        this.hPMaxValue = hPMaxValue;
    }
    public synchronized int getHpValue() {
        return hPValue;
    }
    public void setHpValue(int newHpValue) {
        if (newHpValue <= hPMaxValue) {
            this.hPValue = newHpValue;
        } else {
            throw new IllegalArgumentException("error: Max Value: " + hPMaxValue);
        }
    }
    public synchronized void increaseHP() {
        if (hPValue < hPMaxValue) {
            hPValue++;
        } else {
            throw new IllegalStateException("error2: Max Value: " + hPMaxValue);
        }
    }

    public synchronized void decreaseHP() {
        if (hPValue > 0) {
            hPValue--;
        } else {
            throw new IllegalStateException("error: value already reached 0");
        }
    }
}
