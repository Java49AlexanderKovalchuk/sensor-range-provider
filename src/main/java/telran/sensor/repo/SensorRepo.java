package telran.sensor.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import telran.sensor.model.SensorDoc;

public interface SensorRepo extends MongoRepository<SensorDoc, Long> {

}
