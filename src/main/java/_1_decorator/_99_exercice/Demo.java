package _1_decorator._99_exercice;


public class Demo {
    public static void main(String[] args) {
        // exemple de données à sauvegarder encrypter et compressé
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
//        System.getProperty("user.dir")+"\\src\\main\\java\\_1_decorator\\_99_exercice\\OutputDemo.txt"
        FileDataSource fileDataSource = new FileDataSource("OutputDemo.txt");

        //TODO refactoriser en utilisant le pattern decorator

        DataSourceDecorator dataSourceDecorator = new DataSourceDecorator(fileDataSource);
        EncryptorDecorator encryptorDecorator = new EncryptorDecorator();
        CompressorDecorator compressorDecorator = new CompressorDecorator();
        dataSourceDecorator.writeData(salaryRecords);

        String encryptedd = encryptorDecorator.encode(dataSourceDecorator.readData());
        String encryptedAndCompressedd = compressorDecorator.compress(encryptedd);
        dataSourceDecorator.writeData(encryptedAndCompressedd);

        String readData = dataSourceDecorator.readData();

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(readData);
        System.out.println("- Decoded --------------");
        System.out.println(encryptorDecorator.decode(compressorDecorator.decompress(readData)));
    }
}