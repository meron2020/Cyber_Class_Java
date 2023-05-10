package Grade_11.StudiesForTests.Matkonet.Question2;

public class Program {
    public static void differencesLessThanN(AllKorona aK, int n) {
        for (int i = 0; i < aK.getK().length - 1; i++) {
            for (int j = i + 1; j < aK.getK().length; j++) {
                if (Math.abs(aK.getK()[i].getNumP() - aK.getK()[j].getNumP()) <= n) {
                    System.out.println(aK.getK()[i].getName() + " - " + aK.getK()[j].getName());
                }
            }
        }
    }
}
