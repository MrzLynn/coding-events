package org.launchcode.codingevents.controllers;

import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("events")
public class EventController {
    private static List<String> events = new ArrayList<>();

    HashMap<String, String> events1 = new HashMap<String, String>();
    events1.put("Strangeloop", "A Big coding evet in STL at the Stifel.");
    events1.put("Battle of the Bagels", "A showdown for the yummiest bread in town.");
    events1.put("Meshuggah", "BYO Pretzels");

    return events1;
//    @GetMapping
//    public String displayAllEvents(Model model){
//        List<String> events = new ArrayList<>();
//        model.addAttribute("events",events);
//        return "events/index";


    //lives at /events/create
    @GetMapping("create")
    public String renderCreateEventForm(){
        return "events/create";
    }

    //lives at /events/create
    @PostMapping("create")
    public String createEvent(@RequestParam String eventName){
        events.add(eventName);
        return "redirect:";
    }

}
