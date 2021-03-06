package spring.jeiu.domain.board;

import spring.jeiu.domain.board.Board;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class BoardValidator implements Validator {
    @Override
    public boolean supports(Class<?> clas) {
        return Board.class.equals(clas);
    }

    @Override
    public void validate(Object obj, Errors errors) {
        Board board = (Board) obj;


        if(ObjectUtils.isEmpty(board.getContent())) {
            errors.rejectValue("content", "key", "내용 적어");
        }
    }
}
