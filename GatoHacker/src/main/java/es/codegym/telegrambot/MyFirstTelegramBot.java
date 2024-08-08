package es.codegym.telegrambot;

import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

import java.util.Map;

import static es.codegym.telegrambot.TelegramBotContent.*;

public class MyFirstTelegramBot extends MultiSessionTelegramBot {

    //agregado
    public static final String NAME = "Reemplace este texto con el nombre del bot";
    public static final String TOKEN = "Reemplace con el token de telegram";

    public String keyBoton_1;
    public String keyBoton_2;
    public String keyBoton_2x;
    public String keyBoton_3;
    public String keyBoton_4;
    public String keyBoton_4x;
    public String keyBoton_5;
    public String keyBoton_6;
    public String keyBoton_6x;
    public String keyBoton_6y;
    public String keyBoton_7;
    public String keyBoton_7x;
    public String keyBoton_8;
    public String keyBoton_8q;
    public String keyBoton_8x;
    public String keyBoton_8y;
    public String keyBoton_8z;

    public MyFirstTelegramBot() {
        super(NAME, TOKEN);
    }

    public void gameOver(){

        sendPhotoMessageAsync("gato_game_over");
        sendTextMessageAsync("\n\n*GAME OVER* \n ಥ﹏ಥ\nಥ﹏ಥ\nಥ﹏ಥ\n*GAME OVER*");
        keyBoton_1 = null;
        keyBoton_2 = null;
        keyBoton_2x = null;
        keyBoton_3 = null;
        keyBoton_4 = null;
        keyBoton_4x = null;
        keyBoton_5 = null;
        keyBoton_6 = null;
        keyBoton_6x = null;
        keyBoton_6y = null;
        keyBoton_7 = null;
        keyBoton_7x = null;
        keyBoton_8 = null;
        keyBoton_8q = null;
        keyBoton_8x = null;
        keyBoton_8y = null;
        keyBoton_8z = null;

        reiniciarJuego();
    }

    public void reiniciarJuego(){
        keyBoton_1 = "step_1_btn";
        sendTextMessageAsync(STEP_1_TEXT,
                Map.of("Hackear la nevera", keyBoton_1));
    }

