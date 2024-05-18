# FragmentLifecycle Example

This project demonstrates the lifecycle of an Android fragment using logging and Toast messages to provide insights into various lifecycle methods. The project includes a simple `MainActivity` with a button that, when clicked, replaces a `FrameLayout` with a `BlankFragment`. The fragment logs and shows Toast messages at each stage of its lifecycle.

## Project Structure

### MainActivity

The `MainActivity` class contains the main UI with a button. When the button is clicked, a `BlankFragment` is instantiated and added to the `FrameLayout`.

```kotlin
package com.example.fragmentlifecycle

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button).setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.frameLayout, BlankFragment()).commit()
        }
    }
}
```

### BlankFragment

The `BlankFragment` class overrides several lifecycle methods to log messages and display Toasts at each stage. This helps in understanding the fragment lifecycle.


## Usage

1. **Setup Android Studio**: Open the project in Android Studio.
2. **Run the App**: Execute the app on an emulator or physical device.
3. **Observe Lifecycle Events**: Click the button in `MainActivity` to load the `BlankFragment`. Observe the Toast messages and log outputs corresponding to each lifecycle method in `BlankFragment`.

## Lifecycle Methods

- `onAttach`: Called when the fragment is first attached to its context.
- `onCreate`: Called to do initial creation of the fragment.
- `onCreateView`: Called to create the view hierarchy associated with the fragment.
- `onViewCreated`: Called immediately after `onCreateView` has returned.
- `onResume`: Called when the fragment is visible to the user and actively running.
- `onPause`: Called when the fragment is no longer interacting with the user.
- `onDestroy`: Called when the fragment is being destroyed.

## Dependencies

- **AndroidX**: Ensure your project is using AndroidX libraries for compatibility.

## Notes

- The `Log.d` statements and `Toast` messages help to visualize the lifecycle transitions. 
- Make sure your `activity_main.xml` contains a `FrameLayout` with the ID `frameLayout` and a `Button` with the ID `button`.
- Ensure your `fragment_blank.xml` layout file is set up correctly for `BlankFragment`.

This project serves as an educational tool to understand the fragment lifecycle in Android applications.
