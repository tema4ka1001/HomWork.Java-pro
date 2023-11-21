package homeworks.hm9;

public enum LoginLevel {

    INFO(1), DEBUG(2);

    private int level;
    private LoginLevel(int level){
        this.level=level;
    }
    public boolean IsEnable(LoginLevel other){
        return this.level >= other.level;
    }

}
