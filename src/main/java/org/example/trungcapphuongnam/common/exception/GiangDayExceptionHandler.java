package org.example.trungcapphuongnam.module.giangDay.exception;

import org.example.trungcapphuongnam.common.response.ApiResponse;
import org.example.trungcapphuongnam.module.giangDay.util.ApiResponseUtil;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice(basePackages = "org.example.trungcapphuongnam.module.giangDay")
public class GiangDayExceptionHandler {

    @ExceptionHandler(GiangDayNotFoundException.class)
    public ResponseEntity<ApiResponse<Void>> handleNotFound(GiangDayNotFoundException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ApiResponseUtil.error(ex.getMessage(), null));
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<ApiResponse<Void>> handleBadRequest(IllegalArgumentException ex) {
        return ResponseEntity.badRequest().body(ApiResponseUtil.error(ex.getMessage(), null));
    }
}
