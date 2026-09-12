package org.example;

public class process {
    private int num1;
    private int num2;
    private int num3;
    private int sum;
    float avg;

    public process(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public int suma() {
        sum = num1 + num2 + num3;
        return sum;
    }

    public float avgerage() {
        avg = (num1+num2+num3) / 3;
        return avg;
    }

    public int mayor() {
        if (num1 > num2 && num1 > num3) {
            return num1;
        } else if (num2 > num1 && num2 > num3) {
            return num2;
        } else if (num3 > num1 && num3 > num2) {
            return num3;
        }
        else  {
            return -1;
        }
    }

}
