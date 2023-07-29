package verify_test;

import verify_test.service.EmailService;
import verify_test.service.PassengerRepository;

public class TrainBarriers {

    private PassengerRepository repository;
    private EmailService service;

    public TrainBarriers(PassengerRepository repository, EmailService service) {
        this.repository = repository;
        this.service = service;
    }

    /**
     * two features making such kind of methods difficult to test
     * 1) does nothing except making other method calls
     * 2) with void return value
     * @param passengerId
     */
    public void passengerEntry(int passengerId) {
        repository.registerPassengerOnTrain(passengerId);
        service.notifyPassenger(passengerId);
    }
}
