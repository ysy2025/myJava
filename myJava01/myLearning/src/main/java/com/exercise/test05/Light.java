package com.exercise.test05;

enum Light {
    SUBMITTING(10),
    WAITING(20),
    RUNNING(30),
    KILLING(40),
    KILLED(50),
    FAILED(60),
    SUCCEEDED(70), ;

    int value;

    private Light(int value) {
        this.value = value;
    }

    public int value() {
        return this.value;
    }

    public boolean isFinished() {
        return this == KILLED || this == FAILED || this == SUCCEEDED;
    }

    public boolean isRunning() {
        return !this.isFinished();
    }
}
