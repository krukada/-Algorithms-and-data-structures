package ade.iu.bmstu;

public class ArifmeticSequence {
    private int a, d;

    public ArifmeticSequence(int a,int d){
        if(d <= 0) throw new RuntimeException("d must be more then 0");
        this.a = a;
        this.d = d;
    }

    public boolean include(ArifmeticSequence sequence){
        return (d == sequence.d || sequence.d % d == 0) && a <= sequence.a && (sequence.a - a) % d == 0;
    }

    public String getGroup(){
        int sum = 10 * a + 45 * d;
        if(sum <= 100) return "0..100";
        if(sum <= 1000) return "101..1000";
        return "1000+";
    }

    @Override
    public String toString(){
        return String.format("(a:%d, d:%d)", a, d);
    }
}