package com.hcc.enums;

import com.fasterxml.jackson.annotation.JsonFormat;

// this is an example enum feel free to delete this once you have created your own.
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum AssignmentEnum {
    ASSIGNMENT_1(1, "C++ Intro"),
    ASSIGNMENT_2(2, "C++ Intermediate"),
    ASSIGNMENT_3(3, "C++ Advanced"),
    ASSIGNMENT_4(4, "Java Intro"),
    ASSIGNMENT_5(5, "Jave Intermediate");

    private int assignmentNumber;

    private String assignmentName;

    AssignmentEnum(int assignmentNumber, String assignmentName) {
        this.assignmentNumber = assignmentNumber;
        this.assignmentName = assignmentName;
    }

    public int getAssignmentNumber() {
        return assignmentNumber;
    }

    public String getAssignmentName() {
        return assignmentName;
    }
}
