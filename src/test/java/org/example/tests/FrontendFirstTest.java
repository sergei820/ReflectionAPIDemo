package org.example.tests;

import org.example.annotations.UITest;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FrontendFirstTest extends BaseTest {

    @UITest
    @Test
    public void frontendFirstTest() {
        assertThat(true).isTrue();
    }
}
