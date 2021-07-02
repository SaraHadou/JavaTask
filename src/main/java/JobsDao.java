import java.util.List;

public interface JobsDao {
    public List<Jobs> getAllJobs();
    public Jobs getJob(String title);
    public void updateJob(Jobs student);
    public void deleteJob(Jobs student);
}