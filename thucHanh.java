package accessModifier;

    class A {
    private int data = 40;
    private void msg (){
        System.out.println("Hello java");
    }
}

    public class thucHanh{
        public static void main(String[] args) {
            A ojb=new A();
//            System.out.println(ojb.data);
//            ojb.msg();
        }
    }