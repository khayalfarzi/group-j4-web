package az.iktlab.groupj4web.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DistrictResponse {

    public int objectId;
    public String districtId;
    public String name;
    public String nameEn;

}
