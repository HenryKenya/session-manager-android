# Android Session Manager
An Android library to make managing of user sessions easier.

## Installation Guideline
To install the application:
1. Add this to the project's build.gradle
```xml
  allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  ```
2. Add the dependency
  ```
  dependencies {
	        implementation 'com.github.HenryKenya:session-manager-android:release-version'
	}
  ```
  
  ## Basic use case scenarios
  Once installed, the following common tasks can be done using the library
  
  1. Start a session
  Typically done on user login. Once you have successfully gotten back token from user, you can use the utility library to begin a session like so:
  
    `SessionManagerUtil.startUserSession(this, 60)`
    
  Context and expiry time in seconds are required in order to start the session
  
  2. Check if session is active
  To check if current user session is active, call the util's `isSessionActive` method which return a true if the session is still active
  
    `SessionManagerUtil.isSessionActive(currentTime, this)`
  
  Requires that you pass in the currentTime in date format and the context
  
  3. Store user token
  To store user token, pass the context and token value e.g. `SessionManagerUtil.storeUserToken(this, "randomUserToken")`
  
  4. Retrive user token
  To retrieve user token, pass context and call the method getUserToken e.g. `SessionManagerUtil.getUserToken(this)`
  
  5. End user session
  To end the user session, call endUserSessionMethod passing in the context e.g. `SessionManagerUtil.endUserSession(this)`
    
