package com.example.demo;

class StudenntAPI_Info {
    int id;
    String name;

    StudenntAPI_Info(int id, String name){
        this.id = id;
        this.name=name;

    } 

   public int getID(){
            return id;
    }

   public String getname(){
            return name;
    }

    public void setname(String name){
        this.name=name;
    }

    public void setname(int id){
        this.id=id;
    }
    

}