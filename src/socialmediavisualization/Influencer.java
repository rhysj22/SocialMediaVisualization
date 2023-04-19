package prj5;

/**
 * Class that represents an influencer
 * 
 * @author Group 116
 * @version 2023.4.13
 */
public class Influencer implements Comparable<Influencer> {
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
     * @param month
     *            Current Month
     * @param username
     *            Username
     * @param channelName
     *            Channel name
     * @param country
     *            Country from
     * @param mainTopic
     *            Main content topic
     * @param likes
     *            Number of likes
     * @param postCount
     *            Number of posts
     * @param followersCount
     *            Number of followers
     * @param commentsCount
     *            Number of comments
     * @param views
     *            Number of Views
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
        int views) {
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
     * Return the number of the equivalent month. Example: January = 1
     * 
     * @return the number equivalent of the month
     * @throws IllegalArgumentException
     *             if the month is invalid
     */
    private int getNumberForMonth() {
        if (month == "January") {
            return 1;
        }
        else if (month == "February") {
            return 2;
        }
        else if (month == "March") {
            return 3;
        }
        else if (month == "April") {
            return 4;
        }
        else if (month == "May") {
            return 5;
        }
        else if (month == "June") {
            return 6;
        }
        else if (month == "July") {
            return 7;
        }
        else if (month == "August") {
            return 8;
        }
        else if (month == "September") {
            return 9;
        }
        else if (month == "October") {
            return 10;
        }
        else if (month == "Novermber") {
            return 11;
        }
        else if (month == "December") {
            return 12;
        }
        throw new IllegalArgumentException();

    }


    /**
     * compare to method compares the month of the two influencer objects
     * 
     * @return a positive value if this object is greater than the parameter
     * @param other
     *            is the other influnecer object in comparison
     */
    public int compareTo(Influencer other) {

        if (this.getNumberForMonth() > other.getNumberForMonth()) {
            return 1;
        }
        else if (this.getNumberForMonth() == other.getNumberForMonth()) {
            return 0;
        }

        return -1;
    }


    /**
     * Getter for month
     * 
     * @return Month
     */
    public String getMonth() {
        return month;
    }


    /**
     * Getter for username
     * 
     * @return Username
     */
    public String getUsername() {
        return username;
    }


    /**
     * Getter for channelName
     * 
     * @return channelName
     */
    public String getChannelName() {
        return channelName;
    }


    /**
     * Getter for country
     * 
     * @return country
     */
    public String getCountry() {
        return country;
    }


    /**
     * Getter for getMainTopic
     * 
     * @return mainTopic
     */
    public String getMainTopic() {
        return mainTopic;
    }


    /**
     * Getter for likes
     * 
     * @return likes
     */
    public int getLikes() {
        return likes;
    }


    /**
     * Getter for postCount
     * 
     * @return postCount
     */
    public int getPostCount() {
        return postCount;
    }


    /**
     * Getter for followersCount
     * 
     * @return followersCount
     */
    public int getFollowersCount() {
        return followersCount;
    }


    /**
     * Getter for commentsCount
     * 
     * @return commentsCount
     */
    public int getCommentsCount() {
        return commentsCount;
    }


    /**
     * Getter for views
     * 
     * @return views
     */
    public int getViews() {
        return views;
    }


    /**
     * equals method to determine if an object is equal to this
     * influencer object
     * 
     * @param obj
     *            is the object we are comparing
     * @return if the objects are equal
     */
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        Influencer other = (Influencer)obj;
        return this.month == other.month && this.username == other.username
            && this.channelName == other.channelName
            && this.country == other.country
            && this.mainTopic == other.mainTopic && this.likes == other.likes
            && this.postCount == other.postCount
            && this.followersCount == other.followersCount
            && this.commentsCount == other.commentsCount
            && this.views == other.views;
    }


    /**
     * method to get the Traditional engagement rate of the influencer
     * 
     * @return a double representing the engagement rate
     */
    public double getTraditionalEngagementRate() {

        return (((double) commentsCount + likes) / followersCount) * 100;
    }


    /**
     * method to return the reach rate of the influencers
     * 
     * @return a double representing the reach rate
     */
    public double getReachEngagementRate() {
        return (((double) commentsCount + likes) / views) * 100;
    }


    /**
     * method to compare by traditional engagement. Not typical compareTo method
     * but alternative form for compare to
     * 
     * @param other
     *            influencer
     * @return an int representing the comparison result
     */
    public int compareTraditionalEngagement(Influencer other) {

        if (this.getTraditionalEngagementRate() > other
            .getTraditionalEngagementRate()) {
            return 1;
        }
        else if (this.getTraditionalEngagementRate() < other
            .getTraditionalEngagementRate()) {
            return -1;
        }
        return 0;
    }


    /**
     * method to compare by get reach engagement. Not typical compareTo method
     * but alternative
     * for reach engagement
     * 
     * @param other
     *            influencer
     * @return an int representing comparison result
     */
    public int compareReachEngagement(Influencer other) {
        if (this.getReachEngagementRate() > other.getReachEngagementRate()) {
            return 1;
        }
        else if (this.getReachEngagementRate() < other
            .getReachEngagementRate()) {
            return -1;
        }
        return 0;
    }


    /**
     * method to get the string version of the Influencer
     * 
     * @return A string representation of the Influencer
     */
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append(this.month + " ");
        s.append(username + "(" + channelName + ")");
        s.append(" Country:" + country);
        s.append(" Topic:" + mainTopic);
        s.append(" Likes:" + likes);
        s.append(" Posts:" + postCount);
        s.append(" Followers:" + followersCount);
        s.append(" Total Comments:" + commentsCount);
        s.append(" Total Views:" + views);

        return s.toString();

    }

}

