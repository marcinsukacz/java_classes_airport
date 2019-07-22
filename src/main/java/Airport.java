public enum Airport {
    GLASGOW("GLA"),
    EDINBURGH("EDI"),
    BARRA("BRR"),
    POZNAN("POZ"),
    GDANSK("GDN");

    private final String code;

    Airport(String code) {

        this.code = code;
    }

    public String getCode() {

        return code;
    }
}
