package g.t.app.dto.note;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotNull;

@Data
public class NoteEditDto {

    private Long id;
    private String title;
    private String content;

}