package Grade_11.DataStructures.Node.BookQuestions.P_101.Q_54;

import Grade_11.DataStructures.Node.Node;

public class Program {
    public static boolean checkIfLotteryStable(Lottery lottery) {
        int min = lottery.getLotteryNums()[0];
        for (int i = 1; i < lottery.getLotteryNums().length; i++) {
            if (lottery.getLotteryNums()[i] < min) {
                min = lottery.getLotteryNums()[i];
            }
        }
        int max = lottery.getLotteryNums()[0];
        for (int i = 1; i < lottery.getLotteryNums().length; i++) {
            if (lottery.getLotteryNums()[i] > max) {
                min = lottery.getLotteryNums()[i];
            }
        }

        return max - min < 20;
    }

    public static int checkIfLotteriesStable(Node<Lottery> lotteries) {
        Node<Lottery> currentLottery = lotteries;
        int counter = 0;
        while (currentLottery != null) {
            if (checkIfLotteryStable(currentLottery.getValue())) {
                counter++;
            }
            currentLottery = currentLottery.getNext();
        }
        return counter;
    }
}
