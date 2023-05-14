package com.labactivity.dishcoveryapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.labactivity.dishcoveryapp.databinding.ActivityAboutBinding

class About : AppCompatActivity() {

    private lateinit var binding:ActivityAboutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var about1 = intent.getStringExtra("about").equals("About")
        var about2 = intent.getStringExtra("about2").equals("About2")

        if (about1) {
            binding.title.setText("About Us")
            binding.content.setText(about1())
        }else if (about2){
            binding.title.setText("Contact Us")
            binding.content.setText(about2())
        }
    }
    fun about1():String{
        val aboutus: String = "At Dishcovery, we believe that exploring and preparing " +
                "delicious meals should be an exciting and hassle-free experience. Our app " +
                "is designed to empower food enthusiasts, home cooks, and anyone who loves " +
                "good food by providing a comprehensive collection of ingredients and recipes " +
                "for various meals throughout the day, including breakfast, lunch, dinner, and " +
                "snacks.Discovering new dishes and experimenting with flavors has never been easier. " +
                "\n\nWith Dishcovery, you can access a vast library of recipes that cater to a wide " +
                "range of dietary preferences and cuisines. Whether you're a vegetarian, vegan, " +
                "gluten-free, or have specific dietary restrictions, our app ensures there's " +
                "something for everyone.\n\n" +
                "Our team is made up of food lovers, recipe developers, and tech enthusiasts who " +
                "are committed to creating the best possible experience for our users. We work " +
                "tirelessly to ensure that our app is user-friendly, intuitive, and packed with " +
                "features that make cooking fun and easy.\n\n" +
                "We're proud of what we've accomplished so far, but we know that there's always room " +
                "for improvement. We're constantly looking for ways to enhance our app and provide our " +
                "users with even more value." +
                "\n\nThank you for choosing DishCovery Recipe App. We're honored to be a part of your culinary journey."
        return aboutus
    }
    fun about2():String{
        val aboutus: String = "We at DishCovery Recipe App strive to provide you with the best cooking " +
                "experience possible. If you have any questions, comments, or concerns, we would love " +
                "to hear from you. Our customer service team is available 24/7 to assist you with " +
                "any inquiries you may have. Whether you need help with using our app, navigating " +
                "our website, or finding the perfect recipe for your next meal, we are here to help. " +
                "Don't hesitate to reach out to us via email, phone, or chat. We value your feedback " +
                "and are always looking for ways to improve our app to make it the best it can be. " +
                "\n\n\nEmail: \n\nbruce.asto@neu.edu.ph\n" +
                "\nmae.ariate@neu.edu.ph\n" +
                "\nkristine.baciles@neu.edu.ph\n" +
                "\nPhone: 09278698345\n" +
                "\n\nOperating Hours: Our support team is available to assist you Monday through Friday, " +
                "from 9:00 AM to 6:00 PM\n\n" +
                "We're committed to providing you with the best possible experience on our DishCovery " +
                "Recipe App, and your feedback is essential to achieving that goal. We appreciate " +
                "your support and look forward to hearing from you."
        return aboutus
    }
}