package vcmsa.ci.songs20

class SongApp {
    //declaring arrays
    val songslist = arrayOf<String>()
    val artistslist = arrayOf<String>()
    val ratingslist = arrayOf<String>()
    val commentslist = arrayOf<String>()

    //calling arrays through variables
    val songs = songslist
    val  artist = artistslist
    val ratings = ratingslist
    val comments = commentslist

    //secondary constructor to help with calling variable to other activities
    constructor (songs : String, artist : String, ratings : String, comments : String)
}