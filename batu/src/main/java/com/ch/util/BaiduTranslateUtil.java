package com.ch.util;

import com.ch.base.TransApi;
import com.ch.config.BaiduProperties;
import com.ch.model.Result;
import com.ch.model.TranslateResult;
import net.sf.json.JSONObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class BaiduTranslateUtil {

    private static final Logger LOGGER = LogManager.getLogger(BaiduTranslateUtil.class);

    @Autowired
    BaiduProperties baiduProperties;


    public String translate(String param) {
        TransApi api = new TransApi(baiduProperties.getAccessKeyId(), baiduProperties.getAccessKeySecret());
        String transResult = api.getTransResult(param, "zh", "en");
        LOGGER.info(transResult);
        System.out.println(transResult);
        JSONObject jsonObject = JSONObject.fromObject(transResult);
        Map<String, Class<Result>> map = new HashMap<String, Class<Result>>();
        map.put("trans_result", Result.class);
        TranslateResult translateResult = (TranslateResult) JSONObject.toBean(jsonObject, TranslateResult.class, map);
        if (translateResult.getTrans_result().stream().findFirst().isPresent()) {
            return translateResult.getTrans_result().stream().findFirst().get().getDst();
        }
        return null;
    }
}
