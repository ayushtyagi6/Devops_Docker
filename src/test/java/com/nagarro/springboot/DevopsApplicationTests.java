package com.nagarro.springboot;

import org.junit.jupiter.api.Test;
import com.nagarro.springboot.controller.NameController;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;


@ExtendWith(MockitoExtension.class)
class DevopsApplicationTests {

	@InjectMocks
    private NameController nameController;

    @Test
    public void testDemoReply() {
        String expected = "Ayush Tyagi";
        String actual = nameController.getName();
        assertEquals(expected, actual);
    }

}