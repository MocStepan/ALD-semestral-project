public class Title {
    int index;
    int left;
    int top;
    int right;
    int bottom;

    public Title(int index, int left, int top, int right, int bottom) {
        this.index = index;
        this.left = left;
        this.top = top;
        this.right = right;
        this.bottom = bottom;
    }

    public Boolean checkLeft(Title title) {
        return this.left == title.right;
    }

    public Boolean checkTop(Title title) {
        return this.top == title.bottom;
    }
}
