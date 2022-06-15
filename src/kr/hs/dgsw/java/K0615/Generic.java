package kr.hs.dgsw.java.K0615;

public class Generic<ABC,ZZZ> {
    private ABC value;
    private ZZZ id;

    public ABC getValue(){
        return value;
    }
    public void setValue(ABC value){
        this.value = value;
    }

    public ZZZ getId(){
        return id;
    }
    public void setId(ZZZ value){
        this.id = id;
    }

    public static void main(String[] args) {
        Generic<String,Integer> generic = new Generic<String,Integer>();
        generic.setValue("Korea");

        Generic<Integer,Integer> generic1 = new Generic<Integer,Integer>();
        generic1.setValue(123);
    }
}
