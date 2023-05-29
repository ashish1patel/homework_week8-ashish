package abstractexample23;

class TestAbstaction1 {
    //In real scenario, method is called by programmer or user
    public static void main(String[] args) {
       Shape s =new Circle1();
        //In rel scenario, object is provided through method, e.g. getShape()method
    s.draw();
    }
}
