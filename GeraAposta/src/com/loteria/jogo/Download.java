package com.loteria.jogo;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

public class Download {

    private HttpClient httpCliente;
    private HttpResponse httpResponse;
    private HttpGet httpGet;
    private HttpEntity httpEntity;
    private ByteArrayOutputStream outBytes;

    public ByteArrayOutputStream downloadZip(String link) {
        httpCliente = HttpClientBuilder.create().build();
        httpGet = new HttpGet(link);
        outBytes = new ByteArrayOutputStream();
        try {
            httpResponse = httpCliente.execute(httpGet);
            httpEntity = httpResponse.getEntity();
            if (httpEntity != null) {
                httpEntity.writeTo(outBytes);
                outBytes.close();
            }
        } catch (IOException ex) {
        }
        return outBytes;
    }
}
