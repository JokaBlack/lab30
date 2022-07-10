package com.company;

public enum State {
    IN_DRIVE("in drive"){
        @Override
        public void replaceState() {

        }
    },
    IN_THE_PARKING("parking") {
        @Override
        public void replaceState() {

        }
    };

    private String value;

    public String getValue() {
        return value;
    }

    State(String value) {
        this.value = value;
    }

    public abstract void replaceState();
}
