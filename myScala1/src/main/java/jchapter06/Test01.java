package jchapter06;

public class Test01 {
    public static void main(String[] args) {

        Novel novel = new Novel();

        novel.printBook();
        novel.printPrice();
    }
}

class Novel extends Book{
    @Override
    public void printBook() {
        System.out.println("this is novel");
    }

    public void printPrice() {
        System.out.println("jiage is null");
    }
}