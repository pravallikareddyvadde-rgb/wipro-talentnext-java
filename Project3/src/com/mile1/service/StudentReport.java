package com.mile1.service;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;

public class StudentReport {

    public String validate(Student s)
            throws NullStudentObjectException,
                   NullNameException,
                   NullMarksArrayException {

        if (s == null) {
            throw new NullStudentObjectException();
        }

        if (s.getName() == null) {
            throw new NullNameException();
        }

        if (s.getMarks() == null) {
            throw new NullMarksArrayException();
        }

        int[] marks = s.getMarks();

        boolean fail = false;

        for (int mark : marks) {
            if (mark < 35) {
                fail = true;
                break;
            }
        }

        if (fail) {
            return "F";
        } else {
            return "A";
        }
    }
}
