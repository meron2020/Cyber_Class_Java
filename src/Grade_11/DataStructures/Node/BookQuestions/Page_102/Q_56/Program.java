package Grade_11.DataStructures.Node.BookQuestions.Page_102.Q_56;

import Grade_11.DataStructures.NodeClass;

public class Program {
    public static NodeClass<PolynomialCouple> addCoefficient(NodeClass<PolynomialCouple> list,
                                                             NodeClass<PolynomialCouple> coupleToAdd) {

        NodeClass<PolynomialCouple> coupleToCheck = list;
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
    public static NodeClass<PolynomialCouple> polynomialAddition(NodeClass<PolynomialCouple> list1, NodeClass<PolynomialCouple> list2) {
        NodeClass<PolynomialCouple> listToReturn = new NodeClass<PolynomialCouple>(new PolynomialCouple(1,1));
        NodeClass<PolynomialCouple> endOfList = listToReturn;
        NodeClass<PolynomialCouple> p = list1;
        while (p != null) {
            endOfList.setNext(p);
            endOfList = endOfList.getNext();
            p = p.getNext();
        }
        p = list2;
        NodeClass<PolynomialCouple> coupleToCheck = listToReturn.getNext();
        while (p != null) {
            listToReturn = addCoefficient(coupleToCheck, p);
            p = p.getNext();
        }

        return listToReturn;
    }
    //Done in class > O(N)
    public static NodeClass<PolynomialCouple> polynomialAdditionClass(NodeClass<PolynomialCouple> l1, NodeClass<PolynomialCouple> l2) {
        NodeClass<PolynomialCouple> p1 = l1;
        NodeClass<PolynomialCouple> p2 = l2;
        NodeClass<PolynomialCouple> listToReturn = new NodeClass<PolynomialCouple>(null);
        NodeClass<PolynomialCouple> last = listToReturn;
        while (p1 != null && p2 != null) {
            int h1 = p1.getValue().getDegree();
            int h2 = p2.getValue().getDegree();
            if (h1 > h2) {
                last.setNext(new NodeClass<PolynomialCouple>(new PolynomialCouple(p1.getValue())));
                p1 = p1.getNext();
            }
            else if (h2 > h1) {
                last.setNext(new NodeClass<>(new PolynomialCouple(p2.getValue())));
                p2 = p2.getNext();
            }
            else {
                PolynomialCouple poly = new PolynomialCouple(
                        p1.getValue().getCoefficient() + p2.getValue().getCoefficient(), // add coefficients
                        h1);
                last.setNext(new NodeClass<PolynomialCouple>(poly));
                p1 = p1.getNext();
                p2 = p2.getNext();
            }
            last = last.getNext();

        }

        while (p1 != null) {
            last.setNext(new NodeClass<PolynomialCouple>(new PolynomialCouple(p1.getValue())));
            p1 = p1.getNext();
            last = last.getNext();
        }

        while (p2 != null) {
            last.setNext(new NodeClass<PolynomialCouple>(new PolynomialCouple(p2.getValue())));
            p2 = p2.getNext();
            last = last.getNext();
        }

        return listToReturn.getNext();
    }
}
