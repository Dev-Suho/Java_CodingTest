package ErpTest;

interface Pen {
    void draw(String text);
    void getColor();
    void getSize();
    void changeSize(int size);
}

class BlackPen implements Pen{
    private String color;
    private int size;

    public BlackPen() {
        this.color = "검은색";
        this.size = 1;
    }
    @Override
    public void draw(String text) {
        System.out.println(color + " 펜으로 " + text);
    }
    @Override
    public void getColor() {
        System.out.println(color + " 펜 입니다.");
    }
    @Override
    public void getSize() {
        System.out.println(size + " 크기의 " + color + " 펜입니다.");
    }
    @Override
    public void changeSize(int size) {
        this.size = size;
        System.out.println(size + " 크기로 변경되었습니다.");
    }
}

public class Main {
    public static void main(String[] args) {
        Pen bp = new BlackPen();
        bp.getColor();
        bp.getSize();
        bp.draw("ERD를 그립니다.");
        bp.changeSize(5);
        bp.draw("UML을 그립니다.");
    }
}