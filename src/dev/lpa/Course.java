package dev.lpa;

public record Course(String courseCode, String title, int lectureCount) {

    public Course(String courseCode, String title) {
        this(courseCode, title, 40);
    }
}
