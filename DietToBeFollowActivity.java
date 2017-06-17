package com.example.parveen.healthconsultantsandnutrition;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class DietToBeFollowActivity extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet_to_be_follow);
        tv = (TextView) findViewById(R.id.textView8);
        tv.setSelected(true);
        tv.setHorizontallyScrolling(true);


        tv.setText("Ectomorph: Ectomorph Body\n" +
                "\n" +
                "ectomorph body\n" +
                "\n" +
                "Ectomorphs are the ones who find a tough time in gaining weight whether it be muscle or fat. They do not possess a muscular type instead appear lean and tall. They don’t have any curves and are flat- chested. These are the people who remain skinny all through their entire life. They have high metabolic rates, and the muscular growth is slower in terms. Fat gain is minimal, so they need to put on extra efforts to gain weight and to strengthen their muscles.\n" +
                "\n" +
                "They can eat anything and everything and still remain lean for the entire lifetime. They are less prone to obesity. Following proper workouts and diet plans helps them to give a better standing look.\n" +
                "\n" +
                "Ectomorph: Training\n" +
                "\n" +
                "Ectomorphs have to put in hard efforts to train their body because as I have said muscular growth is slow and building stronger and bigger muscles is not an easy task. At the same time, once they gain a good strength in their muscles they have to keep a check on their muscle growth every day as it is equally important not to over train your body.\n" +
                "\n" +
                "Workout for ectomorph body types should begin with weight training, followed by indoor cardio workout. They need to see that they work for about 1 hour each day. It is better if they concentrate on arms, chest, back, legs, and shoulders and working on 9 to 12 sets per day would give better results. Remember you must not exceed 12 sets as the primary drawback would be over training of your body.\n" +
                "\n" +
                "Ectomorph Training\n" +
                "\n" +
                "Choose your exercises effectively that work all parts of your body. Different exercises that work for different muscle parts would fetch you optimum results. If you do 1 exercise for 3 sets, you could end up doing 3 to 4 exercises as per the number of sets you decided to do. Take rest for about 30 seconds to 1 minute between each set and it boosts your energy levels up when doing other sets.  Trying out different compound exercises like biceps helps you in building stronger muscles. The best workout for ectomorph is basic squats, rows, step- ups, and push- ups. Walking on tread- mill and kickboxing would also fetch good results. Ectomorph workout plans for gaining more curves should include swimming as it provides resistance to your body. Daily pool workouts will provide extra fat insulation for skinny bodies.\n" +
                "\n" +
                "Ectomorph: Diet\n" +
                "\n" +
                "As ectomorphs have a tall, thin or lean body, they need to increase the intake of calories in their diet with a balanced bodybuilding diet plan for mass gain. If you are a true ectomorph you should eat 1000 calories and if you are moderate 750 calories wouldn’t be bad over your maintenance levels. You need not worry whether intake of such huge amount of calories increases the amount of fat levels in your body. No, in fact, these calories help you in the fast growth of muscles and repair them as ectos have high metabolic rates.\n" +
                "\n" +
                "Ectomorph Diet plan\n" +
                "\n" +
                "Don’t skip meals for any reason and you will need to eat a lot more than normal. Avoid junk and fried food if necessary. Eat meals for every 1 hour 30 minutes (at least 6 meals a day) as the key is to take more calories than you burn.  Protein, carbs and fat ratio in terms of percentage of calories can be 40% protein, 40% carbs and 20% fats. Intake of complex carbohydrates like pasta, rice, grain bread, and dried fruits would help you gain maximum results. Drink plenty of water to keep your muscles hydrated and taking enough rest is also necessary to gain the perfect weight and muscle strength.\n" +
                "\n" +
                "Diet Plan for Ectomorph Body Type\n" +
                "\n" +
                "The typical ectomorph body type is characterized by small bone structure and frame, lean muscles and flat chest. People with this body type find it difficult to gain weight due to a fast metabolism. Here, we have presented a sample diet plan for ectomorph body type to promote muscle gain.\n" +
                "\n" +
                "Breakfast – Banana and Raspberries Smoothie (348 calories) or French Toast Total Calories (315 calories)\n" +
                "\n" +
                "Ectomorph Diet - Banana and Raspberries Smoothie\n" +
                "\n" +
                "Midmorning Snack – A handful of dried fruits and nuts (350 calories)\n" +
                "\n" +
                "Lunch – Lamb Stew (300 calories) + stir-fried vegetables (122 calories)\n" +
                "\n" +
                "Evening Snack – Banana and strawberry smoothie (197 calories)\n" +
                "\n" +
                "Dinner – Brown rice (332 calories) + Sweet and sour chicken (237 calories)\n" +
                "\n" +
                "300 Calorie Dinner Plan for nonveg\n" +
                "\n" +
                "Pros and Cons of Ectomorph Body Type\n" +
                "\n" +
                "Although, those struggling weight over-weight issues envy the ectomorph body type, there are a number of advantages of disadvantages of all the three body types.\n" +
                "\n" +
                "Advantages:\n" +
                "\n" +
                "The best advantage of ectomorph body types is that people with this body type never have to care about calories.\n" +
                "\n" +
                "This body type is genetically blessed with superior aerobic capacity.\n" +
                "\n" +
                "Ectomorphs are blessed with a fast metabolism that promotes fast fat burn.\n" +
                "\n" +
                "Disadvantages:\n" +
                "\n" +
                "People with ectomorph body type have low muscle-building potential and it difficult for them to put on lean muscle mass.\n" +
                "\n" +
                "Mesomorph:Mesomorph BodyMesomorph Body\n" +
                "\n" +
                "You are blessed with perfect physique if you are gifted with mesomorphic body type naturally. Mesomorphs are considered athletes and muscular with broad shoulders and bold look. They tend to lose fat easily and doesn’t gain much fat if they control themselves except in rare cases. You need not put a lot of efforts as in the case of ectomorph unless and until your body is a blend of either ectomorph and mesomorph or endomorph and mesomorph. All you mesomorphs need to do is maintain your body type with workouts as your body is very well suited for bodybuilding and by following a healthy diet.\n" +
                "\n" +
                "Mesomorph: Training\n" +
                "\n" +
                "Training for mesomorph body type should be hard and heavy as they already possess a muscular body and have enough stamina. Boot camp training, yoga, Pilates, basic calisthenic exercises list and step classes can be considered some of the best workout plans for mesomorphs. Mesomorphs’ trying out circuit training seems great as it helps in building strength and stamina more effectively than building muscles which are not a necessary regimen for mesomorphs.\n" +
                "\n" +
                "\n" +
                " \n" +
                "Mesomorph TrainingFor weight training, try to initially work out with light and moderate lifts if you are a newbie and do no more than 3 exercises for each body part thrice in a week. For each exercise, you can do 3 to 4 sets which help you in giving a toned look. You can plan your workout for about an hour and resting for 30 seconds to 1 minute after completing each set is a must. You need to keep on changing the intensity of the exercises you do which helps you turn your body into perfect shape rather than bulk type. Running, skipping, strip sets and force sets techniques can be included in your smart workout.\n" +
                "\n" +
                "Mesomorph: Diet\n" +
                "\n" +
                "There are not any major challenges for a mesomorph in taking a healthy diet. All they have to do is to maintain a balanced diet like a 1200 cal meal plan with 40% carbs, 30- 40% lean protein and 20- 30% fats.  You need to maintain a regular intake of 500 calories of diet over your maintenance levels, and if you want to lose weight in necessary conditions you can reduce the calorie intake by 200- 500 calories per day.\n" +
                "\n" +
                "Mesomorph Diet\n" +
                "\n" +
                " More carbohydrates from dried fruits, oatmeal, potatoes and other foods can be easily obtained. To include healthy fats increase the intake of nuts, flaxseed oil, olive oil, avocados and etc., in your diet.\n" +
                "\n" +
                "Diet Plan for Mesomorph Body Type\n" +
                "\n" +
                "Mesomorphs are blessed with good genetics so that any type of diet plan would work for them. Mesomorphs are characterised with well-built and muscular body, athletic physique and broad frame. Here, we have presented a sample meal plan for mesomorph body type.\n" +
                "\n" +
                "Breakfast – A bowl of oatmeal with fresh or frozen berries (161 calories) + 2 Boiled eggs (156 calories)\n" +
                "\n" +
                "Mesomorph Diet Plan\n" +
                "\n" +
                "Midmorning Snack – 2 Rice Cakes with peanut spread (214 calories) + 1 Glass of skimmed milk (83 calories)\n" +
                "\n" +
                "Lunch – Grilled chicken breast (141 calories) + salad made with quinoa, leafy greens, tomatoes, cucumbers and mushrooms (430 calories)\n" +
                "\n" +
                "grilled chicken and vegetables\n" +
                "\n" +
                "Evening snack – Cottage cheese with fresh fruits (219 calories)\n" +
                "\n" +
                "Cottage cheese with fresh fruits\n" +
                "\n" +
                "Dinner – Baked sweet potato (90 calories) + stir-fried chicken and vegetables (439 calories)\n" +
                "\n" +
                "Pros and Cons of Mesomorph Body Type\n" +
                "\n" +
                "This is perhaps the perfect body type that has absolutely no negative aspects. People blessed with mesomorph body type have amazing body shaping and muscle-building potential and have to spend the least time in losing unwanted body fat.\n" +
                "\n" +
                "Advantages:\n" +
                "\n" +
                "People with this body type don’t have to worry about watching calories.\n" +
                "\n" +
                "It is easier for mesomorphs to gain lean muscle mass and stay in a good shape compared to the other two body types.\n" +
                "\n" +
                "People with mesomorph body types have superior anaerobic potential that makes them the best candidate for strength and power sports.\n" +
                "\n" +
                "Like ectos, mesos are also blessed with a fast metabolism.\n" +
                "\n" +
                "Disadvantages:\n" +
                "\n" +
                "There are not really any disadvantages of the mesomorph body type.\n" +
                "\n" +
                "Endomorph:Endomorph bodyEndomorph body\n" +
                "\n" +
                "Endomorph body types generally have a round, curve shaped body. Endomorphs are the people who normally have a plump or fat structured body type. They do possess a soft body, underdeveloped muscles and over developed digestive system and the overall bone structure will certainly be large. They have an increased amount of fat storage; as a result they have high number of fat cells unlike the people of other body types. They cannot lose fat easily but tend to gain fat quickly.  The only thing these people should do is control their fat and plan their diet accordingly.\n" +
                "\n" +
                "Endomorph: Training\n" +
                "\n" +
                "Endomorphs mainly need to focus on dropping the pounds of fat accumulated in their cells. They need to lift heavy weights because lifting small weights doesn’t help them in losing fat so easily. However, they should continue in lifting heavy weights only if they feel comfortable. They need to gain muscle growth and lose weight at the mid-section of the body with effective exercise to reduce tummy. So, working on cardio exercise will fetch them maximum benefits as the main goal of endos is to burn calories.\n" +
                "\n" +
                "Endomorph training\n" +
                "\n" +
                "Exercising your body must be restricted to one hour or less else you might end up over training your body or some other side effects in the chain. Recommended numbers of sets for this body type are 9 and not more than that. Just as in the case of ectomorphs, endomorphs also need to choose exercises that help them work all parts of the body. You can try circuit training thrice a week as it helps in full body strength training. High intensity of cardio exercises for about 20 minutes twice a week is a must to burn maximum fat. Fast paced walking on a treadmill including spinning and step class exercises are a must to cut your weight.\n" +
                "\n" +
                "Endomorph: Diet\n" +
                "\n" +
                "These people need to concentrate on burning huge amount of fats in their body. They need to increase the intake of fiber rich foods and natural protein foods that help them in reducing the calories in their body and enhance lean muscle mass. They need to avoid junk and fried foods and replace them with healthy drinks and plenty of water. Limit your fat intake to around 20% of total caloric value.\n" +
                "\n" +
                "Endomorph Diet plan\n" +
                "\n" +
                "The endomorph body type diet should include carbohydrates like grains, fruits, oatmeal, brown rice, sweet potatoes etc., Take 5 to 6 meals a day which boosts up your metabolic behaviour. Implementing such diet would really help endomorphs to gain a good shape and body.\n" +
                "\n" +
                "Diet Plan for Endomorph Body Type\n" +
                "\n" +
                "Endomorphs are characterized by curvaceous features, full-figured and pear shaped body with medium-large bone structure, small shoulders and shorter limbs. Endomorphs carry their weight in the lower part of the body which makes it a bit difficult for them to lose weight. Here, we have presented a sample meal plan for the endomorph body type.\n" +
                "\n" +
                "Breakfast – Egg whites and vegetables omelette (61 calories) + 1 apple (52 calories)\n" +
                "\n" +
                "Midmorning Snack – Greek yogurt with strawberries (136 calories)\n" +
                "\n" +
                "Eat yogurt and curd\n" +
                "\n" +
                "Lunch – Whole grain pasta (174 calories) + grilled chicken breast (141 calories)\n" +
                "\n" +
                "Evening Snack – 1 pear (96 calories) + handful of almonds (92 calories)\n" +
                "\n" +
                "benefits of almonds\n" +
                "\n" +
                "Dinner – Brown rice (332 calories) + stir-fried vegetables (122 calories)\n" +
                "\n" +
                "Pros and Cons of Endomorph Body Type\n" +
                "\n" +
                "Although, most of us think that there are no advantages of the endomorph body type and this body type is only characterized by fat storage around the mid sections of the body, but in reality there are quite a per positive aspects of this body type.\n" +
                "\n" +
                "Advantages:\n" +
                "\n" +
                "Like mesomorphs, endomorphs can gain muscle mass rapidly.\n" +
                "\n" +
                "Endomorphs usually have high physical strength and athletic potential.\n" +
                "\n" +
                "Individuals with endomorph body type are best suited for sports that require explosive strength like weight lifting.\n" +
                "\n" +
                "Disadvantages:\n" +
                "\n" +
                "The main drawback of the endomorph body type is the slower metabolism that makes it difficult to shed the fat.\n" +
                "\n" +
                "Although, endomorphs cannot be called “hard gainers”, but slow metabolism means more concentration has to        be put on keeping the fat away than building muscles..");
    }

}
