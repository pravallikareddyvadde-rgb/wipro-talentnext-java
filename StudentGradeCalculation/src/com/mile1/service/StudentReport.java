package com.mile1.service;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentException;

public class StudentReport {

    public String validate(Student s)
            throws NullStudentException, NullNameException, NullMarksArrayException {

        if (s == null)
            throw new NullStudentException();

        if (s.getName() == null)
            throw new NullNameException();

        if (s.getMarks() == null)
            throw new NullMarksArrayException();

        int sum = 0;

        for (int mark : s.getMarks()) {
            sum += mark;
        }

        double avg = sum / s.getMarks().length;

        if (avg >= 80)
            return "A";
        else if (avg >= 60)
            return "B";
        else if (avg >= 50)
            return "C";
        else if (avg >= 35)
            return "D";
        else
            return "F";
    }
}