    @Override
    public void onUpdateEventReceived(Update update) {
        // TODO: escribiremos la funcionalidad principal del bot aquí

        // public void opcionesJuego(){

        if (getMessageText().equals("/start")) {
            setUserGlory(0);
            keyBoton_1 = "step_1_btn";
            sendPhotoMessageAsync("step_1_pic");
            sendTextMessageAsync(STEP_1_TEXT,
                    Map.of("Hackear la nevera", keyBoton_1));

        }

        if (getCallbackQueryButtonKey().equals(keyBoton_1)) {
            keyBoton_1 = null;
            keyBoton_2 = "step_2_btn";
            keyBoton_2x = "step_2x_btn";
            setUserGlory(20);
            sendPhotoMessageAsync("step_2_pic");
            sendTextMessageAsync(STEP_2_TEXT,
                    Map.of("¡Tomar una salchicha!", keyBoton_2,
                            "¡Tomar un pescado!", keyBoton_2,
                            "¡Tirar una lata de pepinillos!", keyBoton_2x));
        }

        if (getCallbackQueryButtonKey().equals(keyBoton_2x)) {
            sendPhotoMessageAsync("gato_expulsado");
            sendTextMessageAsync("Por tirar la lata te ha pillado tu amo y te ha echado de la casa");
            gameOver();
        }

        if (getCallbackQueryButtonKey().equals(keyBoton_2)) {
            keyBoton_2 = null;
            keyBoton_2x = null;
            keyBoton_3 = "step_3_btn";
            setUserGlory(20);
            sendPhotoMessageAsync("step_3_pic");
            sendTextMessageAsync(STEP_3_TEXT,
                    Map.of("¡Hackear robot aspirador!", keyBoton_3));
        }

        if (getCallbackQueryButtonKey().equals(keyBoton_3)) {
            keyBoton_3 = null;
            keyBoton_4 = "step_4_btn";
            keyBoton_4x = "step_4x_btn";
            setUserGlory(30);
            sendPhotoMessageAsync("step_4_pic");
            sendTextMessageAsync(STEP_4_TEXT,
                    Map.of("¡Enviar al robot por algo de comer!", keyBoton_4,
                            "¡Dar un paseo en el robot aspirador!", keyBoton_4x,
                            "¡Huir del robot aspirador!", keyBoton_4));
        }

        if (getCallbackQueryButtonKey().equals(keyBoton_4x)) {
            sendPhotoMessageAsync("gato_aspirado");
            sendTextMessageAsync("Por subirte encima del robot te ha aspirado");
            gameOver();
        }


        if (getCallbackQueryButtonKey().equals(keyBoton_4)) {
            keyBoton_4 = null;
            keyBoton_4x = null;
            keyBoton_5 = "step_5_btn";
            setUserGlory(30);
            sendPhotoMessageAsync("step_5_pic");
            sendTextMessageAsync(STEP_5_TEXT,
                    Map.of("¡Colocarse las GoPro + 40 de fama", keyBoton_5));
        }

        if (getCallbackQueryButtonKey().equals(keyBoton_5)) {
            keyBoton_5 = null;
            keyBoton_6 = "step_6_btn";
            keyBoton_6x = "step_6x_btn";
            keyBoton_6y = "step_6y_btn";
            setUserGlory(30);
            sendPhotoMessageAsync("step_6_pic");
            sendTextMessageAsync(STEP_6_TEXT,
                    Map.of("¡Jugar con las GoPro + !", keyBoton_6y,
                            "¡Ver la pelicula 'Como Perros y Gatos'!", keyBoton_6x,
                            "¡Grabar la hazaña de hackear la nevera y burlarse de la aspiradora!", keyBoton_6));
        }

        if (getCallbackQueryButtonKey().equals(keyBoton_6x)) {
            sendPhotoMessageAsync("gato_aspirado");
            sendTextMessageAsync("Por ver la pelicula te has dormido y la aspiradora te ha aspirado");
            gameOver();
        }

        if (getCallbackQueryButtonKey().equals(keyBoton_6y)) {
            sendPhotoMessageAsync("gato_aspirado");
            sendTextMessageAsync("Por estar jugando te has caido al tapete y la aspiradora te ha aspirado");
            gameOver();
        }


        if (getCallbackQueryButtonKey().equals(keyBoton_6)) {
            keyBoton_6 = null;
            keyBoton_6x = null;
            keyBoton_6y = null;
            keyBoton_7 = "step_7_btn";
            keyBoton_7x = "step_7x_btn";

            setUserGlory(30);
            sendPhotoMessageAsync("step_7_pic");
            sendTextMessageAsync(STEP_7_TEXT,
                    Map.of("¡Hackear contraseña de la computadora!", keyBoton_7,
                            "¡Dormir!", keyBoton_7x));
        }

        if (getCallbackQueryButtonKey().equals(keyBoton_7x)) {
            sendPhotoMessageAsync("gato_aspirado");
            sendTextMessageAsync("La aspiradora te pillo durmiendo y te aspiro");
            gameOver();
        }

        if (getCallbackQueryButtonKey().equals(keyBoton_7)) {
            keyBoton_7 = null;
            keyBoton_7x = null;
            keyBoton_8 = "step_8_btn";
            keyBoton_8q = "step_8q_btn";
            keyBoton_8x = "step_8x_btn";
            keyBoton_8y = "step_8y_btn";
            keyBoton_8z = "step_8z_btn";
            setUserGlory(30);
            sendPhotoMessageAsync("step_8_pic");
            sendTextMessageAsync(STEP_8_TEXT,
                    Map.of("¡Dejar todo como estaba!", keyBoton_8q,
                            "¡Bailar!", keyBoton_8,
                            "¡Llamar a los gatos callejeros!", keyBoton_8x,
                            "¡enfrentarse a la aspiradora!", keyBoton_8y,
                            "¡rascar el tapete!", keyBoton_8z));
        }

        if (getCallbackQueryButtonKey().equals(keyBoton_8)) {
            keyBoton_8 = null;
            keyBoton_8q = null;
            keyBoton_8x = null;
            keyBoton_8y = null;
            keyBoton_8z = null;
            sendPhotoMessageAsync("gato_bailando");
            sendTextMessageAsync("Despues de bailar piensas:...");
            setUserGlory(30);
            sendPhotoMessageAsync("final_pic");
            sendTextMessageAsync(FINAL_TEXT);
        }

        if (getCallbackQueryButtonKey().equals(keyBoton_8q)) {
            sendPhotoMessageAsync("gato_congelado");
            sendTextMessageAsync("Intentando dejar todo como estaba se ha cerrado la nevera..QUE FRIO TAN BERRACO!!!!");
            gameOver();
        }

        if (getCallbackQueryButtonKey().equals(keyBoton_8x)) {
            sendPhotoMessageAsync("gato_expulsado");
            sendTextMessageAsync("Por llamar a los gatos callejeros te ha " +
                    "escuchado tu amo y al ver la nevera te ha echado de la casa");
            gameOver();
        }

        if (getCallbackQueryButtonKey().equals(keyBoton_8y)) {
            sendPhotoMessageAsync("gato_vs_aspiradora");
            sendTextMessageAsync("Has logrado enfrentarte a la aspiradora!!! y........aucchhh te aspiro, sorry");
            gameOver();
        }

        if (getCallbackQueryButtonKey().equals(keyBoton_8z)) {
            sendPhotoMessageAsync("gato_aspirado");
            sendTextMessageAsync("La aspiradora te pillo rascando el tapete y te aspiro");
            gameOver();
        }

    }


    public static void main(String[] args) throws TelegramApiException {
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
        telegramBotsApi.registerBot(new MyFirstTelegramBot());
    }
}