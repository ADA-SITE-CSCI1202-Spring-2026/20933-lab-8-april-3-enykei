import java.util.*;

public class StudentGrades {
    public static void main(String[] args) {
        Map<String, Double> studentGrades = new HashMap<>();

        studentGrades.put("Masud", 4.0);
        studentGrades.put("Leyla", 3.0);
        studentGrades.put("Tural", 2.1);
        studentGrades.put("Aysel", 2.5);
        studentGrades.put("Nigar", 2.6);
        studentGrades.put("Farid", 3.1);

        double maxGpa = -1.0;
        List<String> topStudents = new ArrayList<>();

        for (Map.Entry<String, Double> entry : studentGrades.entrySet()) {
            if (entry.getValue() > maxGpa) {
                maxGpa = entry.getValue();
                topStudents.clear(); 
                topStudents.add(entry.getKey());
            } else if (Double.compare(entry.getValue(), maxGpa) == 0) {
                topStudents.add(entry.getKey());
            }
        }
        System.out.println("Highest GPA: " + maxGpa + " (Students: " + topStudents + ")");

        double sum = 0;
        for (double gpa : studentGrades.values()) {
            sum += gpa;
        }
        double averageGpa = sum / studentGrades.size();
        System.out.printf("Average GPA: %.2f%n", averageGpa);

        int belowAverageCount = 0;
        for (double gpa : studentGrades.values()) {
            if (gpa < averageGpa) {
                belowAverageCount++;
            }
        }
        System.out.println("Number of students below average: " + belowAverageCount);
    }
}