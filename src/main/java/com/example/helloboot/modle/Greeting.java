package com.example.helloboot.modle;

/**
 * Description
 * author pjt  kilde@foxmail.com
 * Date $date$ $time$
 * Param $params$
 * Return  $return$
 */
public class Greeting {

    private  final long id;
    private  final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }


}
