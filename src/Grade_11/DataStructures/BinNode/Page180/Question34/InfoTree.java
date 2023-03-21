package Grade_11.DataStructures.BinNode.Page180.Question34;

public class InfoTree {
    public char getCh() {
        return ch;
    }

    public void setCh(char ch) {
        this.ch = ch;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public InfoTree(char ch, int num) {
        this.ch = ch;
        this.num = num;
    }

    private char ch;
    private int num;

    public void add(int n) {
        this.num += n;
    }

}
