package Grade_11.StudiesForTests.Test.EnglishSchool;

import Grade_11.DataStructures.NodeClass;

public class EnglishStudent {
    private String name;
    private int id;
    private NodeClass<EnglishLevel> list;

    public void addLevel(int level, int type) {
        EnglishLevel levelToAdd = new EnglishLevel(level, type);
        if (list == null) {
            this.list = new NodeClass<>(levelToAdd);
        } else {
            NodeClass<EnglishLevel> p = list;
            while (p.getNext() != null) {
                p = p.getNext();
            }
            p.setNext(new NodeClass<EnglishLevel>(levelToAdd));
        }
    }

    public boolean checkIfInOrder() {
        NodeClass<EnglishLevel> p = list;
        while (p.getNext() != null) {
            EnglishLevel currentLevel = p.getValue();
            EnglishLevel nextLevel = p.getNext().getValue();
            if (currentLevel.getLevel() == nextLevel.getLevel()) {
                if (currentLevel.getType() + 1 != nextLevel.getType()) {
                    return false;
                }
            } else if (currentLevel.getLevel() + 1 == nextLevel.getLevel()) {
                if (currentLevel.getType() + 1 != nextLevel.getType()) {
                    return false;
                }
            } else {
                return false;
            }
            p = p.getNext();
        }
        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public NodeClass<EnglishLevel> getList() {
        return list;
    }

    public void setList(NodeClass<EnglishLevel> list) {
        this.list = list;
    }
}
