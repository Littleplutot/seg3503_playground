

public class Twitter {

  public String loadTweet()
  {
    try {
      Thread.sleep(4000);
    } catch (InterruptedException e) {}

    double r =  Math.random();
    if (r <= 0.45) {
      return "I am tweet that likes to talk about @me";
    } else if (r <= 0.9) {
      return "Hello to @you";
    } else {
      return null;
    }
  }

  public boolean isMentionned(String name) {
    String tweet = loadTweet();
    String[] tweets = tweet.split(" ");

    String actualTweet = tweets[1].replace("@","");
    
    if (tweet.endsWith("@" + name)) {
        return true;
    }else if (tweet.contains("@"+ name + " ")){
        return true;
    }

    return false;
  }

}