package Interfaces;

public class SmartPhone implements Phone,Speaker {
    @Override
    public String modelName() {
        return "LG";
    }

    @Override
    public String speakerVolumeIncrease() {
        return "Increased";
    }

    @Override
    public String speakerVolumeDecrease() {
        return "Decreased";
    }

}
