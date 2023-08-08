package ru.learning.models;

import java.util.Comparator;
import java.util.List;

public interface StreamOperator extends Comparator<StreamStudentGroups> {

    public int compare(StreamStudentGroups ssg1,StreamStudentGroups ssg2);

    public List<StreamStudentGroups> sorting(List<StreamStudentGroups> ssgList);

}
