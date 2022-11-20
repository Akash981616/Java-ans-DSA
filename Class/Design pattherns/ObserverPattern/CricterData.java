package ObserverPattern;

public class CricterData extends subject {
    private int runs;

    public int getRuns() {
        return runs;
    }

    public void setRuns() {
        this.runs = runs;
    }

    private int overs;

    public int getOvers() {
        return this.overs;
    }

    public void setOvers() {
        this.overs = overs;
    }

    private int wicketes;

    public int getWickets() {
        return this.wicketes;
    }

    public void setWickets() {
        this.wicketes = wicketes;
    }

}

