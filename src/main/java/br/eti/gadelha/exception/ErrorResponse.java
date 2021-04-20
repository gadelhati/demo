package br.eti.gadelha.exception;

import lombok.AllArgsConstructor;

import java.util.List;

/**
 * @author	Marcelo Ribeiro Gadelha
 * @mail	gadelha.ti@gmail.com
 * @since	19/02/2021
 * @version 1.0
 * @link	www.gadelha.eti.br
 **/

@AllArgsConstructor
public class ErrorResponse {

    private final String message;
    private final int code;
    private final String status;
    private final String objectName;
    private final List<ErrorObject> errors;
}