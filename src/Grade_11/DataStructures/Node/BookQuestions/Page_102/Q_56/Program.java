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

    //Done in HW > O(N**2)
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
    //Done in class > O(N)
    public static Node<PolynomialCouple> polynomialAdditionClass(Node<PolynomialCouple> l1, Node<PolynomialCouple> l2) {
        Node<PolynomialCouple> p1 = l1;
        Node<PolynomialCouple> p2 = l2;
        Node<PolynomialCouple> listToReturn = new Node<PolynomialCouple>(null);
        Node<PolynomialCouple> last = listToReturn;
        while (p1 != null && p2 != null) {
            int h1 = p1.getValue().getDegree();
            int h2 = p2.getValue().getDegree();
            if (h1 > h2) {
                last.setNext(new Node<PolynomialCouple>(new PolynomialCouple(p1.getValue())));
                p1 = p1.getNext();
            }
            else if (h2 > h1) {
                last.setNext(new Node<>(new PolynomialCouple(p2.getValue())));
                p2 = p2.getNext();
            }
            else {
                PolynomialCouple poly = new PolynomialCouple(
                        p1.getValue().getCoefficient() + p2.getValue().getCoefficient(), // add coefficients
                        h1);
                last.setNext(new Node<PolynomialCouple>(poly));
                p1 = p1.getNext();
                p2 = p2.getNext();
            }
            last = last.getNext();

        }

        while (p1 != null) {
            last.setNext(new Node<PolynomialCouple>(new PolynomialCouple(p1.getValue())));
            p1 = p1.getNext();
            last = last.getNext();
        }

        while (p2 != null) {
            last.setNext(new Node<PolynomialCouple>(new PolynomialCouple(p2.getValue())));
            p2 = p2.getNext();
            last = last.getNext();
        }

        return listToReturn.getNext();
    }
}
