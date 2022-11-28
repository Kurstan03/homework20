import java.util.InputMismatchException;

public class Parallelepiped implements AreaAble{
    private int height;
    private int length;
    private int width;

    public Parallelepiped(int height, int length, int width) {
        this.height = height;
        this.length = length;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public int areaAble() {
        int result = 2 * ((getHeight() * getLength()) + (getHeight() * getWidth()) + (getLength() * getWidth()));
        return result;
    }

    @Override
    public int volumeAble() {
        int result = (getHeight() * getLength() * getWidth());
        return result;
    }
}
