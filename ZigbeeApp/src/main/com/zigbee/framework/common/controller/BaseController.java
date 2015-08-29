package com.zigbee.framework.common.controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.zigbee.framework.common.exception.AppException;
import com.zigbee.framework.common.util.Utils;

public class BaseController {

	@ExceptionHandler(Exception.class)
	public String handleAppException(Exception ex, HttpServletRequest request) {

		if (ex instanceof AppException) {
			String errCode = ((AppException) ex).getErrorCode();
			if (Utils.notEmpty(errCode)) {
				request.setAttribute("errCode", errCode);
			}
		} else {
			String errMsg = ex.getMessage();
			if (Utils.notEmpty(errMsg)) {
				request.setAttribute("errCode", "system.error");
			}
			// request.setAttribute("exception", ex);
		}

		return "error";
	}

}
