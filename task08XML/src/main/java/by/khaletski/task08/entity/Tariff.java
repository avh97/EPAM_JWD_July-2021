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

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public double getPayroll() {
        return payroll;
    }

    public double getTraffic() {
        return traffic;
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
        private double insideNetwork;
        private double outsideNetwork;
        private double stationaryNetwork;

        public void setInsideNetwork(double insideNetwork) {
            this.insideNetwork = insideNetwork;
        }

        public void setOutsideNetwork(double outsideNetwork) {
            this.outsideNetwork = outsideNetwork;
        }

        public void setStationaryNetwork(double stationaryNetwork) {
            this.stationaryNetwork = stationaryNetwork;
        }

        public double getInsideNetwork() {
            return insideNetwork;
        }

        public double getOutsideNetwork() {
            return outsideNetwork;
        }

        public double getStationaryNetwork() {
            return stationaryNetwork;
        }
    }

    public class Parameters {
        private String tarificationType;
        private int favouriteNumbers;
        private double connectionFee;

        public void setTarificationType(String tarificationType) {
            this.tarificationType = tarificationType;
        }

        public void setFavouriteNumbers(int favouriteNumbers) {
            this.favouriteNumbers = favouriteNumbers;
        }

        public void setConnectionFee(double connectionFee) {
            this.connectionFee = connectionFee;
        }

        public String getTarificationType() {
            return tarificationType;
        }

        public int getFavouriteNumbers() {
            return favouriteNumbers;
        }

        public double getConnectionFee() {
            return connectionFee;
        }
    }
}

