/*
 *  Freeplane - mind map editor
 *  Copyright (C) 2008 Joerg Mueller, Daniel Polansky, Christian Foltin, Dimitry Polivaev
 *
 *  This file is to be deleted.
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 2 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.freeplane.core.ui;

import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;

import org.freeplane.core.controller.Controller;
import org.freeplane.core.model.NodeModel;

/**
 * @author Dimitry Polivaev
 */
public abstract class MultipleNodeAction extends AFreeplaneAction {
	public MultipleNodeAction(final String key, final Controller controller) {
		super(key, controller);
	}

	public MultipleNodeAction(final String key, final Controller controller, final String name,
	                          final ImageIcon imageIcon) {
		super(key, controller, name, imageIcon);
	}

	public void actionPerformed(final ActionEvent e) {
		for (final NodeModel selected : getModeController().getMapController().getSelectedNodes()) {
			actionPerformed(e, selected);
		}
	}

	abstract protected void actionPerformed(ActionEvent e, NodeModel node);
}
