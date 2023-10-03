package com.marikani.java8;

public class Student {
    private int id;
    private String name;
    private int classStudy;
    private int rank;

    public Student(int id, String name, int classStudy, int rank) {
        this.id = id;
        this.name = name;
        this.classStudy = classStudy;
        this.rank = rank;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getClassStudy() {
        return classStudy;
    }

    public void setClassStudy(int classStudy) {
        this.classStudy = classStudy;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", classStudy=" + classStudy +
                ", rank=" + rank +
                '}';
    }
}
