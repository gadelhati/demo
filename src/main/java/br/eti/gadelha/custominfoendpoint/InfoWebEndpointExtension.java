package br.eti.gadelha.custominfoendpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.web.WebEndpointResponse;
import org.springframework.boot.actuate.endpoint.web.annotation.EndpointWebExtension;
import org.springframework.boot.actuate.info.InfoEndpoint;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@EndpointWebExtension(endpoint = InfoEndpoint.class)
public class InfoWebEndpointExtension {

    @Autowired
    private InfoEndpoint infoEndpoint;

    @ReadOperation
    public WebEndpointResponse <Map> info(){
        Map<String, Object> info = this.infoEndpoint.info();
        Integer status = getStatus(info);
        Map<String, Object> customInfo = new HashMap<>(info);
        Map<String, Object> app = (Map <String, Object>) customInfo.get("app");
        app.put("customApp", "customInfo");
        customInfo.put("customInfo", "handOn");
        return new WebEndpointResponse<>(customInfo, status);
    }
    private Integer getStatus(Map<String, Object> info) {
        return 200;//getStatus(info);
    }
}