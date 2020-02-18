package com.java.allgemein.wissen.combinatorpattern;

import java.util.Optional;

interface AnimalValidationResult {


    static AnimalValidationResult valid() {
        return ValidationSupport.valid();
    }

    static AnimalValidationResult invalid(Reason reason) {
        return new Invalid(reason);
    }

    boolean isValid();

    Reason getReason();

     final static class Invalid implements AnimalValidationResult {

        private final Reason reason;

        Invalid(Reason reason) {
            this.reason = reason;
        }

        public boolean isValid() {
            return false;
        }


        public Reason getReason() {
            return reason;
        }


        // equals and hashCode on field reason
    }

    static final class ValidationSupport {
        private static final AnimalValidationResult valid = new AnimalValidationResult() {
            public boolean isValid() {
                return true;
            }

            public Reason getReason() {
                return Reason.SUCCESS;
            }
        };

        static AnimalValidationResult valid() {
            return valid;
        }
    }
}






