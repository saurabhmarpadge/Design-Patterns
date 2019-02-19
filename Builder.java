public class Builder {
    public static void main(String[] args){
        Batman.AlfredBuilder alfredBuilder = new Batman.AlfredBuilder();
        Batman batman = alfredBuilder.setGun("M22").setWeapon("Sword").setVehicle("Batmobile").build();
        System.out.println(batman.getGun());
        System.out.println(batman.getVehicle());
        System.out.println(batman.getWeapon());
    }
}

class Batman{
    private final String vehicle;
    private final String gun;
    private final String weapon;

    public Batman(AlfredBuilder alfredBuilder) {
        this.vehicle = alfredBuilder.vehicle;
        this.gun = alfredBuilder.gun;
        this.weapon = alfredBuilder.weapon;
    }

    static class AlfredBuilder{
        private String vehicle;
        private String gun;
        private String weapon;

        AlfredBuilder(){

        }
        public AlfredBuilder setVehicle(String vehicle) {
            this.vehicle = vehicle;
            return this;
        }

        public AlfredBuilder setGun(String gun) {
            this.gun = gun;
            return this;
        }

        public AlfredBuilder setWeapon(String weapon) {
            this.weapon = weapon;
            return this;
        }
        public Batman build(){
            return new Batman(this);
        }
    }

    public String getVehicle() {
        return vehicle;
    }

    public String getGun() {
        return gun;
    }

    public String getWeapon() {
        return weapon;
    }
}
