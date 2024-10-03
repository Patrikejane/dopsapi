package com.loollab.lab.api.controllers;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.mockito.BDDMockito;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @author sskma
 * @Created 04/10/2024 - 1:39 AM
 * @project api
 */
@WebMvcTest
class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @BeforeEach
    void setUp () {
    }

    @AfterEach
    void tearDown () {
    }

    @Test
    void getUser_whenUsernameIsNotEmpty () throws Exception {
        ResultActions response = mockMvc.perform(get("/api/users/{username}", "sskma"));

        response.andExpect ( status().isOk () )
                .andDo ( print () );
    }
}