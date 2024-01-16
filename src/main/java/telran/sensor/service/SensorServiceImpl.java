package telran.sensor.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import telran.exceptions.NotFoundException;
import telran.sensor.dto.Range;
import telran.sensor.model.SensorDoc;
import telran.sensor.repo.SensorRepo;
@Service
@Slf4j
@RequiredArgsConstructor

public class SensorServiceImpl implements SensorService {
	final SensorRepo sensorRepo;
	
	@Override
	public Range getSensorRange(long id) {
		SensorDoc sensorDoc = sensorRepo.findById(id)
				.orElseThrow(() -> new NotFoundException(String.format("Sensor id %d not found", id)));
		Range res = sensorDoc.getRange();
		log.debug("sensor id {}, range is {}", id, res);
		return res;
	}

}
