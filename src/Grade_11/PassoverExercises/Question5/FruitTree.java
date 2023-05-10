package Grade_11.PassoverExercises.Question5;
import Grade_11.DataStructures.BinNode.BinNode;
import Grade_11.DataStructures.NodeClass;

public class FruitTree {
    public static boolean isFruit(NodeClass<String> list, BinNode<String> tree){
        String valueToCheck = tree.getValue();
        NodeClass<String> p = list;
        while (p != null) {
            if (p.getValue().equals(valueToCheck)) {
                return true;
            }
            p = p.getNext();
        }
        return false;
    }

    public static int typeOfTree(BinNode<String> tree) {
        NodeClass<String> fruitList = new NodeClass<String>(tree.getValue());
        typeOfTree(tree, fruitList);
        int counter = 0;
        NodeClass<String> p = fruitList;
        while (p != null) {
            counter++;
            p = p.getNext();
        }
        if (counter == 1) {
            return 1;
        }
        else if (counter == 2) {
            return 2;
        }
        else {
            return -1;
        }
    }

    public static void typeOfTree(BinNode<String> tree, NodeClass<String> types) {
        if (tree != null) {
            typeOfTree(tree.getLeft(), types);
            NodeClass<String> p = types;
            boolean found = false;
            while (p != null) {
                if (p.getValue().equals(tree.getValue())) {
                    found = true;
                    p = null;
                }
                else {
                    p = p.getNext();
                }
            }
            if (!found) {
                p = types;
                while (p.getNext() != null) {
                    p = p.getNext();
                }
                p.setNext(new NodeClass<>(tree.getValue()));
            }
            typeOfTree(tree.getRight(), types);
        }
    }

    public static boolean isFruitTree(NodeClass<String> list, BinNode<String> tree) {
        if (tree != null) {
            if (!isFruit(list, tree)) {
                return false;
            }
            else {
                return isFruitTree(list, tree.getLeft()) && isFruitTree(list, tree.getRight());
            }
        }
        return true;
    }
}
