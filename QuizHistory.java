package com.company;

public class QuizHistory {
    int[] nazwatablicy = new int[3];
    int[] nazwatablicy2 = {15, 67, 98};
    public void myFun(){
        nazwatablicy[0] = 1;
        int a = nazwatablicy2[2];
        for(int i = 0; i < nazwatablicy2.length; i++){
            System.out.println("indeks "+i+" wartość "+nazwatablicy2[i]);
        }
    }
}
