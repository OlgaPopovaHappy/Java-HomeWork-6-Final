/** Класс ноутбука */
public class Laptop {
    private String name;
    private String color;
    private String os; // операционная система
    private int ram; // озу например 8 гб
    private int diagonal;

    /* поведение */
    public Laptop(String name, String color, String os, int ram, int diagonal) {
        this.name = name;
        this.color = color;
        this.os = os;
        this.ram = ram;
        this.diagonal = diagonal;
    }


    public void setName(String name) {
        this.name = name;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setRam(int ram) {
        this.ram = ram;
    }
    public void setOs(String os) {
        this.os = os;
    }
    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    public String getName() {return name;}
    public String getColor() {return color;}
    public int getRam() {return ram;}
    public String getOs() {return os;}
    public int getDiagonal() {
        return diagonal;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", ram=" + ram +
                ", os='" + os + '\'' +
                ", diagonal=" + diagonal +
                '}';
    }

    /* метод toString аналогичен getDate */
    public String getDate(){
        return String.format("Бренд:%s\tцвет:%s\tоперац.система:%s\tОЗУ:%d\tдиагональ:%d\"",
                name, color, os, ram, diagonal);
    }
}
