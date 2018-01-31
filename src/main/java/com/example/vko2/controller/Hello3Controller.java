package com.example.vko2.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.vko2.domain.Friend;

@Controller
public class Hello3Controller {
	ArrayList<Friend> friends=new ArrayList<Friend>();
	
@RequestMapping(value="/index", method=RequestMethod.GET)
public String showList(@ModelAttribute Friend friend, Model model){
	
	Friend friend1 = new Friend("Matti Meikäläinen");
	Friend friend2 = new Friend("Maija Mehiläinen");
	friends.add(friend1);
	friends.add(friend2);
	
	model.addAttribute("friends", friends);
	return "hello3";
}


@RequestMapping(value="/index", method=RequestMethod.POST)
public String greetingSubmit(@ModelAttribute Friend friend, Model model) {
	Friend kamut = new Friend(friend.getName());
	friends.add(kamut);
    model.addAttribute("friends", friends);
    return "hello3";
}

}
