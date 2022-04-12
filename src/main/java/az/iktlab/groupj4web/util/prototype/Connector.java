package az.iktlab.groupj4web.util.prototype;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Connector implements Cloneable {

    int id;
    String url;
    String username;
    String password;
    int port;

    @Override
    public Connector clone() {
        try {
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return (Connector) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
