package com.example.forcast_review.Bean;

import com.google.gson.annotations.SerializedName;

public class WeatherBean {


    /**
     * data : {"air":{"aqi":90,"aqi_level":2,"aqi_name":"良","co":"1.2","no2":"77","o3":"3","pm10":"109","pm2.5":"67","so2":"3","update_time":"20201111010000"},"alarm":{},"forecast_24h":{"0":{"day_weather":"晴","day_weather_code":"00","day_weather_short":"晴","day_wind_direction":"南风","day_wind_direction_code":"4","day_wind_power":"3","day_wind_power_code":"0","max_degree":"18","min_degree":"2","night_weather":"晴","night_weather_code":"00","night_weather_short":"晴","night_wind_direction":"西南风","night_wind_direction_code":"5","night_wind_power":"3","night_wind_power_code":"0","time":"2020-11-10"},"1":{"day_weather":"晴","day_weather_code":"00","day_weather_short":"晴","day_wind_direction":"南风","day_wind_direction_code":"4","day_wind_power":"3","day_wind_power_code":"0","max_degree":"18","min_degree":"2","night_weather":"晴","night_weather_code":"00","night_weather_short":"晴","night_wind_direction":"西南风","night_wind_direction_code":"5","night_wind_power":"3","night_wind_power_code":"0","time":"2020-11-10"},"2":{"day_weather":"多云","day_weather_code":"01","day_weather_short":"多云","day_wind_direction":"西南风","day_wind_direction_code":"5","day_wind_power":"3","day_wind_power_code":"0","max_degree":"16","min_degree":"3","night_weather":"多云","night_weather_code":"01","night_weather_short":"多云","night_wind_direction":"北风","night_wind_direction_code":"8","night_wind_power":"3","night_wind_power_code":"0","time":"2020-11-11"},"3":{"day_weather":"晴","day_weather_code":"00","day_weather_short":"晴","day_wind_direction":"北风","day_wind_direction_code":"8","day_wind_power":"4","day_wind_power_code":"1","max_degree":"19","min_degree":"3","night_weather":"晴","night_weather_code":"00","night_weather_short":"晴","night_wind_direction":"北风","night_wind_direction_code":"8","night_wind_power":"3","night_wind_power_code":"0","time":"2020-11-12"},"4":{"day_weather":"晴","day_weather_code":"00","day_weather_short":"晴","day_wind_direction":"南风","day_wind_direction_code":"4","day_wind_power":"3","day_wind_power_code":"0","max_degree":"15","min_degree":"3","night_weather":"多云","night_weather_code":"01","night_weather_short":"多云","night_wind_direction":"南风","night_wind_direction_code":"4","night_wind_power":"3","night_wind_power_code":"0","time":"2020-11-13"},"5":{"day_weather":"多云","day_weather_code":"01","day_weather_short":"多云","day_wind_direction":"南风","day_wind_direction_code":"4","day_wind_power":"3","day_wind_power_code":"0","max_degree":"14","min_degree":"4","night_weather":"多云","night_weather_code":"01","night_weather_short":"多云","night_wind_direction":"北风","night_wind_direction_code":"8","night_wind_power":"3","night_wind_power_code":"0","time":"2020-11-14"},"6":{"day_weather":"多云","day_weather_code":"01","day_weather_short":"多云","day_wind_direction":"北风","day_wind_direction_code":"8","day_wind_power":"3","day_wind_power_code":"0","max_degree":"15","min_degree":"6","night_weather":"小雨","night_weather_code":"07","night_weather_short":"小雨","night_wind_direction":"东风","night_wind_direction_code":"2","night_wind_power":"3","night_wind_power_code":"0","time":"2020-11-15"},"7":{"day_weather":"多云","day_weather_code":"01","day_weather_short":"多云","day_wind_direction":"东风","day_wind_direction_code":"2","day_wind_power":"3","day_wind_power_code":"0","max_degree":"12","min_degree":"5","night_weather":"多云","night_weather_code":"01","night_weather_short":"多云","night_wind_direction":"南风","night_wind_direction_code":"4","night_wind_power":"3","night_wind_power_code":"0","time":"2020-11-16"}},"index":{"airconditioner":{"detail":"您将感到很舒适，一般不需要开启空调。","info":"较少开启","name":"空调开启"},"allergy":{"detail":"天气条件极不易诱发过敏。","info":"极不易发","name":"过敏"},"carwash":{"detail":"适宜洗车，未来持续两天无雨天气较好，适合擦洗汽车，蓝天白云、风和日丽将伴您的车子连日洁净。","info":"适宜","name":"洗车"},"chill":{"detail":"温度未达到风寒所需的低温，稍作防寒准备即可。","info":"无","name":"风寒"},"clothes":{"detail":"建议着厚外套加毛衣等服装。年老体弱者宜着大衣、呢外套加羊毛衫。","info":"较冷","name":"穿衣"},"cold":{"detail":"昼夜温差极大，且空气湿度较大，寒冷潮湿，极易发生感冒，请特别注意增减衣服保暖防寒。","info":"极易发","name":"感冒"},"comfort":{"detail":"白天虽然天气晴好，但早晚会感觉偏凉，午后舒适、宜人。","info":"较舒适","name":"舒适度"},"diffusion":{"detail":"气象条件对空气污染物稀释、扩散和清除无明显影响。","info":"中","name":"空气污染扩散条件"},"dry":{"detail":"天气较好，路面比较干燥，路况较好。","info":"干燥","name":"路况"},"drying":{"detail":"天气不错，适宜晾晒。赶紧把久未见阳光的衣物搬出来吸收一下太阳的味道吧！","info":"适宜","name":"晾晒"},"fish":{"detail":"较适合垂钓，但风力稍大，会对垂钓产生一定的影响。","info":"较适宜","name":"钓鱼"},"heatstroke":{"detail":"天气舒适，对易中暑人群来说非常友善。","info":"无中暑风险","name":"中暑"},"makeup":{"detail":"风力不大，建议用中性保湿型霜类化妆品，无需选用防晒化妆品。","info":"保湿","name":"化妆"},"mood":{"detail":"天气较好，空气温润，和风飘飘，美好的天气会带来一天接踵而来的好心情。","info":"好","name":"心情"},"morning":{"detail":"天气不错，空气清新。","info":"适宜","name":"晨练"},"sports":{"detail":"天气较好，无雨水困扰，较适宜进行各种运动，但因天气凉，在户外运动请注意增减衣物。","info":"较适宜","name":"运动"},"sunglasses":{"detail":"白天天气晴朗，太阳辐射较强，建议佩戴透射比1级且标注UV380-UV400的遮阳镜","info":"必要","name":"太阳镜"},"sunscreen":{"detail":"属中等强度紫外辐射天气，注意防护，建议涂擦SPF指数高于15，PA+的防晒护肤品。","info":"中等","name":"防晒"},"time":"20201110","tourism":{"detail":"天气较好，温度适宜，是个好天气哦。这样的天气适宜旅游，您可以尽情地享受大自然的风光。","info":"适宜","name":"旅游"},"traffic":{"detail":"天气较好，路面干燥，交通气象条件良好，车辆可以正常行驶。","info":"良好","name":"交通"},"ultraviolet":{"detail":"属中等强度紫外线辐射天气，建议涂擦SPF高于15、PA+的防晒护肤品，戴帽子、太阳镜。","info":"中等","name":"紫外线强度"},"umbrella":{"detail":"天气较好，您在出门的时候无须带雨伞。","info":"不带伞","name":"雨伞"}},"observe":{"degree":"4","humidity":"76","precipitation":"0","pressure":"1024","update_time":"202011110140","weather":"晴","weather_code":"00","weather_short":"晴","wind_direction":"1","wind_power":"1"},"rise":{"0":{"sunrise":"06:55","sunset":"17:01","time":"20201111"},"1":{"sunrise":"06:56","sunset":"17:00","time":"20201112"},"2":{"sunrise":"06:57","sunset":"17:00","time":"20201113"},"3":{"sunrise":"06:58","sunset":"16:59","time":"20201114"},"4":{"sunrise":"06:59","sunset":"16:58","time":"20201115"},"5":{"sunrise":"07:00","sunset":"16:57","time":"20201116"},"6":{"sunrise":"07:01","sunset":"16:56","time":"20201117"},"7":{"sunrise":"07:03","sunset":"16:56","time":"20201118"},"8":{"sunrise":"07:04","sunset":"16:55","time":"20201119"},"9":{"sunrise":"07:05","sunset":"16:54","time":"20201120"},"10":{"sunrise":"07:06","sunset":"16:54","time":"20201121"},"11":{"sunrise":"07:07","sunset":"16:53","time":"20201122"},"12":{"sunrise":"07:08","sunset":"16:53","time":"20201123"},"13":{"sunrise":"07:09","sunset":"16:52","time":"20201124"},"14":{"sunrise":"07:10","sunset":"16:52","time":"20201125"},"15":{"sunrise":"","sunset":"","time":"20201110"}},"tips":{"observe":{"0":"你若安好，便是晴天~","1":"天有点冷，注意保暖~"}}}
     * message : OK
     * status : 200
     */

