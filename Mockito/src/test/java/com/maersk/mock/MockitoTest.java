package com.maersk.mock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.*;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;

public class MockitoTest {
    @InjectMocks
    MyService myService;

    //@Spy
    @Mock
    ExternalService externalService;

    @BeforeEach
    void setUp(){
        MockitoAnnotations.openMocks(this);//creating mock instance

//      externalService = Mockito.mock(ExternalService.class);//creating mock instance
//      externalService = Mockito.spy(ExternalService.class);//creating mock instance
//      myService=new MyService(externalService);//same as using @InjectMocks
    }
    @Test
    void testValidate1(){
        Mockito.when(externalService.getValidationData(anyString())).thenReturn("Value");
        assertTrue(myService.validate("Siri"));
        //checking behaviour
        Mockito.verify(externalService,Mockito.times(1)).getValidationData(anyString());
    }

    @Test
    void testValidate2(){
        Mockito.when(externalService.getValidationData(null)).thenReturn(null);
        assertThrows(RuntimeException.class,()->myService.validate(null));
    }
//when then
    @Test
    void testValidate3(){
        Mockito.when(externalService.getValidationData(null)).thenThrow(RuntimeException.class);
        assertThrows(RuntimeException.class,()->myService.validate(null));
    }

    @Test
    void testValidate4(){
        Mockito.doReturn("Value").when(externalService.getValidationData("Value"));
        Mockito.doThrow(RuntimeException.class).when(externalService.getValidationData(null));

    }
}
