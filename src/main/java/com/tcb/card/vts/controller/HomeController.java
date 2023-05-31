package com.tcb.card.vts.controller;

import com.tcb.card.vts.model.StepUpResBody;
import com.tcb.card.vts.model.StepUpReqBody;
import com.tcb.card.vts.service.TokenUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HomeController {

    // Khi user truy cập vào endpoint / thì homepage() được gọi
    @RequestMapping(value = "/stepup", method = RequestMethod.POST)
    public ResponseEntity<StepUpResBody> stepUp(@RequestBody StepUpReqBody body) {
        if(body == null){
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }

        TokenUtils tokenUtils = new TokenUtils();
        String test = tokenUtils.decode("Tmd1eWVuIENvbmcgVGhhbmg");
        System.out.println(test);

        System.out.println(body.token);
        StepUpResBody stepUpResBody = new StepUpResBody();
        return new ResponseEntity<>(stepUpResBody, HttpStatus.OK);
    }

}
