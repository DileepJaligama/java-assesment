package Questions;

public class Question1 {
    //area of rectangle
    public static void main(String[] args){
        Question1 q1 = new Question1();
        double length = 100;
        double breadth = 50;
        double area =  q1.areaOfRectangle(length,breadth);
    }
    public double areaOfRectangle(double length,double breadth){
        return length * breadth;
    }
}
