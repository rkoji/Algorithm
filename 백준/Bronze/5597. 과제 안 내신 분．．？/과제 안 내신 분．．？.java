import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalStudent = 30;
        int submission = 28;
        int[] allStudents = new int[totalStudent];
        int[] submittedStudents = new int[submission];
        for (int i = 0; i < allStudents.length; i++) {
            allStudents[i] = i + 1;
        }
        for (int i = 0; i < submission; i++) {
            submittedStudents[i] = sc.nextInt();
        }

        int missingStudent1 = 0;
        int missingStudent2 = 0;

        for (int i = 0; i < totalStudent; i++) {
            boolean found = false;
            for (int j = 0; j < submission; j++) {
                if (submittedStudents[j] == allStudents[i]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                if (missingStudent1 == 0) {
                    missingStudent1 = allStudents[i];
                } else {
                    missingStudent2 = allStudents[i];
                    break;
                }
            }

        }
        System.out.println(missingStudent1);
        System.out.println(missingStudent2);
    }
}