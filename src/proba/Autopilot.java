package proba;

public class Autopilot {
    private String softwareVersion;

    public Autopilot(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    public String getSoftwareVersion() {
        return softwareVersion;
    }

    @Override
    public String toString() {
        return "Autopilot: {" +
                "SV='" + softwareVersion + '\'' +
                '}';
    }

    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }
}
