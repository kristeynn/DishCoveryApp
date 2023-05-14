package com.labactivity.dishcoveryapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.labactivity.dishcoveryapp.databinding.ActivityIngredientsBinding

class Ingredients : AppCompatActivity() {
    private lateinit var binding: ActivityIngredientsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIngredientsBinding.inflate(layoutInflater)
        setContentView(binding.root)


        var resi1 = intent.getStringExtra("ReciName1").equals("Details1")
        var resi2 = intent.getStringExtra("ReciName2").equals("Details2")
        var resi3 = intent.getStringExtra("ReciName3").equals("Details3")
        var resi4 = intent.getStringExtra("ReciName4").equals("Details4")
        var resi5 = intent.getStringExtra("ReciName5").equals("Details5")
        var resi6 = intent.getStringExtra("ReciName6").equals("Details6")
        var resi7 = intent.getStringExtra("ReciName7").equals("Details7")
        var resi8 = intent.getStringExtra("ReciName8").equals("Details8")
        var resi9 = intent.getStringExtra("ReciName9").equals("Details9")
        var resi10 = intent.getStringExtra("ReciName10").equals("Details10")
        var resi11 = intent.getStringExtra("ReciName11").equals("Details11")
        var resi12 = intent.getStringExtra("ReciName12").equals("Details12")
        var resi13 = intent.getStringExtra("ReciName13").equals("Details13")
        var resi14 = intent.getStringExtra("ReciName14").equals("Details14")
        var resi15 = intent.getStringExtra("ReciName15").equals("Details15")
        var resi16 = intent.getStringExtra("ReciName16").equals("Details16")

        //Main menu
        var waffle = intent.getStringExtra("buttonName").equals("Waffle")
        var chickenCaesar = intent.getStringExtra("buttonName").equals("Caesar")
        var chickenParmesan = intent.getStringExtra("buttonName").equals("Parmesan")
        var mozarellaSticks = intent.getStringExtra("buttonName").equals("Sticks")

        if (waffle){
            binding.imageView.setImageResource(R.drawable.wafflepic)
            binding.title.setText("Waffle")
            binding.recipee.setText(Details1())
        }
        if (chickenCaesar){
            binding.imageView.setImageResource(R.drawable.chickceasar)
            binding.title.setText("Chicken Caesar")
            binding.recipee.setText(Details8())
        }
        if (chickenParmesan){
            binding.imageView.setImageResource(R.drawable.chknparm)
            binding.title.setText("Chicken Parmesan")
            binding.recipee.setText(Details11())
        }
        if (mozarellaSticks){
            binding.imageView.setImageResource(R.drawable.moz)
            binding.title.setText("Mozarella Stick")
            binding.recipee.setText(Details13())
        }
        //
        //Waffle
        if (resi1) {
            binding.imageView.setImageResource(R.drawable.wafflepic)
            binding.title.setText("Waffle")
            binding.recipee.setText(Details1())
        }

        //Smoothie Bowl
        else if (resi2) {
            binding.imageView.setImageResource(R.drawable.smoothiebowl)
            binding.title.setText("Smoothie Bowl")
            binding.recipee.setText(Details2())
        }

        //Omelette
        else if(resi3) {
            binding.imageView.setImageResource(R.drawable.ome)
            binding.title.setText("Omelette")
            binding.recipee.setText(Details3())
        }

        //French Toast
        else if(resi4) {
            binding.imageView.setImageResource(R.drawable.frencht)
            binding.title.setText("French Toast")
            binding.recipee.setText(Details4())

        }

        //Pasta Salad
        else if (resi5) {
            binding.imageView.setImageResource(R.drawable.psalad)
            binding.title.setText("Pasta Salad")
            binding.recipee.setText(Details5())

        }

        //Quesadilla
        else if (resi6) {
            binding.imageView.setImageResource(R.drawable.ques)
            binding.title.setText("Quesadilla")
            binding.recipee.setText(Details6())
        }

