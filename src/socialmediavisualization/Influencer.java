package socialmediavisualization;

/**
 * Class that represents an influencer
 * @author Group 116
 * @version 2023.4.13
 */
public class Influencer {
    private String month;
    private String username;
    private String channelName;
    private String country;
    private String mainTopic;
    private int likes;
    private int postCount;
    private int followersCount;
    private int commentsCount;
    private int views;
    
    /**
     * Constructs a new Influencer object. Represents data for one month 
     * 
     * @param month Current Month
     * @param username Username
     * @param channelName Channel name
     * @param country Country from
     * @param mainTopic Main content topic
     * @param likes Number of likes
     * @param postCount Number of posts
     * @param followersCount Number of followers
     * @param commentsCount Number of comments
     * @param views Number of Views
     */
    public Influencer(
        String month,
        String username,
        String channelName,
        String country,
        String mainTopic,
        int likes,
        int postCount,
        int followersCount,
        int commentsCount,
        int views
    ) {
        this.month = month;
        this.username = username;
        this.channelName = channelName;
        this.country = country;
        this.mainTopic = mainTopic;
        this.likes = likes;
        this.postCount = postCount;
        this.followersCount = followersCount;
        this.commentsCount = commentsCount;
        this.views = views;
    }

    /**
     * Getter for month
     * @return Month
     */
    public String getMonth() {
        return month;
    }

    /**
     * Getter for username
     * @return Username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Getter for channelName
     * @return channelName
     */
    public String getChannelName() {
        return channelName;
    }

    /**
     * Getter for country
     * @return country
     */
    public String getCountry() {
        return country;
    }

    /**
     * Getter for getMainTopic
     * @return mainTopic
     */
    public String getMainTopic() {
        return mainTopic;
    }

    /**
     * Getter for likes
     * @return likes
     */
    public int getLikes() {
        return likes;
    }

    /**
     * Getter for postCount
     * @return postCount
     */
    public int getPostCount() {
        return postCount;
    }

    /**
     * Getter for followersCount
     * @return followersCount
     */
    public int getFollowersCount() {
        return followersCount;
    }

    /**
     * Getter for commentsCount
     * @return commentsCount
     */
    public int getCommentsCount() {
        return commentsCount;
    }
    
    /**
     * Getter for views
     * @return views
     */
    public int getViews() {
        return views;
    }
    
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        Influencer other = (Influencer) obj;
        return this.month == other.month &&
            this.username == other.username &&
            this.channelName == other.channelName &&
            this.country == other.country &&
            this.mainTopic == other.mainTopic &&
            this.likes == other.likes &&
            this.postCount == other.postCount &&
            this.followersCount == other.followersCount &&
            this.commentsCount == other.commentsCount &&
            this.views == other.views;
    }
    
}
