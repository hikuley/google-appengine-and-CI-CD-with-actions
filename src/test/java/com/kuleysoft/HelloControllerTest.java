package com.kuleysoft;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class HelloControllerTest extends TestCase {

    @Test
    public void testTest() {
        String test = null;
        assertThat("test").isNotBlank();
        assertThat("test").isNotBlank();
//        assertThat(test).isNotBlank();
    }

}