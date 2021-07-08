package guru.springframework.msscbrewery.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import org.springframework.validation.BindException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@ControllerAdvice
public class MvcExceptionHandler {

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<List> validationErrorHandler(ConstraintViolationException e){
        final Set<ConstraintViolation<?>> constraintViolations = e.getConstraintViolations();
        List<String> errors = new ArrayList<>(constraintViolations.size());
        constraintViolations.forEach(constraintViolation->{
            errors.add(constraintViolation.getPropertyPath()+" : "+constraintViolation.getMessage());
        });
        return new ResponseEntity<>(errors,HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<List> handleBindException(BindException ex){
        return new ResponseEntity<>(ex.getAllErrors(),HttpStatus.BAD_REQUEST);
    }
}
