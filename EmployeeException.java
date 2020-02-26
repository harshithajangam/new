package com.capg;

	@SuppressWarnings("serial")
	public class EmployeeException extends RuntimeException {

		String message;

		public EmployeeException() {
				message = "";
			}

		public EmployeeException(String message) {
				this.message = message;
			}

		@Override
		public String toString() {
			return "[" + this.getClass().getName() + ":" + message + "]";
		}

		public String getMessage() {
			return super.getMessage();
		}

	}


