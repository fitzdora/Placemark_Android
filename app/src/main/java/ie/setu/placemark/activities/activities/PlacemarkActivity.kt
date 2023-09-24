package ie.setu.placemark.activities.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import ie.setu.placemark.activities.models.PlacemarkModel
import timber.log.Timber
import timber.log.Timber.Forest.i
import ie.setu.placemark.databinding.ActivityPlacemarkBinding

class PlacemarkActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPlacemarkBinding
    var placemark = PlacemarkModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPlacemarkBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Timber.plant(Timber.DebugTree())

        i("Placemark Activity started...")

        binding.btnAdd.setOnClickListener() {
            val placemarkTitle = binding.placemarkTitle.text.toString()
            if (placemarkTitle.isNotEmpty())
            {
            i("add Button Pressed: $placemarkTitle")
            }
            else {
                Snackbar.make(it, "Please Enter a title", Snackbar.LENGTH_LONG).show()
            }

            val placemarkDescription = binding.placemarkDescription.text.toString()
            if (placemarkDescription.isNotEmpty())
            {
                i("add Button Pressed: $placemarkDescription")
            }
            else {
                Snackbar.make(it, "Please Enter a Description", Snackbar.LENGTH_LONG).show()
            }
        }
    }
}