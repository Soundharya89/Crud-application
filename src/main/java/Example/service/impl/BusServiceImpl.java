package Example.service.impl;

import Example.model.Bus;
import Example.repository.BusRepository;
import Example.service.BusService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusServiceImpl implements BusService {
    private BusRepository busRepository;
    public BusServiceImpl(BusRepository busRepository) {

        this.busRepository = busRepository;
    }

    @Override
    public Bus addBus(Bus bus) {
        return busRepository.save(bus);
    }

    @Override
    public List<Bus> getAllBus() {
        return busRepository.findAll();
    }
}
