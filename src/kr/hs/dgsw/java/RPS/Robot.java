package kr.hs.dgsw.java.RPS;

import java.util.Random;

public class Robot {
    int point = -1;
    public int getPoint(){
        Random rand = new Random();
        point = rand.nextInt(3);
        return point;
    }
    public String getDoing(){
        if(point == 0) return "가위";
        else if(point == 1) return "바위";
        else if(point == 2) return "보";
        else{
            return "오류";
        }
    }
}
