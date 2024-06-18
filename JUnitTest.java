public class JUnitTest {

    public int add(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        JUnitTest a= new JUnitTest();
        System.out.println(a.add(2,3));
    }
}
