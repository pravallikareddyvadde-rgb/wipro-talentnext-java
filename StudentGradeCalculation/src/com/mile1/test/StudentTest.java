package com.mile1.test;

import static org.junit.Assert.*;
import org.junit.Test;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentException;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;

public class StudentTest {

    StudentReport report = new StudentReport();
    StudentService service = new StudentService();

    // TC1 - Grade A
    @Test
    public void testGradeA() throws Exception {
        Student s = new Student("Ravi", new int[]{90, 92, 95});
        assertEquals("A", report.validate(s));
    }

    // TC2 - Grade D
    @Test
    public void testGradeD() throws Exception {
        Student s = new Student("Kiran", new int[]{40, 45, 50});
        assertEquals("D", report.validate(s));
    }

    // TC3 - Grade F
    @Test
    public void testGradeF() throws Exception {
        Student s = new Student("Rahul", new int[]{20, 25, 30});
        assertEquals("F", report.validate(s));
    }

    // TC4 - NullStudentException
    @Test(expected = NullStudentException.class)
    public void testNullStudent() throws Exception {
        report.validate(null);
    }

    // TC5 - NullNameException
    @Test(expected = NullNameException.class)
    public void testNullName() throws Exception {
        Student s = new Student(null, new int[]{90, 90, 90});
        report.validate(s);
    }

    // TC6 - NullMarksArrayException
    @Test(expected = NullMarksArrayException.class)
    public void testNullMarks() throws Exception {
        Student s = new Student("Ravi", null);
        report.validate(s);
    }

    // TC7 - findNumberOfNullName
    @Test
    public void testFindNumberOfNullName() {
        Student[] students = {
            new Student(null, new int[]{10, 20, 30}),
            new Student("A", new int[]{10, 20, 30}),
            new Student(null, new int[]{10, 20, 30})
        };

        assertEquals(2, service.findNumberOfNullName(students));
    }

    // TC8 - findNumberOfNullObjects
    @Test
    public void testFindNumberOfNullObjects() {
        Student[] students = {
            null,
            new Student("A", new int[]{10, 20, 30}),
            null
        };

        assertEquals(2, service.findNumberOfNullObjects(students));
    }

    // TC9 - findNumberOfNullMarks
    @Test
    public void testFindNumberOfNullMarks() {
        Student[] students = {
            new Student("A", null),
            new Student("B", new int[]{10, 20, 30}),
            new Student("C", null)
        };

        assertEquals(2, service.findNumberOfNullMarks(students));
    }
}