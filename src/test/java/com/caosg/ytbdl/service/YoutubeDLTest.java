package com.caosg.ytbdl.service;

import com.caosg.ytbdl.service.dto.FormatsBean;
import com.caosg.ytbdl.service.dto.ThumbnailsBean;
import com.caosg.ytbdl.service.dto.VideoInfo;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Created by csg on 2017/7/9.
 */

public class YoutubeDLTest {
    private final String directory = System.getProperty("java.io.tmpdir");
    private final String videoUrl = "http://v.youku.com/v_show/id_XMjg0MjEzNTM4MA==.html?spm=a2hww.20023042.ykRecommend.5~5!3~5~5~A";
    private final String noneExistantvideoUrl = "https://www.youtube.com/watch?v=dQw4w9WgXcZ";

    /**@Test
    public void testUsingOwnExecutablePath() throws YoutubeDLException {
    YoutubeDL.setExecutablePath("/usr/bin/youtube-dl");
    Assert.assertNotNull(YoutubeDL.getVersion());
    }**/

    @Test
    public void testGetVersion() throws YoutubeDLException {
        Assert.assertNotNull(YoutubeDL.getVersion());
    }

    @Test
    public void testElapsedTime() throws YoutubeDLException {

        long startTime = System.nanoTime();

        YoutubeDLRequest request = new YoutubeDLRequest();
        request.setOption("version");
        YoutubeDLResponse response = YoutubeDL.execute(request);

        int elapsedTime = (int) (System.nanoTime() - startTime);

        Assert.assertTrue(elapsedTime > response.getElapsedTime());
    }




    @Test
    public void testDirectory() throws YoutubeDLException {

        YoutubeDLRequest request = new YoutubeDLRequest(videoUrl, directory);
        request.setOption("simulate");
        YoutubeDLResponse response = YoutubeDL.execute(request);

        Assert.assertEquals(directory, response.getDirectory());
    }

    @Test
    public void testGetVideoInfo() throws YoutubeDLException {
        VideoInfo videoInfo = YoutubeDL.getVideoInfo(videoUrl);
        Assert.assertNotNull(videoInfo);
    }

    @Test
    public void testGetFormats() throws YoutubeDLException {
        List<FormatsBean> formats = YoutubeDL.getFormats(videoUrl);
        Assert.assertNotNull(formats);
        Assert.assertTrue(formats.size() > 0);
    }

    @Test
    public void testGetThumbnails() throws YoutubeDLException {
        List<ThumbnailsBean> thumbnails = YoutubeDL.getThumbnails(videoUrl);
        Assert.assertNotNull(thumbnails);
        Assert.assertTrue(thumbnails.size() > 0);
    }

    @Test
    public void testGetTags() throws YoutubeDLException {
        List<String> tags = YoutubeDL.getTags(videoUrl);
        Assert.assertNotNull(tags);
        Assert.assertTrue(tags.size() > 0);
    }

    @Test
    public void testGetCategories() throws YoutubeDLException {
        List<String> categories = YoutubeDL.getCategories(videoUrl);
        Assert.assertNotNull(categories);
        Assert.assertTrue(categories.size() > 0);
    }

    @Test(expected = YoutubeDLException.class)
    public void testFailGetNonExistantVideoInfo() throws YoutubeDLException {
        YoutubeDL.getVideoInfo(noneExistantvideoUrl);
    }

}