    private DataBean data;
    private String message;
    private int status;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public static class DataBean {
        /**
         * air : {"aqi":90,"aqi_level":2,"aqi_name":"良","co":"1.2","no2":"77","o3":"3","pm10":"109","pm2.5":"67","so2":"3","update_time":"20201111010000"}
         * alarm : {}
         * forecast_24h : {"0":{"day_weather":"晴","day_weather_code":"00","day_weather_short":"晴","day_wind_direction":"南风","day_wind_direction_code":"4","day_wind_power":"3","day_wind_power_code":"0","max_degree":"18","min_degree":"2","night_weather":"晴","night_weather_code":"00","night_weather_short":"晴","night_wind_direction":"西南风","night_wind_direction_code":"5","night_wind_power":"3","night_wind_power_code":"0","time":"2020-11-10"},"1":{"day_weather":"晴","day_weather_code":"00","day_weather_short":"晴","day_wind_direction":"南风","day_wind_direction_code":"4","day_wind_power":"3","day_wind_power_code":"0","max_degree":"18","min_degree":"2","night_weather":"晴","night_weather_code":"00","night_weather_short":"晴","night_wind_direction":"西南风","night_wind_direction_code":"5","night_wind_power":"3","night_wind_power_code":"0","time":"2020-11-10"},"2":{"day_weather":"多云","day_weather_code":"01","day_weather_short":"多云","day_wind_direction":"西南风","day_wind_direction_code":"5","day_wind_power":"3","day_wind_power_code":"0","max_degree":"16","min_degree":"3","night_weather":"多云","night_weather_code":"01","night_weather_short":"多云","night_wind_direction":"北风","night_wind_direction_code":"8","night_wind_power":"3","night_wind_power_code":"0","time":"2020-11-11"},"3":{"day_weather":"晴","day_weather_code":"00","day_weather_short":"晴","day_wind_direction":"北风","day_wind_direction_code":"8","day_wind_power":"4","day_wind_power_code":"1","max_degree":"19","min_degree":"3","night_weather":"晴","night_weather_code":"00","night_weather_short":"晴","night_wind_direction":"北风","night_wind_direction_code":"8","night_wind_power":"3","night_wind_power_code":"0","time":"2020-11-12"},"4":{"day_weather":"晴","day_weather_code":"00","day_weather_short":"晴","day_wind_direction":"南风","day_wind_direction_code":"4","day_wind_power":"3","day_wind_power_code":"0","max_degree":"15","min_degree":"3","night_weather":"多云","night_weather_code":"01","night_weather_short":"多云","night_wind_direction":"南风","night_wind_direction_code":"4","night_wind_power":"3","night_wind_power_code":"0","time":"2020-11-13"},"5":{"day_weather":"多云","day_weather_code":"01","day_weather_short":"多云","day_wind_direction":"南风","day_wind_direction_code":"4","day_wind_power":"3","day_wind_power_code":"0","max_degree":"14","min_degree":"4","night_weather":"多云","night_weather_code":"01","night_weather_short":"多云","night_wind_direction":"北风","night_wind_direction_code":"8","night_wind_power":"3","night_wind_power_code":"0","time":"2020-11-14"},"6":{"day_weather":"多云","day_weather_code":"01","day_weather_short":"多云","day_wind_direction":"北风","day_wind_direction_code":"8","day_wind_power":"3","day_wind_power_code":"0","max_degree":"15","min_degree":"6","night_weather":"小雨","night_weather_code":"07","night_weather_short":"小雨","night_wind_direction":"东风","night_wind_direction_code":"2","night_wind_power":"3","night_wind_power_code":"0","time":"2020-11-15"},"7":{"day_weather":"多云","day_weather_code":"01","day_weather_short":"多云","day_wind_direction":"东风","day_wind_direction_code":"2","day_wind_power":"3","day_wind_power_code":"0","max_degree":"12","min_degree":"5","night_weather":"多云","night_weather_code":"01","night_weather_short":"多云","night_wind_direction":"南风","night_wind_direction_code":"4","night_wind_power":"3","night_wind_power_code":"0","time":"2020-11-16"}}
         * index : {"airconditioner":{"detail":"您将感到很舒适，一般不需要开启空调。","info":"较少开启","name":"空调开启"},"allergy":{"detail":"天气条件极不易诱发过敏。","info":"极不易发","name":"过敏"},"carwash":{"detail":"适宜洗车，未来持续两天无雨天气较好，适合擦洗汽车，蓝天白云、风和日丽将伴您的车子连日洁净。","info":"适宜","name":"洗车"},"chill":{"detail":"温度未达到风寒所需的低温，稍作防寒准备即可。","info":"无","name":"风寒"},"clothes":{"detail":"建议着厚外套加毛衣等服装。年老体弱者宜着大衣、呢外套加羊毛衫。","info":"较冷","name":"穿衣"},"cold":{"detail":"昼夜温差极大，且空气湿度较大，寒冷潮湿，极易发生感冒，请特别注意增减衣服保暖防寒。","info":"极易发","name":"感冒"},"comfort":{"detail":"白天虽然天气晴好，但早晚会感觉偏凉，午后舒适、宜人。","info":"较舒适","name":"舒适度"},"diffusion":{"detail":"气象条件对空气污染物稀释、扩散和清除无明显影响。","info":"中","name":"空气污染扩散条件"},"dry":{"detail":"天气较好，路面比较干燥，路况较好。","info":"干燥","name":"路况"},"drying":{"detail":"天气不错，适宜晾晒。赶紧把久未见阳光的衣物搬出来吸收一下太阳的味道吧！","info":"适宜","name":"晾晒"},"fish":{"detail":"较适合垂钓，但风力稍大，会对垂钓产生一定的影响。","info":"较适宜","name":"钓鱼"},"heatstroke":{"detail":"天气舒适，对易中暑人群来说非常友善。","info":"无中暑风险","name":"中暑"},"makeup":{"detail":"风力不大，建议用中性保湿型霜类化妆品，无需选用防晒化妆品。","info":"保湿","name":"化妆"},"mood":{"detail":"天气较好，空气温润，和风飘飘，美好的天气会带来一天接踵而来的好心情。","info":"好","name":"心情"},"morning":{"detail":"天气不错，空气清新。","info":"适宜","name":"晨练"},"sports":{"detail":"天气较好，无雨水困扰，较适宜进行各种运动，但因天气凉，在户外运动请注意增减衣物。","info":"较适宜","name":"运动"},"sunglasses":{"detail":"白天天气晴朗，太阳辐射较强，建议佩戴透射比1级且标注UV380-UV400的遮阳镜","info":"必要","name":"太阳镜"},"sunscreen":{"detail":"属中等强度紫外辐射天气，注意防护，建议涂擦SPF指数高于15，PA+的防晒护肤品。","info":"中等","name":"防晒"},"time":"20201110","tourism":{"detail":"天气较好，温度适宜，是个好天气哦。这样的天气适宜旅游，您可以尽情地享受大自然的风光。","info":"适宜","name":"旅游"},"traffic":{"detail":"天气较好，路面干燥，交通气象条件良好，车辆可以正常行驶。","info":"良好","name":"交通"},"ultraviolet":{"detail":"属中等强度紫外线辐射天气，建议涂擦SPF高于15、PA+的防晒护肤品，戴帽子、太阳镜。","info":"中等","name":"紫外线强度"},"umbrella":{"detail":"天气较好，您在出门的时候无须带雨伞。","info":"不带伞","name":"雨伞"}}
         * observe : {"degree":"4","humidity":"76","precipitation":"0","pressure":"1024","update_time":"202011110140","weather":"晴","weather_code":"00","weather_short":"晴","wind_direction":"1","wind_power":"1"}
         * rise : {"0":{"sunrise":"06:55","sunset":"17:01","time":"20201111"},"1":{"sunrise":"06:56","sunset":"17:00","time":"20201112"},"2":{"sunrise":"06:57","sunset":"17:00","time":"20201113"},"3":{"sunrise":"06:58","sunset":"16:59","time":"20201114"},"4":{"sunrise":"06:59","sunset":"16:58","time":"20201115"},"5":{"sunrise":"07:00","sunset":"16:57","time":"20201116"},"6":{"sunrise":"07:01","sunset":"16:56","time":"20201117"},"7":{"sunrise":"07:03","sunset":"16:56","time":"20201118"},"8":{"sunrise":"07:04","sunset":"16:55","time":"20201119"},"9":{"sunrise":"07:05","sunset":"16:54","time":"20201120"},"10":{"sunrise":"07:06","sunset":"16:54","time":"20201121"},"11":{"sunrise":"07:07","sunset":"16:53","time":"20201122"},"12":{"sunrise":"07:08","sunset":"16:53","time":"20201123"},"13":{"sunrise":"07:09","sunset":"16:52","time":"20201124"},"14":{"sunrise":"07:10","sunset":"16:52","time":"20201125"},"15":{"sunrise":"","sunset":"","time":"20201110"}}
         * tips : {"observe":{"0":"你若安好，便是晴天~","1":"天有点冷，注意保暖~"}}
         */

        private AirBean air;
        private AlarmBean alarm;
        private Forecast24hBean forecast_24h;
        private IndexBean index;
        private ObserveBean observe;
        private RiseBean rise;
        private TipsBean tips;

        public AirBean getAir() {
            return air;
        }

        public void setAir(AirBean air) {
            this.air = air;
        }

        public AlarmBean getAlarm() {
            return alarm;
        }

        public void setAlarm(AlarmBean alarm) {
            this.alarm = alarm;
        }

        public Forecast24hBean getForecast_24h() {
            return forecast_24h;
        }

        public void setForecast_24h(Forecast24hBean forecast_24h) {
            this.forecast_24h = forecast_24h;
        }

        public IndexBean getIndex() {
            return index;
        }

        public void setIndex(IndexBean index) {
            this.index = index;
        }

        public ObserveBean getObserve() {
            return observe;
        }

        public void setObserve(ObserveBean observe) {
            this.observe = observe;
        }

        public RiseBean getRise() {
            return rise;
        }

        public void setRise(RiseBean rise) {
            this.rise = rise;
        }

        public TipsBean getTips() {
            return tips;
        }

        public void setTips(TipsBean tips) {
            this.tips = tips;
        }

        public static class AirBean {
            /**
             * aqi : 90
             * aqi_level : 2
             * aqi_name : 良
             * co : 1.2
             * no2 : 77
             * o3 : 3
             * pm10 : 109
             * pm2.5 : 67
             * so2 : 3
             * update_time : 20201111010000
             */

            private int aqi;

            public int getAqi() {
                return aqi;
            }

            public void setAqi(int aqi) {
                this.aqi = aqi;
            }
        }

        public static class AlarmBean {
        }

        public static class Forecast24hBean {
            /**
             * 0 : {"day_weather":"晴","day_weather_code":"00","day_weather_short":"晴","day_wind_direction":"南风","day_wind_direction_code":"4","day_wind_power":"3","day_wind_power_code":"0","max_degree":"18","min_degree":"2","night_weather":"晴","night_weather_code":"00","night_weather_short":"晴","night_wind_direction":"西南风","night_wind_direction_code":"5","night_wind_power":"3","night_wind_power_code":"0","time":"2020-11-10"}
             * 1 : {"day_weather":"晴","day_weather_code":"00","day_weather_short":"晴","day_wind_direction":"南风","day_wind_direction_code":"4","day_wind_power":"3","day_wind_power_code":"0","max_degree":"18","min_degree":"2","night_weather":"晴","night_weather_code":"00","night_weather_short":"晴","night_wind_direction":"西南风","night_wind_direction_code":"5","night_wind_power":"3","night_wind_power_code":"0","time":"2020-11-10"}
             * 2 : {"day_weather":"多云","day_weather_code":"01","day_weather_short":"多云","day_wind_direction":"西南风","day_wind_direction_code":"5","day_wind_power":"3","day_wind_power_code":"0","max_degree":"16","min_degree":"3","night_weather":"多云","night_weather_code":"01","night_weather_short":"多云","night_wind_direction":"北风","night_wind_direction_code":"8","night_wind_power":"3","night_wind_power_code":"0","time":"2020-11-11"}
             * 3 : {"day_weather":"晴","day_weather_code":"00","day_weather_short":"晴","day_wind_direction":"北风","day_wind_direction_code":"8","day_wind_power":"4","day_wind_power_code":"1","max_degree":"19","min_degree":"3","night_weather":"晴","night_weather_code":"00","night_weather_short":"晴","night_wind_direction":"北风","night_wind_direction_code":"8","night_wind_power":"3","night_wind_power_code":"0","time":"2020-11-12"}
             * 4 : {"day_weather":"晴","day_weather_code":"00","day_weather_short":"晴","day_wind_direction":"南风","day_wind_direction_code":"4","day_wind_power":"3","day_wind_power_code":"0","max_degree":"15","min_degree":"3","night_weather":"多云","night_weather_code":"01","night_weather_short":"多云","night_wind_direction":"南风","night_wind_direction_code":"4","night_wind_power":"3","night_wind_power_code":"0","time":"2020-11-13"}
             * 5 : {"day_weather":"多云","day_weather_code":"01","day_weather_short":"多云","day_wind_direction":"南风","day_wind_direction_code":"4","day_wind_power":"3","day_wind_power_code":"0","max_degree":"14","min_degree":"4","night_weather":"多云","night_weather_code":"01","night_weather_short":"多云","night_wind_direction":"北风","night_wind_direction_code":"8","night_wind_power":"3","night_wind_power_code":"0","time":"2020-11-14"}
             * 6 : {"day_weather":"多云","day_weather_code":"01","day_weather_short":"多云","day_wind_direction":"北风","day_wind_direction_code":"8","day_wind_power":"3","day_wind_power_code":"0","max_degree":"15","min_degree":"6","night_weather":"小雨","night_weather_code":"07","night_weather_short":"小雨","night_wind_direction":"东风","night_wind_direction_code":"2","night_wind_power":"3","night_wind_power_code":"0","time":"2020-11-15"}
             * 7 : {"day_weather":"多云","day_weather_code":"01","day_weather_short":"多云","day_wind_direction":"东风","day_wind_direction_code":"2","day_wind_power":"3","day_wind_power_code":"0","max_degree":"12","min_degree":"5","night_weather":"多云","night_weather_code":"01","night_weather_short":"多云","night_wind_direction":"南风","night_wind_direction_code":"4","night_wind_power":"3","night_wind_power_code":"0","time":"2020-11-16"}
             */

            @SerializedName("0")
            private _$0Bean _$0;
            @SerializedName("1")
            private _$1Bean _$1;
            @SerializedName("2")
            private _$2Bean _$2;
            @SerializedName("3")
            private _$3Bean _$3;
            @SerializedName("4")
            private _$4Bean _$4;
            @SerializedName("5")
            private _$5Bean _$5;
            @SerializedName("6")
            private _$6Bean _$6;
            @SerializedName("7")
            private _$7Bean _$7;

            public _$0Bean get_$0() {
                return _$0;
            }

            public void set_$0(_$0Bean _$0) {
                this._$0 = _$0;
            }

            public _$1Bean get_$1() {
                return _$1;
            }

            public void set_$1(_$1Bean _$1) {
                this._$1 = _$1;
            }

            public _$2Bean get_$2() {
                return _$2;
            }

            public void set_$2(_$2Bean _$2) {
                this._$2 = _$2;
            }

            public _$3Bean get_$3() {
                return _$3;
            }

            public void set_$3(_$3Bean _$3) {
                this._$3 = _$3;
            }

            public _$4Bean get_$4() {
                return _$4;
            }

            public void set_$4(_$4Bean _$4) {
                this._$4 = _$4;
            }

            public _$5Bean get_$5() {
                return _$5;
            }

            public void set_$5(_$5Bean _$5) {
                this._$5 = _$5;
            }

            public _$6Bean get_$6() {
                return _$6;
            }

            public void set_$6(_$6Bean _$6) {
                this._$6 = _$6;
            }

            public _$7Bean get_$7() {
                return _$7;
            }

            public void set_$7(_$7Bean _$7) {
                this._$7 = _$7;
            }

            public static class _$0Bean {
                /**
                 * day_weather : 晴
                 * day_weather_code : 00
                 * day_weather_short : 晴
                 * day_wind_direction : 南风
                 * day_wind_direction_code : 4
                 * day_wind_power : 3
                 * day_wind_power_code : 0
                 * max_degree : 18
                 * min_degree : 2
                 * night_weather : 晴
                 * night_weather_code : 00
                 * night_weather_short : 晴
                 * night_wind_direction : 西南风
                 * night_wind_direction_code : 5
                 * night_wind_power : 3
                 * night_wind_power_code : 0
                 * time : 2020-11-10
                 */

                private String day_weather;
                private String day_weather_code;
                private String day_weather_short;
                private String day_wind_direction;
                private String day_wind_direction_code;
                private String day_wind_power;
                private String day_wind_power_code;
                private String max_degree;
                private String min_degree;
                private String night_weather;
                private String night_weather_code;
                private String night_weather_short;
                private String night_wind_direction;
                private String night_wind_direction_code;
                private String night_wind_power;
                private String night_wind_power_code;
                private String time;

                public String getDay_weather() {
                    return day_weather;
                }

                public void setDay_weather(String day_weather) {
                    this.day_weather = day_weather;
                }

                public String getDay_weather_code() {
                    return day_weather_code;
                }

                public void setDay_weather_code(String day_weather_code) {
                    this.day_weather_code = day_weather_code;
                }

                public String getDay_weather_short() {
                    return day_weather_short;
                }

                public void setDay_weather_short(String day_weather_short) {
                    this.day_weather_short = day_weather_short;
                }

                public String getDay_wind_direction() {
                    return day_wind_direction;
                }

                public void setDay_wind_direction(String day_wind_direction) {
                    this.day_wind_direction = day_wind_direction;
                }

                public String getDay_wind_direction_code() {
                    return day_wind_direction_code;
                }

                public void setDay_wind_direction_code(String day_wind_direction_code) {
                    this.day_wind_direction_code = day_wind_direction_code;
                }

                public String getDay_wind_power() {
                    return day_wind_power;
                }

                public void setDay_wind_power(String day_wind_power) {
                    this.day_wind_power = day_wind_power;
                }

                public String getDay_wind_power_code() {
                    return day_wind_power_code;
                }

                public void setDay_wind_power_code(String day_wind_power_code) {
                    this.day_wind_power_code = day_wind_power_code;
                }

                public String getMax_degree() {
                    return max_degree;
                }

                public void setMax_degree(String max_degree) {
                    this.max_degree = max_degree;
                }

                public String getMin_degree() {
                    return min_degree;
                }

                public void setMin_degree(String min_degree) {
                    this.min_degree = min_degree;
                }

                public String getNight_weather() {
                    return night_weather;
                }

                public void setNight_weather(String night_weather) {
                    this.night_weather = night_weather;
                }

                public String getNight_weather_code() {
                    return night_weather_code;
                }

                public void setNight_weather_code(String night_weather_code) {
                    this.night_weather_code = night_weather_code;
                }

                public String getNight_weather_short() {
                    return night_weather_short;
                }

                public void setNight_weather_short(String night_weather_short) {
                    this.night_weather_short = night_weather_short;
                }

                public String getNight_wind_direction() {
                    return night_wind_direction;
                }

                public void setNight_wind_direction(String night_wind_direction) {
                    this.night_wind_direction = night_wind_direction;
                }

                public String getNight_wind_direction_code() {
                    return night_wind_direction_code;
                }

                public void setNight_wind_direction_code(String night_wind_direction_code) {
                    this.night_wind_direction_code = night_wind_direction_code;
                }

                public String getNight_wind_power() {
                    return night_wind_power;
                }

                public void setNight_wind_power(String night_wind_power) {
                    this.night_wind_power = night_wind_power;
                }

                public String getNight_wind_power_code() {
                    return night_wind_power_code;
                }

                public void setNight_wind_power_code(String night_wind_power_code) {
                    this.night_wind_power_code = night_wind_power_code;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$1Bean {
                /**
                 * day_weather : 晴
                 * day_weather_code : 00
                 * day_weather_short : 晴
                 * day_wind_direction : 南风
                 * day_wind_direction_code : 4
                 * day_wind_power : 3
                 * day_wind_power_code : 0
                 * max_degree : 18
                 * min_degree : 2
                 * night_weather : 晴
                 * night_weather_code : 00
                 * night_weather_short : 晴
                 * night_wind_direction : 西南风
                 * night_wind_direction_code : 5
                 * night_wind_power : 3
                 * night_wind_power_code : 0
                 * time : 2020-11-10
                 */

                private String day_weather;
                private String day_weather_code;
                private String day_weather_short;
                private String day_wind_direction;
                private String day_wind_direction_code;
                private String day_wind_power;
                private String day_wind_power_code;
                private String max_degree;
                private String min_degree;
                private String night_weather;
                private String night_weather_code;
                private String night_weather_short;
                private String night_wind_direction;
                private String night_wind_direction_code;
                private String night_wind_power;
                private String night_wind_power_code;
                private String time;

                public String getDay_weather() {
                    return day_weather;
                }

                public void setDay_weather(String day_weather) {
                    this.day_weather = day_weather;
                }

                public String getDay_weather_code() {
                    return day_weather_code;
                }

                public void setDay_weather_code(String day_weather_code) {
                    this.day_weather_code = day_weather_code;
                }

                public String getDay_weather_short() {
                    return day_weather_short;
                }

                public void setDay_weather_short(String day_weather_short) {
                    this.day_weather_short = day_weather_short;
                }

                public String getDay_wind_direction() {
                    return day_wind_direction;
                }

                public void setDay_wind_direction(String day_wind_direction) {
                    this.day_wind_direction = day_wind_direction;
                }

                public String getDay_wind_direction_code() {
                    return day_wind_direction_code;
                }

                public void setDay_wind_direction_code(String day_wind_direction_code) {
                    this.day_wind_direction_code = day_wind_direction_code;
                }

                public String getDay_wind_power() {
                    return day_wind_power;
                }

                public void setDay_wind_power(String day_wind_power) {
                    this.day_wind_power = day_wind_power;
                }

                public String getDay_wind_power_code() {
                    return day_wind_power_code;
                }

                public void setDay_wind_power_code(String day_wind_power_code) {
                    this.day_wind_power_code = day_wind_power_code;
                }

                public String getMax_degree() {
                    return max_degree;
                }

                public void setMax_degree(String max_degree) {
                    this.max_degree = max_degree;
                }

                public String getMin_degree() {
                    return min_degree;
                }

                public void setMin_degree(String min_degree) {
                    this.min_degree = min_degree;
                }

                public String getNight_weather() {
                    return night_weather;
                }

                public void setNight_weather(String night_weather) {
                    this.night_weather = night_weather;
                }

                public String getNight_weather_code() {
                    return night_weather_code;
                }

                public void setNight_weather_code(String night_weather_code) {
                    this.night_weather_code = night_weather_code;
                }

                public String getNight_weather_short() {
                    return night_weather_short;
                }

                public void setNight_weather_short(String night_weather_short) {
                    this.night_weather_short = night_weather_short;
                }

                public String getNight_wind_direction() {
                    return night_wind_direction;
                }

                public void setNight_wind_direction(String night_wind_direction) {
                    this.night_wind_direction = night_wind_direction;
                }

                public String getNight_wind_direction_code() {
                    return night_wind_direction_code;
                }

                public void setNight_wind_direction_code(String night_wind_direction_code) {
                    this.night_wind_direction_code = night_wind_direction_code;
                }

                public String getNight_wind_power() {
                    return night_wind_power;
                }

                public void setNight_wind_power(String night_wind_power) {
                    this.night_wind_power = night_wind_power;
                }

                public String getNight_wind_power_code() {
                    return night_wind_power_code;
                }

                public void setNight_wind_power_code(String night_wind_power_code) {
                    this.night_wind_power_code = night_wind_power_code;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$2Bean {
                /**
                 * day_weather : 多云
                 * day_weather_code : 01
                 * day_weather_short : 多云
                 * day_wind_direction : 西南风
                 * day_wind_direction_code : 5
                 * day_wind_power : 3
                 * day_wind_power_code : 0
                 * max_degree : 16
                 * min_degree : 3
                 * night_weather : 多云
                 * night_weather_code : 01
                 * night_weather_short : 多云
                 * night_wind_direction : 北风
                 * night_wind_direction_code : 8
                 * night_wind_power : 3
                 * night_wind_power_code : 0
                 * time : 2020-11-11
                 */

                private String day_weather;
                private String day_weather_code;
                private String day_weather_short;
                private String day_wind_direction;
                private String day_wind_direction_code;
                private String day_wind_power;
                private String day_wind_power_code;
                private String max_degree;
                private String min_degree;
                private String night_weather;
                private String night_weather_code;
                private String night_weather_short;
                private String night_wind_direction;
                private String night_wind_direction_code;
                private String night_wind_power;
                private String night_wind_power_code;
                private String time;

                public String getDay_weather() {
                    return day_weather;
                }

                public void setDay_weather(String day_weather) {
                    this.day_weather = day_weather;
                }

                public String getDay_weather_code() {
                    return day_weather_code;
                }

                public void setDay_weather_code(String day_weather_code) {
                    this.day_weather_code = day_weather_code;
                }

                public String getDay_weather_short() {
                    return day_weather_short;
                }

                public void setDay_weather_short(String day_weather_short) {
                    this.day_weather_short = day_weather_short;
                }

                public String getDay_wind_direction() {
                    return day_wind_direction;
                }

                public void setDay_wind_direction(String day_wind_direction) {
                    this.day_wind_direction = day_wind_direction;
                }

                public String getDay_wind_direction_code() {
                    return day_wind_direction_code;
                }

                public void setDay_wind_direction_code(String day_wind_direction_code) {
                    this.day_wind_direction_code = day_wind_direction_code;
                }

                public String getDay_wind_power() {
                    return day_wind_power;
                }

                public void setDay_wind_power(String day_wind_power) {
                    this.day_wind_power = day_wind_power;
                }

                public String getDay_wind_power_code() {
                    return day_wind_power_code;
                }

                public void setDay_wind_power_code(String day_wind_power_code) {
                    this.day_wind_power_code = day_wind_power_code;
                }

                public String getMax_degree() {
                    return max_degree;
                }

                public void setMax_degree(String max_degree) {
                    this.max_degree = max_degree;
                }

                public String getMin_degree() {
                    return min_degree;
                }

                public void setMin_degree(String min_degree) {
                    this.min_degree = min_degree;
                }

                public String getNight_weather() {
                    return night_weather;
                }

                public void setNight_weather(String night_weather) {
                    this.night_weather = night_weather;
                }

                public String getNight_weather_code() {
                    return night_weather_code;
                }

                public void setNight_weather_code(String night_weather_code) {
                    this.night_weather_code = night_weather_code;
                }

                public String getNight_weather_short() {
                    return night_weather_short;
                }

                public void setNight_weather_short(String night_weather_short) {
                    this.night_weather_short = night_weather_short;
                }

                public String getNight_wind_direction() {
                    return night_wind_direction;
                }

                public void setNight_wind_direction(String night_wind_direction) {
                    this.night_wind_direction = night_wind_direction;
                }

                public String getNight_wind_direction_code() {
                    return night_wind_direction_code;
                }

                public void setNight_wind_direction_code(String night_wind_direction_code) {
                    this.night_wind_direction_code = night_wind_direction_code;
                }

                public String getNight_wind_power() {
                    return night_wind_power;
                }

                public void setNight_wind_power(String night_wind_power) {
                    this.night_wind_power = night_wind_power;
                }

                public String getNight_wind_power_code() {
                    return night_wind_power_code;
                }

                public void setNight_wind_power_code(String night_wind_power_code) {
                    this.night_wind_power_code = night_wind_power_code;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$3Bean {
                /**
                 * day_weather : 晴
                 * day_weather_code : 00
                 * day_weather_short : 晴
                 * day_wind_direction : 北风
                 * day_wind_direction_code : 8
                 * day_wind_power : 4
                 * day_wind_power_code : 1
                 * max_degree : 19
                 * min_degree : 3
                 * night_weather : 晴
                 * night_weather_code : 00
                 * night_weather_short : 晴
                 * night_wind_direction : 北风
                 * night_wind_direction_code : 8
                 * night_wind_power : 3
                 * night_wind_power_code : 0
                 * time : 2020-11-12
                 */

                private String day_weather;
                private String day_weather_code;
                private String day_weather_short;
                private String day_wind_direction;
                private String day_wind_direction_code;
                private String day_wind_power;
                private String day_wind_power_code;
                private String max_degree;
                private String min_degree;
                private String night_weather;
                private String night_weather_code;
                private String night_weather_short;
                private String night_wind_direction;
                private String night_wind_direction_code;
                private String night_wind_power;
                private String night_wind_power_code;
                private String time;

                public String getDay_weather() {
                    return day_weather;
                }

                public void setDay_weather(String day_weather) {
                    this.day_weather = day_weather;
                }

                public String getDay_weather_code() {
                    return day_weather_code;
                }

                public void setDay_weather_code(String day_weather_code) {
                    this.day_weather_code = day_weather_code;
                }

                public String getDay_weather_short() {
                    return day_weather_short;
                }

                public void setDay_weather_short(String day_weather_short) {
                    this.day_weather_short = day_weather_short;
                }

                public String getDay_wind_direction() {
                    return day_wind_direction;
                }

                public void setDay_wind_direction(String day_wind_direction) {
                    this.day_wind_direction = day_wind_direction;
                }

                public String getDay_wind_direction_code() {
                    return day_wind_direction_code;
                }

                public void setDay_wind_direction_code(String day_wind_direction_code) {
                    this.day_wind_direction_code = day_wind_direction_code;
                }

                public String getDay_wind_power() {
                    return day_wind_power;
                }

                public void setDay_wind_power(String day_wind_power) {
                    this.day_wind_power = day_wind_power;
                }

                public String getDay_wind_power_code() {
                    return day_wind_power_code;
                }

                public void setDay_wind_power_code(String day_wind_power_code) {
                    this.day_wind_power_code = day_wind_power_code;
                }

                public String getMax_degree() {
                    return max_degree;
                }

                public void setMax_degree(String max_degree) {
                    this.max_degree = max_degree;
                }

                public String getMin_degree() {
                    return min_degree;
                }

                public void setMin_degree(String min_degree) {
                    this.min_degree = min_degree;
                }

                public String getNight_weather() {
                    return night_weather;
                }

                public void setNight_weather(String night_weather) {
                    this.night_weather = night_weather;
                }

                public String getNight_weather_code() {
                    return night_weather_code;
                }

                public void setNight_weather_code(String night_weather_code) {
                    this.night_weather_code = night_weather_code;
                }

                public String getNight_weather_short() {
                    return night_weather_short;
                }

                public void setNight_weather_short(String night_weather_short) {
                    this.night_weather_short = night_weather_short;
                }

                public String getNight_wind_direction() {
                    return night_wind_direction;
                }

                public void setNight_wind_direction(String night_wind_direction) {
                    this.night_wind_direction = night_wind_direction;
                }

                public String getNight_wind_direction_code() {
                    return night_wind_direction_code;
                }

                public void setNight_wind_direction_code(String night_wind_direction_code) {
                    this.night_wind_direction_code = night_wind_direction_code;
                }

                public String getNight_wind_power() {
                    return night_wind_power;
                }

                public void setNight_wind_power(String night_wind_power) {
                    this.night_wind_power = night_wind_power;
                }

                public String getNight_wind_power_code() {
                    return night_wind_power_code;
                }

                public void setNight_wind_power_code(String night_wind_power_code) {
                    this.night_wind_power_code = night_wind_power_code;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$4Bean {
                /**
                 * day_weather : 晴
                 * day_weather_code : 00
                 * day_weather_short : 晴
                 * day_wind_direction : 南风
                 * day_wind_direction_code : 4
                 * day_wind_power : 3
                 * day_wind_power_code : 0
                 * max_degree : 15
                 * min_degree : 3
                 * night_weather : 多云
                 * night_weather_code : 01
                 * night_weather_short : 多云
                 * night_wind_direction : 南风
                 * night_wind_direction_code : 4
                 * night_wind_power : 3
                 * night_wind_power_code : 0
                 * time : 2020-11-13
                 */

                private String day_weather;
                private String day_weather_code;
                private String day_weather_short;
                private String day_wind_direction;
                private String day_wind_direction_code;
                private String day_wind_power;
                private String day_wind_power_code;
                private String max_degree;
                private String min_degree;
                private String night_weather;
                private String night_weather_code;
                private String night_weather_short;
                private String night_wind_direction;
                private String night_wind_direction_code;
                private String night_wind_power;
                private String night_wind_power_code;
                private String time;

                public String getDay_weather() {
                    return day_weather;
                }

                public void setDay_weather(String day_weather) {
                    this.day_weather = day_weather;
                }

                public String getDay_weather_code() {
                    return day_weather_code;
                }

                public void setDay_weather_code(String day_weather_code) {
                    this.day_weather_code = day_weather_code;
                }

                public String getDay_weather_short() {
                    return day_weather_short;
                }

                public void setDay_weather_short(String day_weather_short) {
                    this.day_weather_short = day_weather_short;
                }

                public String getDay_wind_direction() {
                    return day_wind_direction;
                }

                public void setDay_wind_direction(String day_wind_direction) {
                    this.day_wind_direction = day_wind_direction;
                }

                public String getDay_wind_direction_code() {
                    return day_wind_direction_code;
                }

                public void setDay_wind_direction_code(String day_wind_direction_code) {
                    this.day_wind_direction_code = day_wind_direction_code;
                }

                public String getDay_wind_power() {
                    return day_wind_power;
                }

                public void setDay_wind_power(String day_wind_power) {
                    this.day_wind_power = day_wind_power;
                }

                public String getDay_wind_power_code() {
                    return day_wind_power_code;
                }

                public void setDay_wind_power_code(String day_wind_power_code) {
                    this.day_wind_power_code = day_wind_power_code;
                }

                public String getMax_degree() {
                    return max_degree;
                }

                public void setMax_degree(String max_degree) {
                    this.max_degree = max_degree;
                }

                public String getMin_degree() {
                    return min_degree;
                }

                public void setMin_degree(String min_degree) {
                    this.min_degree = min_degree;
                }

                public String getNight_weather() {
                    return night_weather;
                }

                public void setNight_weather(String night_weather) {
                    this.night_weather = night_weather;
                }

                public String getNight_weather_code() {
                    return night_weather_code;
                }

                public void setNight_weather_code(String night_weather_code) {
                    this.night_weather_code = night_weather_code;
                }

                public String getNight_weather_short() {
                    return night_weather_short;
                }

                public void setNight_weather_short(String night_weather_short) {
                    this.night_weather_short = night_weather_short;
                }

                public String getNight_wind_direction() {
                    return night_wind_direction;
                }

                public void setNight_wind_direction(String night_wind_direction) {
                    this.night_wind_direction = night_wind_direction;
                }

                public String getNight_wind_direction_code() {
                    return night_wind_direction_code;
                }

                public void setNight_wind_direction_code(String night_wind_direction_code) {
                    this.night_wind_direction_code = night_wind_direction_code;
                }

                public String getNight_wind_power() {
                    return night_wind_power;
                }

                public void setNight_wind_power(String night_wind_power) {
                    this.night_wind_power = night_wind_power;
                }

                public String getNight_wind_power_code() {
                    return night_wind_power_code;
                }

                public void setNight_wind_power_code(String night_wind_power_code) {
                    this.night_wind_power_code = night_wind_power_code;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$5Bean {
                /**
                 * day_weather : 多云
                 * day_weather_code : 01
                 * day_weather_short : 多云
                 * day_wind_direction : 南风
                 * day_wind_direction_code : 4
                 * day_wind_power : 3
                 * day_wind_power_code : 0
                 * max_degree : 14
                 * min_degree : 4
                 * night_weather : 多云
                 * night_weather_code : 01
                 * night_weather_short : 多云
                 * night_wind_direction : 北风
                 * night_wind_direction_code : 8
                 * night_wind_power : 3
                 * night_wind_power_code : 0
                 * time : 2020-11-14
                 */

                private String day_weather;
                private String day_weather_code;
                private String day_weather_short;
                private String day_wind_direction;
                private String day_wind_direction_code;
                private String day_wind_power;
                private String day_wind_power_code;
                private String max_degree;
                private String min_degree;
                private String night_weather;
                private String night_weather_code;
                private String night_weather_short;
                private String night_wind_direction;
                private String night_wind_direction_code;
                private String night_wind_power;
                private String night_wind_power_code;
                private String time;

                public String getDay_weather() {
                    return day_weather;
                }

                public void setDay_weather(String day_weather) {
                    this.day_weather = day_weather;
                }

                public String getDay_weather_code() {
                    return day_weather_code;
                }

                public void setDay_weather_code(String day_weather_code) {
                    this.day_weather_code = day_weather_code;
                }

                public String getDay_weather_short() {
                    return day_weather_short;
                }

                public void setDay_weather_short(String day_weather_short) {
                    this.day_weather_short = day_weather_short;
                }

                public String getDay_wind_direction() {
                    return day_wind_direction;
                }

                public void setDay_wind_direction(String day_wind_direction) {
                    this.day_wind_direction = day_wind_direction;
                }

                public String getDay_wind_direction_code() {
                    return day_wind_direction_code;
                }

                public void setDay_wind_direction_code(String day_wind_direction_code) {
                    this.day_wind_direction_code = day_wind_direction_code;
                }

                public String getDay_wind_power() {
                    return day_wind_power;
                }

                public void setDay_wind_power(String day_wind_power) {
                    this.day_wind_power = day_wind_power;
                }

                public String getDay_wind_power_code() {
                    return day_wind_power_code;
                }

                public void setDay_wind_power_code(String day_wind_power_code) {
                    this.day_wind_power_code = day_wind_power_code;
                }

                public String getMax_degree() {
                    return max_degree;
                }

                public void setMax_degree(String max_degree) {
                    this.max_degree = max_degree;
                }

                public String getMin_degree() {
                    return min_degree;
                }

                public void setMin_degree(String min_degree) {
                    this.min_degree = min_degree;
                }

                public String getNight_weather() {
                    return night_weather;
                }

                public void setNight_weather(String night_weather) {
                    this.night_weather = night_weather;
                }

                public String getNight_weather_code() {
                    return night_weather_code;
                }

                public void setNight_weather_code(String night_weather_code) {
                    this.night_weather_code = night_weather_code;
                }

                public String getNight_weather_short() {
                    return night_weather_short;
                }

                public void setNight_weather_short(String night_weather_short) {
                    this.night_weather_short = night_weather_short;
                }

                public String getNight_wind_direction() {
                    return night_wind_direction;
                }

                public void setNight_wind_direction(String night_wind_direction) {
                    this.night_wind_direction = night_wind_direction;
                }

                public String getNight_wind_direction_code() {
                    return night_wind_direction_code;
                }

                public void setNight_wind_direction_code(String night_wind_direction_code) {
                    this.night_wind_direction_code = night_wind_direction_code;
                }

                public String getNight_wind_power() {
                    return night_wind_power;
                }

                public void setNight_wind_power(String night_wind_power) {
                    this.night_wind_power = night_wind_power;
                }

                public String getNight_wind_power_code() {
                    return night_wind_power_code;
                }

                public void setNight_wind_power_code(String night_wind_power_code) {
                    this.night_wind_power_code = night_wind_power_code;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$6Bean {
                /**
                 * day_weather : 多云
                 * day_weather_code : 01
                 * day_weather_short : 多云
                 * day_wind_direction : 北风
                 * day_wind_direction_code : 8
                 * day_wind_power : 3
                 * day_wind_power_code : 0
                 * max_degree : 15
                 * min_degree : 6
                 * night_weather : 小雨
                 * night_weather_code : 07
                 * night_weather_short : 小雨
                 * night_wind_direction : 东风
                 * night_wind_direction_code : 2
                 * night_wind_power : 3
                 * night_wind_power_code : 0
                 * time : 2020-11-15
                 */

                private String day_weather;
                private String day_weather_code;
                private String day_weather_short;
                private String day_wind_direction;
                private String day_wind_direction_code;
                private String day_wind_power;
                private String day_wind_power_code;
                private String max_degree;
                private String min_degree;
                private String night_weather;
                private String night_weather_code;
                private String night_weather_short;
                private String night_wind_direction;
                private String night_wind_direction_code;
                private String night_wind_power;
                private String night_wind_power_code;
                private String time;

                public String getDay_weather() {
                    return day_weather;
                }

                public void setDay_weather(String day_weather) {
                    this.day_weather = day_weather;
                }

                public String getDay_weather_code() {
                    return day_weather_code;
                }

                public void setDay_weather_code(String day_weather_code) {
                    this.day_weather_code = day_weather_code;
                }

                public String getDay_weather_short() {
                    return day_weather_short;
                }

                public void setDay_weather_short(String day_weather_short) {
                    this.day_weather_short = day_weather_short;
                }

                public String getDay_wind_direction() {
                    return day_wind_direction;
                }

                public void setDay_wind_direction(String day_wind_direction) {
                    this.day_wind_direction = day_wind_direction;
                }

                public String getDay_wind_direction_code() {
                    return day_wind_direction_code;
                }

                public void setDay_wind_direction_code(String day_wind_direction_code) {
                    this.day_wind_direction_code = day_wind_direction_code;
                }

                public String getDay_wind_power() {
                    return day_wind_power;
                }

                public void setDay_wind_power(String day_wind_power) {
                    this.day_wind_power = day_wind_power;
                }

                public String getDay_wind_power_code() {
                    return day_wind_power_code;
                }

                public void setDay_wind_power_code(String day_wind_power_code) {
                    this.day_wind_power_code = day_wind_power_code;
                }

                public String getMax_degree() {
                    return max_degree;
                }

                public void setMax_degree(String max_degree) {
                    this.max_degree = max_degree;
                }

                public String getMin_degree() {
                    return min_degree;
                }

                public void setMin_degree(String min_degree) {
                    this.min_degree = min_degree;
                }

                public String getNight_weather() {
                    return night_weather;
                }

                public void setNight_weather(String night_weather) {
                    this.night_weather = night_weather;
                }

                public String getNight_weather_code() {
                    return night_weather_code;
                }

                public void setNight_weather_code(String night_weather_code) {
                    this.night_weather_code = night_weather_code;
                }

                public String getNight_weather_short() {
                    return night_weather_short;
                }

                public void setNight_weather_short(String night_weather_short) {
                    this.night_weather_short = night_weather_short;
                }

                public String getNight_wind_direction() {
                    return night_wind_direction;
                }

                public void setNight_wind_direction(String night_wind_direction) {
                    this.night_wind_direction = night_wind_direction;
                }

                public String getNight_wind_direction_code() {
                    return night_wind_direction_code;
                }

                public void setNight_wind_direction_code(String night_wind_direction_code) {
                    this.night_wind_direction_code = night_wind_direction_code;
                }

                public String getNight_wind_power() {
                    return night_wind_power;
                }

                public void setNight_wind_power(String night_wind_power) {
                    this.night_wind_power = night_wind_power;
                }

                public String getNight_wind_power_code() {
                    return night_wind_power_code;
                }

                public void setNight_wind_power_code(String night_wind_power_code) {
                    this.night_wind_power_code = night_wind_power_code;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$7Bean {
                /**
                 * day_weather : 多云
                 * day_weather_code : 01
                 * day_weather_short : 多云
                 * day_wind_direction : 东风
                 * day_wind_direction_code : 2
                 * day_wind_power : 3
                 * day_wind_power_code : 0
                 * max_degree : 12
                 * min_degree : 5
                 * night_weather : 多云
                 * night_weather_code : 01
                 * night_weather_short : 多云
                 * night_wind_direction : 南风
                 * night_wind_direction_code : 4
                 * night_wind_power : 3
                 * night_wind_power_code : 0
                 * time : 2020-11-16
                 */

                private String day_weather;
                private String day_weather_code;
                private String day_weather_short;
                private String day_wind_direction;
                private String day_wind_direction_code;
                private String day_wind_power;
                private String day_wind_power_code;
                private String max_degree;
                private String min_degree;
                private String night_weather;
                private String night_weather_code;
                private String night_weather_short;
                private String night_wind_direction;
                private String night_wind_direction_code;
                private String night_wind_power;
                private String night_wind_power_code;
                private String time;

                public String getDay_weather() {
                    return day_weather;
                }

                public void setDay_weather(String day_weather) {
                    this.day_weather = day_weather;
                }

                public String getDay_weather_code() {
                    return day_weather_code;
                }

                public void setDay_weather_code(String day_weather_code) {
                    this.day_weather_code = day_weather_code;
                }

                public String getDay_weather_short() {
                    return day_weather_short;
                }

                public void setDay_weather_short(String day_weather_short) {
                    this.day_weather_short = day_weather_short;
                }

                public String getDay_wind_direction() {
                    return day_wind_direction;
                }

                public void setDay_wind_direction(String day_wind_direction) {
                    this.day_wind_direction = day_wind_direction;
                }

                public String getDay_wind_direction_code() {
                    return day_wind_direction_code;
                }

                public void setDay_wind_direction_code(String day_wind_direction_code) {
                    this.day_wind_direction_code = day_wind_direction_code;
                }

                public String getDay_wind_power() {
                    return day_wind_power;
                }

                public void setDay_wind_power(String day_wind_power) {
                    this.day_wind_power = day_wind_power;
                }

                public String getDay_wind_power_code() {
                    return day_wind_power_code;
                }

                public void setDay_wind_power_code(String day_wind_power_code) {
                    this.day_wind_power_code = day_wind_power_code;
                }

                public String getMax_degree() {
                    return max_degree;
                }

                public void setMax_degree(String max_degree) {
                    this.max_degree = max_degree;
                }

                public String getMin_degree() {
                    return min_degree;
                }

                public void setMin_degree(String min_degree) {
                    this.min_degree = min_degree;
                }

                public String getNight_weather() {
                    return night_weather;
                }

                public void setNight_weather(String night_weather) {
                    this.night_weather = night_weather;
                }

                public String getNight_weather_code() {
                    return night_weather_code;
                }

                public void setNight_weather_code(String night_weather_code) {
                    this.night_weather_code = night_weather_code;
                }

                public String getNight_weather_short() {
                    return night_weather_short;
                }

                public void setNight_weather_short(String night_weather_short) {
                    this.night_weather_short = night_weather_short;
                }

                public String getNight_wind_direction() {
                    return night_wind_direction;
                }

                public void setNight_wind_direction(String night_wind_direction) {
                    this.night_wind_direction = night_wind_direction;
                }

                public String getNight_wind_direction_code() {
                    return night_wind_direction_code;
                }

                public void setNight_wind_direction_code(String night_wind_direction_code) {
                    this.night_wind_direction_code = night_wind_direction_code;
                }

                public String getNight_wind_power() {
                    return night_wind_power;
                }

                public void setNight_wind_power(String night_wind_power) {
                    this.night_wind_power = night_wind_power;
                }

                public String getNight_wind_power_code() {
                    return night_wind_power_code;
                }

                public void setNight_wind_power_code(String night_wind_power_code) {
                    this.night_wind_power_code = night_wind_power_code;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }
        }

        public static class IndexBean {
            /**
             * airconditioner : {"detail":"您将感到很舒适，一般不需要开启空调。","info":"较少开启","name":"空调开启"}
             * allergy : {"detail":"天气条件极不易诱发过敏。","info":"极不易发","name":"过敏"}
             * carwash : {"detail":"适宜洗车，未来持续两天无雨天气较好，适合擦洗汽车，蓝天白云、风和日丽将伴您的车子连日洁净。","info":"适宜","name":"洗车"}
             * chill : {"detail":"温度未达到风寒所需的低温，稍作防寒准备即可。","info":"无","name":"风寒"}
             * clothes : {"detail":"建议着厚外套加毛衣等服装。年老体弱者宜着大衣、呢外套加羊毛衫。","info":"较冷","name":"穿衣"}
             * cold : {"detail":"昼夜温差极大，且空气湿度较大，寒冷潮湿，极易发生感冒，请特别注意增减衣服保暖防寒。","info":"极易发","name":"感冒"}
             * comfort : {"detail":"白天虽然天气晴好，但早晚会感觉偏凉，午后舒适、宜人。","info":"较舒适","name":"舒适度"}
             * diffusion : {"detail":"气象条件对空气污染物稀释、扩散和清除无明显影响。","info":"中","name":"空气污染扩散条件"}
             * dry : {"detail":"天气较好，路面比较干燥，路况较好。","info":"干燥","name":"路况"}
             * drying : {"detail":"天气不错，适宜晾晒。赶紧把久未见阳光的衣物搬出来吸收一下太阳的味道吧！","info":"适宜","name":"晾晒"}
             * fish : {"detail":"较适合垂钓，但风力稍大，会对垂钓产生一定的影响。","info":"较适宜","name":"钓鱼"}
             * heatstroke : {"detail":"天气舒适，对易中暑人群来说非常友善。","info":"无中暑风险","name":"中暑"}
             * makeup : {"detail":"风力不大，建议用中性保湿型霜类化妆品，无需选用防晒化妆品。","info":"保湿","name":"化妆"}
             * mood : {"detail":"天气较好，空气温润，和风飘飘，美好的天气会带来一天接踵而来的好心情。","info":"好","name":"心情"}
             * morning : {"detail":"天气不错，空气清新。","info":"适宜","name":"晨练"}
             * sports : {"detail":"天气较好，无雨水困扰，较适宜进行各种运动，但因天气凉，在户外运动请注意增减衣物。","info":"较适宜","name":"运动"}
             * sunglasses : {"detail":"白天天气晴朗，太阳辐射较强，建议佩戴透射比1级且标注UV380-UV400的遮阳镜","info":"必要","name":"太阳镜"}
             * sunscreen : {"detail":"属中等强度紫外辐射天气，注意防护，建议涂擦SPF指数高于15，PA+的防晒护肤品。","info":"中等","name":"防晒"}
             * time : 20201110
             * tourism : {"detail":"天气较好，温度适宜，是个好天气哦。这样的天气适宜旅游，您可以尽情地享受大自然的风光。","info":"适宜","name":"旅游"}
             * traffic : {"detail":"天气较好，路面干燥，交通气象条件良好，车辆可以正常行驶。","info":"良好","name":"交通"}
             * ultraviolet : {"detail":"属中等强度紫外线辐射天气，建议涂擦SPF高于15、PA+的防晒护肤品，戴帽子、太阳镜。","info":"中等","name":"紫外线强度"}
             * umbrella : {"detail":"天气较好，您在出门的时候无须带雨伞。","info":"不带伞","name":"雨伞"}
             */

            private AirconditionerBean airconditioner;
            private AllergyBean allergy;
            private CarwashBean carwash;
            private ChillBean chill;
            private ClothesBean clothes;
            private ColdBean cold;
            private ComfortBean comfort;
            private DiffusionBean diffusion;
            private DryBean dry;
            private DryingBean drying;
            private FishBean fish;
            private HeatstrokeBean heatstroke;
            private MakeupBean makeup;
            private MoodBean mood;
            private MorningBean morning;
            private SportsBean sports;
            private SunglassesBean sunglasses;
            private SunscreenBean sunscreen;
            private String time;
            private TourismBean tourism;
            private TrafficBean traffic;
            private UltravioletBean ultraviolet;
            private UmbrellaBean umbrella;

            public AirconditionerBean getAirconditioner() {
                return airconditioner;
            }

            public void setAirconditioner(AirconditionerBean airconditioner) {
                this.airconditioner = airconditioner;
            }

            public AllergyBean getAllergy() {
                return allergy;
            }

            public void setAllergy(AllergyBean allergy) {
                this.allergy = allergy;
            }

            public CarwashBean getCarwash() {
                return carwash;
            }

            public void setCarwash(CarwashBean carwash) {
                this.carwash = carwash;
            }

            public ChillBean getChill() {
                return chill;
            }

            public void setChill(ChillBean chill) {
                this.chill = chill;
            }

            public ClothesBean getClothes() {
                return clothes;
            }

            public void setClothes(ClothesBean clothes) {
                this.clothes = clothes;
            }

            public ColdBean getCold() {
                return cold;
            }

            public void setCold(ColdBean cold) {
                this.cold = cold;
            }

            public ComfortBean getComfort() {
                return comfort;
            }

            public void setComfort(ComfortBean comfort) {
                this.comfort = comfort;
            }

            public DiffusionBean getDiffusion() {
                return diffusion;
            }

            public void setDiffusion(DiffusionBean diffusion) {
                this.diffusion = diffusion;
            }

            public DryBean getDry() {
                return dry;
            }

            public void setDry(DryBean dry) {
                this.dry = dry;
            }

            public DryingBean getDrying() {
                return drying;
            }

            public void setDrying(DryingBean drying) {
                this.drying = drying;
            }

            public FishBean getFish() {
                return fish;
            }

            public void setFish(FishBean fish) {
                this.fish = fish;
            }

            public HeatstrokeBean getHeatstroke() {
                return heatstroke;
            }

            public void setHeatstroke(HeatstrokeBean heatstroke) {
                this.heatstroke = heatstroke;
            }

            public MakeupBean getMakeup() {
                return makeup;
            }

            public void setMakeup(MakeupBean makeup) {
                this.makeup = makeup;
            }

            public MoodBean getMood() {
                return mood;
            }

            public void setMood(MoodBean mood) {
                this.mood = mood;
            }

            public MorningBean getMorning() {
                return morning;
            }

            public void setMorning(MorningBean morning) {
                this.morning = morning;
            }

            public SportsBean getSports() {
                return sports;
            }

            public void setSports(SportsBean sports) {
                this.sports = sports;
            }

            public SunglassesBean getSunglasses() {
                return sunglasses;
            }

            public void setSunglasses(SunglassesBean sunglasses) {
                this.sunglasses = sunglasses;
            }

            public SunscreenBean getSunscreen() {
                return sunscreen;
            }

            public void setSunscreen(SunscreenBean sunscreen) {
                this.sunscreen = sunscreen;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }

            public TourismBean getTourism() {
                return tourism;
            }

            public void setTourism(TourismBean tourism) {
                this.tourism = tourism;
            }

            public TrafficBean getTraffic() {
                return traffic;
            }

            public void setTraffic(TrafficBean traffic) {
                this.traffic = traffic;
            }

            public UltravioletBean getUltraviolet() {
                return ultraviolet;
            }

            public void setUltraviolet(UltravioletBean ultraviolet) {
                this.ultraviolet = ultraviolet;
            }

            public UmbrellaBean getUmbrella() {
                return umbrella;
            }

            public void setUmbrella(UmbrellaBean umbrella) {
                this.umbrella = umbrella;
            }

            public static class AirconditionerBean {
                /**
                 * detail : 您将感到很舒适，一般不需要开启空调。
                 * info : 较少开启
                 * name : 空调开启
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class AllergyBean {
                /**
                 * detail : 天气条件极不易诱发过敏。
                 * info : 极不易发
                 * name : 过敏
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class CarwashBean {
                /**
                 * detail : 适宜洗车，未来持续两天无雨天气较好，适合擦洗汽车，蓝天白云、风和日丽将伴您的车子连日洁净。
                 * info : 适宜
                 * name : 洗车
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class ChillBean {
                /**
                 * detail : 温度未达到风寒所需的低温，稍作防寒准备即可。
                 * info : 无
                 * name : 风寒
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class ClothesBean {
                /**
                 * detail : 建议着厚外套加毛衣等服装。年老体弱者宜着大衣、呢外套加羊毛衫。
                 * info : 较冷
                 * name : 穿衣
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class ColdBean {
                /**
                 * detail : 昼夜温差极大，且空气湿度较大，寒冷潮湿，极易发生感冒，请特别注意增减衣服保暖防寒。
                 * info : 极易发
                 * name : 感冒
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class ComfortBean {
                /**
                 * detail : 白天虽然天气晴好，但早晚会感觉偏凉，午后舒适、宜人。
                 * info : 较舒适
                 * name : 舒适度
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class DiffusionBean {
                /**
                 * detail : 气象条件对空气污染物稀释、扩散和清除无明显影响。
                 * info : 中
                 * name : 空气污染扩散条件
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class DryBean {
                /**
                 * detail : 天气较好，路面比较干燥，路况较好。
                 * info : 干燥
                 * name : 路况
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class DryingBean {
                /**
                 * detail : 天气不错，适宜晾晒。赶紧把久未见阳光的衣物搬出来吸收一下太阳的味道吧！
                 * info : 适宜
                 * name : 晾晒
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class FishBean {
                /**
                 * detail : 较适合垂钓，但风力稍大，会对垂钓产生一定的影响。
                 * info : 较适宜
                 * name : 钓鱼
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class HeatstrokeBean {
                /**
                 * detail : 天气舒适，对易中暑人群来说非常友善。
                 * info : 无中暑风险
                 * name : 中暑
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class MakeupBean {
                /**
                 * detail : 风力不大，建议用中性保湿型霜类化妆品，无需选用防晒化妆品。
                 * info : 保湿
                 * name : 化妆
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class MoodBean {
                /**
                 * detail : 天气较好，空气温润，和风飘飘，美好的天气会带来一天接踵而来的好心情。
                 * info : 好
                 * name : 心情
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class MorningBean {
                /**
                 * detail : 天气不错，空气清新。
                 * info : 适宜
                 * name : 晨练
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class SportsBean {
                /**
                 * detail : 天气较好，无雨水困扰，较适宜进行各种运动，但因天气凉，在户外运动请注意增减衣物。
                 * info : 较适宜
                 * name : 运动
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class SunglassesBean {
                /**
                 * detail : 白天天气晴朗，太阳辐射较强，建议佩戴透射比1级且标注UV380-UV400的遮阳镜
                 * info : 必要
                 * name : 太阳镜
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class SunscreenBean {
                /**
                 * detail : 属中等强度紫外辐射天气，注意防护，建议涂擦SPF指数高于15，PA+的防晒护肤品。
                 * info : 中等
                 * name : 防晒
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class TourismBean {
                /**
                 * detail : 天气较好，温度适宜，是个好天气哦。这样的天气适宜旅游，您可以尽情地享受大自然的风光。
                 * info : 适宜
                 * name : 旅游
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class TrafficBean {
                /**
                 * detail : 天气较好，路面干燥，交通气象条件良好，车辆可以正常行驶。
                 * info : 良好
                 * name : 交通
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class UltravioletBean {
                /**
                 * detail : 属中等强度紫外线辐射天气，建议涂擦SPF高于15、PA+的防晒护肤品，戴帽子、太阳镜。
                 * info : 中等
                 * name : 紫外线强度
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class UmbrellaBean {
                /**
                 * detail : 天气较好，您在出门的时候无须带雨伞。
                 * info : 不带伞
                 * name : 雨伞
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }
        }

        public static class ObserveBean {
            /**
             * degree : 4
             * humidity : 76
             * precipitation : 0
             * pressure : 1024
             * update_time : 202011110140
             * weather : 晴
             * weather_code : 00
             * weather_short : 晴
             * wind_direction : 1
             * wind_power : 1
             */

            private String degree;
            private String humidity;
            private String precipitation;
            private String pressure;
            private String update_time;
            private String weather;
            private String weather_code;
            private String weather_short;
            private String wind_direction;
            private String wind_power;

            public String getDegree() {
                return degree;
            }

            public void setDegree(String degree) {
                this.degree = degree;
            }

            public String getHumidity() {
                return humidity;
            }

            public void setHumidity(String humidity) {
                this.humidity = humidity;
            }

            public String getPrecipitation() {
                return precipitation;
            }

            public void setPrecipitation(String precipitation) {
                this.precipitation = precipitation;
            }

            public String getPressure() {
                return pressure;
            }

            public void setPressure(String pressure) {
                this.pressure = pressure;
            }

            public String getUpdate_time() {
                return update_time;
            }

            public void setUpdate_time(String update_time) {
                this.update_time = update_time;
            }

            public String getWeather() {
                return weather;
            }

            public void setWeather(String weather) {
                this.weather = weather;
            }

            public String getWeather_code() {
                return weather_code;
            }

            public void setWeather_code(String weather_code) {
                this.weather_code = weather_code;
            }

            public String getWeather_short() {
                return weather_short;
            }

            public void setWeather_short(String weather_short) {
                this.weather_short = weather_short;
            }

            public String getWind_direction() {
                return wind_direction;
            }

            public void setWind_direction(String wind_direction) {
                this.wind_direction = wind_direction;
            }

            public String getWind_power() {
                return wind_power;
            }

            public void setWind_power(String wind_power) {
                this.wind_power = wind_power;
            }
        }

        public static class RiseBean {
            /**
             * 0 : {"sunrise":"06:55","sunset":"17:01","time":"20201111"}
             * 1 : {"sunrise":"06:56","sunset":"17:00","time":"20201112"}
             * 2 : {"sunrise":"06:57","sunset":"17:00","time":"20201113"}
             * 3 : {"sunrise":"06:58","sunset":"16:59","time":"20201114"}
             * 4 : {"sunrise":"06:59","sunset":"16:58","time":"20201115"}
             * 5 : {"sunrise":"07:00","sunset":"16:57","time":"20201116"}
             * 6 : {"sunrise":"07:01","sunset":"16:56","time":"20201117"}
             * 7 : {"sunrise":"07:03","sunset":"16:56","time":"20201118"}
             * 8 : {"sunrise":"07:04","sunset":"16:55","time":"20201119"}
             * 9 : {"sunrise":"07:05","sunset":"16:54","time":"20201120"}
             * 10 : {"sunrise":"07:06","sunset":"16:54","time":"20201121"}
             * 11 : {"sunrise":"07:07","sunset":"16:53","time":"20201122"}
             * 12 : {"sunrise":"07:08","sunset":"16:53","time":"20201123"}
             * 13 : {"sunrise":"07:09","sunset":"16:52","time":"20201124"}
             * 14 : {"sunrise":"07:10","sunset":"16:52","time":"20201125"}
             * 15 : {"sunrise":"","sunset":"","time":"20201110"}
             */

            @SerializedName("0")
            private _$0BeanX _$0;
            @SerializedName("1")
            private _$1BeanX _$1;
            @SerializedName("2")
            private _$2BeanX _$2;
            @SerializedName("3")
            private _$3BeanX _$3;
            @SerializedName("4")
            private _$4BeanX _$4;
            @SerializedName("5")
            private _$5BeanX _$5;
            @SerializedName("6")
            private _$6BeanX _$6;
            @SerializedName("7")
            private _$7BeanX _$7;
            @SerializedName("8")
            private _$8Bean _$8;
            @SerializedName("9")
            private _$9Bean _$9;
            @SerializedName("10")
            private _$10Bean _$10;
            @SerializedName("11")
            private _$11Bean _$11;
            @SerializedName("12")
            private _$12Bean _$12;
            @SerializedName("13")
            private _$13Bean _$13;
            @SerializedName("14")
            private _$14Bean _$14;
            @SerializedName("15")
            private _$15Bean _$15;

            public _$0BeanX get_$0() {
                return _$0;
            }

            public void set_$0(_$0BeanX _$0) {
                this._$0 = _$0;
            }

            public _$1BeanX get_$1() {
                return _$1;
            }

            public void set_$1(_$1BeanX _$1) {
                this._$1 = _$1;
            }

            public _$2BeanX get_$2() {
                return _$2;
            }

            public void set_$2(_$2BeanX _$2) {
                this._$2 = _$2;
            }

            public _$3BeanX get_$3() {
                return _$3;
            }

            public void set_$3(_$3BeanX _$3) {
                this._$3 = _$3;
            }

            public _$4BeanX get_$4() {
                return _$4;
            }

            public void set_$4(_$4BeanX _$4) {
                this._$4 = _$4;
            }

            public _$5BeanX get_$5() {
                return _$5;
            }

            public void set_$5(_$5BeanX _$5) {
                this._$5 = _$5;
            }

            public _$6BeanX get_$6() {
                return _$6;
            }

            public void set_$6(_$6BeanX _$6) {
                this._$6 = _$6;
            }

            public _$7BeanX get_$7() {
                return _$7;
            }

            public void set_$7(_$7BeanX _$7) {
                this._$7 = _$7;
            }

            public _$8Bean get_$8() {
                return _$8;
            }

            public void set_$8(_$8Bean _$8) {
                this._$8 = _$8;
            }

            public _$9Bean get_$9() {
                return _$9;
            }

            public void set_$9(_$9Bean _$9) {
                this._$9 = _$9;
            }

            public _$10Bean get_$10() {
                return _$10;
            }

            public void set_$10(_$10Bean _$10) {
                this._$10 = _$10;
            }

            public _$11Bean get_$11() {
                return _$11;
            }

            public void set_$11(_$11Bean _$11) {
                this._$11 = _$11;
            }

            public _$12Bean get_$12() {
                return _$12;
            }

            public void set_$12(_$12Bean _$12) {
                this._$12 = _$12;
            }

            public _$13Bean get_$13() {
                return _$13;
            }

            public void set_$13(_$13Bean _$13) {
                this._$13 = _$13;
            }

            public _$14Bean get_$14() {
                return _$14;
            }

            public void set_$14(_$14Bean _$14) {
                this._$14 = _$14;
            }

            public _$15Bean get_$15() {
                return _$15;
            }

            public void set_$15(_$15Bean _$15) {
                this._$15 = _$15;
            }

            public static class _$0BeanX {
                /**
                 * sunrise : 06:55
                 * sunset : 17:01
                 * time : 20201111
                 */

                private String sunrise;
                private String sunset;
                private String time;

                public String getSunrise() {
                    return sunrise;
                }

                public void setSunrise(String sunrise) {
                    this.sunrise = sunrise;
                }

                public String getSunset() {
                    return sunset;
                }

                public void setSunset(String sunset) {
                    this.sunset = sunset;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$1BeanX {
                /**
                 * sunrise : 06:56
                 * sunset : 17:00
                 * time : 20201112
                 */

                private String sunrise;
                private String sunset;
                private String time;

                public String getSunrise() {
                    return sunrise;
                }

                public void setSunrise(String sunrise) {
                    this.sunrise = sunrise;
                }

                public String getSunset() {
                    return sunset;
                }

                public void setSunset(String sunset) {
                    this.sunset = sunset;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$2BeanX {
                /**
                 * sunrise : 06:57
                 * sunset : 17:00
                 * time : 20201113
                 */

                private String sunrise;
                private String sunset;
                private String time;

                public String getSunrise() {
                    return sunrise;
                }

                public void setSunrise(String sunrise) {
                    this.sunrise = sunrise;
                }

                public String getSunset() {
                    return sunset;
                }

                public void setSunset(String sunset) {
                    this.sunset = sunset;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$3BeanX {
                /**
                 * sunrise : 06:58
                 * sunset : 16:59
                 * time : 20201114
                 */

                private String sunrise;
                private String sunset;
                private String time;

                public String getSunrise() {
                    return sunrise;
                }

                public void setSunrise(String sunrise) {
                    this.sunrise = sunrise;
                }

                public String getSunset() {
                    return sunset;
                }

                public void setSunset(String sunset) {
                    this.sunset = sunset;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$4BeanX {
                /**
                 * sunrise : 06:59
                 * sunset : 16:58
                 * time : 20201115
                 */

                private String sunrise;
                private String sunset;
                private String time;

                public String getSunrise() {
                    return sunrise;
                }

                public void setSunrise(String sunrise) {
                    this.sunrise = sunrise;
                }

                public String getSunset() {
                    return sunset;
                }

                public void setSunset(String sunset) {
                    this.sunset = sunset;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$5BeanX {
                /**
                 * sunrise : 07:00
                 * sunset : 16:57
                 * time : 20201116
                 */

                private String sunrise;
                private String sunset;
                private String time;

                public String getSunrise() {
                    return sunrise;
                }

                public void setSunrise(String sunrise) {
                    this.sunrise = sunrise;
                }

                public String getSunset() {
                    return sunset;
                }

                public void setSunset(String sunset) {
                    this.sunset = sunset;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$6BeanX {
                /**
                 * sunrise : 07:01
                 * sunset : 16:56
                 * time : 20201117
                 */

                private String sunrise;
                private String sunset;
                private String time;

                public String getSunrise() {
                    return sunrise;
                }

                public void setSunrise(String sunrise) {
                    this.sunrise = sunrise;
                }

                public String getSunset() {
                    return sunset;
                }

                public void setSunset(String sunset) {
                    this.sunset = sunset;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$7BeanX {
                /**
                 * sunrise : 07:03
                 * sunset : 16:56
                 * time : 20201118
                 */

                private String sunrise;
                private String sunset;
                private String time;

                public String getSunrise() {
                    return sunrise;
                }

                public void setSunrise(String sunrise) {
                    this.sunrise = sunrise;
                }

                public String getSunset() {
                    return sunset;
                }

                public void setSunset(String sunset) {
                    this.sunset = sunset;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$8Bean {
                /**
                 * sunrise : 07:04
                 * sunset : 16:55
                 * time : 20201119
                 */

                private String sunrise;
                private String sunset;
                private String time;

                public String getSunrise() {
                    return sunrise;
                }

                public void setSunrise(String sunrise) {
                    this.sunrise = sunrise;
                }

                public String getSunset() {
                    return sunset;
                }

                public void setSunset(String sunset) {
                    this.sunset = sunset;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$9Bean {
                /**
                 * sunrise : 07:05
                 * sunset : 16:54
                 * time : 20201120
                 */

                private String sunrise;
                private String sunset;
                private String time;

                public String getSunrise() {
                    return sunrise;
                }

                public void setSunrise(String sunrise) {
                    this.sunrise = sunrise;
                }

                public String getSunset() {
                    return sunset;
                }

                public void setSunset(String sunset) {
                    this.sunset = sunset;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$10Bean {
                /**
                 * sunrise : 07:06
                 * sunset : 16:54
                 * time : 20201121
                 */

                private String sunrise;
                private String sunset;
                private String time;

                public String getSunrise() {
                    return sunrise;
                }

                public void setSunrise(String sunrise) {
                    this.sunrise = sunrise;
                }

                public String getSunset() {
                    return sunset;
                }

                public void setSunset(String sunset) {
                    this.sunset = sunset;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$11Bean {
                /**
                 * sunrise : 07:07
                 * sunset : 16:53
                 * time : 20201122
                 */

                private String sunrise;
                private String sunset;
                private String time;

                public String getSunrise() {
                    return sunrise;
                }

                public void setSunrise(String sunrise) {
                    this.sunrise = sunrise;
                }

                public String getSunset() {
                    return sunset;
                }

                public void setSunset(String sunset) {
                    this.sunset = sunset;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$12Bean {
                /**
                 * sunrise : 07:08
                 * sunset : 16:53
                 * time : 20201123
                 */

                private String sunrise;
                private String sunset;
                private String time;

                public String getSunrise() {
                    return sunrise;
                }

                public void setSunrise(String sunrise) {
                    this.sunrise = sunrise;
                }

                public String getSunset() {
                    return sunset;
                }

                public void setSunset(String sunset) {
                    this.sunset = sunset;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$13Bean {
                /**
                 * sunrise : 07:09
                 * sunset : 16:52
                 * time : 20201124
                 */

                private String sunrise;
                private String sunset;
                private String time;

                public String getSunrise() {
                    return sunrise;
                }

                public void setSunrise(String sunrise) {
                    this.sunrise = sunrise;
                }

                public String getSunset() {
                    return sunset;
                }

                public void setSunset(String sunset) {
                    this.sunset = sunset;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$14Bean {
                /**
                 * sunrise : 07:10
                 * sunset : 16:52
                 * time : 20201125
                 */

                private String sunrise;
                private String sunset;
                private String time;

                public String getSunrise() {
                    return sunrise;
                }

                public void setSunrise(String sunrise) {
                    this.sunrise = sunrise;
                }

                public String getSunset() {
                    return sunset;
                }

                public void setSunset(String sunset) {
                    this.sunset = sunset;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$15Bean {
                /**
                 * sunrise :
                 * sunset :
                 * time : 20201110
                 */

                private String sunrise;
                private String sunset;
                private String time;

                public String getSunrise() {
                    return sunrise;
                }

                public void setSunrise(String sunrise) {
                    this.sunrise = sunrise;
                }

                public String getSunset() {
                    return sunset;
                }

                public void setSunset(String sunset) {
                    this.sunset = sunset;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }
        }

        public static class TipsBean {
            /**
             * observe : {"0":"你若安好，便是晴天~","1":"天有点冷，注意保暖~"}
             */

            private ObserveBeanX observe;

            public ObserveBeanX getObserve() {
                return observe;
            }

            public void setObserve(ObserveBeanX observe) {
                this.observe = observe;
            }

            public static class ObserveBeanX {
                /**
                 * 0 : 你若安好，便是晴天~
                 * 1 : 天有点冷，注意保暖~
                 */

                @SerializedName("0")
                private String _$0;
                @SerializedName("1")
                private String _$1;

                public String get_$0() {
                    return _$0;
                }

                public void set_$0(String _$0) {
                    this._$0 = _$0;
                }

                public String get_$1() {
                    return _$1;
                }

                public void set_$1(String _$1) {
                    this._$1 = _$1;
                }
            }
        }
    }
}
