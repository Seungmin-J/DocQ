package api.docq.common.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@AllArgsConstructor
@RequiredArgsConstructor
public class FailedResponse<T> implements Response<T> {

    private final String message;
}
