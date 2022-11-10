package Grade_10.OneDimensionalArrays.ArrayFunctions;

public class DollarChain {
    public boolean findDollarChain(char[] array, int len) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == '$') {
                if ((i + len - 1) < array.length) {
                    if (array[i + len - 1] == '$') {
                        if (array[(i + (i + len)) / 2] == '$') {
                            return true;
                        }
                }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        DollarChain dollarChain = new DollarChain();
        char[] array = {'$', '$', '$'};
        System.out.println(dollarChain.findDollarChain(array, 3));
    }
}
