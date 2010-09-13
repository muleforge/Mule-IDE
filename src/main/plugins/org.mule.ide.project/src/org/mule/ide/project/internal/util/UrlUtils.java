package org.mule.ide.project.internal.util;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class UrlUtils
{
    /**
     * @return new {@link URL} instance from the given <code>url</code> String. Wrap any 
     * {@link MalformedURLException} into a {@link RuntimeException}.
     */
    public static URL urlFromString(String url)
    {
        try
        {
            return new URL(url);
        }
        catch (MalformedURLException e)
        {
            throw new RuntimeException(e);
        }
    }
    
    public static String filename(URL url)
    {
        String path = url.getPath();
        return new File(path).getName();
    }
    
    /**
     * this is a static helper class, do not create instances from it
     */
    private UrlUtils()
    {
        super();
    }
}
