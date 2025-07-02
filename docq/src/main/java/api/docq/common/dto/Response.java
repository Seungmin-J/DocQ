package api.docq.common.dto;

import org.springframework.http.HttpStatus;

public interface Response<T> {

    static <T> Response<T> ok(T data) {
        return new DefaultResponse<>(HttpStatus.OK, data);
    }

    static <T> Response<T> failed(String message) {
        return new FailedResponse<>(message);
    }
}
