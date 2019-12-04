package momatools.gui.main;

import java.awt.GridBagConstraints;
import java.awt.Insets;

public class GuiUtils {

	public static GridBagConstraints posicionarElemento(int ipadx, int ipady, int gridx, int gridy, int gridwidth,
			int gridheight, int fill, int anchor) {

		return posicionarElemento(ipadx, ipady, gridx, gridy, gridwidth, gridheight, fill, anchor, null);
	}

	public static GridBagConstraints posicionarElemento(int ipadx, int ipady, int gridx, int gridy, int gridwidth,
			int gridheight, int fill, int anchor, Insets insets) {
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.ipadx = ipadx;
		constraints.ipady = ipady;

		constraints.gridx = gridx;
		constraints.gridy = gridy;
		constraints.gridwidth = gridwidth;
		constraints.gridheight = gridheight;
		constraints.fill = fill;
		constraints.anchor = anchor;
		if (null != insets)
			constraints.insets = insets;
		return constraints;
	}

}
