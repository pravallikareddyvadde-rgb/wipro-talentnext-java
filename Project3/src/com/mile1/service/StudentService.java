package com.mile1.service;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;

public class StudentService {

    public int findNumberOfNullMarksArray(Student[] students) {

        int count = 0;

        if (students == null)
            return 0;

        for (Student s : students) {
            if (s != null && s.getMarks() == null) {
                count++;
            }
        }

        return count;
    }

    public int findNumberOfNullNames(Student[] students) {

        int count = 0;

        if (students == null)
            return 0;

        for (Student s : students) {
            if (s != null && s.getName() == null) {
                count++;
            }
        }

        return count;
    }

    public int findNumberOfNullObjects(Student[] students) {

        int count = 0;

        if (students == null)
            return 0;

        for (Student s : students) {
            if (s == null) {
                count++;
            }
        }

        return count;
    }

    public String[] findGrades(Student[] students) {

        String[] grades = new String[students.length];
        StudentReport report = new StudentReport();

        for (int i = 0; i < students.length; i++) {

            try {
                grades[i] = report.validate(students[i]);
            } catch (NullStudentObjectException e) {
                grades[i] = e.getMessage();
            } catch (NullNameException e) {
                grades[i] = e.getMessage();
            } catch (NullMarksArrayException e) {
                grades[i] = e.getMessage();
            }
        }

        return grades;
    }
}
