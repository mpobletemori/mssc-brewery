package guru.springframework.msscbrewery.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.UUID;

/**
 * Created by jt on 2019-04-21.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Customer {
    private UUID id;
    private String name;
}
