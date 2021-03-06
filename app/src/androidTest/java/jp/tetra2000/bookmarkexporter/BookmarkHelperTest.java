package jp.tetra2000.bookmarkexporter;

import junit.framework.TestCase;

public class BookmarkHelperTest extends TestCase {
    public void testToHTML() {
        BookmarkHelper helper = new BookmarkHelper();
        helper.add(new Bookmark("アップル", "http://www.apple.com/jp/"));
        helper.add(new Bookmark("GitHub", "https://github.com/"));
        helper.add(new Bookmark("Twitter", "https://twitter.com"));

        String expected = "<!DOCTYPE NETSCAPE-Bookmark-file-1>\n" +
                "\t<HTML>\n" +
                "\t<META HTTP-EQUIV=\"Content-Type\" CONTENT=\"text/html; charset=UTF-8\">\n" +
                "\t<Title>Bookmarks</Title>\n" +
                "\t<H1>Bookmarks</H1>\n" +
                "\t\t<DT><A HREF=\"http://www.apple.com/jp/\">アップル</A>\n" +
                "\t\t<DT><A HREF=\"https://github.com/\">GitHub</A>\n" +
                "\t\t<DT><A HREF=\"https://twitter.com\">Twitter</A>\n" +
                "</HTML>\n";
        assertEquals(expected, helper.toHTML());
    }
}