        //Fish Tacos
        else if(resi7) {
            binding.imageView.setImageResource(R.drawable.fishtcs)
            binding.title.setText("Fish Tacos")
            binding.recipee.setText(Details7())
        }

        //Chicken Caesar
        else if(resi8) {
            binding.imageView.setImageResource(R.drawable.chickceasar)
            binding.title.setText("Chicken Caesar")
            binding.recipee.setText(Details8())

        }

        //Steak Dinner
        else if (resi9) {
            binding.imageView.setImageResource(R.drawable.stk)
            binding.title.setText("Steak Dinner")
            binding.recipee.setText(Details9())

        }

        //Pot Roast
        else if (resi10) {
            binding.imageView.setImageResource(R.drawable.potrows)
            binding.title.setText("Pot Roast")
            binding.recipee.setText(Details10())
        } else if(resi11) {
            binding.imageView.setImageResource(R.drawable.chknparm)
            binding.title.setText("Chicken Parmesan")
            binding.recipee.setText(Details11())
        }

        //Grilled Samon
        else if(resi12) {
            binding.imageView.setImageResource(R.drawable.grilledsamon)
            binding.title.setText("Grilled Samon")
            binding.recipee.setText(Details12())
        }

        //Mozarella Stick
        else if (resi13) {
            binding.imageView.setImageResource(R.drawable.moz)
            binding.title.setText("Mozarella Stick")
            binding.recipee.setText(Details13())

        }

