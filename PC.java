package com.coleman.computer;

public class PC {

    private Case _case;
    private Monitor monitors;
    private Motherboard motherboard;

    public PC(Case _case, Monitor monitors, Motherboard motherboard) {
        this._case = _case;
        this.monitors = monitors;
        this.motherboard = motherboard;
    }

    public Case get_case() {
        return _case;
    }

    public Monitor getMonitors() {
        return monitors;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

}
