export class Post {
    mediaURL: string;
    numLikes: number;
    numComments: number;
    postType: string;
    constructor(mediaURL: string, numLikes: number, numComments: number, postType: string) {
        this.mediaURL = mediaURL;
        this.numLikes = numLikes;
        this.numComments = numComments;
        this.postType = postType;
    }
}
