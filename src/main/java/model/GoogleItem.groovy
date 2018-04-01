package model

/**
 * Created by brust on 4/1/2018.
 */
class GoogleItem {

    private String title
    private String link
    private String displayLink
    private String snippet

    GoogleItem(String title, String link, String displayLink, String snippet) {
        this.title = title
        this.link = link
        this.displayLink = displayLink
        this.snippet = snippet
    }
}
