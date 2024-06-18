public class JUnitTest {

    public int add(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        JUnitTest a= new Sample_classForJUnitTest();
        System.out.println(a.add(2,3));
    }
}
