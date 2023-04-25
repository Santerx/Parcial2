package com.example.parciall;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.intent.Intents.intended;
import static androidx.test.espresso.intent.matcher.IntentMatchers.hasComponent;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.assertTrue;

import androidx.test.core.app.ApplicationProvider;
import androidx.test.espresso.intent.Intents;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class Pruebas_espresso {

    @Rule
    public ActivityScenarioRule<MainActivity> mActivityRule = new ActivityScenarioRule(MainActivity.class);

    @Before
    public void setUp() {
        Intents.init();
    }

    @Test
    public void testLogin() throws InterruptedException {
        // Ingrese un numero en el campos de entrada de texto
        onView(withId(R.id.txt_Insert)).perform(typeText("5"));

        // Haga clic en el botón de inicio de sesión
        onView(withId(R.id.btn_mostrar)).perform(click());
        Thread.sleep(2000);

    }
}