package org.tensorflow.lite.examples.imageclassification.fragments;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.your.unique.package.name.R;

public class CameraFragmentDirections {
  private CameraFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionCameraToPermissions() {
    return new ActionOnlyNavDirections(R.id.action_camera_to_permissions);
  }
}