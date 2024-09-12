import java.awt.*;

public class car {
    int averageMilesPerGallon;
    String licensePlateNumber;
    Color paintColor;
    boolean areTailingWorking;

    public car(int inputAverageMPG,
            String inputLicensePlate,
            Color inputPaintColor,
            boolean inputAreTailingWorking) {
        this.averageMilesPerGallon = inputAverageMPG;
        this.licensePlateNumber = inputLicensePlate;
        this.paintColor = inputPaintColor;
        this.areTailingWorking = inputAreTailingWorking;
    }

    public void changePaintColor(Color newPaintColor){
        this.paintColor = newPaintColor;
    }

    public double speedingUp(double currentSpeed){
        currentSpeed += 100;
        return currentSpeed;
    }
}
