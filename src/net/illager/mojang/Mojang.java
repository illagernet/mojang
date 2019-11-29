package net.illager.mojang;

import org.bukkit.plugin.java.annotation.plugin.Plugin;
import org.bukkit.plugin.java.annotation.plugin.Description;
import org.bukkit.plugin.java.annotation.plugin.author.Author;
import org.bukkit.plugin.java.annotation.plugin.Website;
import org.bukkit.plugin.java.annotation.plugin.ApiVersion;
import org.bukkit.plugin.java.JavaPlugin;

import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.HttpEntity;
import org.apache.http.util.EntityUtils;
import com.google.code.gson.Gson;

@Plugin(name = "Mojang", version = "1.0.0-beta")
@Description("Serves as a wrapper for the Mojang API. This plugin has no inate functionality.")
@Author("Illager Net")
@Website("https://illager.net")
@ApiVersion(ApiVersion.Target.v1_13)
public class Mojang extends JavaPlugin {

    /**
     * Reusable gson parser
     */
    private static final Gson gson = new Gson();
    
    /**
     * Reusable HTTP client
     */
    private final CloseableHttpClient client = HttpClients.createDefault();

    /**
     * Bukkit plugin enable hook.
     * Not used.
     */
    @Override
    public void onEnable() {}

    /**
     * Bukkit plugin disable hook.
     * Not used.
     */
    @Override
    public void onDisable() {}
    
    /**
     * Make a request over HTTP.
     * @param request an HTTP request instance
     * @return the response as a string
     */
    private static String makeRequest(HttpGet request) {
        try(CloseableHttpResponse response = client.execute(request)) {
            HttpEntity entity = response.getEntity();
            if(entity != null)
                return EntityUtils.toString(entity);
        }
        return null
    }
    
    /**
     * Fetch, parse, and wrap server statuses
     * @return a statuses wrapper object
     */
    public static Status[] getStatus() {
        HttpGet request = new HttpGet("https://status.mojang.com/check");
        String response = Mojang.makeRequest(request);
        return new Statuses(gson.fromJson(response, Status.class));
    }
}
