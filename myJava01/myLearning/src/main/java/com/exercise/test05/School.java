package com.exercise.test05;

public enum School {
    TOP("hefeiNo1", 1),
    SECOND("hefei168", 2),
    THIRD("shouchun", 3),
    OTHER("others", 4);

    String name;
    int rank;

    School() {
    }

    School(String name, int rank) {
        this.name = name;
        this.rank = rank;
    }

    public boolean isNiuBi(){
        return (this == TOP || this == SECOND);
    }
    public boolean isLaJi(){
        return (this == OTHER);
    }

    public boolean isJiangYou(){
        return (this == THIRD);
    }
}
