package io.jababrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class DefaultExceptionHandler extends Exception {

//	@ExceptionHandler(RuntimeException.class)
//	public ModelAndView handleException(NullPointerException ex)
//	{
//	    
//	    ModelAndView modelAndView = new ModelAndView();
//	    modelAndView.setViewName("error");
//	    modelAndView.addObject("message", ex.getMessage());
//	    return modelAndView;
//	}

//	
//	@ExceptionHandler(NullPointerException.class)
//	public ModelAndView handleException(NullPointerException ex)
//	{
//	    //Do something additional if required
//	    ModelAndView modelAndView = new ModelAndView();
//	    modelAndView.setViewName("error");
//	    modelAndView.addObject("message", ex.getMessage());
//	    return modelAndView;
//	}

	/**
	 * 
	 */

	private static final long serialVersionUID = 1L;

	@ExceptionHandler(Exception.class)
	public final ResponseEntity<ErrorMessage> somethingWentWrong(Exception e) {

		ErrorMessage exceptionResponse = new ErrorMessage(e.getMessage(), "What else do you want to add Shashank");
		return (new ResponseEntity<ErrorMessage>(exceptionResponse, new HttpHeaders(), HttpStatus.NOT_FOUND));
	}

	@ExceptionHandler(RecordNotFoundException.class)
	public final ResponseEntity<ErrorMessage> handleUserNotFoundException(RecordNotFoundException ex,
			WebRequest request) {
		
		ErrorMessage error = new ErrorMessage(ex.getMessage(), "Record Not Found Exception");
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	}
}
