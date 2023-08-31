package nextstep.blackjack;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BlackUserTest {

    private static User user;
    @BeforeAll
    static void init() {
        user = new User("히히");
    }
    @Test
    void 유저를생성한다_이름만맞춘객체() {
        assertEquals(new User("히히"), user);
    }


}