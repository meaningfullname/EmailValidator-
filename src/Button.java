public class Button {
    private Switchable device;
    private boolean isOn;

    public Button(Switchable device) {
        this.device = device;
        this.isOn = false;  // Initial state
    }

    public void press() {
        if (isOn) {
            device.turnOff();
            isOn = false;
        } else {
            device.turnOn();
            isOn = true;
        }
    }
}