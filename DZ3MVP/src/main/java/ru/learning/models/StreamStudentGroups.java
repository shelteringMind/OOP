package ru.learning.models;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StreamStudentGroups implements Iterable<StudentGroup>{
    private List<StudentGroup> streamGroups;

    public StreamStudentGroups(){
    }

    public StreamStudentGroups(List<StudentGroup> stGrStream){

        this.streamGroups = stGrStream;
    }

    public StreamStudentGroups createStreamStudentGroup(List<StudentGroup> streams){
        return new StreamStudentGroups(streams);
    }

    public  Iterator<StudentGroup> iterator() {

        return streamGroups.iterator();
    }

    public void addGroupToStream(StudentGroup sg){

        streamGroups.add(sg);
    }

    public void removeGroupToStream(StudentGroup sg){

        streamGroups.remove(sg);
    }

    public List<StudentGroup> getStreamGroups() {

        return streamGroups;
    }

    public int getSizeStream(){

        return streamGroups.size();
    }
}
