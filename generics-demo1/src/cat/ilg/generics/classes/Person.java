package cat.ilg.generics.classes;

import java.time.LocalDate;

public class Person {

		private final String name;
		private final String surname;
		private LocalDate dateOfBith;
		
	    public Person(String name, String surname) {
	        this.name = name;
	        this.surname = surname;
	    }

	    public Person() {
	        this.name = "John";
	        this.surname = "Smith";
	    }
	    
	    
		public String getName() {
			return name;
		}

		public String getSurname() {
			return surname;
		}
	    
	    
		public LocalDate getDateOfBith() {
			return dateOfBith;
		}

		public void setDateOfBith(LocalDate dateOfBith) {
			this.dateOfBith = dateOfBith;
		}
		
		@Override
		public String toString() {
			return.this.name
		}
}
