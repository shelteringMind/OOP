package org.example;

import java.util.Iterator;
import java.util.List;

public class Stream extends StudyGroup implements Iterable{
    private List<StudyGroup> studyGroups;

    public Stream(List<StudyGroup> stGrStream){

        this.studyGroups = stGrStream;
    }

    public  Iterator<StudyGroup> iterator() {
            return studyGroups.iterator();
    }

    public void addGroupToStream(StudyGroup sg){
        this.studyGroups.add(sg);
    }

    public void removeGroupToStream(StudyGroup sg){
        if(this.studyGroups.contains(sg)) {
            this.studyGroups.remove(sg);
        }
    }

    public List<StudyGroup> getStudyGroups() {
        return studyGroups;
    }
}
