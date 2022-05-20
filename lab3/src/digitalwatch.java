public class digitalwatch {
    public String state = "normal";
    public String state1 = "time";
    public String state2 = "min";
    public String state3 = "alarm";
    int m = 0, h = 0, D = 1, M = 1, Y = 2000;

    String Input(char x) {
        switch (state) {
            case "normal": {
                if (x == 'c')
                    this.state = "update";
                if (x == 'b')
                    this.state = "alarm";
                if (x == 'a')
                    if (state1 == "time") {
                        state1 = "date";
                        return this.DisplayDate();
                    } else {
                        state1 = "time";
                        return this.DisplayTIME();
                    }
                return state;
            }
            case "update": {
                if (x == 'd')
                    state = "normal";
                else if (x == 'c')
                    state = "update";
                else {
                    switch (state2) {
                        case "min": {
                            if (x == 'a')
                                state2 = "hour";
                            if (x == 'b') {
                                this.m = (m + 1) % 60;
                                return this.DisplayTIME();
                            }
                            break;
                        }
                        case "hour": {
                            if (x == 'a')
                                state2 = "day";
                            if (x == 'b') {
                                this.h = (h + 1) % 12 + 1;
                                return this.DisplayTIME();
                            }
                            break;
                        }
                        case "day": {
                            if (x == 'a')
                                state2 = "month";
                            if (x == 'b') {
                                this.D = (D + 1) % 30 + 1;
                                return this.DisplayTIME();
                            }
                            break;
                        }
                        case "month": {
                            if (x == 'a')
                                state2 = "year";
                            if (x == 'b') {
                                this.M = (M + 1) % 12 + 1;
                                return this.DisplayTIME();
                            }
                            break;
                        }
                        case "year": {
                            if (x == 'a')
                                state = "normal";
                            if (x == 'b') {
                                this.Y = (Y + 1);
                                return this.DisplayTIME();
                            }
                        }
                        break;
                    }
                }
                return state;
            }
            case "alarm": {
                if (x == 'd') {
                    state = "normal";
                    return state;
                } else if (x == 'a')
                    if (state3 == "alarm") {
                        state3 = "chime";
                        return state3;
                    } else {
                        state = "alarm";
                        return state3;
                    }
            }
            return state;
        }
        return state;
    }

    String DisplayDate() {
        System.out.println(Y + "-" + M + "-" + D);
        return (Y + "-" + M + "-" + D);
    }

    String DisplayTIME() {
        System.out.println(h + ":" + m);
        return (h + ":" + m);
    }

    public static void main(String args[]) {
    }
}

