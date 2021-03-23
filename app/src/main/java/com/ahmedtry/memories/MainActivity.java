package com.ahmedtry.memories;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int[] pics = {
            R.drawable.ah_1, R.drawable.img_2, R.drawable.img_3,
            R.drawable.img_4, R.drawable.img_5, R.drawable.img_6, R.drawable.img_7,
            R.drawable.img_8, R.drawable.img_9, R.drawable.img_10, R.drawable.img_11,
            R.drawable.img_12, R.drawable.img_13, R.drawable.img_14, R.drawable.img_15,
            R.drawable.img_16, R.drawable.img_17, R.drawable.img_18, R.drawable.img_19,
            R.drawable.img_20, R.drawable.img_21, R.drawable.img_22, R.drawable.img_23,
            R.drawable.img_24, R.drawable.img_25, R.drawable.img_26, R.drawable.img_27,
            R.drawable.img_28, R.drawable.img_29, R.drawable.img_30, R.drawable.random,
            R.drawable.img_31, R.drawable.img_32, R.drawable.img_33, R.drawable.img_34,
            R.drawable.random2, R.drawable.img_36, R.drawable.img_37, R.drawable.img_38,
            R.drawable.img_39, R.drawable.img_40, R.drawable.img_41, R.drawable.img_42,
            R.drawable.random3, R.drawable.random4, R.drawable.img_45, R.drawable.img_46,
            R.drawable.img_47, R.drawable.img_48, R.drawable.img_49, R.drawable.img_50,
            R.drawable.img_51, R.drawable.img_52, R.drawable.img_53, R.drawable.img_54,
            R.drawable.img_55, R.drawable.img_56, R.drawable.img_57, R.drawable.img_58,
            R.drawable.img_59, R.drawable.img_60, R.drawable.img_61


    };

    String[] deatil_images = {
            "المعروف لا يعرف :)", " فلتر ورد وي 😂 \n سبتمبر , ٢٠١٧ ", " هيكل عظمي مو انسان 😂 \n مارس , ٢٠١٧ "
            , " الا الا ):  \n مارس , ٢٠١٧ ", " مين الحلو هذا؟ ☹️ \n مارس , ٢٠١٧ ", " برعاية استاذ حسن 😎 \n يناير , ٢٠١٧ "
            , " طبعا الاخ جايبينه من الصومال 😂 \n مارس , ٢٠١٧ ", " مع البزرنجي  \n فبراير , ٢٠١٧ ", " يعع \n يناير , ٢٠١٧ "
            , " مبسوطين لأنهم كلاب لحولل😑 \n فبراير , ٢٠١٧ "
            /*  10 المؤشر */
            , "اشش الحركات الخطيرة ذي؟؟ \n مارس , ٢٠١٧ ", " الا الا ):  \n مارس , ٢٠١٧ ", " ترا تعليمات المصور😔  \n مارس , ٢٠١٧ "
            , " اجتمعو المعفنين  \n مارس , ٢٠١٧ ", "مارس , ٢٠١٧", " الهيكل العظمي لا يعرف  \n مارس , ٢٠١٧ ", " محمد وخر شقتك  \n ابريل , ٢٠١٧ "
            , " يخخ اش حركة الراس هذي؟؟😔😂  \n مارس , ٢٠١٧ ", " الا الا ):  \n مارس , ٢٠١٧ ", " طبعا اليوم ذا سحبتو علينا ي نصابين 😌  \n ابريل , ٢٠١٧ "
            /*  20 المؤشر */
            , "خقيت عليك ي ورد انتا 😘  \n فبراير , ٢٠١٧ ", "كانت رحلة الى قندهار😁  \n مارس , ٢٠١٨ ", " الا الا ):  \n مارس , ٢٠١٨ ", " يساتر يساتر  \n مارس , ٢٠١٨ "
            , " محد يسلك لنفسه😔  \n فبراير , ٢٠١٧ ", " في ضيافة الشيخ اسامة \n ابريل , ٢٠١٧ ", " امير الاحزان  \n ابريل , ٢٠١٧ ", " اهمشي السنفورة الي معنا😂💜  \n فبراير , ٢٠١٧ "
            , " صورني ونا مدري  \n فبراير , ٢٠١٧ ", "بداية المسيرة :) \n فبراير , ٢٠١٧ "
            /*  30 المؤشر */
            , " المز والجميل استاذ حسن خقيتت يخ ؟👅 \n ابريل , ٢٠٢٠ ", " دامها اول رضاعة منك خلاص ضاع مستقبل الولد  \n ابريل , ٢٠١٧ ", "استاذ محححححمدد ؟؟😂😂  \n مارس , ٢٠١٧ "
            , " مولععع خيييو 😂  \n نوفمبر , ٢٠١٦ ", " يعنني اعرف اطلع دخان 🦦  \n مارس , ٢٠١٧ ", " تحية للقديس العطيم محمد ابن قربان  \n ابريل , ٢٠٢٠ ", " صالح شكلك كنت حشران ؟؟😂🙁  \n سبتمبر , ٢٠١٧ "
            , " كانت الاجواء حلوه ف لندن يخ  \n مارس , ٢٠١٩ ", " الفلتر ذا ليش اختفى ؟😂😶  \n فبرابر , ٢٠١٩ ", " طبعا عمكم احم احم   \n يوليو , ٢٠١٨ ", " غرفة الحمضيات , م ننسى المصمم العظيم الاستاذ والدكتور ( حسن )   \n اغسطسس , ٢٠١٧ "
            /*  40 المؤشر */
            , " يخخ ايام حلوهه :(  \n سمبتمبر , ٢٠١٩ ", "   ٢٦, سبتمبر , ٢٠١٩ ", " مسوق امريكي نصاب   \n اغسطسس , ٢٠٢٠ ", " مين القمر دا ؟🥺  \n ديسمبر , ٢٠١٩ ", " بسس يبغا يتصوررر   \n فبراير , ٢٠١٧ "
            , " الحلوين اجتمعو :)  \n مارس , ٢٠١٧ ", " الصوره كملت هنا 😎  \n مارس , ٢٠١٧ ", " مارس , ٢٠١٧ ", "من ابداعات الاستاذ حسن \n مارس , ٢٠١٧ ", "محمد شفيك تبي تطير؟؟😂  \n مارس , ٢٠١٧ "
            , " طبعا الاستاذ حسن منور الصوره \n مارس , ٢٠١٧ ", " صوره عفوية \n مارس , ٢٠١٧ ", " هنا محمد منجد قرر يطير 😂  \n مارس , ٢٠١٧ ", " هنا صالح كان سالب 😀  \n مارس , ٢٠١٧ ", " The Abyys 😈🔥 ", " الاستاذ حسن يوم كان مدرب عظيم🤓  \n مارس , ٢٠١٦ "
            , " حسن وهو يسبح  \n مارس , ٢٠١٤ ", " الا الا ):  \n اغسطس , ٢٠١٨ ", "الفرقة السرية ☠️  \n مارس , ٢٠١٨ ", " نوقف هنا احتراما للصياد العظيم (١) ", " الين هنا خلاص كذا ننهي البرنامج مع الصياد العظيم  "
    };


    public ImageView imageView;
    public int mCorentImage = -1; /* القيمة المبدئية بيكون -١ كيف عطاني المؤشر صفر ؟؟؟ */
    public String mTheDeatil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.images_view);

        if (savedInstanceState == null) {
            showPics(null);
        } else {
            mCorentImage = savedInstanceState.getInt("index", 0);
            showImage();
        }


    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("index", mCorentImage);
    }

    public void showPics(View view) {
        mCorentImage++;
        if (mCorentImage == pics.length) {
            mCorentImage = 0;
        }
        showImage();
    } //دالة اظهار الصور
    public void backbtn(View view) {
        mCorentImage--;
        if (mCorentImage == -1) {
            mCorentImage = 0;
        }
        showImage();
    } //دالة اظهار الصور

    void showImage() {
        mTheDeatil = deatil_images[mCorentImage];
        Drawable imageDrawable = ContextCompat.getDrawable(this, pics[mCorentImage]);
        imageView.setImageDrawable(imageDrawable);
    }

    public void onDatilImagesCliked(View view) {
        Intent intent = new Intent(this, Datils.class);
        intent.putExtra("send", mTheDeatil);
        startActivity(intent);
    } // دالة التفاصيل


}


