package verify_test;

import org.junit.Test;
import verify_test.service.EmailService;
import verify_test.service.PassengerRepository;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class TrainBarriersTest {

    @Test
    public void passengerEntry() {
        PassengerRepository repository = mock(PassengerRepository.class);
        EmailService service = mock(EmailService.class);
        TrainBarriers barriers = new TrainBarriers(repository, service);
        int passengerId = 199;
        barriers.passengerEntry(passengerId);
        // notice: this only traces method calls stored with a MOCKed class!
        verify(repository).registerPassengerOnTrain(passengerId);
        verify(service).notifyPassenger(passengerId);

    }

}