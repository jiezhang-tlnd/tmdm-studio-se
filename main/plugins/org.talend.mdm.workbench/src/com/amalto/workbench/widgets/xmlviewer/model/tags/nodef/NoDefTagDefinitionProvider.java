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
package com.amalto.workbench.widgets.xmlviewer.model.tags.nodef;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import com.amalto.workbench.widgets.xmlviewer.model.XMLNode;
import com.amalto.workbench.widgets.xmlviewer.model.tags.TagTypeDefinition;
import com.amalto.workbench.widgets.xmlviewer.model.tags.XMLTagDefinitionProvider;
import com.amalto.workbench.widgets.xmlviewer.utils.XMLViewUtils;

/**
 * Defines for each tag which other tags and attributes could contain based on
 * the already written tags
 */
public class NoDefTagDefinitionProvider implements XMLTagDefinitionProvider {
	private Map<String, Collection<String>> tagsContainersMapping = new HashMap<String, Collection<String>>();
	private Map<String, Collection<String>> tagsAttributeMapping = new HashMap<String, Collection<String>>();
	private Map<String, TagTypeDefinition> tags = new HashMap<String, TagTypeDefinition>();

	public TagTypeDefinition getTagDefinition(XMLNode node) {
		String tagName = node.getTagName();
		TagTypeDefinition tag = this.tags.get(tagName);
		if (tag == null) {
			tag = new NoDefTagTypeDefinition(tagName, this.tags, this.tagsContainersMapping, this.tagsAttributeMapping);
			this.tags.put(tagName, tag);
		}
		return tag;
	}

	public void addReference(String tagContainer, String tagContained) {
		if (!XMLViewUtils.isEmpty(tagContainer)) {
			this.getInnerTagsIn(tagContainer).add(tagContained);
		}
	}

	private Collection<String> getInnerTagsIn(String tagName) {
		if (tagName == null || tagName.length() == 0) {
			tagName = "ROOT";
		}
		Collection<String> innerTags = this.tagsContainersMapping.get(tagName);
		if (innerTags == null) {
			innerTags = new HashSet<String>();
			this.tagsContainersMapping.put(tagName, innerTags);
		}
		return innerTags;
	}

	private Collection<String> getAttibutes(String tagName) {
		Collection<String> attributes = this.tagsAttributeMapping.get(tagName);
		if (attributes == null) {
			attributes = new HashSet<String>();
			this.tagsAttributeMapping.put(tagName, attributes);
		}
		return attributes;
	}

	public void addAllAttributes(String tagName, Collection<String> attributes) {
		this.getAttibutes(tagName).addAll(attributes);
	}

	public void clear() {
		this.tagsAttributeMapping = new HashMap<String, Collection<String>>();
		this.tagsContainersMapping = new HashMap<String, Collection<String>>();
	}

}
