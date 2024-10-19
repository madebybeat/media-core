import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.beatstreaming.media.databinding.MainActivityBinding;

import dagger.hilt.android.AndroidEntryPoint;
import lombok.Getter;

@AndroidEntryPoint
@Getter
public class MainActivity extends AppCompatActivity {
    private static MainActivity mainActivity;

    private MainActivityBinding mainActivityBinding;

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);

        mainActivity = this;

        this.mainActivityBinding = MainActivityBinding.inflate(this.getLayoutInflater());
        this.setContentView(this.mainActivityBinding.getRoot());
    }
}
