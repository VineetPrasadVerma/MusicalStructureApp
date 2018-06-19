warning: LF will be replaced by CRLF in .idea/misc.xml.
The file will have its original line endings in your working directory.
[1mdiff --git a/.idea/caches/build_file_checksums.ser b/.idea/caches/build_file_checksums.ser[m
[1mindex 5bf02f3..aaf6469 100644[m
Binary files a/.idea/caches/build_file_checksums.ser and b/.idea/caches/build_file_checksums.ser differ
[1mdiff --git a/.idea/misc.xml b/.idea/misc.xml[m
[1mindex 99202cc..c0f68ed 100644[m
[1m--- a/.idea/misc.xml[m
[1m+++ b/.idea/misc.xml[m
[36m@@ -25,7 +25,7 @@[m
       </value>[m
     </option>[m
   </component>[m
[31m-  <component name="ProjectRootManager" version="2" languageLevel="JDK_1_7" project-jdk-name="1.8" project-jdk-type="JavaSDK">[m
[32m+[m[32m  <component name="ProjectRootManager" version="2" languageLevel="JDK_1_8" project-jdk-name="1.8" project-jdk-type="JavaSDK">[m
     <output url="file://$PROJECT_DIR$/build/classes" />[m
   </component>[m
   <component name="ProjectType">[m
[1mdiff --git a/app/src/main/AndroidManifest.xml b/app/src/main/AndroidManifest.xml[m
[1mindex d2a8cfb..26da015 100644[m
[1m--- a/app/src/main/AndroidManifest.xml[m
[1m+++ b/app/src/main/AndroidManifest.xml[m
[36m@@ -4,7 +4,7 @@[m
 [m
     <application[m
         android:allowBackup="true"[m
[31m-        android:icon="@drawable/musicicon"[m
[32m+[m[32m        android:icon="@mipmap/musicicon"[m
         android:label="@string/app_name"[m
         android:supportsRtl="true"[m
         android:theme="@style/AppTheme">[m
[36m@@ -15,14 +15,19 @@[m
                 <category android:name="android.intent.category.LAUNCHER" />[m
             </intent-filter>[m
         </activity>[m
[31m-        <activity android:name=".EnglishSongsActivity"[m
[31m-            android:label="@string/english_songs"/>[m
[31m-        <activity android:name=".HindiSongsActivity"[m
[31m-            android:label="@string/hindi_songs"/>[m
[31m-        <activity android:name=".BhojpuriSongsActivity"[m
[31m-            android:label="@string/bhojpuri_songs"/>[m
[31m-        <activity android:name=".PunjabiSongsActivity"[m
[31m-            android:label="@string/punjabi_songs"/>[m
[32m+[m[32m        <activity[m
[32m+[m[32m            android:name=".EnglishSongsActivity"[m
[32m+[m[32m            android:label="@string/english_songs" />[m
[32m+[m[32m        <activity[m
[32m+[m[32m            android:name=".HindiSongsActivity"[m
[32m+[m[32m            android:label="@string/hindi_songs" />[m
[32m+[m[32m        <activity[m
[32m+[m[32m            android:name=".BhojpuriSongsActivity"[m
[32m+[m[32m            android:label="@string/bhojpuri_songs" />[m
[32m+[m[32m        <activity[m
[32m+[m[32m            android:name=".PunjabiSongsActivity"[m
[32m+[m[32m            android:label="@string/punjabi_songs" />[m
[32m+[m[32m        <activity android:name=".NowPlayingActivity"></activity>[m
     </application>[m
 [m
 </manifest>[m
\ No newline at end of file[m
[1mdiff --git a/app/src/main/java/com/example/vineetprasadverma/musicalstructureapp/EnglishSongsActivity.java b/app/src/main/java/com/example/vineetprasadverma/musicalstructureapp/EnglishSongsActivity.java[m
[1mindex f8ea565..00c0ff2 100644[m
[1m--- a/app/src/main/java/com/example/vineetprasadverma/musicalstructureapp/EnglishSongsActivity.java[m
[1m+++ b/app/src/main/java/com/example/vineetprasadverma/musicalstructureapp/EnglishSongsActivity.java[m
[36m@@ -2,6 +2,8 @@[m [mpackage com.example.vineetprasadverma.musicalstructureapp;[m
 [m
 import android.support.v7.app.AppCompatActivity;[m
 import android.os.Bundle;[m
[32m+[m[32mimport android.view.View;[m
[32m+[m[32mimport android.widget.AdapterView;[m
 import android.widget.ListView;[m
 [m
 import java.util.ArrayList;[m
[36m@@ -36,6 +38,13 @@[m [mpublic class EnglishSongsActivity extends AppCompatActivity {[m
         //Attach the adapter to the listview.[m
         listView.setAdapter(adapter);[m
 [m
[32m+[m[32m        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {[m
[32m+[m[32m            @Override[m
[32m+[m[32m            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {[m
[32m+[m
[32m+[m[32m            }[m
[32m+[m[32m        });[m
[32m+[m
 [m
 [m
     }[m
[1mdiff --git a/app/src/main/res/drawable-hdpi/ic_play_arrow.png b/app/src/main/res/drawable-hdpi/ic_play_arrow.png[m
[1mindex d229aaf..d63dd8e 100644[m
Binary files a/app/src/main/res/drawable-hdpi/ic_play_arrow.png and b/app/src/main/res/drawable-hdpi/ic_play_arrow.png differ
[1mdiff --git a/app/src/main/res/drawable-mdpi/ic_play_arrow.png b/app/src/main/res/drawable-mdpi/ic_play_arrow.png[m
[1mindex 7a00dc4..bcc3662 100644[m
Binary files a/app/src/main/res/drawable-mdpi/ic_play_arrow.png and b/app/src/main/res/drawable-mdpi/ic_play_arrow.png differ
[1mdiff --git a/app/src/main/res/drawable-xhdpi/ic_play_arrow.png b/app/src/main/res/drawable-xhdpi/ic_play_arrow.png[m
[1mindex 536f2d2..e70ce44 100644[m
Binary files a/app/src/main/res/drawable-xhdpi/ic_play_arrow.png and b/app/src/main/res/drawable-xhdpi/ic_play_arrow.png differ
[1mdiff --git a/app/src/main/res/drawable-xxhdpi/ic_play_arrow.png b/app/src/main/res/drawable-xxhdpi/ic_play_arrow.png[m
[1mindex f576b32..2a6ed9f 100644[m
Binary files a/app/src/main/res/drawable-xxhdpi/ic_play_arrow.png and b/app/src/main/res/drawable-xxhdpi/ic_play_arrow.png differ
[1mdiff --git a/app/src/main/res/drawable-xxxhdpi/ic_play_arrow.png b/app/src/main/res/drawable-xxxhdpi/ic_play_arrow.png[m
[1mindex 4b2fa90..fb67b31 100644[m
Binary files a/app/src/main/res/drawable-xxxhdpi/ic_play_arrow.png and b/app/src/main/res/drawable-xxxhdpi/ic_play_arrow.png differ
[1mdiff --git a/app/src/main/res/layout/list_songs.xml b/app/src/main/res/layout/list_songs.xml[m
[1mindex 0838b24..0f98776 100644[m
[1m--- a/app/src/main/res/layout/list_songs.xml[m
[1m+++ b/app/src/main/res/layout/list_songs.xml[m
[36m@@ -1,23 +1,51 @@[m
 <?xml version="1.0" encoding="utf-8"?>[m
[31m-<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"[m
[32m+[m[32m<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"[m
     xmlns:tools="http://schemas.android.com/tools"[m
     android:layout_width="match_parent"[m
[31m-    android:layout_height="match_parent"[m
[31m-    android:orientation="vertical"[m
[32m+[m[32m    android:layout_height="@dimen/eighty_eight_dp"[m
     android:padding="@dimen/sixteen_dp">[m
 [m
[31m-    <TextView[m
[31m-        android:id="@+id/song_name_text_view"[m
[31m-        android:layout_width="match_parent"[m
[31m-        android:layout_height="wrap_content"[m
[31m-        android:textStyle="bold"[m
[31m-        tools:text="Addicted" />[m
[32m+[m[32m    <ImageView[m
[32m+[m[32m        android:id="@+id/image_view"[m
[32m+[m[32m        android:layout_height="@dimen/eighty_eight_dp"[m
[32m+[m[32m        android:layout_width="@dimen/eighty_eight_dp"[m
[32m+[m[32m        android:src="@drawable/musicicon"/>[m
 [m
[31m-    <TextView[m
[31m-        android:id="@+id/artist_name_text_view"[m
[32m+[m[32m    <LinearLayout[m
         android:layout_width="match_parent"[m
[31m-        android:layout_height="wrap_content"[m
[31m-        android:layout_below="@+id/song_name_text_view"[m
[31m-        tools:text="Enrique Iglesias" />[m
[32m+[m[32m        android:layout_height="@dimen/eighty_eight_dp"[m
[32m+[m[32m        android:orientation="vertical"[m
[32m+[m[32m        android:layout_toRightOf="@id/image_view"[m
[32m+[m[32m        android:paddingLeft="@dimen/sixteen_dp">[m
[32m+[m
[32m+[m[32m        <TextView[m
[32m+[m[32m            android:id="@+id/song_name_text_view"[m
[32m+[m[32m            android:layout_width="match_parent"[m
[32m+[m[32m            android:layout_height="@dimen/zero_dp"[m
[32m+[m[32m            android:layout_weight="1"[m
[32m+[m[32m            android:textStyle="bold"[m
[32m+[m[32m            android:gravity="bottom"[m
[32m+[m[32m            android:textColor="@android:color/black"[m
[32m+[m[32m            tools:text="Addicted" />[m
[32m+[m
[32m+[m[32m        <TextView[m
[32m+[m[32m            android:id="@+id/artist_name_text_view"[m
[32m+[m[32m            android:layout_width="match_parent"[m
[32m+[m[32m            android:layout_height="0dp"[m
[32m+[m[32m            android:layout_weight="1"[m
[32m+[m[32m            android:gravity="top"[m
[32m+[m[32m            android:textColor="@android:color/black"[m
[32m+[m[32m            tools:text="Enrique Iglesias" />[m
[32m+[m
[32m+[m[32m    </LinearLayout>[m
[32m+[m
[32m+[m[32m    <ImageView[m
[32m+[m[32m        android:layout_height="@dimen/twenty_four_dp"[m
[32m+[m[32m        android:layout_width="@dimen/twenty_four_dp"[m
[32m+[m[32m        android:layout_centerVertical="true"[m
[32m+[m[32m        android:layout_alignParentRight="true"[m
[32m+[m[32m        android:src="@drawable/ic_play_arrow"[m
[32m+[m[32m        android:text="@string/play" />[m
[32m+[m
 [m
[31m-</LinearLayout>[m
\ No newline at end of file[m
[32m+[m[32m</RelativeLayout>[m
\ No newline at end of file[m
[1mdiff --git a/app/src/main/res/values/dimens.xml b/app/src/main/res/values/dimens.xml[m
[1mindex 888cec5..7ebd5d4 100644[m
[1m--- a/app/src/main/res/values/dimens.xml[m
[1m+++ b/app/src/main/res/values/dimens.xml[m
[36m@@ -2,4 +2,8 @@[m
 <resources>[m
     <dimen name="twenty_four_sp">24sp</dimen>[m
     <dimen name="sixteen_dp">16dp</dimen>[m
[32m+[m[32m    <dimen name="hundred_dp">100dp</dimen>[m
[32m+[m[32m    <dimen name="eighty_eight_dp">88dp</dimen>[m
[32m+[m[32m    <dimen name="twenty_four_dp">24dp</dimen>[m
[32m+[m[32m    <dimen name="zero_dp">0dp</dimen>[m
 </resources>[m
\ No newline at end of file[m
[1mdiff --git a/app/src/main/res/values/strings.xml b/app/src/main/res/values/strings.xml[m
[1mindex 0f7f667..70d4d86 100644[m
[1m--- a/app/src/main/res/values/strings.xml[m
[1m+++ b/app/src/main/res/values/strings.xml[m
[36m@@ -4,4 +4,5 @@[m
     <string name="hindi_songs">Hindi Songs</string>[m
     <string name="bhojpuri_songs">Bhojpuri Songs</string>[m
     <string name="punjabi_songs">Punjabi Songs</string>[m
[32m+[m[32m    <string name="play">Play</string>[m
 </resources>[m
