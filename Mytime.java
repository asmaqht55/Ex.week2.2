public class Mytime {
    private int hour = 0;
    private int minute = 0;
    private int second = 0;

    public Mytime(int minute) {

    }

    public Mytime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        if (hour >= 0 && hour <= 23) {
            setHour(hour);
        }

        {
            if (minute >= 0 && minute <= 59)
                setMinute(minute);

        }
        {
            if (second >= 0 && second <= 23) {
                setSecend(second);
            }
        }

    }

    private void setSecend(int second) {
    }

    public int getHour() {

        return hour;
    }
    private void nextHour() {
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        if (hour <= 23 && hour > 0)
            hour++;
        this.hour = hour;
    }

    private void setMinute(int minute) {
    }

    @Override
    public String toString() {
        String leadingHour = String.format("%2d", hour);
        String leadingMinute = String.format("2d", minute);
        String leadingSecend = String.format("2d", second);
        return leadingHour ":" + leadingMinute ":" + leadingSecend;
    }

    public Mytime nextSecend() {
        if (second == 59) {
            this.second = 0;
            nextMinute();
        } else {
            this.second++;
            return this;
        }

    }

    public Mytime nextMinute() {
        if (minute == 59) {
            this.minute = 0;
            nextHour();
        } else {
            this.minute++;
            return this;

        }
        public Mytime nextHour () {
            if (hour == 23) {
                this.hour = 0;
                nextMinute();
            } else {
                this.hour++;
                return this;
            }

        }
        public Mytime previousSecond() {
            if (second == 59) {
                this.second = 0;
                nextMinute();
            } else {
                this.second--;
                return this;
            }
            public Mytime previousMinute() {
                if (minute == 59) {
                    this.minute = 0;
                    nextHour();
                } else {
                    this.minute--;
                    return this;

                }
                public Mytime previousHour(){
                    if (hour == 23) {
                        this.hour = 0;
                        nextMinute();
                    } else {
                        this.hour++;
                        return this;
                }
            }
        }
    }


}