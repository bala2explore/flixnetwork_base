package wolfsoft1.flixnetwork;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.app.ActivityCompat;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

import Adapter.CameraRecycleAdapter;
import ModelClasses.HotelInnListModelClass;

public class CameraActivity extends AppCompatActivity {

    private static final int CAMERA_REQUEST = 1888;
    private ImageView imageView;
    private static final int MY_CAMERA_PERMISSION_CODE = 100;


    private ArrayList<HotelInnListModelClass> cocoNewsListModelClasses;
    private RecyclerView recyclerView;
    private CameraRecycleAdapter bAdapter;

    String txt[]={"PHOTO","VIDEO","BOOMBERING","FREEHAND","NORMAL","REWIND","TYPE"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);



        recyclerView = findViewById(R.id.recyclerView);

        RecyclerView.LayoutManager mLayoutManager1 = new LinearLayoutManager(CameraActivity.this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(mLayoutManager1);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        cocoNewsListModelClasses = new ArrayList<>();

        for (int i = 0; i < txt.length; i++) {
            HotelInnListModelClass beanClassForRecyclerView_contacts = new HotelInnListModelClass(txt[i]);
            cocoNewsListModelClasses.add(beanClassForRecyclerView_contacts);
        }
        bAdapter = new CameraRecycleAdapter(CameraActivity.this,cocoNewsListModelClasses);
        recyclerView.setAdapter(bAdapter);




       // ActivityCompat.requestPermissions(CameraActivity.this, new String[] {Manifest.permission.CAMERA}, requestCode);

        this.imageView = (ImageView)this.findViewById(R.id.imageView1);
        ImageView image = (ImageView) this.findViewById(R.id.button1);
        image.setOnClickListener(new View.OnClickListener() {

            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
                if (checkSelfPermission(Manifest.permission.CAMERA)
                        != PackageManager.PERMISSION_GRANTED) {
                    requestPermissions(new String[]{Manifest.permission.CAMERA},
                            MY_CAMERA_PERMISSION_CODE);
                } else {
                    Intent cameraIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                    startActivityForResult(cameraIntent, CAMERA_REQUEST);
                }
            }
        });
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == MY_CAMERA_PERMISSION_CODE) {
            if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                Toast.makeText(this, "camera permission granted", Toast.LENGTH_LONG).show();
                Intent cameraIntent = new
                        Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(cameraIntent, CAMERA_REQUEST);
            } else {
                Toast.makeText(this, "camera permission denied", Toast.LENGTH_LONG).show();
            }

        }}

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == CAMERA_REQUEST && resultCode == Activity.RESULT_OK) {
            Bitmap photo = (Bitmap) data.getExtras().get("data");
            imageView.setImageBitmap(photo);
        }
    }
}