        else if (resi14) {
            binding.imageView.setImageResource(R.drawable.moj)
            binding.title.setText("Mojos")
            binding.recipee.setText(Details14())
        } else if(resi15) {
            binding.imageView.setImageResource(R.drawable.corrnd)
            binding.title.setText("Corn Dog")
            binding.recipee.setText(Details15())
        } else if(resi16) {
            binding.imageView.setImageResource(R.drawable.spinachd)
            binding.title.setText("Spinach Dip")
            binding.recipee.setText(Details16())
        }
    }


    //Waffle
    fun Details1():String{
        val dets: String = "\nINGREDIENTS\n\n" +
                "\t• 2 cups all-purpose flour\n" +
                "\t• 1 teaspoon salt\n" +
                "\t• 4 teaspoons baking powder\n" +
                "\t• 2 tablespoons white sugar\n" +
                "\t• 2 eggs\n" +
                "\t• 1 ½ cups warm milk\n" +
                "\t• ⅓ cup butter, melted\n" +
                "\t •1 teaspoon vanilla extract\n" +
                "\n\nPROCEDURE:\n" +
                "\nStep 1: Gather all ingredients.\n" +
                "\nStep 2: In a large bowl, mix together flour, salt, baking powder and sugar; set aside. Preheat waffle iron to desired temperature.\n" +
                "\nStep 3: In a separate bowl, beat the eggs. Stir in the milk, butter and vanilla.\n" +
                "\nStep 4: Pour the milk mixture into the flour mixture; beat until blended..\n" +
                "\nStep 5: Ladle the batter into a preheated waffle iron.\n" +
                "\nStep 6: Cook the waffles until golden and crisp.\n" +
                "\nStep 7: Serve immediately and enjoy!"

        return dets
    }

    //Smoothie Bowl
    fun Details2():String{
        val dets: String = "\nINGREDIENTS\n\n" +
                "\t• 1 heaping cup organic frozen mixed berries\n" +
                "\t• 1 small ripe banana (sliced and frozen)\n" +
                "\t• 2-3 Tbsp light coconut or almond milk (plus more as needed)\n" +
                "\t• 1 scoop plain or vanilla protein powder of choice* (optional)\n" +
                "\n\n TOPPINGS\n" +
                "\n\t• 1 Tbsp shredded unsweetened coconut (desiccated)\n" +
                "\t• 1 Tbsp chia seeds\n" +
                "\t• 1 Tbsp hemp seeds\n" +
                "\t• Granola (optional)\n" +
                "\t• Fruit (optional)\n" +
                "\n\nPROCEDURE: " +
                "\n\nStep 1: Add frozen berries and banana to a blender and blend on low until small bits remain.\n" +
                "\n\nStep 2: Add a bit of coconut or almond milk and protein powder (optional), and blend on low again, scraping down sides as needed, until the mixture reaches a soft serve consistency." +
                "\n\nStep 3: Scoop into 1-2 serving bowls (amount as original recipe is written // adjust if altering batch size) and top with desired toppings (optional)." +
                "\n\nStep 4: Best when fresh, though leftovers keep in the freezer for 1-2 weeks. Let thaw before enjoying."

        return dets
    }

    //Omelette
    fun Details3():String{
        val dets: String = "\nINGREDIENTS:\n\n" +
                "\t• 3 eggs, beaten\n" +
                "\t• 1 tsp sunflower oil\n" +
                "\t• 1 tsp butter\n" +
                "\n\nPROCEDURE:\n" +
                "\nStep 1: Season the beaten eggs well with salt and pepper. Heat the oil and butter in a non-stick frying pan over a medium-low heat until the butter has melted and is foaming.\n" +
                "\nStep 2: Pour the eggs into the pan, tilt the pan ever so slightly from one side to another to allow the eggs to swirl and cover the surface of the pan completely. Let the mixture cook for about 20 seconds then scrape a line through the middle with a spatula.\n" +
                "\nStep 3: Tilt the pan again to allow it to fill back up with the runny egg. Repeat once or twice more until the egg has just set.\n" +
                "\nStep 4: At this point you can fill the omelette with whatever you like – some grated cheese, sliced ham, fresh herbs, sautéed mushrooms or smoked salmon all work well. Scatter the filling over the top of the omelette and fold gently in half with the spatula. Slide onto a plate to serve."

        return dets
    }

    //French Toast
    fun Details4():String{
        val dets: String = "\nINGREDIENTS:\n\n" +
                "\t• 1 egg\n" +
                "\t• 1 teaspoon Vanilla Extract\n" +
                "\t• 1/2 teaspoon Ground Cinnamon\n" +
                "\t• 1/4 cup milk\n" +
                "\t• 4 slices hearty sandwich bread\n" +
                "\n\nPROCEDURE:" +
                "\n\nStep 1: Whisk egg, vanilla and cinnamon in shallow dish. Stir in milk.\n" +
                "\nStep 2: Dip bread slices in egg mixture, turning to coat evenly on both sides.\n" +
                "\nStep 3: Cook bread slices on lightly greased nonstick griddle or skillet on medium heat until cooked through and browned on both sides. Serve with Easy Spiced Syrup (recipe follows), if desired. Voila, easy French toast.\n" +
                "\nStep 4: Easy Spiced Syrup: Add 1 teaspoon Vanilla Extract and 1/4 teaspoon Ground Cinnamon to 1 cup pancake syrup; stir well to mix. Serve warm, if desired."
        return dets
    }

    //Pasta Salad
    fun Details5():String{
        val dets: String = "\nINGREDIENTS:\n\n" +
                "\t• 1 pound tri-colored spiral pasta\n" +
                "\t• 1 (16 ounce) bottle Italian-style salad dressing\n" +
                "\t• 6 tablespoons salad seasoning mix\n" +
                "\t• 2 cups cherry tomatoes, diced\n" +
                "\t• 1 green bell pepper, chopped\n" +
                "\t• 1 red bell pepper, diced\n" +
                "\t• ½ yellow bell pepper, chopped\n" +
                "\t• 1 (2.25 ounce) can black olives, chopped\n" +
                "\n\nPROCEDURE: \n" +
                "\nStep 1: Gather all ingredients.\n" +
                "\nStep 2: Bring a large pot of lightly salted water to a boil. Cook pasta in the boiling water, stirring occasionally, until tender yet firm to the bite, about 10 to 12 minutes; rinse under cold water and drain.\n" +
                "\nStep 3: Whisk Italian dressing and salad spice mix together until smooth. Combine pasta, tomatoes, bell peppers, and olives in a salad bowl.\n" +
                "\nStep 4: Pour dressing over salad and toss to coat.\n" +
                "\nStep 5: Refrigerate salad, 8 hours to overnight.\n" +
                "\nStep 6: Enjoy!"
        return dets
    }

    //Quesadilla
    fun Details6():String{
        val dets: String = "\nINGREDIENTS:\n\n" +
                "\t• Large flour tortillas\n" +
                "\t• Grated cheese such as mild or sharp cheddar, or Monterey Jack\n" +
                "\t• Olive oil or butter\n" +
                "\n\nOPTIONAL: \n" +
                "\n\t• Sliced mushrooms\n" +
                "\t• Green onions\n" +
                "\t• Black olives, sliced\n" +
                "\t• Fresh tomatoes, diced\n" +
                "\t• Chicken pieces\n" +
                "\t• Avocado\n" +
                "\t• Lettuce\n" +
                "\t• Apple cider vinegar\n" +
                "\t• Kosher salt\n" +
                "\n\nPROCEDURE: " +
                "\n\nStep1: Heat the tortillas until air pockets form: " +
                "Heat a large skillet (cast iron works great) on medium high heat. Add a small amount of oil (about 1/2 teaspoon) and spread it around the bottom of the pan with a spatula (you could use butter as well).Take one large flour tortilla and place it in the pan. Flip the tortilla over a few times, 10 seconds between flips. Air pockets should begin to form within the tortilla.\n" +
                "\nStep2: Add the cheese and other ingredients. " +
                "When pockets of air begin to form, take a handful of grated cheese, sprinkle over the top of the tortilla, making sure that the cheese does not land on the pan itself. Add whatever additional ingredients you choose - green onion, sliced mushrooms, olives, tomatoes, etc. If you would like your quesadilla to be a chicken quesadilla, add some diced cooked chicken.\n" +
                "\nStep3: Lower the heat and cover pan. " +
                "Reduce the heat to low and cover the pan. The pan should be hot enough by now to have plenty of residual heat to melt the cheese and brown the tortilla. If the quesadilla begins to smoke too much, remove from the heat. After a minute, check to see if the cheese is melted. If not, return the cover and keep checking every minute until the cheese is melted.\n" +
                "\nStep4: Fold the tortilla over. " +
                "When the cheese is sufficiently melted, use a spatula to lift up one side of the quesadilla and flip over the other side, as if you were making an omelette.The tortilla should by now be browned slightly. If it is not browned, turn the heat up to high and flip the quesadilla over every 10 seconds or so until it gets browned.\n" +
                "\nStep5: Remove quesadilla from pan and cut into wedges. " +
                "To make the lettuce to accompany the quesadilla, thinly slice some iceberg lettuce. Sprinkle some cider vinegar on it and some salt. Serve with the lettuce, salsa, sour cream, and guacamole."
        return dets
    }

    //Fish Tacos
    fun Details7():String{
        val dets: String = "\nINGREDIENTS\n\n" +
                "For the fish:\n\n" +
                "\t• 1 pound cod, tilapia, halibut, or other white fish filets\n" +
                "\t• 2 to 3 teaspoons chili powder, enough to coat the fish\n" +
                "\t• 1 teaspoon kosher salt\n" +
                "\n\nFor the fish taco sauce:\n" +
                "\n\t• 1/2 cup sour cream\n" +
                "\t• 1/4 cup mayonnaise\n" +
                "\t• 3 to 4 tablespoons lime juice (from 2 limes)\n" +
                "\t• 1 teaspoon hot sauce, optional\n" +
                "\n\nTo assemble:\n\n" +
                "\t• 1/2 small head red cabbage, shredded (about 4 cups)\n" +
                "\t• 12 taco-sized corn or flour tortillas\n" +
                "\t• 1 avocado, sliced\n" +
                "\t• 4 radishes, thinly sliced\n" +
                "\t• 4 spring onions, thinly sliced\n" +
                "\t• 1/3 cup roughly chopped cilantro\n" +
                "\n\nPROCEDURE:" +
                "\n\nStep 1: Make the fish taco sauce:\n" +
                "In a small bowl, combine the sour cream, mayonnaise, lime juice, and hot sauce (if using) for the taco sauce. Stir until combined.\n" +
                "\nStep 2: Make the red cabbage slaw:\n" +
                "In a medium bowl, combine the shredded cabbage with 3 tablespoons of the taco sauce. Stir to coat and add more taco sauce if you like. (The cabbage shouldn't be dripping with sauce; aim for a very thin coating.)\n" +
                "\nStep3: Warm the tortillas:\n" +
                "In a dry skillet over medium-high heat, warm the tortillas one at a time for about 30 seconds on both sides. Alternatively, wrap 1 to 3 tortillas in a damp paper towel and microwave for 30 seconds, until warm.Keep warmed tortillas wrapped in a clean dish towel while you make the fish.\n" +
                "\nStep 4: Season the fish: Sprinkle the fish on both sides with chili powder and salt. Gently rub in the seasonings with your fingers to make sure the fish is entirely coated.\n" +
                "\nStep 5: Cook the fish: Warm a large cast iron or nonstick skillet on the stovetop over medium-high heat. When hot, add one tablespoon of olive oil and tilt the pan to entirely coat the bottom.\n" +
                "Add the fish to the pan and cook for 2 minutes. Flip the fish and cook another 2 minutes. Flip and cook 1-2 minutes longer if needed; the fish is done when it is opaque all the way through and breaks apart easily. If any smaller, thinner pieces of the fish start to break off as you flip, just scoop them out and transfer them to a serving platter.\n" +
                "\nStep 6: Serve the tacos:Transfer the cooked fillets to a platter and use a fork or a knife to gently break the fish into large chunks. Assemble the tacos with a few pieces of fish, some cabbage slaw, toppings of your choice, and a drizzle of taco sauce."
        return dets
    }

    //Chicken Caesar
    fun Details8():String{
        val dets: String = "\nINGREDIENTS: \n" +
                "\n\t• 6 cloves garlic, peeled, divided\n" +
                "\t• ¾ cup mayonnaise\n" +
                "\t• 6 tablespoons grated Parmesan cheese, divided\n" +
                "\t• 5 anchovy fillets, minced\n" +
                "\t• 1 tablespoon lemon juice, or more to taste\n" +
                "\t• 1 teaspoon Worcestershire sauce\n" +
                "\t• 1 teaspoon Dijon mustard\n" +
                "\t• Salt and ground black pepper to taste\n" +
                "\t• ¼ cup olive oil\n" +
                "\t• 4 cups day-old bread, cubed\n" +
                "\t• 1 head romaine lettuce, torn into bite-sized pieces\n" +
                "\n\nPROCEDURE:" +
                "\n\nStep 1: Gather all ingredients.\n" +
                "\nStep 2: Mince 3 cloves of garlic and place in a small bowl. Add mayonnaise, 2 tablespoons grated Parmesan cheese, anchovies, lemon juice, Worcestershire sauce, and mustard; mix well to combine. Season to taste with salt and black pepper. Refrigerate until ready to use.\n" +
                "\nStep 3: Heat oil in a large skillet over medium heat. Slice remaining 3 cloves of garlic into quarters and add to hot oil. Cook and stir until brown, then remove garlic from pan. Cook bread cubes in hot flavored oil, turning frequently, until lightly browned; transfer onto a plate and season with salt and pepper.\n" +
                "\nStep 4: Place lettuce in a large bowl. Add dressing, remaining Parmesan cheese, and seasoned bread cubes; toss well to coat.\n" +
                "\nStep 5: Serve immediately and enjoy!"
        return dets
    }

    //Steak Dinner
    fun Details9():String{
        val dets: String = "\nINGREDIENTS: \n\n" +
                "\t• 4 pounds New York strip steak, sliced thin\n" +
                "\t• 1 lemon, juiced\n" +
                "\t• 3 tablespoons soy sauce\n" +
                "\t• 1 teaspoon white sugar\n" +
                "\t• salt and pepper to taste\n" +
                "\t• 1 tablespoon cornstarch\n" +
                "\t• ¼ cup vegetable oil\n" +
                "\t• 3 tablespoons olive oil\n" +
                "\t• 1 onion, chopped\n" +
                "\t• 2 cloves garlic, chopped\n" +
                "\n\nPROCEDURES:\n" +
                "\nStep 1: Place sliced beef in a large bowl. Whisk together lemon juice, soy sauce, sugar, salt, and pepper in a small bowl; pour over beef and toss to coat. Stir in cornstarch. Cover and refrigerate for 1 hour to overnight.\n" +
                "\nStep 2: Heat vegetable oil in a large skillet over medium heat.\n" +
                "\nStep 3: Remove beef slices from marinade, shaking to remove any excess liquid. Discard marinade.\n" +
                "\nStep 4: Working in batches, fry beef slices in hot oil until they start to firm and are reddish-pink and juicy in the center, 2 to 4 minutes per side. Transfer beef slices to a serving platter.\n" +
                "\nStep 5: Heat olive oil in a small skillet over medium heat. Cook and stir onion and garlic in hot oil until onion is golden brown, 5 to 7 minutes; spoon over beef slices."

        return dets
    }
    //Pot Roast
    fun Details10():String{
        val dets: String = "\nINGREDIENTS:\n\n" +
                "\t• 1 tablespoon vegetable oil\n" +
                "\t• 3 ½ pounds beef chuck pot roast\n" +
                "\t• 2 teaspoons salt\n" +
                "\t• 1 teaspoon ground black pepper\n" +
                "\t• 1 cup diced carrots\n" +
                "\t• 1 cup diced celery\n" +
                "\t• 1 cup diced onion\n" +
                "\t• ¼ cup butter\n" +
                "\t• 1 teaspoon dried rosemary\n" +
                "\n\nPROCEDURE: \n"+
                "\nStep 1: Preheat the oven to 275 degrees F (135 degrees C).\n" +
                "\nStep 2: Heat vegetable oil into a large oven-safe pot over medium-high heat. Season chuck roast with salt and black pepper, then cook in hot oil until brown on both sides; transfer to a plate.\n" +
                "\nStep 3: Add carrots, celery, and onion into the pot. Cook and stir until vegetables start to release their juices, scraping any brown flavor bits off the bottom of the pot, about 3 minutes. Add butter, and cook until onions are translucent, about 5 minutes. Sprinkle in rosemary; return roast to the pot and cover.\n" +
                "\nStep 4: Roast in the preheated oven until the chuck roast is tender, about 2 1/2 to 3 hours. Season vegetables with additional salt and black pepper, if desired."

        return dets
    }

    //Chicken Parmesan
    fun Details11():String{
        val dets: String = "\nINGREDIENTS: \n\n" +
                "\t• 4 skinless, boneless chicken breast halves\n" +
                "\t• salt and freshly ground black pepper to taste\n" +
                "\t• 2 large eggs\n" +
                "\t• 1 cup panko bread crumbs, or more as needed\n" +
                "\t• ¾ cup grated Parmesan cheese, divided\n" +
                "\t• 2 tablespoons all-purpose flour, or more if needed\n" +
                "\t• ½ cup olive oil for frying, or as needed\n" +
                "\t• ½ cup prepared tomato sauce\n" +
                "\t• ¼ cup fresh mozzarella, cut into small cubes\n" +
                "\t• ¼ cup chopped fresh basil\n" +
                "\t• ½ cup grated provolone cheese\n" +
                "\t• 2 teaspoons olive oil\n" +
                "\n\nPROCEDURES: \n" +
                "\nStep 1: Preheat an oven to 450 degrees F (230 degrees C).\n" +
                "\nStep 2: Place chicken breasts between two sheets of heavy plastic (resealable freezer bags work well) on a solid, level surface. Firmly pound chicken with the smooth side of a meat mallet to a thickness of 1/2-inch.\n" +
                "\nStep 3: Season chicken thoroughly with salt and pepper. Using a sifter or strainer; sprinkle flour over chicken breasts, evenly coating both sides\n" +
                "\nStep 4: Beat eggs in a shallow bowl and set aside.\n" +
                "\nStep 5: Mix bread crumbs and 1/2 cup Parmesan cheese in a separate bowl, set aside.\n" +
                "\nStep 6: Dip a flour-coated chicken breast in beaten eggs. Transfer breast to the bread crumb mixture, pressing crumbs into both sides. Repeat for each breast. Let chicken rest for 10 to 15 minutes.\n" +
                "\nStep 7: Heat 1/2 inch olive oil in a large skillet on medium-high heat until it begins to shimmer. Cook chicken in the hot oil until golden, about 2 minutes per side. The chicken will finish cooking in the oven.\n" +
                "\nStep 8: Transfer chicken to a baking dish. Top each breast with 2 tablespoons tomato sauce. Layer each chicken breast with equal amounts of mozzarella cheese, fresh basil, and provolone cheese. Sprinkle remaining Parmesan over top and drizzle each with 1/2 teaspoon olive oil.\n" +
                "\nStep 9: Bake in the preheated oven until cheese is browned and bubbly and chicken breasts are no longer pink in the center, 15 to 20 minutes. An instant-read thermometer inserted into the center should read at least 165 degrees F (74 degrees C)."
        return dets
    }

    //Grilled Samon
    fun Details12():String{
        val dets: String = "\nINGREDIENTS: \n\n" +
                "\t• ½ cup olive oil\n" +
                "\t• ¼ cup lemon juice\n" +
                "\t• 4 green onions, thinly sliced\n" +
                "\t• 1 tablespoon chopped fresh parsley\n" +
                "\t• 1 teaspoon chopped fresh rosemary\n" +
                "\t• 1 teaspoon chopped fresh thyme\n" +
                "\t• ½ teaspoon salt\n" +
                "\t• ⅛ teaspoon black pepper\n" +
                "\t• ⅛ teaspoon garlic powder\n" +
                "\t• 3 pounds salmon fillets\n" +
                "\n\nPROCEDURE: \n" +
                "\nStep 1: Combine olive oil, lemon juice, green onions, parsley, rosemary, thyme, salt, black pepper, and garlic powder in a small bowl; reserve 1/4 cup for basting.\n" +
                "\nStep 2: Place salmon fillets in a shallow dish and pour remaining marinade on top. Cover and refrigerate for 30 minutes.\n" +
                "\nStep 3: Preheat the grill for medium heat and lightly oil the grate.\n" +
                "\nStep 4: Remove fillets from the refrigerator; discard marinade. Place fillets on the preheated grill skin-side down. Cook, basting occasionally with reserved marinade, until fish flakes easily with a fork, 15 to 20 minutes.\n"
        return dets
    }

    //Mozarella Stick
    fun Details13():String{
        val dets: String = "\nINGREDIENTS\n\n" +
                "\t• 2 large eggs, beaten\n" +
                "\t• ¼ cup water\n" +
                "\t• 1 ½ cups Italian seasoned bread crumbs\n" +
                "\t• ½ teaspoon garlic salt\n" +
                "\t• ⅔ cup all-purpose flour\n" +
                "\t• ⅓ cup cornstarch\n" +
                "\t• 2 cups oil for frying, or as needed\n" +
                "\t• 1 (16 ounce) package mozzarella cheese sticks\n" +
                "\n\nPROCEDURE:\n" +
                "\nStep 1: Gather all ingredients.\n" +
                "\nStep 2: Whisk water and eggs together in a small bowl. Mix bread crumbs and garlic salt together in a medium bowl. Blend flour and cornstarch together in a third bowl.\n" +
                "\nStep 3: Heat oil to 365 degrees F (185 degrees C) in a large, heavy saucepan.\n" +
                "\nStep 4: Dredge a mozzarella stick in flour; shake off excess. Dip into egg mixture. Lift up so excess egg drips back in the bowl. Press into bread crumbs to coat. Place breaded mozzarella stick on a plate or wire rack. Repeat with remaining mozzarella sticks.\n" +
                "\nStep 5: Use a spider spoon or a pair of tongs to lower 3 to 4 mozzarella sticks into the hot oil. Fry until golden brown, about 30 seconds. Remove from heat and drain on paper towels. Repeat to fry remaining mozzarella sticks. Serve hot and Enjoy!"
        return dets
    }

    //Mojos
    fun Details14():String{
        val dets: String = "\nINGREDIENTS: \n\n" +
                "\t• 7 medium potatoes cleaned\n" +
                "\t• 1 1/2 cups of fried chicken breading mix\n" +
                "\t• 2 cups of Fresh milk\n" +
                "\t• Oil for deep frying\n" +
                "\n\nPROCEDURE:\n" +
                "\nStep 1: Cut the unpeeled potatoes into thin slices, about 1/4 inch thick. If you want it to be crispy, cut them thinner. I prefer to cut it a little thicker.\n" +
                "\nStep 2: In a large frying pan, pour 2 cups oil (about one inch deep)—heat oil over medium heat. When the water sizzles across the top, you are ready to fry. While heating the oil, dip each potato slices in milk and coat with the fried chicken breading mix.\n" +
                "\nStep 3: Carefully drop potatoes into the oil right away and fry for 3 minutes on each side or until golden brown. Do not overcrowd the pan and adjust heat as necessary.\n" +
                "\nStep 4: Remove and drain on a plate with a paper towel. Serve with Mayo-ketchup dip or cheese whiz."
        return dets
    }

    //Corn Dog
    fun Details15():String{
        val dets: String = "\nINGREDIENTS\n\n" +
                "\t• 1 cup yellow cornmeal\n" +
                "\t• 1 cup all-purpose flour\n" +
                "\t• ¼ cup white sugar\n" +
                "\t• 4 teaspoons baking powder\n" +
                "\t• ¼ teaspoon salt\n" +
                "\t• ⅛ teaspoon black pepper\n" +
                "\t• 1 cup milk\n" +
                "\t• 1 egg\n" +
                "\t• 1 quart vegetable oil for frying\n" +
                "\t• 2 (16 ounce) packages beef frankfurters\n" +
                "\t• 16 wooden skewers\n" +
                "\n\nPROCEDURE:\n" +
                "\nStep 1: Combine cornmeal, flour, sugar, baking powder, salt, and pepper in a medium bowl; stir in milk and egg to make a batter.\n" +
                "\nStep 2: Heat oil in a deep fryer or large saucepan to 375 degrees F (190 degrees C). Meanwhile, pat frankfurters dry and insert a skewer into each one. Roll frankfurters in batter until well coated.\n" +
                "\nStep 3: Fry 2 or 3 corn dogs at a time in preheated oil until lightly browned, about 3 minutes. Drain on paper towels."
        return dets
    }

    fun Details16():String{
        val dets: String = "\nINGREDIENTS: \n\n" +
                "\t• 1 (10-ounce) package frozen spinach, thawed, drained\n" +
                "\t• 2 tablespoons unsalted butter\n" +
                "\t• 1 medium shallot, finely chopped\n" +
                "\t• 1/2 teaspoon paprika\n" +
                "\t• 8 ounces cream cheese\n" +
                "\t• 3/4 cup (or more) heavy cream\n" +
                "\t• 1/2 teaspoon kosher salt\n" +
                "\t• 1/4 teaspoon freshly ground black pepper\n" +
                "\n\nPROCEDURE:\n" +
                "\nStep 1: Squeeze as much liquid out of the spinach as possible with a clean dishtowel or paper towels. Melt butter in a medium pan over medium-high heat. Sauté shallot until soft, 3–5 minutes. Stir in paprika and cook until fragrant, about 30 seconds. Add spinach, cream cheese, cream, salt, and pepper and cook, stirring, until warmed through and slightly reduced, 8–10 minutes; add more cream if needed to reach desired consistency.\n" +
                "\nDo Ahead\n" +
                "\nStep 2: Dip can be made 1 day ahead. Store in an airtight container and chill. Warm before serving."
        return dets
    }
}