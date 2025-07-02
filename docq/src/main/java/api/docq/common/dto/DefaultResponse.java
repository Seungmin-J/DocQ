package api.docq.common.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
@RequiredArgsConstructor
public class DefaultResponse<T> implements Response<T> {
    private final HttpStatus status;
    private final T data;
}
