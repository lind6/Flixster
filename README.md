# Flix
Flix is an app that allows users to browse movies from the [The Movie Database API](http://docs.themoviedb.apiary.io/#).

## Flix Part 2

### User Stories

#### REQUIRED (10pts)

- [x] (8pts) Expose details of movie (ratings using RatingBar, popularity, and synopsis) in a separate activity.
- [x] (2pts) Allow video posts to be played in full-screen using the YouTubePlayerView.

#### BONUS

- [ ] Implement a shared element transition when user clicks into the details of a movie (1 point).
- [ ] Trailers for popular movies are played automatically when the movie is selected (1 point).
  - [ ] When clicking on a popular movie (i.e. a movie voted for more than 5 stars) the video should be played immediately.
  - [ ] Less popular videos rely on the detailed page should show an image preview that can initiate playing a YouTube video.
- [ ] Add a play icon overlay to popular movies to indicate that the movie can be played (1 point).
- [ ] Apply data binding for views to help remove boilerplate code. (1 point)
- [ ] Add a rounded corners for the images using the Glide transformations. (1 point)

### App Walkthough GIF

<img src="https://github.com/lind6/Flixster/blob/master/flixster_walkthrough_week_2.gif" width=250><br>

### Notes

Describe any challenges encountered while building the app.

- youtube API installation instructors were erroneous and out of date.  The video says to follow the 'install emulator' link on the assignment page, so I stoppped the video and clicked the link and tried to follow the instructions, but they were both wrong and out of date as nothing matched my version of android studio.  There were no written notes of step-by-step that matched my version of android studio, and dragging/dropping the youtubeApi.jar file into android studio only created more problems that prevented the emulator from running as the compiler treated the .jar file as a separate application and it was unclear how to remove it because dragging the .jar into teh IDE created additional dependencies that wouldn't go away just by cutting/deleting the youtubeapi.jar from the IDE.  There were no solutions posted in the codepath slack channel, so I prompted the TA's for help, but no response.  I checked online for solutions such as at statckoverflow.com, but the suggestions there were also out of date and not useful.  That is my why assignment is late.  I'm really fed up with codepath's lack of quality control.
- 

## Open-source libraries used
- [Android Async HTTP](https://github.com/codepath/CPAsyncHttpClient) - Simple asynchronous HTTP requests with JSON parsing
- [Glide](https://github.com/bumptech/glide) - Image loading and caching library for Android



## Flix Part 1

### User Stories

#### REQUIRED (10pts)
- [x] (10pts) User can view a list of movies (title, poster image, and overview) currently playing in theaters from the Movie Database API.

#### BONUS
- [ ] (2pts) Views should be responsive for both landscape/portrait mode.
   - [ ] (1pt) In portrait mode, the poster image, title, and movie overview is shown.
   - [ ] (1pt) In landscape mode, the rotated alternate layout should use the backdrop image instead and show the title and movie overview to the right of it.

- [ ] (2pts) Display a nice default [placeholder graphic](https://guides.codepath.org/android/Displaying-Images-with-the-Glide-Library#advanced-usage) for each image during loading
- [ ] (2pts) Improved the user interface by experimenting with styling and coloring.
- [ ] (2pts) For popular movies (i.e. a movie voted for more than 5 stars), the full backdrop image is displayed. Otherwise, a poster image, the movie title, and overview is listed. Use Heterogenous RecyclerViews and use different ViewHolder layout files for popular movies and less popular ones.

### App Walkthough GIF
<img src="https://github.com/lind6/Flixster/blob/master/flixster_walkthrough_week_1.gif" width=250><br>

### Notes
Describe any challenges encountered while building the app.

Instruction videos skip over important details with regards to libraries, and usage of methods.
Instructions for GIT inside of android are out of date.
Android API level shown/suggested in lecture no longer available.

### Open-source libraries used

- [Android Async HTTP](https://github.com/codepath/CPAsyncHttpClient) - Simple asynchronous HTTP requests with JSON parsing
- [Glide](https://github.com/bumptech/glide) - Image loading and caching library for Androids
