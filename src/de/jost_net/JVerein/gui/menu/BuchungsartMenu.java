/**********************************************************************
 * $Source$
 * $Revision$
 * $Date$
 * $Author$
 *
 * Copyright (c) by Heiner Jostkleigrewe
 * All rights reserved
 * heiner@jverein.de
 * www.jverein.de
 * $Log$
 * Revision 1.1  2008/05/22 06:50:55  jost
 * Buchführung
 *
 * Revision 1.4  2008/03/16 07:36:10  jost
 * Reaktivierung Buchführung
 *
 * Revision 1.2  2007/02/23 20:26:58  jost
 * Mail- und Webadresse im Header korrigiert.
 *
 * Revision 1.1  2006/10/14 16:11:34  jost
 * Buchungen l�schen eingef�hrt
 *
 **********************************************************************/
package de.jost_net.JVerein.gui.menu;

import de.jost_net.JVerein.gui.action.BuchungsartDeleteAction;
import de.willuhn.jameica.gui.parts.CheckedContextMenuItem;
import de.willuhn.jameica.gui.parts.ContextMenu;

/**
 * Kontext-Menu zu den Buchungsarten.
 */
public class BuchungsartMenu extends ContextMenu
{

  /**
   * Erzeugt ein Kontext-Menu fuer die Liste der Buchungsarten.
   */
  public BuchungsartMenu()
  {
    addItem(new CheckedContextMenuItem("L�schen...",
        new BuchungsartDeleteAction(), "user-trash.png"));
  }
}
