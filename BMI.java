public class BMI {

    private double weight;
    private double height;

    public BMI(){

    }

    public BMI(double weight, double height){
        this.weight = weight * 0.45359237;
        this.height = height * 0.0254;
    }

    public double calculateBMI(){
        return (this.weight / (Math.pow(this.height, 2)));
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
