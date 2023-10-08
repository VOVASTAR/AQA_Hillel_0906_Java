package homeworkTest.hw31ApiPost;

public class UserDataCreate {

    private String name;
    private String job;

    public UserDataCreate() {
    }

    public UserDataCreate(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
