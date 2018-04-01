package model

/**
 * Created by brust on 4/1/2018.
 */
class GoogleRequest {

    private static String REQUEST_PREFIX = "https://www.googleapis.com/customsearch/v1?"
    private static String GOOGLE_KEY = "key=AIzaSyChsdkfLuT08I-R7uufqvVxZS7OpQD3W2Q"
    private static String LINK_CHARACTER = "&"
    private static String CONTEXT = "cx=004975013161726427879:4vfb7hajvjq"
    private static String QUERY_PREFIX = "q="
    private static String START_INDEX_PREFIX = "start="

    static String createRequest(String query) {
        return REQUEST_PREFIX +
                GOOGLE_KEY +
                LINK_CHARACTER + CONTEXT +
                LINK_CHARACTER + QUERY_PREFIX + query;
    }

    static String createRequestWithStartingIndex(String startIndex, String query) {
        return REQUEST_PREFIX +
                GOOGLE_KEY +
                LINK_CHARACTER + START_INDEX_PREFIX + startIndex +
                LINK_CHARACTER + QUERY_PREFIX + query;
    }
}

