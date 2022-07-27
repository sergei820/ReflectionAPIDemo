package org.example.tests;

import org.example.annotations.UITest;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FrontendSecondTest extends BaseTest {

    @UITest
    @Test
    public void frontendSecondTest() {
        assertThat(true).isTrue();
    }
}
