package com.github.yoshiyoshi441;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class UserTest {
    @Test
    public void test() throws Exception {
        var actual = new User("test-user", 30);

        assertThat(actual).extracting(User::name).isEqualTo("test-user");
        assertThat(actual).extracting(User::age).isEqualTo(30);
    }
}
