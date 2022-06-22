package kr.hs.dgsw.java.RPS;

import java.util.Scanner;

public class PlayerMain {
    Robot ai = new Robot();
    Scanner scanner = new Scanner(System.in);
    int aiPoint = 0;
    int win = 0;
    int draw = 0;
    int lose = 0;
    int count = 0;
    public static void main(String[] args) {
        PlayerMain pm = new PlayerMain();
        System.out.println("** 가위바위보 GAME **");
        pm.startGame();
        pm.endGame();
    }
    public void startGame(){
        String str;
        int point = -1;
        while(true){
            count++;
            System.out.println("무엇을 낼 지 정해주세요 \n(가위 / 바위 / 보) : ");
            str = scanner.nextLine();
            if(str.trim().equals("가위")) point = 0;
            else if(str.trim().equals("바위")) point = 1;
            else if(str.trim().equals("보")) point = 2;
            else if(str.trim().equals("quit")) break;
            else{
                System.out.println("제대로 된 값이 아닙니다.");
                count -= 1;
                point = -1;
            }
            aiPoint=ai.getPoint();
            if(point != -1){
                if((aiPoint>point && aiPoint!=2) || (aiPoint==0 && point ==2)){
                    System.out.println("패배하셨습니다. AI : "+ai.getDoing()+" / YOU : "+str);
                    lose++;
                }
                else if(aiPoint<point || (aiPoint==2 && point ==0)){
                    System.out.println("승리하셨습니다. AI : "+ai.getDoing()+" / YOU : "+str);
                    win++;
                }
                else if(aiPoint == point){
                    System.out.println("비기셨습니다. AI : "+ai.getDoing()+" / YOU : "+str);
                    draw++;
                }
            }
            System.out.println("전적 : "+win+"/"+draw+"/"+lose);
        }
    }
    public void endGame(){
        System.out.println("게임을 종료합니다.");
        System.out.println("총 "+count+"판의 게임을 하셨습니다.");
        System.out.println("전적 : "+win+"승 "+draw+"무 "+lose+"패");
        System.out.println("승률 : "+(float)win/(count)*100+"%");
        scanner.close();
    }
}
