package de.dominikschadow.clientinfo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

@RestController
public class RequestController {
    @GetMapping("/")
    public ResponseEntity<Map<String, Object>> showRequestData(HttpServletRequest request) {
        Map<String, Object> requestData = new HashMap<>();

        requestData.put("remoteUser", request.getRemoteUser());
        requestData.put("remoteAddr", request.getRemoteAddr());
        requestData.put("remoteHost", request.getRemoteHost());
        requestData.put("remotePort", request.getRemotePort());
        requestData.put("xForwardedFor", request.getHeader("X-FORWARDED-FOR"));

        return ResponseEntity.ok(requestData);
    }

    @GetMapping("/headers")
    public ResponseEntity<Map<String, String>> showAllHeaders(HttpServletRequest request) {
        Map<String, String> headers = new HashMap<>();

        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String key = headerNames.nextElement();
            String value = request.getHeader(key);
            headers.put(key, value);
        }

        return ResponseEntity.ok(headers);
    }
}
