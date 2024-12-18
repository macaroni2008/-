package mevsha;

public enum Season {
    WINTER(-15.7, 175), SUMMER(25.4, 300), SPRING(15.7, 200), AUTUMN(11.3, 250);
    private final double avgTemp;
    private final int avgPrec;

    Season(double avgTemp, int avgPrec) {
        this.avgTemp = avgTemp;
        this.avgPrec = avgPrec;
    }

    public double getAvgTemp() {
        return avgTemp;
    }
    public int getAvgPrec(){
        return avgPrec;
    }
    public String getDescription() {
        if (this == Season.AUTUMN || this == Season.WINTER) {
            return ("Это холодное время года.");
        }
        else {
            return ("Это тёплое время года.");
        }
    }

    @Override
    public String toString() {
        return "Season{" +
                "avgTemp=" + avgTemp +
                ", avgPrec=" + avgPrec +
                '}';
    }
}
