package ru.netology.springbootdemoap2.advice;

import org.hibernate.validator.internal.util.privilegedactions.GetMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import ru.netology.springbootdemoap2.exception.InvalidCredentials;
import ru.netology.springbootdemoap2.exception.UnauthorizedUser;

import static org.apache.logging.log4j.util.LambdaUtil.getMessage;

@RestControllerAdvice
public class ExceptionHandlerAdvice {
    @ExceptionHandler(InvalidCredentials.class)
    public ResponseEntity<String> getAuthoritiesHandler(InvalidCredentials e){
        return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
    }




    @ExceptionHandler(UnauthorizedUser.class)
    public ResponseEntity<String> userAuthoritiesHandler(UnauthorizedUser e){
        return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
    }

    }


