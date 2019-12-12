package com.choppeabarrock.backend.controllers.exceptions;

import lombok.Builder;

@Builder
public class ResourceNotFoundException extends RuntimeException {
	String code;
	String message;

}
