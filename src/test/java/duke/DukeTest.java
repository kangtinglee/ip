package duke;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DukeTest {
    @Test
    public void dummyTest() {
        Duke duke = new Duke("data/tasks.txt");
        assertEquals(2, 2);
    }
}