public class Problem1 {
    public static void main(String[] args) {
        int diameterSun = 865000;
        int diameterEarth = 7600;
        int radiusSun = diameterSun / 2;
        int radiusEarth = diameterEarth / 2;

        double volumeSun = ((4/3) * Math.PI * Math.pow(radiusSun, 3));
        double volumeEarth = ((4/3) * Math.PI * Math.pow(radiusEarth, 3));
        System.out.println("Volume Earth is :");
        System.out.println(volumeEarth);
        System.out.println("Volume Sun is :");
        System.out.println(volumeSun);

        double ratio = ( volumeSun / volumeEarth);
        System.out.println("and the ratio of the volume of the Sun to the volume of the Earth is:");
        System.out.println(ratio);
    }
}