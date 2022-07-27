package org.example.tests;

import org.example.annotations.UITest;
import org.example.listeners.AnnotationsListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Listeners(AnnotationsListener.class)
public class FrontendFirstTest extends BaseTest {

    @UITest
    @Test
    public void frontendFirstTest() {
        assertThat(true).isTrue();
    }
}
