public class Wall {
    // write code here

    private double width;
    private double height;

    public Wall() {
    }

    public Wall(double width, double height){
        setWidth(width);
        setHeight(height);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width < 0) {
            width = 0;
        } else {
            this.width = width;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height < 0) {
            height = 0;
        } else {
            this.height = height;
        }
    }

    public double getArea() {
        return width*height;
    }
}