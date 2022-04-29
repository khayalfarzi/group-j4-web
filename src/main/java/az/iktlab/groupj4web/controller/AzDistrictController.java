package az.iktlab.groupj4web.controller;

import az.iktlab.groupj4web.client.AzDistrictClient;
import az.iktlab.groupj4web.model.District;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/districts")
public class AzDistrictController {

    private final AzDistrictClient client;

    public AzDistrictController(AzDistrictClient client) {
        this.client = client;
    }

    @GetMapping
    public District getDistricts() {
        District var = client.getDistricts();

        System.out.println(var);

        return var;
    }
}
