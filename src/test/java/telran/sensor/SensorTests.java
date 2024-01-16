package telran.sensor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import telran.exceptions.NotFoundException;
import telran.sensor.dto.Range;
import telran.sensor.repo.SensorRepo;
import telran.sensor.service.SensorService;

@SpringBootTest
class SensorTests {
	
	@Autowired 
	SensorRepo sensorRepo;
	@Autowired
	DbTestCreation dbCreation;
	@Autowired
	SensorService sensorService;
	
	@BeforeEach
	void setUp() {
		dbCreation.createDB();
	}
	@Test
	@DisplayName("service: testing method getSensorRange")
	void getSensorRangeTest() {
		Range expected = dbCreation.getSensor(1).range();
		Range actual = sensorService.getSensorRange(1);
		System.out.println("range min :" + actual.minValue() + "range max: " + actual.maxValue());
		assertEquals(expected, actual);
		assertThrowsExactly(NotFoundException.class, () -> sensorService.getSensorRange(100));
	}

}
