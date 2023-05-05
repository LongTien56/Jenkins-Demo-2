package practive.practive.dto;

import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Data
@Builder
public class ClubDTO {

    private Long id;
    private String title;
    private String photoUrl;
    private String content;
    private LocalDateTime createOn;
    private LocalDateTime updateOn;
}
