
import java.util.ArrayList;
import java.util.List;

public class ValidateShipmentStatus {
    public static void main(String[] args) {
        List<StatusTest> stringList = new ArrayList<>();
        StatusTest statusTest1 = new StatusTest();
        StatusTest statusTest2 = new StatusTest();
        StatusTest statusTest3 = new StatusTest();
        StatusTest statusTest4 = new StatusTest();
        StatusTest statusTest5 = new StatusTest();
        StatusTest statusTest6 = new StatusTest();
        StatusTest statusTest7 = new StatusTest();
        StatusTest statusTest8 = new StatusTest();
        StatusTest statusTest9 = new StatusTest();
        statusTest1.setStatus("shipment_dispatched");
        statusTest2.setStatus("shipment_arrival_pickup");
        statusTest3.setStatus("shipment_pickup_dock_assigned");
        statusTest4.setStatus("shipment_loading");
        statusTest5.setStatus("shipment_ontheway");

        stringList.add(statusTest1);
        stringList.add(statusTest2);
        stringList.add(statusTest3);
        stringList.add(statusTest4);
        stringList.add(statusTest5);
        stringList.add(statusTest6);
        stringList.add(statusTest7);
        stringList.add(statusTest8);
        stringList.add(statusTest9);

        ValidateShipmentStatus.checkStatusFlow(stringList);
    }

    public static void checkStatusFlow(List<StatusTest> status) {

        String statusUpdated = "";
        int count = 0;
        for (int i = 0; i < status.size(); i++) {
            if (status.get(i).getStatus() != null) {
                if (status.get(i).getStatus().equals("shipment_dispatched")) {
                    if (status.get(i).getStatus().length() != status.size() && status.get(i + 1).getStatus() != null
                            && status.get(i + 1).getStatus().equals("shipment_arrival_pickup")) {
                        validateInput(status.get(i).getData());
                        statusUpdated = status.get(i + 1).getStatus();
                        count++;
                        continue;
                    }
                }
                if (status.get(i).getStatus().equals("shipment_arrival_pickup")) {
                    if (status.get(i).getStatus().length() != status.size() && status.get(i + 1).getStatus() != null
                            && status.get(i + 1).getStatus().equals("shipment_pickup_dock_assigned")) {
                        validateInput(status.get(i).getData());
                        statusUpdated = status.get(i + 1).getStatus();
                        count++;
                        continue;
                    }
                }
                if (status.get(i).getStatus().equals("shipment_pickup_dock_assigned") && statusUpdated.equals("shipment_pickup_dock_assigned")) {
                    if (status.get(i).getStatus().length() != status.size() && status.get(i + 1).getStatus() != null
                            && status.get(i + 1).getStatus().equals("shipment_loading")) {
                        validateInput(status.get(i).getData());
                        statusUpdated = status.get(i + 1).getStatus();
                        count++;
                        continue;
                    }
                }
                if (status.get(i).getStatus().equals("shipment_loading") && statusUpdated.equals("shipment_loading")) {
                    if (status.get(i).getStatus().length() != status.size() && status.get(i + 1).getStatus() != null
                            && status.get(i + 1).getStatus().equals("shipment_ontheway")) {
                        validateInput(status.get(i).getData());
                        statusUpdated = status.get(i + 1).getStatus();
                        count++;
                        continue;
                    }
                }
                if (status.get(i).getStatus().equals("shipment_ontheway") && statusUpdated.equals("shipment_ontheway")) {
                    if (status.get(i).getStatus().length() != status.size() && status.get(i + 1).getStatus() != null
                            && status.get(i + 1).getStatus().equals("shipment_arrival_destination")) {
                        validateInput(status.get(i).getData());
                        statusUpdated = status.get(i + 1).getStatus();
                        count++;
                        continue;
                    }
                }
                if (status.get(i).getStatus().equals("shipment_arrival_destination") && statusUpdated.equals("shipment_arrival_destination")) {
                    if (status.get(i).getStatus().length() != status.size() && status.get(i + 1).getStatus() != null
                            && status.get(i + 1).getStatus().equals("shipment_deliver_dock_assigned")) {
                        validateInput(status.get(i).getData());
                        statusUpdated = status.get(i + 1).getStatus();
                        count++;
                        continue;
                    }
                }
                if (status.get(i).getStatus().equals("shipment_deliver_dock_assigned") && statusUpdated.equals("shipment_deliver_dock_assigned")) {
                    if (status.get(i).getStatus().length() != status.size() && status.get(i + 1).getStatus() != null
                    && status.get(i + 1).getStatus().equals("shipment_unloading")) {
                        validateInput(status.get(i).getData());
                        statusUpdated = status.get(i + 1).getStatus();
                        count++;
                        continue;
                    }
                }
                if (status.get(i).getStatus().equals("shipment_unloading") && statusUpdated.equals("shipment_unloading")) {
                    if (status.get(i).getStatus().length() != status.size() && status.get(i + 1).getStatus() != null
                            && status.get(i + 1).getStatus().equals("shipment_delivered")) {
                        validateInput(status.get(i).getData());
                        statusUpdated = status.get(i + 1).getStatus();
                        count++;
                    }
                }
            }
        }

        if (count == status.size() - 1) {
            System.out.println("2121");
        }
    }

    public static void validateInput(String data) {
        if (data != null) {

        }
    }

    public static class StatusTest {
        private String status;
        private String data;

        public StatusTest() {
        }

        public StatusTest(String status, String data) {
            this.status = status;
            this.data = data;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }
    }
}
