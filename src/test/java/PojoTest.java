import json.Fields;
import json.Issue;
import org.testng.annotations.Test;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;public class PojoTest {

    @Test
    public void sampleTest() {
        ObjectMapper mapper = new ObjectMapper();

        Fields fields = new Fields();
        fields.setAssignee("Marina");
        fields.setIssueType("Bug");
        fields.setProject("QAAUT-5");
        fields.setSummary("Issue summary from the Automation Test");

        Issue issue = new Issue(fields);

        String jsonInString = "";
        try {
            jsonInString = mapper.writeValueAsString(issue);
            try {
                mapper.writeValue(new File("/home/mmazur/IdeaProjects/logging_from_scratch/test.json"), issue);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        System.out.println(jsonInString);
    }
}
