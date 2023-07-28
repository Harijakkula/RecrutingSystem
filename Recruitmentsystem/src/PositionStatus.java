public enum PositionStatus {
    YET_TO_START("yts"),ARE_OPENED("ap"),COMPLETED("comp");
    private  String code;
    private PositionStatus(String code) {
        this.code=code;

    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


    void openposition(){
        PositionStatus positionStatus = PositionStatus.ARE_OPENED;
    }

    void endpositions() {
        PositionStatus positionStatus = PositionStatus.COMPLETED;
    }
}
