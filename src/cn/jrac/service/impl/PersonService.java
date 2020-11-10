package cn.jrac.service.impl;

import cn.jrac.service.IPersonService;

public class PersonService implements IPersonService {

    /**
     * 说话
     *
     * @param content
     * @return
     */
    public String toSay(String content) {
        System.out.printf("say:%s", content);
        return content;
    }

}
