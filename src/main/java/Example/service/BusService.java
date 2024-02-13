package Example.service;

import Example.model.Bus;

import java.util.List;

public interface BusService {
    Bus addBus(Bus bus);
    List<Bus> getAllBus();
}
