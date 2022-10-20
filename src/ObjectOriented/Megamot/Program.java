package ObjectOriented.Megamot;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Megamot[] schools = new Megamot[10];
        for (int i = 0; i < 10; i ++) {
            schools[i] = new Megamot("School " + i);
        }

        while (true) {
            System.out.println("Enter the school you would like to enroll in >> ");
            String schoolName = scanner.next();
            if (schoolName.equals("end")) {
                break;
            }
            System.out.println("Enter the megama number you would like to enroll in >> ");
            int megamaNum = scanner.nextInt();

            for (int i = 0; i < schools.length; i++) {
                if (schoolName.equals(schools[i].getSchoolName())) {
                    schools[i].addStudentToMegama(megamaNum);
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            String schoolNameMax = "";
            int max = 0;
            for (int j = 0; j < schools.length; j++) {
                int megamaNum = schools[j].getMegamotList()[i];
                if (max < megamaNum) {
                    max = megamaNum;
                    schoolNameMax = schools[j].getSchoolName();
                }
            }

            switch (i) {
                case 0:
                    System.out.println(schoolNameMax + "has the biggest software engineering class.");
                case 1:
                    System.out.println(schoolNameMax + "has the biggest art class.");
                case 2:
                    System.out.println(schoolNameMax + "has the biggest graphics design class.");
                case 3:
                    System.out.println(schoolNameMax + "has the biggest medicine class.");
                case 4:
                    System.out.println(schoolNameMax + "has the biggest robotics class.");
            }
        }

    }
}
