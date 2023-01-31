package YouTybeJava.Lesson11NasledieExtends;

public class Cow11_1 extends Animal11 {
    public Cow11_1(String say, int teeth) {
        setSay(say);
        setTeeth(teeth);

    }
    public String getSay() {
        String say = super.getSay();
        return say + " New ! ";
    }

    void mu() {
        System.out.println(getSay() + " во все " + getTeeth() + " зуба");

    }

}
