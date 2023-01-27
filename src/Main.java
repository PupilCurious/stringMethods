public class Main {
    public static void main(String[] args) {
        String message = "Java Öğrenmeye Başladım";

        System.out.println("Eleman sayısı : " + message.length());
        System.out.println("7. karakter : " + message.charAt(7));
        System.out.println("metine ekleme yapma : " + message.concat(" Yaşasın!"));
        System.out.println("başlangıç karakteri 'J' mi? : " + message.startsWith("J"));
        System.out.println("bitiş karakteri 'm' mi? : " + message.endsWith("m"));
        char[] karakterler = new char[10];
        message.getChars(5,10,karakterler,0);
        System.out.println(karakterler);
        System.out.println("verilen karakter sol baştan kaçıncı sırada : " + message.indexOf("Ö"));
        System.out.println("verilen karakter sağ baştan kaçıcı sırada : " +message.lastIndexOf("e"));
        System.out.println("karakter değiştirme : " + message.replace(' ','-'));
        System.out.println("metinden istenilen bölümü kesme : " + message.substring(5,10));

        //metini kesme
        for (String kelime:message.split(" ")){
            System.out.println(kelime);
        }

        System.out.println("hepsini küçük harf yapma : " + message.toLowerCase());
        System.out.println("hepsini büyük harf yapma : " + message.toUpperCase());

        //başında sonunda boşluk var
        message = "         Java Öğrenmeye Başladım        ";
        System.out.println(message.trim());
    }
}