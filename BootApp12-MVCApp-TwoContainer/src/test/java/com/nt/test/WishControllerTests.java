package com.nt.test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Matchers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.nt.controller.WishController;
import com.nt.service.WishService;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = WishController.class)
public class WishControllerTests {
	@Autowired
	public MockMvc mvc;
	@MockBean
	public WishService mockService;

	@Before
	public void setup() {

	}

	@Test
	public void testShowForm() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/home.htm"))
		.andExpect(view().name("welcome"))
		.andExpect(MockMvcResultMatchers.view().name("welcome"))
		.andDo(print());
	}

	@Test
	public void testProcessForm() throws Exception {
		assertThat(this.mockService).isNotNull();
		mvc.perform(MockMvcRequestBuilders.get("/wish.htm"))
		//.andExpect(status().isOk())
		//.andExpect(view().name("wish"))
		.andExpect(content().string(Matchers.contains("Good noon"))).andDo(print());
	}

}
