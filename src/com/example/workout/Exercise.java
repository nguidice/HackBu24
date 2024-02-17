package com.example.workout;
import java.util.*;

public class Exercise {

    public Exercise () { //Default Constructor

    }

    public Exercise (String name){ //Constructor for use
      String exName = name;
      HashMap <Integer, float[]> setMap = new HashMap <Integer, float[]>();//Hashmap to store lbs and reps in a set
      //setMap.put(); //In hashmap, index of hashmap + 1, is the set number, put length [2] array into the content of the map, first element of array is lbs, second is reps

    }

    public HashMap getSet (int setNum){
        return setMap.get(setNum);
    }

    public void setSet (int setNum, float lbs, float reps){
        float [] setArr = {lbs,reps}; //Array to put into setMap
        setMap.put(setNum,setArr);
    }

    public String getExName(){
        return exName;
    }
}
