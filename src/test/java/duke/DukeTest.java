package duke;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DukeTest {
    @Test
    public void dummyTest() {
        Duke duke = new Duke("data/tasks.txt");
        assertEquals(2, 2);
    }
}
