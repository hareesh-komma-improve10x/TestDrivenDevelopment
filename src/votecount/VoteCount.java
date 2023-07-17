package votecount;

public class VoteCount {

    public int voteCount(int upVotes, int downVotes) {
        int voteCount = 0;
        if (upVotes == 0 && downVotes == 0) {
            return 0;
        } else if (upVotes < 0 && downVotes < 0) {
            return -1;
        } else {
            voteCount = upVotes-downVotes;
        }
        return voteCount;

    }
}
