package Grade_11.DataStructures.Node.BookQuestions.Page_102.Q_56;

import Grade_11.DataStructures.Node.Node;

public class Program {
    public static Node<PolynomialCouple> addCoefficient(Node<PolynomialCouple> list,
                                                        Node<PolynomialCouple> coupleToAdd) {

        Node<PolynomialCouple> coupleToCheck = list;
        while (coupleToCheck.getNext() != null) {
            if (coupleToCheck.getValue().getDegree() == coupleToAdd.getValue().getDegree()) {
                coupleToCheck.getValue().setCoefficient(coupleToCheck.getValue().getCoefficient() +
                        coupleToAdd.getValue().getCoefficient());
                return list;
            }
            else if (coupleToCheck.getValue().getDegree() > coupleToAdd.getValue().getDegree()) {
                if (coupleToCheck.getNext().getValue().getDegree() < coupleToAdd.getValue().getDegree()) {
                    coupleToAdd.setNext(coupleToCheck.getNext());
                    coupleToCheck.setNext(coupleToAdd);
                    return list;
                }
                coupleToCheck = coupleToCheck.getNext();
            }
            else {
                coupleToAdd.setNext(coupleToCheck);
                return coupleToAdd;
            }
        }
        coupleToCheck.setNext(coupleToAdd);
        return list;
    }

    public static Node<PolynomialCouple> polynomialAddition(Node<PolynomialCouple> list1, Node<PolynomialCouple> list2) {
        Node<PolynomialCouple> listToReturn = new Node<PolynomialCouple>(new PolynomialCouple(1,1));
        Node<PolynomialCouple> endOfList = listToReturn;
        Node<PolynomialCouple> p = list1;
        while (p != null) {
            endOfList.setNext(p);
            endOfList = endOfList.getNext();
            p = p.getNext();
        }
        p = list2;
        Node<PolynomialCouple> coupleToCheck = listToReturn.getNext();
        while (p != null) {
            listToReturn = addCoefficient(coupleToCheck, p);
            p = p.getNext();
        }

        return listToReturn;
    }
}
