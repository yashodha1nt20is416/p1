package com.example.lifecyc;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_main);
 Toast.makeText(getApplicationContext(),"AppCreate 
function",Toast.LENGTH_SHORT).show();
 }
 @Override
 protected void onStart() {
 super.onStart();
 Toast.makeText(getApplicationContext(),"AppStart 
function",Toast.LENGTH_SHORT).show();
 }
 @Override
 protected void onResume() {
 super.onResume();
 Toast.makeText(getApplicationContext(),"AppResume 
function",Toast.LENGTH_SHORT).show();
 }
 @Override
 protected void onPause() {
 super.onPause();
 Toast.makeText(getApplicationContext(),"AppPause 
function",Toast.LENGTH_SHORT).show();
 }
 @Override
 protected void onStop() {
 super.onStop();
 Toast.makeText(getApplicationContext(),"AppStop function",Toast.LENGTH_SHORT).show();
 }
 @Override
 protected void onRestart() {
 super.onRestart();
 Toast.makeText(getApplicationContext(),"AppRestart 
function",Toast.LENGTH_SHORT).show();
 }
 @Override
 protected void onDestroy() {
 super.onDestroy();
 Toast.makeText(getApplicationContext(),"AppDestroy 
function",Toast.LENGTH_SHORT).show();
 }
}
