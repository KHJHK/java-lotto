package lotto.domain;

public enum Prize {
    LOSE(0, 0, false),
    FIFTH(5_000, 3, false),
    FOURTH(50_000, 4, false),
    THIRD(1_500_000, 5, false),
    SECOND(30_000_000, 5, true),
    FIRST(2_000_000_000, 6, false);

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

    public boolean getIsBonusCorrect() { return isBonusCorrect; }

    public static Prize comparePrize(int correctCnt){
        for (Prize prize : Prize.values()){
            if(prize.correctCnt == correctCnt) return prize;
        }
        return LOSE;
    }

    public static Prize comparePrize(boolean isBonusCorrect){
        if(isBonusCorrect){
            return SECOND;
        }
        return THIRD;
    }


}
