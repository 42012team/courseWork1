package servlets;

public class Device {

    private boolean isGeneratingInA = false;
    private boolean isGeneratingInB = false;
    private boolean isActive = true;
    private boolean isFailed = false;
    private boolean isBusy = false;
    private boolean isBlockedByA = false;
    private boolean isBlockedByB = false;
 //   private MyThread thread = new MyThread();
    private String address;

    public Device(String address) {
        this.address = address;
    }

  //  public void init() {
    //    thread.start();
 //   }

   /* public Message receiveMessageByA(Message message) {
        if (isActive && !isGeneratingInA) {
            Message.MessageType messageType = message.getMessageType();
            switch (messageType) {
                case SWITCH_ON:
                    if (isBusy)
                        return sendBusyResponse();
                    else
                        return processSwitchOnByA();
                case SWITCH_OFF:
                    return processSwitchOffByA();
                case COMMAND:
                    return processCommand(message.getMessage());
            }
        }
        return null;
    }

    public Message receiveMessageByB(Message message) {
        if (isActive && !isGeneratingInB) {
            Message.MessageType messageType = message.getMessageType();
            switch (messageType) {
                case SWITCH_ON:
                    if (isBusy)
                        return sendBusyResponse();
                    else
                        return processSwitchOnByB();
                case SWITCH_OFF:
                    return processSwitchOffByB();
                case COMMAND:
                    return processCommand(message.getMessage());
            }
        }
        return null;
    }

    private Message processCommand(String message) {
        //isBusy = true;
        if (isFailed) {
            isFailed = false;
            return new Message("controller", Message.MessageType.RESPONSE, "failed");
        } else
            return new Message("controller", Message.MessageType.RESPONSE, "response");
    }

    private Message processSwitchOffByA() {
        isActive = false;
        isBlockedByA = true;
        isBlockedByB = false;
        return null;
    }

    private Message processSwitchOffByB() {
        isActive = false;
        isBlockedByB = true;
        isBlockedByA = false;
        return null;
    }

    private Message processSwitchOnByA() {
        if (!isActive && isBlockedByB) {
            isActive = true;
            isBlockedByA = false;
            isBlockedByB = false;
        }
        return null;
    }

    private Message processSwitchOnByB() {
        if (!isActive && isBlockedByA) {
            isActive = true;
            isBlockedByA = false;
            isBlockedByB = false;
        }
        return null;
    }

    private Message sendBusyResponse() {
        return new Message("controller", Message.MessageType.RESPONSE, "busy");
    }*/

    public boolean isActive() {
        return isActive;
    }

    public boolean isBusy() {
        return isBusy;
    }

    public boolean isGeneratingInA() {
        return isGeneratingInA;
    }

    public boolean isGeneratingInB() {
        return isGeneratingInB;
    }

    public boolean isBlockedByA() {
        return isBlockedByA;
    }

    public boolean isBlockedByB() {
        return isBlockedByB;
    }

    public void startGenerateInA() {
        isGeneratingInA = true;
    }

    public void startGeneratingInB() {
        isGeneratingInB = true;
    }

    public String getAddress() {
        return address;
    }

    public boolean isFailed() {
        return isFailed;
    }
    public void setActive(boolean active) {
        isActive = active;
    }
    public void setFailed(boolean failed) {
        isFailed = failed;
    }
    public void setBusy(boolean busy) {
        isBusy = busy;
    }

    public void setBlockedByA(boolean blockedByA) {
        isBlockedByA = blockedByA;
    }

    public void setBlockedByB(boolean blockedByB) {
        isBlockedByB = blockedByB;
    }

    public void setGeneratingInA(boolean generatingInA) {
        isGeneratingInA = generatingInA;
    }

    public void setGeneratingInB(boolean generatingInB) {
        isGeneratingInB = generatingInB;
    }


    private class MyThread extends Thread {
        public void run() {

        }
    }

}
