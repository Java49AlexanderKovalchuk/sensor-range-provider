package telran.sensor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.RequiredArgsConstructor;
import telran.sensor.controller.SensorRangeController;
import telran.sensor.service.SensorService;
//@WebMvcTest
@SpringBootTest
@AutoConfigureMockMvc
public class SensorControllerAndServiceTest {
	public static final String HOST = "http://localhost:8080/";
	@Autowired
	SensorRangeController sensorRangeController;
	@Autowired
	DbTestCreation dBCreation;
	@Autowired
	MockMvc mockMvc;
//	@MockBean
//	SensorService sensorService;
	@Autowired
	ObjectMapper objectMapper;
	@Autowired
	SensorService sensorService;
	@Test
	void applicationContextTest() {
		assertNotNull(mockMvc);
		assertNotNull(objectMapper);
		assertNotNull(sensorService);
		assertNotNull(sensorRangeController);
	}
}
