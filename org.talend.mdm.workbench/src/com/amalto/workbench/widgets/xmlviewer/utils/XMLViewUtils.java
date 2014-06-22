/*****************************************************************************
 * This file is part of Rinzo
 * 
 * Author: Claudio Cancinos WWW: https://sourceforge.net/projects/editorxml Copyright (C): 2008, Claudio Cancinos
 * 
 * This program is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser General
 * Public License as published by the Free Software Foundation; either version 2 of the License, or (at your option) any
 * later version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License along with this program; If not, see
 * <http://www.gnu.org/licenses/>
 ****************************************************************************/
package com.amalto.workbench.widgets.xmlviewer.utils;
public class XMLViewUtils {

	public static boolean isEmpty(String string) {
		return string == null || string.length() == 0;
	}

	public static String getLeadingWhitespace(String str) {
		if (str == null) {
            return ""; //$NON-NLS-1$
		}

		int sz = str.length();
		StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < sz; i++) {
            if ((Character.isWhitespace(str.charAt(i)))) {
            	buffer.append(str.charAt(i));
            } else {
            	break;
            }
        }
        return buffer.toString();
	}

}
