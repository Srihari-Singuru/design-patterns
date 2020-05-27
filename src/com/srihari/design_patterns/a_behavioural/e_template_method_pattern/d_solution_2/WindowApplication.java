package com.srihari.design_patterns.a_behavioural.e_template_method_pattern.d_solution_2;

public class WindowApplication {
    public static void main(String[] args) {
        var browser = new BrowserWindow();
        browser.close();        // only close method will be visible if this class is out side the 'Window' package

        var chat = new ChatWindow();
        chat.close();
    }
}
