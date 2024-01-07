package client;

public class Client {
    private String fullName;
    private String documentId;
    private double Salary;
    private double creditRating;

    public Client(String fullName, String documentId, double salary, double creditRating) {
        this.fullName = fullName;
        this.documentId = documentId;
        Salary = salary;
        this.creditRating = creditRating;
    }

    public String getFullName() {
        return fullName;
    }

    public String getDocumentId() {
        return documentId;
    }

    public double getSalary() {
        return Salary;
    }

    public double getCreditRating() {
        return creditRating;
    }

    @Override
    public String toString() {
        return "Client{" +
                "fullName='" + fullName + '\'' +
                ", documentId='" + documentId + '\'' +
                ", Salary=" + Salary +
                ", creditRating=" + creditRating +
                '}';
    }
}
