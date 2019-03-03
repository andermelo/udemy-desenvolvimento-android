package me.andersonmelo.calendario;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.CalendarView;

import com.prolificinteractive.materialcalendarview.CalendarDay;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import com.prolificinteractive.materialcalendarview.OnDateSelectedListener;
import com.prolificinteractive.materialcalendarview.OnMonthChangedListener;

public class MainActivity extends AppCompatActivity {

    //private CalendarView calendarView;
    private MaterialCalendarView calendarView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calendarView = findViewById(R.id.calendarView);

        /*calendarView.state().edit()
                .setMinimumDate(CalendarDay.from(2015,1,1))
                .setMaximumDate(CalendarDay.from(2019,3,1))
                .commit();*/

        CharSequence meses[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun","Jun","Ago","Set", "Out", "Nov", "Dez" };
        calendarView.setTitleMonths(meses);

        CharSequence semana[] = {"Dom","Seg","Ter","Qua","Qui","Sex","Sab"};
        calendarView.setWeekDayLabels(semana);


        calendarView.setOnMonthChangedListener(new OnMonthChangedListener() {
            @Override
            public void onMonthChanged(MaterialCalendarView widget, CalendarDay date) {
                Log.i("data","valor: " + (date.getMonth() + 1) + "/" + date.getYear());
            }
        });

        /*calendarView.setOnDateChangedListener(new OnDateSelectedListener() {
            @Override
            public void onDateSelected(@NonNull MaterialCalendarView widget, @NonNull CalendarDay date, boolean selected) {
                Log.i("data","valor: " + date);
            }
        });*/

        /*calendarView = findViewById(R.id.calendarView);
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                Log.i("data","valor: " + dayOfMonth + "/" + month + "/" + year);
            }
        });*/
    }
}
