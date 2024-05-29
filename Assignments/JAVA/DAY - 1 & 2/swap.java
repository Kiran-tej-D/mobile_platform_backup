class swap{
    public static void main(String[] args){
        int a = 5;
        int b = 10;
        System.out.println("Before swapping \na = " + a);
        System.out.println("b = " + b);

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("After swapping \na = " + a);
        System.out.println("b = " + b);

    }
}



