package Grade_11.PassoverExercises.Question7;

import Grade_11.DataStructures.BinNode.BinNode;

public class BlackAndWhiteTree {
    public static boolean checkIfAllLeavesBlack(BinNode<String> t) {
        if (BinNode.isLeafString(t)) {
            return t.getValue().equals("black");
        } else {
            return checkIfAllLeavesBlack(t.getLeft()) && checkIfAllLeavesBlack(t.getRight());
        }
    }

    public static boolean checkIfAllWhiteAndBlack(BinNode<String> t) {
        if (t != null) {
            return (t.getValue().equals("black") || t.getValue().equals("white")) &&
                    checkIfAllWhiteAndBlack(t.getLeft()) && checkIfAllWhiteAndBlack(t.getRight());
        }
        return true;
    }

    public static boolean checkBlackWithWhiteSon(BinNode<String> t) {
        if (t != null) {
            if (!BinNode.isLeafString(t)) {
                if (t.getValue().equals("black")) {
                    return t.getLeft().getValue().equals("white") && t.getRight().getValue().equals("white") &&
                            checkBlackWithWhiteSon(t.getLeft()) && checkBlackWithWhiteSon(t.getRight());
                }
            }
        }
        return true;
    }

    public static boolean allLeavesBlackOrWhite(BinNode<String> tree) {
        if (tree != null) {
            if (!tree.getValue().equals("black") && !tree.getValue().equals("white")) {
                return false;
            }
            return allLeavesBlackOrWhite(tree.getLeft()) && allLeavesBlackOrWhite(tree.getRight());
        }
        return true;
    }

    public static boolean blackAndWhiteTree(BinNode<String> tree) {
        if (tree != null) {
            if (!allLeavesBlackOrWhite(tree)) {
                return false;
            }
            return BinNode.isLeafString(tree) && checkIfAllLeavesBlack(tree) && checkBlackWithWhiteSon(tree);
        }
        return true;
    }
}
