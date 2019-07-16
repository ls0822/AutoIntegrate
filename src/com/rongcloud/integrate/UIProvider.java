package com.rongcloud.integrate;

import com.rongcloud.integrate.model.ModelType;
import com.rongcloud.integrate.model.ModelUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class UIProvider {
//    public Frame create() {
//        return new MainFrame();
//    }


    public static JFrame create() {
        JFrame frame = new JFrame();
        for (ModelType type : ModelType.values()) {
            String dirPath = Constants.MODEL_DIR + type.getName();
            boolean exsitModel = ModelUtils.isExsitModel(dirPath);
            System.out.printf(type.getName() + "路径：" + dirPath + "\n");
            System.out.printf(type.getName() + "存在：" + exsitModel + "\n");
            if (exsitModel) {

                frame.add(new JCheckBox(), BorderLayout.NORTH );
                new GroupLayout()

            }
        }

        JButton button = new JButton("button");
        frame.add(button,BorderLayout.SOUTH);//南边
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.printf("button click");
            }
        });

        frame.setPreferredSize(new Dimension(400, 300));//设置大小
        frame.setBounds(30, 30, 300, 300);
        frame.setTitle("边界布局");
        frame.dispatchEvent(new WindowEvent(frame,WindowEvent.WINDOW_CLOSING) );
        frame.setVisible(true);//设置dialog显示


        return frame;
    }
}
