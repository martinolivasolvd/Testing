package net.phptravels.gui.utils;

import com.qaprosoft.carina.core.foundation.utils.R;
import org.apache.commons.io.FilenameUtils;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.logging.Logger;

import static com.zebrunner.agent.core.webdriver.RemoteWebDriverFactory.getDriver;

public class TakeScreenshot {
    private final static Logger LOGGER = (Logger) LogManager.getLogger(TakeScreenshot.class);

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


