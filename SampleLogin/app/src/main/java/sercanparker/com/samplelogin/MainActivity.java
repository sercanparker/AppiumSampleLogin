package sercanparker.com.samplelogin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {



    @BindView(R.id.loginButton_LoginActivity)
    Button loginButton;

    @BindView(R.id.username_EditText_LoginActivity)
    EditText usernameEditText;

    @BindView(R.id.password_EditText_LoginActivity)
    EditText passwordEditText;


    @BindView(R.id.loginInfoTextView_LoginActivity)
    TextView loginInfoTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                loginInfoTextView.setVisibility(View.VISIBLE);

                if (usernameEditText.getText().toString().equals("sercanparker@foo.com")
                        && passwordEditText.getText().toString().equals("bar")){
                    loginInfoTextView.setText("Login Success");
                }else{
                    loginInfoTextView.setText("Login Fail");
                }
            }
        });
    }
}
