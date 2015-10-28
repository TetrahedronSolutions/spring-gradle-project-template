package net.tsol.contribution;

import java.util.List;

import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.experimental.Accessors;

@JsonIgnoreProperties
@Accessors(chain = true)
@Data
public class Contribution {
    @NotNull
    private List<String> names;
    private String url;
}
