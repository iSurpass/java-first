package com.qingguatang.Java5minute.course3;

import com.qingguatang.Java5minute.course3.model.SongInfo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Controller
public class SongInfoControl {

    private static Map<String,SongInfo>songInfoMap = new HashMap<>();

    @RequestMapping(value = "/songinfo")
    public String index (String songId,ModelMap modelMap){
        if(songId==null){
            songId = "3587388";
        }

        SongInfo songInfo = songInfoMap.get(songId);


       /* SongInfo songInfo = new SongInfo();
        songInfo.setName("Hello");
        songInfo.setSinger("Adele");
        songInfo.setAlbumName("Hello");
        songInfo.setCommentCount(10);
        songInfo.setAlbumImg("http://p1.music.126.net/PrO7oPvnjvH4xdujdGbf2w==/1407374890649284.jpg?param=130y130");
        songInfo.setLyrics("Hello, it's me<br/>你好吗 是我<br/>I was wondering if after all these years you'd like to meet<br/>我犹豫着要不要给你来电 不确定多年后你是否还愿相见");
       */
        modelMap.addAttribute("song",songInfo);

        return "index" ;
    }


    @RequestMapping(value = "/songinfo/get")
    @ResponseBody
    public SongInfo get(String songId){
        SongInfo songInfo = songInfoMap.get(songId);
        return songInfo;
    }

    @PostConstruct
    public void init(){
        SongInfo songInfo = new SongInfo();
        songInfo.setId("35847388");
        songInfo.setName("Hello");
        songInfo.setSinger("Adele");
        songInfo.setAlbumName("Hello");
        songInfo.setCommentCount(10);
        songInfo.setAlbumImg("http://p1.music.126.net/PrO7oPvnjvH4xdujdGbf2w==/1407374890649284.jpg?param=130y130");
        songInfo.setLyrics("Hello, it's me<br/>你好吗 是我<br/>I was wondering if after all these years you'd like to meet<br/>我犹豫着要不要给你来电 不确定多年后你是否还愿相见");
        songInfoMap.put("35847388",songInfo);

        songInfo = new SongInfo();
        songInfo.setId("16435049");
        songInfo.setName("Someone like you");
        songInfo.setSinger("Adele");
        songInfo.setAlbumName("Someone like you");
        songInfo.setCommentCount(98);
        songInfo.setAlbumImg("http://p1.music.126.net/-g2ieFBmoy7T8crwFaAdxQ==/109951163077007716.jpg?param=130y130");
        songInfo.setLyrics("I heard<br/>听说<br/>That you are settled down<br/>你已定下来<br/>That you found a girl<br/>找到了一个女孩<br/>And your married<br/>现在结婚了");
        songInfoMap.put("16435049",songInfo);
    }


}


