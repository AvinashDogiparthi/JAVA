package AF_ClassesInDepth.D_NestedClass.staticDemo;

public class Dinner {
    private String avinash;
    private String adithya;
    private String harikiran;
    private String vinay;
    private String deepak;
    private String dhanush;

    private Dinner(DinnerBuilder dinnerBuilder) {
        this.avinash = dinnerBuilder.avinash;
        this.adithya = dinnerBuilder.adithya;
        this.harikiran = dinnerBuilder.harikiran;
        this.vinay = dinnerBuilder.vinay;
        this.deepak = dinnerBuilder.deepak;
        this.dhanush = dinnerBuilder.dhanush;
    }

    public static class DinnerBuilder{
        private String avinash;
        private String adithya;
        private String harikiran;
        private String vinay;
        private String deepak;
        private String dhanush;

        public DinnerBuilder setAvinash(String avinash){
            this.avinash = avinash;
            return this;
        }
        public DinnerBuilder setAdithya(String adithya){
            this.adithya = adithya;
            return this;
        }
        public DinnerBuilder setHarikiran(String harikiran){
            this.harikiran = harikiran;
            return this;
        }
        public DinnerBuilder setVinay(String vinay){
            this.vinay = vinay;
            return this;
        }
        public DinnerBuilder setDeepak(String deepak){
            this.deepak = deepak;
            return this;
        }
        public DinnerBuilder setDhanush(String dhanush){
            this.dhanush = dhanush;
            return this;
        }
        public Dinner build(){
            return new Dinner(this);
        }
    }
}
