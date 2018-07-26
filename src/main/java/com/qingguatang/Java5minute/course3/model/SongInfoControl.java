package com.qingguatang.Java5minute.course3.model;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SongInfoControl {
    @RequestMapping(value = "/songinfo")
    public String index (ModelMap modelMap){
        SongInfo songInfo = new SongInfo();
        songInfo.setName("Hello");
        songInfo.setSinger("Adele");
        songInfo.setAlbumName("Hello");
        songInfo.setCommentCount(10);
        songInfo.setAlbumlmg("http://p4.music.126.net/PrO7oPvnjvH4xdujdGbf2w==/1407374890649284.jpg");
        songInfo.setLyrics("Hello, it's me<br/>你好吗 是我<br/>I was wondering if after all these years you'd like to meet<br/>我犹豫着要不要给你来电 不确定多年后你是否还愿相见");

        modelMap.addAttribute("song",songInfo);

        return "index" ;
    }
}