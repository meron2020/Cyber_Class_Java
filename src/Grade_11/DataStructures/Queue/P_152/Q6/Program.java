package Grade_11.DataStructures.Queue.P_152.Q6;

import Grade_11.DataStructures.Queue.Queue;

public class Program {
    public static void availableJobs(Queue<Job> jobs, int availableTime) {
        while (!jobs.isEmpty()) {
            if (jobs.head().getJobLength() <= availableTime) {
                System.out.println(jobs.head().getCode());
                availableTime -= jobs.remove().getJobLength();
            }
            else {
                return;
            }
        }
    }
}
