package Grade_11.DataStructures.Queue.P_152.Q6;

public class Job {
    private String code;
    private int jobLength;

    public Job(String code, int jobLength) {
        this.code = code;
        this.jobLength = jobLength;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getJobLength() {
        return jobLength;
    }

    public void setJobLength(int jobLength) {
        this.jobLength = jobLength;
    }
}
