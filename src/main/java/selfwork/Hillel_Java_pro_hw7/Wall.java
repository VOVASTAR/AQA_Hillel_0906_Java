package selfwork.Hillel_Java_pro_hw7;

public class Wall extends Restriction{

    int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean overcome(Partitipant partitipant) {
        return partitipant.heightJump > this.height;
    }
}
