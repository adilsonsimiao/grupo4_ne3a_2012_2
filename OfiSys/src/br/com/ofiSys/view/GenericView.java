/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ofiSys.view;

import br.com.ofiSys.model.dao.DaoVeiculo;
import br.com.ofiSys.annotations.ClassProperty;
import br.com.ofiSys.annotations.MethodProperty;
import br.com.ofiSys.model.entity.Cliente;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Method;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author lgvalentin
 */
public class GenericView {

    public static void showObject(Object obj) {
        final JDialog dialog = prepareDialogLayout(obj);

        insertMethodsValues(obj, (Container) dialog.getRootPane().getContentPane());

        dialog.setVisible(true);
    }

    public static void updateObject(final Object obj) {
        final JDialog dialog = prepareDialogLayout(obj);

        insertMethodsInput(obj, (Container) dialog.getRootPane().getContentPane());

        // Insere o botão para fechar o formulário
        JButton buttonClose = new JButton("Fechar");
        buttonClose.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                dialog.setVisible(false);
            }
        });
        dialog.add(buttonClose);
        
        // Insere o botão para fechar o formulário
        JButton buttonSave = new JButton("Salvar");
        buttonSave.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                //System.out.println("VJGGHJK%%$*%*GHJGHJG");
                //System.out.println(obj.toString());
                restoreInputValues(obj, dialog.getRootPane().getContentPane());
                dialog.setVisible(false);
            }
        });
        dialog.add(buttonSave);
        
        
        // Exibe o formulário
        dialog.setVisible(true);
        dialog.dispose();
    }
    
    private static void restoreInputValues(Object o, Container container){

        System.out.println("Restaurando os valores da tela");
        for (Component c : container.getComponents()) {
            System.out.println("===>" + c.getName() +':' + c.getClass().getSimpleName());
        }
    }

    private static JDialog prepareDialogLayout(Object obj) throws SecurityException {
        final JDialog dialog = new JDialog();
        dialog.setLocationRelativeTo(null);
        dialog.setModal(true);
        dialog.setLayout(new GridLayout(0,2));
        if (obj.getClass().isAnnotationPresent(ClassProperty.class)) {
            ClassProperty classProperty = obj.getClass().getAnnotation(ClassProperty.class);
            dialog.setSize(classProperty.width(), classProperty.height());
            dialog.setTitle(classProperty.label());
           // dialog.setBackground(classProperty.color().getColor());
        } else {
            dialog.setSize(400, obj.getClass().getDeclaredFields().length * 60);
            dialog.setTitle(obj.getClass().getSimpleName());
            dialog.setBackground(Color.PINK);
        }
        
        return dialog;
    }

    private static void insertMethodsValues(Object obj, Container container) throws SecurityException {
        for (Method m : retrieveMethods(obj)) {
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
                Object value = m.invoke(obj, null);
                container.add(new JLabel(value == null ? "(VAZIO)" : value.toString()));
            } catch (Exception ex) {
                container.add(new JLabel(ex.getMessage()));
            }
        }
    }

    private static List<Method> retrieveMethods(Object obj) {
        List<Method> result = new ArrayList<Method>();

        Method[] ms = obj.getClass().getMethods();
        orderAlphaMethods(ms);
        for (Method m : ms) {
            if (m.getName().startsWith("get") && !m.getName().endsWith("getClass")) {
                result.add(m);
            }
        }

        return result;
    }

    private static void insertMethodsInput(Object obj, Container container) throws SecurityException {
        for (Method m : retrieveMethods(obj)) {
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
                Object value = m.invoke(obj, null);
                container.add(retrieveComponentByType(m.getReturnType(), value, m.getName()));
            } catch (Exception ex) {
                container.add(new JLabel(ex.getMessage()));
            }
        }
    }

    private static Component retrieveComponentByType(Class<?> type, Object value, String methodName) {
        Component result = new JLabel("TIPO NAO IMPLEMENTADO: " + type);
        if (type == String.class) {
            result = new JTextField(value.toString());
        } else if (type == Integer.class || type == int.class) {
            JFormattedTextField field = new JFormattedTextField(NumberFormat.getInstance());
            field.setValue(value);
            result = field;
        } else if (type == long.class || type == long.class) {
            JFormattedTextField field = new JFormattedTextField(NumberFormat.getInstance());
            field.setValue(value);
            result = field;
        } else if (type == Cliente.class || type == Cliente.class) {
            JFormattedTextField field = new JFormattedTextField(Object.class.getDeclaredAnnotations());
            field.setValue(value);
            result = field;
        } else if (type == Calendar.class) {
            //JCalendar não pode receber uma data NULL
            if (value == null){value = Calendar.getInstance();}
            
            JDateChooser chooser = new JDateChooser(((Calendar) value).getTime());
            result = chooser;
        }

        result.setName(methodName);
        return result;
    }

    private static void orderAlphaMethods(Method[] ms) {
        for (int i = 0; i < ms.length; i++) {
            for (int x = i + 1; x < ms.length; x++) {
                if (ms[i].getName().compareTo(ms[x].getName()) > 0) {
                    Method aux = ms[i];
                    ms[i] = ms[x];
                    ms[x] = aux;
                }
            }
        }
    }
}
