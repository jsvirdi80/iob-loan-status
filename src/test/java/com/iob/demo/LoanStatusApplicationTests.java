package com.iob.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LoanStatusApplicationTests {

    @Autowired
    private LoanService service;

    @Test
    void contextLoadsWithSampleLoans() {
        assertEquals(4, service.all().size());
    }

    @Test
    void findsLoanById() {
        assertTrue(service.find("LN-1001").isPresent());
        assertFalse(service.find("LN-9999").isPresent());
    }
}
