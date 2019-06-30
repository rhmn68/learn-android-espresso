package coffeecode.co.learnespresso

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent



class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (supportActionBar != null){
            supportActionBar!!.title = "Learn Espresso"
        }

        btnChangeText.setOnClickListener(this)
        btnSwicthActivity.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.btnChangeText -> {
                edtText.setText("LaLaLa")
                val input = edtText.text.toString().trim()
                tvPrinted_text.text = input
            }

            R.id.btnSwicthActivity -> {
                val text = edtText.text.toString().trim()
                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra(SecondActivity.EXTRA_INPUT, text)
                startActivity(intent)
            }
        }
    }
}
