class USERTRAIL {
    int val1;
    int val2;

    public int getVal1() {
        return val1;
    }

    public void setVal1(int val1) {
        this.val1 = val1;
    }

    public int getVal2() {
        return val2;
    }

    public void setVal2(int val2) {
        this.val2 = val2;
    }

    public USERTRAIL(int val1, int val2) throws IllegalValueException {
        if (val1 < 0 || val2 < 0)
            throw new IllegalValueException("Value is less than Zero");

        this.val1 = val1;
        this.val2 = val2;
    }

    void show() {
        System.out.println("Number 1 is " + val1 + "\n Number 2 is " + val2);
    }
}

public class Question8 {
    public static void main(String[] args) throws IllegalValueException {
        USERTRAIL ut = new USERTRAIL(1, 1);
        ut.show();

    }
}
