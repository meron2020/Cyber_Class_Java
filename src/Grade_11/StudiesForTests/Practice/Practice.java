package Grade_11.StudiesForTests.Practice;

import Grade_11.DataStructures.NodeClass;
import org.w3c.dom.Node;

public class Practice {
    private String name;
    private int day;
    private int hour;



    private int max;
    NodeClass<Integer> list;
    NodeClass<Integer> waitL;

    public Practice(String name, int day, int hour, int max) {
        this.name = name;
        this.day = day;
        this.hour = hour;
        this.max = max;
        this.list = null;
        this.waitL = null;

    }
    public boolean listFull() {
        int counter = 0;
        NodeClass<Integer> p = list;
        while (p != null) {
            counter++;
            p = p.getNext();
        }
        return counter == this.max;
    }

    public boolean addMember(int num) {
        NodeClass<Integer> member = new NodeClass<Integer>(num);
        if (this.listFull()) {
            NodeClass<Integer> p = this.waitL;
            while (p.getNext() != null) {
                p = p.getNext();
            }
            p.setNext(member);
            return false;
        } else {
            NodeClass<Integer> p = this.list;
            while (p.getNext() != null) {
                p = p.getNext();
            }
            p.setNext(member);
            return false;
        }
    }

    public void deleteMember(int num) {
        NodeClass<Integer> p = this.list;
        while (p.getNext() != null) {
            if (p.getValue() == num) {
                if (this.waitL == null) {
                    p.setNext(p.getNext().getNext());
                    return;
                }
                else {
                    p.setValue(this.waitL.getValue());
                    this.waitL = this.waitL.getNext();
                }
                p = p.getNext();
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public NodeClass<Integer> getList() {
        return list;
    }

    public void setList(NodeClass<Integer> list) {
        this.list = list;
    }

    public NodeClass<Integer> getWaitL() {
        return waitL;
    }

    public void setWaitL(NodeClass<Integer> waitL) {
        this.waitL = waitL;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
}
