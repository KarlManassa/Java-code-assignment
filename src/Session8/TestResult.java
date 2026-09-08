package Session8;

import java.util.Map;
import java.util.HashMap;

public class TestResult {

    public static Map getOriginalGrades() {
        Map grades = new HashMap<>();
        grades.put("Islam", 90);
        grades.put("Ahmed", 80);
        grades.put("Adham", 70);
        grades.put("Mohamed", 60);
        return grades;
    }

    public static Map getMakeUpGrades() {
        Map grades = new HashMap<>();
        grades.put("Islam", 90);
        grades.put("Ahmed", 95);
        grades.put("Adham", 80);
        grades.put("Mohamed", 50);
        return grades;
    }
}
