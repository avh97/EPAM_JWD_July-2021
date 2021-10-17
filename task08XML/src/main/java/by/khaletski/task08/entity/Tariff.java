package by.khaletski.task08.entity;

public class Tariff {
    private String name;
    private String id;
    private double payroll;
    private double traffic;

    public CallPrices callPrices = new CallPrices();
    public Parameters parameters = new Parameters();

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPayroll(double payroll) {
        this.payroll = payroll;
    }

    public void setTraffic(double traffic) {
        this.traffic = traffic;
    }

    @Override
    public String toString() {
        return "\nid: " + id
                + "\nname: " + name
                + "\npayroll: " + payroll
                + "\ncallPrices: "
                + "\n\tinsideNetwork: " + callPrices.insideNetwork
                + "\n\toutsideNetwork: " + callPrices.outsideNetwork
                + "\n\tstationaryNetwork: " + callPrices.stationaryNetwork
                + "\ntraffic: " + traffic + " "
                + "\nparameters: "
                + "\n\tfavouriteNumbers: " + parameters.favouriteNumbers
                + "\n\ttarificationType: " + parameters.tarificationType
                + "\n\tconnectionFee: " + parameters.connectionFee;
    }

    public class CallPrices {
        double insideNetwork;
        double outsideNetwork;
        double stationaryNetwork;

        public void setInsideNetwork(double insideNetwork) {
            this.insideNetwork = insideNetwork;
        }

        public void setOutsideNetwork(double outsideNetwork) {
            this.outsideNetwork = outsideNetwork;
        }

        public void setStationaryNetwork(double stationaryNetwork) {
            this.stationaryNetwork = stationaryNetwork;
        }
    }

    public class Parameters {
        String tarificationType;
        int favouriteNumbers;
        double connectionFee;

        public void setTarificationType(String tarificationType) {
            this.tarificationType = tarificationType;
        }

        public void setFavouriteNumbers(int favouriteNumbers) {
            this.favouriteNumbers = favouriteNumbers;
        }

        public void setConnectionFee(double connectionFee) {
            this.connectionFee = connectionFee;
        }

    }
}

