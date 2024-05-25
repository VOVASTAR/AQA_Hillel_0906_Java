package selfwork.Hillel_Java_pro_hw7;

public class RunWay extends Restriction {

    int distance;

    public RunWay(int distance) {
        this.distance = distance;
    }

    @Override
    public boolean overcome(Partitipant partitipant) {
        return partitipant.distanceRun > this.distance;
    }
}
