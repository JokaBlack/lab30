package com.company;

public enum State {
    IN_DRIVE("in drive"){
        @Override
        public State replaceState() {
            return IN_THE_PARKING;
        }
    },
    IN_THE_PARKING("parking") {
        @Override
        public State replaceState() {
            return IN_DRIVE;
        }
    };

    private String value;

    public String getValue() {
        return value;
    }

    State(String value) {
        this.value = value;
    }

    public abstract State replaceState();
}
