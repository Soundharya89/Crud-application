package Example.controller;

import Example.model.Bus;
import Example.repository.BusRepository;
import Example.service.BusService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bus")
public class BusController {
    private BusService busService;

    public BusController(BusService busService)
    {
        super();
        this.busService=busService;
    }
    //adding the bus detail
    @PostMapping("/addbus")
    public ResponseEntity<Bus> addBus(@RequestBody Bus bus)
    {
       return new ResponseEntity<Bus>(busService.addBus(bus), HttpStatus.CREATED);
    }

    @GetMapping("/get-all-bus")
    public List<Bus> getAllBus(){
        return busService.getAllBus();
    }

}
