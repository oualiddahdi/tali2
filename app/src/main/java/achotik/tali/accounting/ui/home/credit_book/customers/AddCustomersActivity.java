package achotik.tali.accounting.ui.home.credit_book.customers;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import achotik.tali.accounting.R;
import achotik.tali.accounting.databinding.ActivityAddCustomersBinding;
import achotik.tali.accounting.databinding.ActivityAddSuppliersBinding;

public class AddCustomersActivity extends AppCompatActivity {


    // creating a constant string variable for our
    // course name, description and duration.
    public static final String EXTRA_ID = "achotik.tali.accounting.EXTRA_ID";
    public static final String EXTRA_COURSE_NAME = "achotik.tali.accounting.EXTRA_COURSE_NAME";
    public static final String EXTRA_DESCRIPTION = "achotik.tali.accounting.EXTRA_COURSE_DESCRIPTION";
    public static final String EXTRA_DURATION = "achotik.tali.accounting.EXTRA_COURSE_DURATION";

    private EditText editName,editPhone,editAddress;
    private Button addCustomers;
    private ImageView mImageClose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_customers);

        editName = findViewById(R.id.editName);
        editPhone = findViewById(R.id.editPhone);
        editAddress = findViewById(R.id.editAddress);
        mImageClose = findViewById(R.id.mImageClose);
        addCustomers = findViewById(R.id.addCustomers);

        mImageClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        addCustomers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String editNameS = editName.getText().toString();
                String editPhoneS = editPhone.getText().toString();
                String editAddressS = editAddress.getText().toString();

                if (editNameS.isEmpty() || editPhoneS.isEmpty()  || editAddressS.isEmpty()) {
                    Toast.makeText(AddCustomersActivity.this, "Please enter the valid course details.", Toast.LENGTH_SHORT).show();
                    return;
                }
                // calling a method to save our course.
                saveCourse(editNameS, editPhoneS, editAddressS);

            }
        });

    }

    private void saveCourse(String editName, String editPhone, String editAddress) {

        Intent data = new Intent();

        // in below line we are passing all our course detail.
        data.putExtra(EXTRA_COURSE_NAME, editName);
        data.putExtra(EXTRA_DESCRIPTION, editPhone);
        data.putExtra(EXTRA_DURATION, editAddress);

        int id = getIntent().getIntExtra(EXTRA_ID, -1);
        if (id != -1) {
            // in below line we are passing our id.
            data.putExtra(EXTRA_ID, id);
        }

        // at last we are setting result as data.
        setResult(RESULT_OK, data);

        // displaying a toast message after adding the data
        Toast.makeText(this, "Course has been saved to Room Database. ", Toast.LENGTH_SHORT).show();

    }
}