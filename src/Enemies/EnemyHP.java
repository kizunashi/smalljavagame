package Enemies;

public class EnemyHP {
    public int EnHpValue;
    public int EnHpMaxValue;
    public EnemyHP(int hPMaxValue) {
        this.EnHpMaxValue = hPMaxValue;
    }
    public synchronized int getEnHpValue() {
        return EnHpValue;
    }
    public void setEnHpValue(int newHpValue) {
        if (newHpValue <= EnHpMaxValue) {
            this.EnHpValue = newHpValue;
        } else {
            throw new IllegalArgumentException("error: Max Value: " + EnHpMaxValue);
        }
    }
    public synchronized void increaseHP() {
        if (EnHpValue < EnHpMaxValue) {
            EnHpValue++;
        } else {
            throw new IllegalStateException("error2: Max Value: " + EnHpMaxValue);
        }
    }

    public synchronized void decreaseHP() {
        if (EnHpValue > 0) {
            EnHpValue--;
        } else {
            throw new IllegalStateException("error: value already reached 0");
        }
    }
}
