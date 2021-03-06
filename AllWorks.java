package textminingparser;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author kai
 */
public class AllWorks {
    private List<Work> works = new ArrayList<>();
    
    public void add(Work work) {
        works.add(work);
    }
    
    public void addAll(AllWorks aw) {
        works.addAll(aw.getAll());
    }
    
    public List<Work> getAll() {
        return works;
    }
    
    public List<Speaker> getAllSpeakers() {
        List<Speaker> res = new ArrayList<>();
        for (Work w: works) {
            res.addAll(w.getSpeakers());
        }
        Collections.sort(res, (speaker1, speaker2) -> speaker2.getNumberOfMonologues()-speaker1.getNumberOfMonologues());
        return res;
    }
    

}