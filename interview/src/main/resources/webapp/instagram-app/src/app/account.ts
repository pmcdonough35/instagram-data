export class Account {
    dateTime: string;
    biography: string;
    fullName: string;
    followers: string;
    constructor(dateTime: string, biography: string, fullName: string, followers: string) {
        this.dateTime = dateTime;
        this.biography = biography;
        this.fullName = fullName;
        this.followers = followers;
    }
}
