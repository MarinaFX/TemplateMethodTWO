package Template;

import java.math.BigDecimal;

public class FloatingPointComparator implements DoubleComparator{
    private double d;

    public void setD(double d) {
        this.d = d;
    }

    public double getD() {
        return d;
    }

    @Override
    public void compare(double array[]){
        BigDecimal first = null;
        BigDecimal second = null;
        int intd1;
        int intd2;
        BigDecimal d1DecimalPart;
        BigDecimal d2DecimalPart;

        for (int i = 0; i < array.length; i++) {
            first = new BigDecimal(array[i]);
            second = new BigDecimal(array[i+1]);
            intd1 = first.intValue();
            intd2 = second.intValue();
            d1DecimalPart = new BigDecimal(first.subtract(new BigDecimal(intd1)).toPlainString());
            d2DecimalPart = new BigDecimal(second.subtract(new BigDecimal(intd2)).toPlainString());


            if (d1DecimalPart.compareTo(d2DecimalPart) == 0)
                System.out.printf("Os valores %.20f e %.20f são iguais pelo floating point!\n", first, second);
            else
                System.out.printf("Os valores %.20f e %.20f não são iguais pelo floating point!\n", first, second);
        }
    }

    @Override
    public void compare(double d1, double d2) {
        BigDecimal first = new BigDecimal(d1);
        BigDecimal second = new BigDecimal(d2);
        int intd1 = first.intValue();
        int intd2 = second.intValue();
        BigDecimal d1DecimalPart = new BigDecimal(first.subtract(new BigDecimal(intd1)).toPlainString());
        BigDecimal d2DecimalPart = new BigDecimal(second.subtract(new BigDecimal(intd2)).toPlainString());


        if (d1DecimalPart.compareTo(d2DecimalPart) == 0)
            System.out.printf("Os valores %.20f e %.20f são iguais pelo floating point!", first, second);
        else
            System.out.printf("Os valores %.20f e %.20f não são iguais pelo floating point!", first, second);

    }
}
/*
 *
 */