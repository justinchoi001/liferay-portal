/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portalweb.portal.util;

/**
 * @author Brian Wing Shun Chan
 */
public class BrowserCommands {

	public static void downloadTempFile(String value) {
		if (!_BROWSER_TYPE.equals("*chrome") &&
			!_BROWSER_TYPE.equals("*firefox") &&
			!_BROWSER_TYPE.equals("*iehta") &&
			!_BROWSER_TYPE.equals("*iexplore")) {

			return;
		}

		try {
			Thread.sleep(5000);

			Runtime runtime = Runtime.getRuntime();

			String command = _BROWSER_COMMANDS_DIR + "download_file.exe";

			runtime.exec(command);

			Thread.sleep(30000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void setBrowserOption() {
		if (!_BROWSER_TYPE.equals("*chrome") &&
			!_BROWSER_TYPE.equals("*firefox")) {

			return;
		}

		try {
			Runtime runtime = Runtime.getRuntime();

			String[] commands = {
				_BROWSER_COMMANDS_DIR + "set_browser_option.exe", _OUTPUT_DIR
			};

			runtime.exec(commands);

			Thread.sleep(10000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static final String _BROWSER_COMMANDS_DIR =
		TestPropsValues.BROWSER_COMMANDS_DIR;

	private static final String _BROWSER_TYPE = TestPropsValues.BROWSER_TYPE;

	private static final String _OUTPUT_DIR = TestPropsValues.OUTPUT_DIR;

}