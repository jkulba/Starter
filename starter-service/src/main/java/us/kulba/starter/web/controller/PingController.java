package us.kulba.starter.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import us.kulba.starter.model.Ping;

/**
 * Ping is a ..
 *
 * @author James Kulba, jkulba@gmail.com
 */
@RestController
public class PingController {
    final Logger logger = LoggerFactory.getLogger(PingController.class);

    @RequestMapping("/ping")
    public @ResponseBody
    Ping ping() {

        logger.debug("Hit PingController.ping()");

        Ping p = new Ping();
        p.setApplication("Starter Service");
        p.setVersion("1.0");

        return p;

    }
}
