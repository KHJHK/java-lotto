package lotto.domain;

public enum Prize {
    FIRST(2_000_000_000, 6, false),
    SECOND(30_000_000, 5, true),
    THIRD(1_500_000, 5, false),
    FOURTH(50_000, 4, false),
    FIFTH(5_000, 3, false),
    LOSE(0, 0, false);

    private final long prize;
    private final int correctCnt;
    private final boolean isBonusCorrect;

    Prize(long prize, int correctCnt, boolean isBonusCorrect){
        this.prize = prize;
        this.correctCnt = correctCnt;
        this.isBonusCorrect = isBonusCorrect;
    }

    public int getCorrectCnt() {
        return correctCnt;
    }

    public long getPrize() {
        return prize;
    }

    public boolean getIsBonusCorrect() {
        return isBonusCorrect;
    }

}
