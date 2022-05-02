package net.phptravels.gui.utils;

import com.qaprosoft.carina.core.foundation.utils.R;
import com.qaprosoft.carina.core.foundation.webdriver.IDriverPool;
import org.apache.commons.io.FilenameUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

public class TakeScreenshotService implements IDriverPool {
    private final static Logger LOGGER = LogManager.getLogger(TakeScreenshotService.class);

    public void makeScreenshot() {
        File outputfile = new File(FilenameUtils.normalize(R.TESTDATA.get("path")+ LocalDateTime.now() + ".png"));
        BufferedImage screenshot = null;
        try {
            screenshot = ImageIO.read(((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE));
            ImageIO.write(screenshot, "PNG", outputfile);
        } catch (IOException e) {
            LOGGER.info("Unable to capture screenshot");
            e.printStackTrace();
        }
    }

    public void makeScreenshot(String fileName) {
        File outputfile = new File(FilenameUtils.normalize(R.TESTDATA.get("path") + fileName + ".png"));
        BufferedImage screenshot = null;
        try {
            screenshot = ImageIO.read(((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE));
            ImageIO.write(screenshot, "PNG", outputfile);
        } catch (IOException e) {
            LOGGER.info("Unable to capture screenshot");
            e.printStackTrace();
        }
    }
}


