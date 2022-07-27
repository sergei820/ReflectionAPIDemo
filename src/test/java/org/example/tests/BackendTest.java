package org.example.tests;

import org.example.annotations.BETest;
import org.example.listeners.AnnotationsListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Listeners(AnnotationsListener.class)
public class BackendTest extends BaseTest {

    @BETest
    @Test
    public void backendTest() {
        assertThat(true).isTrue();
    }
}
