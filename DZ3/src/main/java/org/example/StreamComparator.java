package org.example;

public class StreamComparator implements Comparable<Stream>{
    public int compare(Stream s1,Stream s2){
        return s1.getStudyGroups().size()-s2.getStudyGroups().size();
    }

    public int compareTo(Stream o) {
        return 0;
    }
}
