package Session8;

import java.util.Map;

public class FinalResult {
    public static void main(String[] args) {
        Map<String , Integer> originalGrades =TestResult.getOriginalGrades();
        Map<String , Integer> makeUpGrades=TestResult.getMakeUpGrades();
        for (var student:makeUpGrades.entrySet()){
            Integer firstGrade = originalGrades.get(student.getKey());
            Integer secondGrade = makeUpGrades.get(student.getKey());
            if(secondGrade>firstGrade){
                originalGrades.put(student.getKey(),secondGrade);
            }
            System.out.println("Student "+student.getKey() + " has a grade "+
                    originalGrades.get(student.getKey()));
        }
    }
}