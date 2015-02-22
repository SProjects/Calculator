package com.bluesquare.calculator;
import java.lang.*;

public class Result {

    private int answer;
    private String errorMessage;

    public Result(int answer, String errorMessage){
        this.answer = answer;
        this.errorMessage = errorMessage;
    }

    public int getAnswer(){
        return this.answer;
    }

    public String getErrorMessage(){
        return this.errorMessage;
    }

}
