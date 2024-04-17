class Calc {
    public int add(int n1, int n2) {
        int result = n1 + n2;
        return result;
    }

    public int add2(int n1, int n2, int n3) {
        int result = n1 + n2 + n3;
        return result;
    }
}

class object {

    int a;
    String name;

    public static void main(String[] args) {

        // declare the variable
        // cretae the object

        Calc obj = new Calc();

        int result = obj.add(4, 3);
        System.out.println(result);

    }
}