package com.hand.ssm.pojo;

public class Teacher {
    private int sno;
    private String sname;
    private String score;

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "sno=" + sno +
                ", sname='" + sname + '\'' +
                ", score='" + score + '\'' +
                '}';
    }
}
