package com.marvin.spring.web;

import com.marvin.spring.config.RootConfig;
import com.marvin.spring.data.SpittleRepository;
import com.marvin.spring.model.Spittle;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RootConfig.class})
public class SpittleControllerTest {
    @Test
    public void testSpittles() throws Exception {
        List<Spittle> result = createSpittleList(20);
        SpittleRepository repository = mock(SpittleRepository.class);
        when(repository.findSpittles(Long.MAX_VALUE, 20)).thenReturn(result);

        SpittleController controller = new SpittleController(repository);
        MockMvc mockMvc = standaloneSetup(controller).build();
        mockMvc.perform(get("/spittles"))
                .andExpect(view().name("spittle"))
                .andExpect(model().attributeExists("spittleList"))
                .andExpect(model().attribute("spittleList", result));
    }

    private List<Spittle> createSpittleList(int count) {
        List<Spittle> result = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            result.add(new Spittle("Spittle" + i, new Date()));
        }
        return result;
    }
}
