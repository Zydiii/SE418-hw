package hello;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.Set;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//import static hello.WordLadderController.loadDict;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class WordLadderControllerTest {

//    MockMvc mockMvc;
//    Set<String> dict = loadDict("static/dictionary.txt");
//
//    @Autowired
//    WebApplicationContext wc;
//
//    @Before
//    public void beforeSetUp() {
//        this.mockMvc = MockMvcBuilders.webAppContextSetup(wc).build();
//    }
//
//    @Test
//    public void testReturnedAns() throws Exception {
//        String start = "happy";
//        String end = "money";
//
//        MvcResult result = this.mockMvc.perform(get("/WordLadder/Search").param("word1", start).param("word2", end)).andDo(print()).andExpect(status().isOk())
//                .andReturn();
//
//        WordLadder ladder_test = new WordLadder(start, end, dict, 1);
//
//        String str = result.getResponse().getContentAsString();
//        JSONObject jsonObject = JSONObject.fromObject(str);
//        WordLadder ladder_res = (WordLadder) JSONObject.toBean(jsonObject, WordLadder.class);
//
//        Assert.assertEquals(ladder_test.getWords(), ladder_res.getWords());
//    }
}
