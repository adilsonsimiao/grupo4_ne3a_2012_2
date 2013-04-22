/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ofiSys.view;

import br.com.ofiSys.model.dao.DaoVeiculo;
import br.com.ofiSys.annotations.ClassProperty;
import br.com.ofiSys.annotations.MethodProperty;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.lang.reflect.Method;
import javax.persistence.ManyToOne;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JTextField;

/**
 *
 * @author lgvalentin
 */
public class EditGenericView {

    public static void showObject(Object obj) {
        JDialog dialog = prepareDialogLayout(obj);
        
        insertMethodsValues(obj, dialog.getRootPane().getContentPane());
        
        dialog.add(new JLabel());
        JButton b = new JButton("Fechar");
        b.addActionListener(new Action() {
            public Object getValue(String key) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            public void putValue(String key, Object value) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            public void setEnabled(boolean b) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            public boolean isEnabled() {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            public void addPropertyChangeListener(PropertyChangeListener listener) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            public void removePropertyChangeListener(PropertyChangeListener listener) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            public void actionPerformed(ActionEvent e) {
                ((JDialog) ((JRootPane) ((JLayeredPane) ((JPanel) ((JButton) e.getSource()).getParent()).getParent()).getParent()).getParent()).setVisible(false);
            }
        });
        
        JButton btnEditar = new JButton("Editar");
        dialog.add(b);
        dialog.add(btnEditar);
        dialog.setVisible(true);
    }

    private static JDialog prepareDialogLayout(Object obj) throws SecurityException {
        JDialog dialog = new JDialog();
        dialog.setLocationRelativeTo(null);
        dialog.setModal(true);
        dialog.setLayout(new GridLayout(0, 2));
        if (obj.getClass().isAnnotationPresent(ClassProperty.class)) {
            ClassProperty classProperty = obj.getClass().getAnnotation(ClassProperty.class);
            dialog.setSize(classProperty.width(), classProperty.height());
            dialog.setTitle(classProperty.label());
            //dialog.setBackground(classProperty.color().getColor());
        } else {
            dialog.setSize(400, obj.getClass().getDeclaredFields().length * 60);
            dialog.setTitle(obj.getClass().getSimpleName());
            dialog.setBackground(Color.PINK);
        }
        return dialog;
    }

    private static void insertMethodsValues(Object obj, Container container) throws SecurityException {
        Method[] ms = obj.getClass().getMethods();
        Container cont = container;
        orderAlphaMethods(ms);
        for (Method m : ms) {
            if (m.getName().startsWith("get") && !m.getName().endsWith("getClass")) {
                MethodProperty anot = m.getAnnotation(MethodProperty.class);
                String labelText = m.getName().substring(3);
                Color labelColor = Color.RED;
                if (anot != null) {
                    labelText = anot.label();
                    labelColor = anot.color().getColor();
                }
                JLabel label = new JLabel(labelText + ":");
                label.setForeground(labelColor);
                container.add(label);
                try {
//                    Object value = m.invoke(obj, null);                   
//                    container.add(new JLabel(value == null ? "(VAZIO)" : value.toString()));
                     addComponent(m, cont, obj);
                } catch (Exception ex) {
                    container.add(new JLabel(ex.getMessage()));
                }
            }
        }
    }

    private static void orderAlphaMethods(Method[] ms) {
        for(int i = 0; i < ms.length; i++){
            for(int x = i + 1; x < ms.length; x++){
                if(ms[i].getName().compareTo(ms[x].getName())>0){
                    Method aux = ms[i];
                    ms[i] = ms[x];
                    ms[x] = aux;
                }
            }
        }
    }
    
    private static Object newObject;
    
  
    private static void addComponent(Method m, Container container, Object obj){
            if(m.isAnnotationPresent(MethodProperty.class)){
//            if(m.isAnnotationPresent(ManyToOne.class)){
                container.add(new JComboBox());              
            }else {
                container.add(new JTextField());
            }                             
    }
    
//    private static void invokeSetMethod(Object object, String fieldName, Object fieldValue) throws RuntimeException {
//        /* Usando REFLECTION, obtem o o método set correspondente
//        ao atual campo do dao analisado.*/
//        Method mSet = null;
//        try {
//            mSet = object.getClass().getMethod("set" + fieldName.toUpperCase().charAt(0) + fieldName.substring(1), new Class[]{this.getFieldType(fieldName)});
//            mSet.invoke(object, fieldValue);
//        } catch (Exception ex) {
//            throw new RuntimeException("Náo foi possível obter o método set ou definir o valor do campo:" + fieldName, ex);
//        }
//    }
  
    
}
