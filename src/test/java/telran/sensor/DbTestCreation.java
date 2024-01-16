package telran.sensor;

import java.util.List;
import java.util.stream.IntStream;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import telran.sensor.dto.Range;
import telran.sensor.dto.Sensor;
import telran.sensor.model.SensorDoc;
import telran.sensor.repo.SensorRepo;

@Component
@RequiredArgsConstructor
@AllArgsConstructor
public class DbTestCreation {
	
	final SensorRepo sensorRepo;
	
	final static long ID_1 = 1l;
	final static long ID_2 = 2l;
	final static long ID_3 = 3l;
	
	final static double RANGE_1_MIN = 10.0;
	final static double RANGE_1_MAX = 19.0;
	final static double RANGE_2_MIN = 20.0;
	final static double RANGE_2_MAX = 29.0;
	final static double RANGE_3_MIN = 30.0;
	final static double RANGE_3_MAX = 39.0;
	
	Range RANGE_1 = new Range(RANGE_1_MIN, RANGE_1_MAX);
	Range RANGE_2 = new Range(RANGE_2_MIN, RANGE_2_MAX);
	Range RANGE_3 = new Range(RANGE_3_MIN, RANGE_3_MAX);
	
	Sensor[] sensors = {
			new Sensor(ID_1, RANGE_1),
			new Sensor(ID_2, RANGE_2),
			new Sensor(ID_3, RANGE_3)
	};
	
	public void createDB() {
		sensorRepo.deleteAll();
		IntStream.range(0, sensors.length).forEach(i -> sensorRepo.save(SensorDoc.of(sensors[i])));
				
	}
	
	public Sensor getSensor(long id) {
		return sensors[(int) (id - 1)];
	}
	
	
}
