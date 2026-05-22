public class AirConditioner extends Devices {

    private int temperature = 22;

    public AirConditioner(String deviceName) {
        super(deviceName);
    }

    public void increaseTemperature() {
        if (temperature < 30) {
            temperature += 1;
            System.out.println("Temperature increased.");
            System.out.println("Current Temperature: " + temperature);
        } else {
            System.out.println("Temperature is at maximum level.");
        }
    }

    public void decreaseTemperature() {
        if (temperature > 16) {
            temperature -= 1;
            System.out.println("Temperature decreased.");
            System.out.println("Current Temperature: " + temperature);
        } else {
            System.out.println("Temperature is at minimum level.");
        }
    }

    public void setTemperature(int degree) {
        if (degree >= 16 && degree <= 30) {
            temperature = degree;
            System.out.println("Temperature set to desired degree.");
            System.out.println("New Temperature: " + temperature);
        } else {
            System.out.println("Temperature must be between 16 and 30.");
        }
    }

    @Override
    public void showStatus() {
        System.out.println(getDeviceName());
        if (isOn()) {
            System.out.println("Air Conditioner is ON.");
            System.out.println("Current Temperature: " + temperature);
        } else {
            System.out.println("Air Conditioner is OFF.");
        }
    }
}