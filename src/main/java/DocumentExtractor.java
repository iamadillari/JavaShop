import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.tika.Tika;
import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.AutoDetectParser;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.sax.BodyContentHandler;
import org.json.simple.JSONObject;
import org.xml.sax.SAXException;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DocumentExtractor {

    public static void main(String[] args) {
        String filePath = "src/main/resources/Latest QA Jobs 07 Aug 2024.pdf"; // Replace with your file path
        String outputFilePath = "target/output/output.txt"; // Replace with your output file path

        String fileType = getFileType(filePath);
        String content = extractContent(filePath, fileType);

        if (content != null) {
            JSONObject extractedDetails = extractDetails(content);
            writeDetailsToFile(extractedDetails, outputFilePath);
            System.out.println("Extraction complete. Details written to " + outputFilePath);
        } else {
            System.out.println("Failed to extract content from the document.");
        }
    }

    private static String getFileType(String filePath) {
        Tika tika = new Tika();
        try {
            return tika.detect(new File(filePath));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static String extractContent(String filePath, String fileType) {
        if (fileType != null && fileType.equals("application/pdf")) {
            return extractPDFContent(filePath);
        } else {
            return extractGenericContent(filePath);
        }
    }

    private static String extractPDFContent(String filePath) {
        try (PDDocument document = PDDocument.load(new File(filePath))) {
            PDFTextStripper pdfStripper = new PDFTextStripper();
            return pdfStripper.getText(document);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static String extractGenericContent(String filePath) {
        try (FileInputStream inputstream = new FileInputStream(new File(filePath))) {
            AutoDetectParser parser = new AutoDetectParser();
            BodyContentHandler handler = new BodyContentHandler();
            Metadata metadata = new Metadata();
            parser.parse(inputstream, handler, metadata, new ParseContext());
            return handler.toString();
        } catch (IOException | TikaException | SAXException e) {
            e.printStackTrace();
            return null;
        }
    }

    @SuppressWarnings("unchecked")
    private static JSONObject extractDetails(String content) {
        JSONObject details = new JSONObject();

        // Extract email
        Pattern emailPattern = Pattern.compile("\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}\\b");
        Matcher emailMatcher = emailPattern.matcher(content);
        if (emailMatcher.find()) {
            details.put("email", emailMatcher.group());
        }

        // Extract notice period
        Pattern noticePattern = Pattern.compile("notice period:?\\s*(\\d+\\s*\\w+)", Pattern.CASE_INSENSITIVE);
        Matcher noticeMatcher = noticePattern.matcher(content);
        if (noticeMatcher.find()) {
            details.put("notice_period", noticeMatcher.group(1));
        }

        // Extract skills
        Pattern skillsPattern = Pattern.compile("skills:?\\s*([\\w,\\s]+)", Pattern.CASE_INSENSITIVE);
        Matcher skillsMatcher = skillsPattern.matcher(content);
        if (skillsMatcher.find()) {
            String[] skills = skillsMatcher.group(1).split(",\\s*");
            details.put("skills", skills);
        }

        // Extract budget or maximum salary
        Pattern budgetPattern = Pattern.compile("(budget|max salary):?\\s*([\\d,]+)", Pattern.CASE_INSENSITIVE);
        Matcher budgetMatcher = budgetPattern.matcher(content);
        if (budgetMatcher.find()) {
            details.put("budget", budgetMatcher.group(2));
        }

        // Extract location
        Pattern locationPattern = Pattern.compile("location:?\\s*([\\w\\s]+)", Pattern.CASE_INSENSITIVE);
        Matcher locationMatcher = locationPattern.matcher(content);
        if (locationMatcher.find()) {
            details.put("location", locationMatcher.group(1));
        }

        return details;
    }

    private static void writeDetailsToFile(JSONObject details, String outputFilePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {
            writer.write(details.toJSONString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}