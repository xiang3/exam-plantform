package exam.paperContext.application;

import lombok.*;

import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AssemblePaperCommand {
    private String teacherId;
    private List<Quiz> quizzes;

    @Data
    @Getter
    @Setter
    public static class Quiz {
        private String quizId;
        private int score;
    }
}