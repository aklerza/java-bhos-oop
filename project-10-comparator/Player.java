public final class Player implements Comparable<Player> {

    public String name;
    public int score;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "{\"name\":\"%s\", \"score\":\"%d\"}"
                .formatted(name, score);
    }

    @Override
    public int compareTo(Player that) {
        return Long.compare(this.score, that.score);
    }
}