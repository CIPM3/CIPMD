package com.example.cipm3;



public class Student {

    String name;
    boolean presentsimple,presenteContinuo, presenteperfecto;

    public boolean isPresenteperfecto() {
        return presenteperfecto;
    }

    public void setPresenteperfecto(boolean presenteperfecto) {
        this.presenteperfecto = presenteperfecto;
    }

    public Student() {

    }
    public Student(String name, boolean presentsimple, boolean presenteContinuo,boolean presenteperfecto) {
        this.name = name;
        this.presentsimple = presentsimple;
        this.presenteContinuo= presenteContinuo;
        this.presenteperfecto=presenteperfecto;
    }

    public boolean isPresenteContinuo() {
        return presenteContinuo;
    }

    public void setPresenteContinuo(boolean presenteContinuo) {
        this.presenteContinuo = presenteContinuo;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPresentsimple() {
        return presentsimple;
    }

    public void setPresentsimple(boolean presentsimple) {
        this.presentsimple = presentsimple;
    }



}
