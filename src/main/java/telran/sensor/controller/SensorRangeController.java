package telran.sensor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import telran.sensor.dto.Range;
import telran.sensor.service.SensorService;

@RestController
@RequiredArgsConstructor
@Slf4j
public class SensorRangeController {
	final SensorService sensorService;
	
	@GetMapping("sensorRange/{id}")
	Range getRangeSensorValues(@PathVariable long id) {
		return sensorService.getSensorRange(id);
	}
	
}
