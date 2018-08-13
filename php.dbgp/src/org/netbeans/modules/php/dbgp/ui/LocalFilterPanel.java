/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.netbeans.modules.php.dbgp.ui;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.netbeans.modules.php.dbgp.models.VariablesModelFilter;
import org.netbeans.modules.php.dbgp.models.VariablesModelFilter.FilterType;

/**
 *
 * @author den
 */
public class LocalFilterPanel extends javax.swing.JPanel {
    private static final long serialVersionUID = -523385854753396290L;

    /**
     * Creates new form LocalFilterPanel.
     */
    public LocalFilterPanel() {
        initComponents();
        init();
    }

    public FilterType[] getSelectedTypes() {
        List<FilterType> result = new LinkedList<>();
        if (myScalars.isSelected()) {
            result.add(FilterType.SCALARS);
        }
        if (myArray.isSelected()) {
            result.add(FilterType.ARRAY);
        }
        if (myObject.isSelected()) {
            result.add(FilterType.OBJECT);
        }
        if (myResource.isSelected()) {
            result.add(FilterType.RESOURCE);
        }
        if (myNull.isSelected()) {
            result.add(FilterType.NULL);
        }
        if (myUninit.isSelected()) {
            result.add(FilterType.UNINIT);
        }
        if (mySuperglobal.isSelected()) {
            result.add(FilterType.SUPERGLOBALS);
        }
        return result.toArray(new FilterType[result.size()]);
    }

    private void init() {
        FilterType[] types = VariablesModelFilter.getFilters();
        if (types == null) {
            return;
        }
        Set<FilterType> set = new HashSet<>(Arrays.asList(types));
        myScalars.setSelected(set.contains(FilterType.SCALARS));
        myArray.setSelected(set.contains(FilterType.ARRAY));
        myObject.setSelected(set.contains(FilterType.OBJECT));
        myResource.setSelected(set.contains(FilterType.RESOURCE));
        myNull.setSelected(set.contains(FilterType.NULL));
        myUninit.setSelected(set.contains(FilterType.UNINIT));
        mySuperglobal.setSelected(set.contains(FilterType.SUPERGLOBALS));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mySelectLbl = new javax.swing.JLabel();
        myScalars = new javax.swing.JCheckBox();
        myArray = new javax.swing.JCheckBox();
        myObject = new javax.swing.JCheckBox();
        myResource = new javax.swing.JCheckBox();
        myNull = new javax.swing.JCheckBox();
        myUninit = new javax.swing.JCheckBox();
        mySuperglobal = new javax.swing.JCheckBox();

        org.openide.awt.Mnemonics.setLocalizedText(mySelectLbl, org.openide.util.NbBundle.getMessage(LocalFilterPanel.class, "LBL_Select")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(myScalars, org.openide.util.NbBundle.getMessage(LocalFilterPanel.class, "LBL_Scalars")); // NOI18N
        myScalars.setActionCommand(org.openide.util.NbBundle.getMessage(LocalFilterPanel.class, "LBL_Scalars")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(myArray, org.openide.util.NbBundle.getMessage(LocalFilterPanel.class, "LBL_Array")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(myObject, org.openide.util.NbBundle.getMessage(LocalFilterPanel.class, "LBL_Object")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(myResource, org.openide.util.NbBundle.getMessage(LocalFilterPanel.class, "LBL_Resource")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(myNull, org.openide.util.NbBundle.getMessage(LocalFilterPanel.class, "LBL_Null")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(myUninit, org.openide.util.NbBundle.getMessage(LocalFilterPanel.class, "LBL_Uninit")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(mySuperglobal, org.openide.util.NbBundle.getMessage(LocalFilterPanel.class, "LBL_Superglobal")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mySelectLbl)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(myArray)
                            .addComponent(myScalars)
                            .addComponent(myObject)
                            .addComponent(myResource)
                            .addComponent(myNull)
                            .addComponent(myUninit)
                            .addComponent(mySuperglobal))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mySelectLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(myScalars)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(myArray)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(myObject)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(myResource)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(myNull)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(myUninit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mySuperglobal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mySelectLbl.getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(LocalFilterPanel.class, "LocalFilterPanel.mySelectLbl.AccessibleContext.accessibleName")); // NOI18N
        mySelectLbl.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(LocalFilterPanel.class, "LocalFilterPanel.mySelectLbl.AccessibleContext.accessibleDescription")); // NOI18N
        myScalars.getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(LocalFilterPanel.class, "A11_Scalars")); // NOI18N
        myScalars.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(LocalFilterPanel.class, "LocalFilterPanel.myScalars.AccessibleContext.accessibleDescription")); // NOI18N
        myArray.getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(LocalFilterPanel.class, "A11_Array")); // NOI18N
        myArray.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(LocalFilterPanel.class, "LocalFilterPanel.myArray.AccessibleContext.accessibleDescription")); // NOI18N
        myObject.getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(LocalFilterPanel.class, "A11_Object")); // NOI18N
        myObject.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(LocalFilterPanel.class, "LocalFilterPanel.myObject.AccessibleContext.accessibleDescription")); // NOI18N
        myResource.getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(LocalFilterPanel.class, "A11_Resource")); // NOI18N
        myResource.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(LocalFilterPanel.class, "LocalFilterPanel.myResource.AccessibleContext.accessibleDescription")); // NOI18N
        myNull.getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(LocalFilterPanel.class, "A11_Null")); // NOI18N
        myNull.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(LocalFilterPanel.class, "LocalFilterPanel.myNull.AccessibleContext.accessibleDescription")); // NOI18N
        myUninit.getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(LocalFilterPanel.class, "A11_Uninit")); // NOI18N
        myUninit.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(LocalFilterPanel.class, "LocalFilterPanel.myUninit.AccessibleContext.accessibleDescription")); // NOI18N
        mySuperglobal.getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(LocalFilterPanel.class, "A11_Superglobal")); // NOI18N
        mySuperglobal.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(LocalFilterPanel.class, "LocalFilterPanel.mySuperglobal.AccessibleContext.accessibleDescription")); // NOI18N

        getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(LocalFilterPanel.class, "LocalFilterPanel.AccessibleContext.accessibleName")); // NOI18N
        getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(LocalFilterPanel.class, "LocalFilterPanel.AccessibleContext.accessibleDescription")); // NOI18N
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox myArray;
    private javax.swing.JCheckBox myNull;
    private javax.swing.JCheckBox myObject;
    private javax.swing.JCheckBox myResource;
    private javax.swing.JCheckBox myScalars;
    private javax.swing.JLabel mySelectLbl;
    private javax.swing.JCheckBox mySuperglobal;
    private javax.swing.JCheckBox myUninit;
    // End of variables declaration//GEN-END:variables

}