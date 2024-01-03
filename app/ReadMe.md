// Note that it is not actually possible to disable the official API rather we just have to make it invisible so that it doesn't become two
Then we have to add the Splash Screen dependency note that
Then we add our Svg image in the Xml format and then after that, we have to add some basic animations
// Then we can animate the group as a whole but also do this to each path as well in the group tag
// We can add the name, pivotX and then pivotY
// Then we create the new animation file -> New resource file-> resource type is animator and then we change the root element from set to "objectAnimator"
// We set the duration of the animation in the objectAnimator tag
// Then we add the propertyValuesHolder tag to it -> This is the place where we define where we define what we want to animate
// Property name refers to scale X and scale Y
// Since we are dealing with degrees we then have to specify the valueType as "Float type" for allowing the use of degrees
// Then we define the value from and value to state the degree of motion. Here, we started from 0 to 360 degrees. This means a 360 degree movement
// Then we create a new drawable resource file of root element "animated-vector" // This is the animated_logo file
// We then add the normal logo to it as its drawable property
// Then we add the target tag
// then we give it the name of the "group" in the "logo.xml" file 
// And then we give the "animation" attribute as the name of the animator which is "@animator/logo_animator"

// We then have to create a new "Style" tag in the themes.xml file
// When creating the styles tag, don't be worried if the name seems not to be passing well, we just need to add the parent (parent="Theme.SplashScreen") to make the naming work perfectly
// When we try to set the animation icon this way, <item name="android:windowSplashScreenAnimatedIcon">@drawable/animated_logo</item>, Android 31 and above do not allow so Android Studio automatically creates a new styles.xml to apply to newer Android 
// We can then remove it from the normal Themes.xml file
// Then we go to the Manifest file to set the Theme of the app to the new style tag that had just been created in the themes.xml i.e "Theme.App.Starting"
// Then we work on the MainActivity Class

// Interpolator
In the provided code, the interpolator used is the OvershootInterpolator. Interpolators in Android are used to define the rate of change of an animation. They control the acceleration and deceleration of the animation, providing a specific timing behavior.

The OvershootInterpolator is a type of interpolator that causes the animated values to overshoot the target value and then spring back into place. It adds a bouncing effect to the animation, making it go slightly beyond the target value before settling.

In the context of the provided code, the OvershootInterpolator is applied to both the X and Y scale animations (zoomX and zoomY). This means that when the SplashScreen exit animation is triggered, the iconView (presumably the app icon) will shrink (scale down) with a bouncing or overshooting effect before finally being removed from the screen.


// For XML 
// We can create an external Interpolator
// This should be of the type "animation"
// Then we create the directory "anim" which has the root element of overshootInterpolator
// Then we go to the "logo_animator" and then we have to register the interpolator in the objectAnimator tag
// This will then register the animation that we had done manually to it as well as the overshootInterpolator

// DONE


