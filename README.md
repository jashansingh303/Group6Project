Original App Design Project - README Template
===

# FitBuddy

## Table of Contents
1. [Overview](#Overview)
1. [Product Spec](#Product-Spec)
1. [Wireframes](#Wireframes)
2. [Schema](#Schema)

## Overview
### Description
FitBuddy is an app that shows users how to exercise including videos depending on their current and dream physique. Users can share posts about themselves and see posts of other users.
### App Evaluation
[Evaluation of your app across the following attributes]
- **Category:** Fitness
- **Mobile:** The app is best used on mobile because of the photo sharing aspect. It is much harder to take quality photos on a computer.
- **Story:** Allows users to choose their current physique and whether they want to lose weight/gain muscle and gives them workout plans on how to do so.
- **Market:** Anyone can use the exercise portion of the app but to use the social media portion users must be 13 or older. 
- **Habit:** The app focuses and encourages users to share daily updates of their physique.
- **Scope:** Anyone can use the app as most people would like to have a better physique. Users will similar goals will go on journeys together to better their physiques.

## Walkthrough
<img src="walkthrough.gif" width="250px">

## Product Spec

### 1. User Stories (Required and Optional)

**Required Must-have Stories**

[] User logins and see latest posts from other users 
[] User can enter their personal information about their physique
[] Users can see their recommmended exercises
[] Users can post their updates

**Optional Nice-to-have Stories**

[] Users can follow other users
[] Users can create groups
[] Users can see their health care providers opinion on their exercises

### 2. Screen Archetypes

[x] Log in
[x] Sign up
   * Users have to enter their email, username, password, and date of birth to sign up
[x] Feed
   [] Users can see posts from other users
[] Post
   [] Users can make posts to the feed
[] Exercises
   [] Users can see which exercises they have to do and how many sets/reps of each exercise
[] Profile
   [] Users can enter personal information about their physique
### 3. Navigation

**Tab Navigation** (Tab to Screen)

* Feed
* Post
* Exercises/Data
* Profile

**Flow Navigation** (Screen to Screen)

* Log in -> Sign up if needed
* Log in -> Main feed
* Feed -> goes to feed 
* Post -> Goes to post section where user can input description and take photo to image
* Post: take photo btn -> Camera
* Exercise -> Exercises the user needs to do
* Profile -> Input field for user information on physique
  
## Wireframes
<img src="wireframes2.jpg" width=600>

### [BONUS] Digital Wireframes & Mockups

### [BONUS] Interactive Prototype

## Schema 
[This section will be completed in Unit 9]
### Models
| Tables        | Type          | Description|
| ------------- |:-------------:| ----------:|
| author        |Pointer to user| Post author|
| objectId      |String         | Post ID    |
| image         |File           | User Image |
| description   |String         | image description
| userPicture   |File           |Profile Picture|

### Networking
* Feed
  * (READ/GET) Query all posts
* Post
  * (CREATE/POST) Create a new post and upload to feed
* Exercise
  * (READ/GET) Gets exercies for user based on profile information
* Profile
  * (UPDATE/PUT) Update user information to give personalized exercises
