package lotto.domain;

import java.util.List;

public class WinningLotto{
    private final String DUPLICATE_BONUSNUM_ERROR = "보너스 번호는 당첨 번호와 중복될 수 없습니다.";
    private final String OUT_OF_LOTTO_SIZE_ERROR = "로또 번호는 정확히 6개가 입력되어야 합니다.";
    private final int WINNING_LOTTO_CNT = 6;
    private final Lotto winningLotto;
    private final int bonusNum;

    public WinningLotto(List<Integer> numbers, int bonusNum){
        validateDuplicateBonusNumber(numbers, bonusNum);
        winningLotto = new Lotto(numbers);
        this.bonusNum = bonusNum;
    }

    private void validateDuplicateBonusNumber(List<Integer> numbers, int bonusNum){
        if(numbers.contains(bonusNum))  throw new IllegalArgumentException(DUPLICATE_BONUSNUM_ERROR);
        if(numbers.size() != WINNING_LOTTO_CNT)  throw new IllegalArgumentException(OUT_OF_LOTTO_SIZE_ERROR);
    }
    
    public int compareLottoNums(Lotto lotto){
        int correctCnt = 0;
        for (int idx = 0; idx < WINNING_LOTTO_CNT; idx++)
            if(lotto.getNumbers().get(idx) == winningLotto.getNumbers().get(idx)) correctCnt++;

        return correctCnt;
    }

    public boolean compareBonusNum(Lotto lotto){
        return lotto.getNumbers().contains(bonusNum);
    }

    public Lotto getWinningLotto(){
        return winningLotto;
    }

    public int getBonusNum(){
        return bonusNum;
    }


}
