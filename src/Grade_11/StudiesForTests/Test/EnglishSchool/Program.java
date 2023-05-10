package Grade_11.StudiesForTests.Test.EnglishSchool;

import Grade_11.DataStructures.NodeClass;

public class Program {
    public static String[] numOfStudentsInEachLevel(NodeClass<EnglishStudent> all) {
        String[] studentsInEachLevel = new String[30];
        NodeClass<EnglishStudent> p = all;
        while (p != null) {
            NodeClass<EnglishLevel> level = p.getValue().getList();
            while (level != null) {
                int index = level.getValue().getLevel() * 2 + level.getValue().getType() - 1;
                studentsInEachLevel[index] = p.getValue().getName();
                level = level.getNext();
            }
            p = p.getNext();
        }
        return studentsInEachLevel;
    }
}
