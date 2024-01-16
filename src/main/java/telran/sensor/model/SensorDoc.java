package telran.sensor.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import telran.sensor.dto.Range;
import telran.sensor.dto.Sensor;

@Document(collection = "sensors")
@Getter
public class SensorDoc {
	@Id
	Long id;
	Range range;

	public Sensor build() {
		return new Sensor(id, range);
	}
	public static SensorDoc of(Sensor sensor) {
		return new SensorDoc(sensor.id(), sensor.range());
	}
	
	private SensorDoc(Long id, Range range) {
		this.id = id;
		this.range = range;
	}
}
