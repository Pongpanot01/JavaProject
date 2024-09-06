public class MemberApp {
    public static void main(String[] args) throws Exception {
        MemberCard platinumCard = new PlatinumCard("John Wick", 1500);
        System.out.println("Platinum Info");
        platinumCard.display();

        MemberCard silverCard = new SilverCard("John Lenon", 1500);
        System.out.println("Silver Info");
        silverCard.display();
    }
}
