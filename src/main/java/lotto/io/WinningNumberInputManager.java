package lotto.io;

import camp.nextstep.edu.missionutils.Console;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.regex.PatternSyntaxException;

public class WinningNumberInputManager extends InputManager<List<Integer>> {
    private static WinningNumberInputManager INSTANCE;

    private WinningNumberInputManager() {
    }

    public static WinningNumberInputManager getInstance() {
        if (INSTANCE == null) INSTANCE = new WinningNumberInputManager();
        return INSTANCE;
    }

    @Override
    public List<Integer> input() {
        while (true) {
            try {
                String inputLine = consoleAdapter.readLine();
                return validation(inputLine);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("[ERROR] 숫자를 입력해주세요.");
            } catch (IndexOutOfBoundsException e) {
                throw new IllegalArgumentException("[ERROR] 1~45 범위 내의 값을 입력해주세요.");
            } catch (NullPointerException e) {
                throw new IllegalArgumentException("[ERROR] 입력이 존재하지 않습니다.");
            }
        }
    }

    @Override
    public List<Integer> validation(String input) throws  NumberFormatException, NullPointerException, IndexOutOfBoundsException {
        List<Integer> numbers = Arrays.stream(input.split(",")).map(Integer::parseInt).toList();
        numbers.forEach(WinningNumberInputManager::validateNumberRange);
        return numbers;
    }


    private static void validateNumberRange(Integer number) {
        if (number > 45 || number < 1) throw new IndexOutOfBoundsException();
    }
}
