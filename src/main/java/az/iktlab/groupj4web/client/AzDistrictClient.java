package az.iktlab.groupj4web.client;

import az.iktlab.groupj4web.model.District;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "az-district", url = "https://api.opendata.az/v1/json/map/")
public interface AzDistrictClient {


    @GetMapping("/districts")
    District getDistricts();
}
