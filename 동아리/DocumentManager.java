package 동아리;

import java.util.LinkedList;
public class DocumentManager {
        LinkedList<Document> documents = new LinkedList<>();
        public void makeDocument(String day, String name, String content) {
            if (day.isEmpty()) {
                documents.add(new Document(name, content));
            }
            else {
                documents.add(new Document(day, name, content));
            }
        }

        public void deletDocument(String name) {
            if (name.isEmpty()) {
                documents.clear();
            }
            else {
                for (Document document : documents) {
                    if (document.equals(name)) {
                        documents.remove(document);
                    }
                }
            }
        }

        public void recontent(String name, String content) {
            for (Document document : documents) {
                if (document.equals(name)) {
                    document.setContent(content);
                }
            }
        }

        public Document returnDocument(String name) {
            for (Document document : documents) {
                if (document.equals(name)) {
                    return document;
                }
            }

            return null;
        }

        public void searchDocument(String name) {
            // TODO Auto-generated method stub

        }
    }
}
