package com.mert.homework5.util;

import com.mert.homework5.model.CharacterTemplate;
import com.mert.homework5.service.DecoderService;
import com.mert.homework5.service.EncoderService;

import java.util.Scanner;

public class CommonData {
	private static final CommonData instance = new CommonData();
	private Scanner scanner;
	private CharacterTemplate template;
	private EncoderService encoderService;
	private DecoderService decoderService;

	private CommonData() {
		super();
	}

	public DecoderService getDecoderService() {
		if (this.decoderService == null)
			this.decoderService = new DecoderService();
		return this.decoderService;
	}

	public EncoderService getEncoderService() {
		if (this.encoderService == null)
			this.encoderService = new EncoderService();
		return this.encoderService;
	}

	public CharacterTemplate getTemplate() {
		if (this.template == null)
			this.template = new CharacterTemplate();
		return this.template;
	}

	public static CommonData getInstance() {
		return CommonData.instance;
	}

	public Scanner getScanner() {
		if (this.scanner == null) {
			this.scanner = new Scanner(System.in);
		}
		return this.scanner;
	}


}
