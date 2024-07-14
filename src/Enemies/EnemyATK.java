package Enemies;

public class EnemyATK {
    public int enAtkValue;
    public int enAtkMaxValue;
    public EnemyATK(int atkMaxValue) {
        this.enAtkMaxValue = atkMaxValue;
    }
    public synchronized int getEnAtkValue() {
        return enAtkValue;
    }
    public synchronized void setEnAtkValue(int newHpValue) {
        if (newHpValue <= enAtkMaxValue) {
            this.enAtkValue = newHpValue;
        } else {
            throw new IllegalArgumentException("error: Max Value: " + enAtkMaxValue);
        }
    }
    public synchronized void increaseATK() {
        if (enAtkValue < enAtkMaxValue) {
            enAtkValue++;
        } else {
            throw new IllegalStateException("error2: Max Value: " + enAtkMaxValue);
        }
    }

    public synchronized void decreaseATK() {
        if (enAtkValue > 0) {
            enAtkValue--;
        } else {
            throw new IllegalStateException("error: value already reached 0");
        }
    }
}
