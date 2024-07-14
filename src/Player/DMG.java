package Player;

public class DMG {
    public int atkValue;
    public int atkMaxValue;
    public DMG(int atkMaxValue) {
        this.atkMaxValue = atkMaxValue;
    }
    public synchronized int getAtkValue() {
        return atkValue;
    }
    public synchronized void setAtkValue(int newHpValue) {
        if (newHpValue <= atkMaxValue) {
            this.atkValue = newHpValue;
        } else {
            throw new IllegalArgumentException("error: Max Value: " + atkMaxValue);
        }
    }
    public synchronized void increaseATK() {
        if (atkValue < atkMaxValue) {
            atkValue++;
        } else {
            throw new IllegalStateException("error2: Max Value: " + atkMaxValue);
        }
    }

    public synchronized void decreaseATK() {
        if (atkValue > 0) {
            atkValue--;
        } else {
            throw new IllegalStateException("error: value already reached 0");
        }
    }
}
