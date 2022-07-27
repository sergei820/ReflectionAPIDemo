package org.example.tests;

import org.example.annotations.BETest;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BackendTest extends BaseTest {

    @BETest
    @Test
    public void backendTest() {
        assertThat(true).isTrue();
    }
}
