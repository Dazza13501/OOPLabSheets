package labsheet5;

public class Thermometer {

    private int temperature;
    private int maxTemperature;
    private int minTemperature;

    public Thermometer(){
        temperature=0;
        maxTemperature=0;
        minTemperature=0;
    }

    public Thermometer(int temperature, int maxTemperature, int minTemperature){

        this.temperature= temperature;
        this.maxTemperature= maxTemperature;
        this.minTemperature= minTemperature;

    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }
}
