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
 * Revision 1.1  2008/07/18 20:11:01  jost
 * Neu: Formulare
 *
 **********************************************************************/
package de.jost_net.JVerein.gui.menu;

import de.jost_net.JVerein.gui.action.FormularfeldDeleteAction;
import de.willuhn.jameica.gui.parts.CheckedContextMenuItem;
import de.willuhn.jameica.gui.parts.ContextMenu;

/**
 * Kontext-Menu zu den Formularen.
 */
public class FormularfeldMenu extends ContextMenu
{

  /**
   * Erzeugt ein Kontext-Menu fuer die Liste der Formularfelder.
   */
  public FormularfeldMenu()
  {
    addItem(new CheckedContextMenuItem("L�schen...",
        new FormularfeldDeleteAction(), "user-trash.png"));
  }
}
