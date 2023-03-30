package com.company;

public class History {
    static class CalculationHistory {
        private StringBuilder history;

        public CalculationHistory() {
            history = new StringBuilder();
        }

        public void addCalculation(String calculation) {
            history.append(calculation);
            history.append("\n");
        }

        public String getCalculationHistory() {
            return history.toString();
        }
    }
}
