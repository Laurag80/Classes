package JavaQuiz6;

public class Q3 {
    // Choose the correct statement about the following code:

    public interface CanFly {

        void fly();

    }

    interface HasWings {

        public abstract Object getWindSpan();

    }

    abstract class Falcon implements CanFly, HasWings {

    }
}
/* Answer
It compiles without issue.
 */