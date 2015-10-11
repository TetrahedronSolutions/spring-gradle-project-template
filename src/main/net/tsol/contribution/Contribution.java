package net.tsol.contribution;

import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@JsonIgnoreProperties
@Data
public class Contribution {
    @NotNull
    private String name;
    private String url;
}
