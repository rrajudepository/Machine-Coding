package CarRentalApplication.Service;

public class User {
    int userId;
    String userName;
    String drivingLicense;
    public User(int userId, String userName, String drivingLicense){
        this.userId = userId;
        this.userName = userName;
        this.drivingLicense = drivingLicense;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDrivingLicense() {
        return drivingLicense;
    }

    public void setDrivingLicense(String drivingLicense) {
        this.drivingLicense = drivingLicense;
    }
}
