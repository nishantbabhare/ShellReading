package com.shellreader.config;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SchedullingShellTask {

	private static final Logger log = LoggerFactory.getLogger(SchedullingShellTask.class);

	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

	@Scheduled(cron = "0 0/2 * * * ?")
	public void reportCurrentTime() {
		log.info("The time is now {}", dateFormat.format(new Date()));
		String[] cmd=new String[] {"/Users/nishantbabhare/Documents/Practice Workspace/ShellReading/src/main/resources/test.sh"};
		ProcessBuilder pb=new ProcessBuilder(cmd);
		try {
			Process p=pb.start();
			BufferedReader reader= new BufferedReader(new InputStreamReader(p.getInputStream()));
			String inputString=null;
			while((inputString=reader.readLine())!=null) {
				System.out.println(inputString);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}