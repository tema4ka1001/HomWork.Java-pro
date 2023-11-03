package homeworks.hm5.Second;

public class Track implements Obstacle {
    public int length;

    public Track(int length) {
        this.length = length;
    }

    @Override
    public void overcome(Participant participant) {
        participant.run();
    }

}
