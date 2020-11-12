package guru.springframework.msscbrewery.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;
import java.util.UUID;

/**
 * Created by Fernando Lima
 * at 10/11/2020
 **/

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerDto {
    @Null
    private UUID id;

    @NotNull
    @Size(min = 3, max = 100)
    private String name;
}
