package com.volfam.barska

import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ShareCompat
import androidx.fragment.app.FragmentActivity
import com.google.android.material.snackbar.Snackbar
import com.volfam.barska.data.Training

fun shareTrainingInvitation(view: View, activity: FragmentActivity, training: Training) {

    val shareIntent = ShareCompat.IntentBuilder
        .from(activity)
        .setType("text/plain")
        .setText(
            trainingToShareIntentText(
                activity as AppCompatActivity,
                training
            )
        )
        .intent

    if (shareIntent.resolveActivity(activity.packageManager) != null) {
        activity.startActivity(shareIntent)
    } else {
        showErrorSnackbar(view, activity.getString(R.string.no_messenger_installed_error))
    }
}

fun showErrorSnackbar(view: View, message: String) {
    Snackbar.make(view!!, message, Snackbar.LENGTH_SHORT).show()
}