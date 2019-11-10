package com.example.consumingrestservice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ConsumingRestServiceApplicationTests {

    @Autowired
    private RestTemplate restTemplate;

/*
    @Mock
    private Appender appender;

    @Captor
    private ArgumentCaptor<LoggingEvent> loggingEventArgumentCaptor;

    @Before
    public void setup() {
        final Logger logger = (Logger) LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME);
        logger.addAppender(appender);
    }

    @After
    public void teardown() {
        final Logger logger = (Logger) LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME);
        logger.detachAppender(appender);
    }
*/

    @Test
    public void contextLoads() {
        assertThat(restTemplate).isNotNull();
    }

/*
    @Test
    public void shouldLogQuote() {
        // given
        Value value = getValue();
        Quote quote = getQuote(value);
//        when(restTemplate.getForObject("https://gturnquist-quoters.cfapps.io/api/random", Quote.class))
//                .thenReturn(quote);
//        when(ConsumingRestServiceApplication.log.info(any())).getMock();
//        ConsumingRestServiceApplication.log.info(quote.toString());

//        given(log.info(any()))
//		ConsumingRestServiceApplication application = new ConsumingRestServiceApplication();
//
//        application.run(restTemplate);

        verify(appender).doAppend(loggingEventArgumentCaptor.capture());
        final LoggingEvent loggingEvent = loggingEventArgumentCaptor.getValue();
        org.junit.Assert.assertThat(loggingEvent.getLevel(), is(Level.INFO));
        org.junit.Assert.assertThat(loggingEvent.getFormattedMessage(), is(quote.toString()));
    }

    private Value getValue() {
        Value value = new Value();

        value.setId(1L);
        value.setQuote("Learning Spring Boot");

        return value;
    }

    private Quote getQuote(Value value) {
        Quote quote = new Quote();

        quote.setType("success");
        quote.setValue(value);

        return quote;
    }
*/

}