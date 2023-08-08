package ru.learning.models;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StreamService extends StreamStudentGroups implements StreamOperator{

    private List<StreamStudentGroups> streamsGroups;

    public StreamService(){
    }
    public StreamService(List<StreamStudentGroups> streamsGroups){
        this.streamsGroups=streamsGroups;
    }

    public List<StreamStudentGroups> getAll() {
        return streamsGroups;
    }

    public int compare(StreamStudentGroups ssg1,StreamStudentGroups ssg2) {

        return Integer.compare(ssg1.getSizeStream(),ssg2.getSizeStream());

    }

    public List<StreamStudentGroups> sorting(List<StreamStudentGroups> ssgList){
        ssgList.sort((s1, s2)->compare(s1,s2));
        return ssgList;
    }

}