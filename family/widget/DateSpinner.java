package com.google.android.gms.family.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.google.android.gms.R;
import com.google.android.gms.chimera.modules.family.AppContextProvider;
import defpackage.atzb;
import defpackage.bbyo;
import defpackage.bchb;
import defpackage.bchc;
import defpackage.bchd;
import defpackage.bche;
import defpackage.bchf;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class DateSpinner extends LinearLayout {
    public String a;
    public String b;
    public String c;
    public bbyo d;

    public DateSpinner(Context context) {
        super(context);
        f();
    }

    public static final void e(Spinner spinner, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (spinner.getSelectedItem() == null) {
            spinner.setContentDescription(str);
            return;
        }
        spinner.setContentDescription(str + " " + String.valueOf(spinner.getSelectedItem()));
    }

    private final void f() {
        inflate(getContext(), R.layout.fm_layout_date_spinner, this);
        Map<String, Integer> displayNames = GregorianCalendar.getInstance().getDisplayNames(2, 1, AppContextProvider.a().getResources().getConfiguration().locale);
        atzb.s(displayNames);
        HashMap hashMap = new HashMap(displayNames.size());
        for (Map.Entry<String, Integer> entry : displayNames.entrySet()) {
            hashMap.put(entry.getValue(), entry.getKey());
        }
        ArrayList arrayList = new ArrayList(hashMap.size());
        for (int i = 0; i < hashMap.size(); i++) {
            String str = (String) hashMap.get(Integer.valueOf(i));
            atzb.s(str);
            arrayList.add(str);
        }
        bche bcheVar = new bche(getContext(), arrayList);
        bcheVar.setDropDownViewResource(R.layout.fm_date_spinner_dropdown);
        Spinner spinner = (Spinner) findViewById(R.id.fm_birthday_month);
        spinner.setAdapter((SpinnerAdapter) bcheVar);
        spinner.setOnItemSelectedListener(new bchb(this, spinner));
        bchf bchfVar = new bchf(getContext());
        bchfVar.c = R.layout.fm_date_spinner_dropdown;
        Spinner spinner2 = (Spinner) findViewById(R.id.fm_birthday_day);
        spinner2.setAdapter((SpinnerAdapter) bchfVar);
        spinner2.setOnItemSelectedListener(new bchc(this, spinner2));
        EditText editText = (EditText) findViewById(R.id.fm_birthday_year);
        editText.addTextChangedListener(new bchd(this, editText));
    }

    public final Calendar a() {
        Spinner spinner = (Spinner) findViewById(R.id.fm_birthday_month);
        Spinner spinner2 = (Spinner) findViewById(R.id.fm_birthday_day);
        EditText editText = (EditText) findViewById(R.id.fm_birthday_year);
        if (spinner.getSelectedItem() == null || spinner2.getSelectedItem() == null || TextUtils.isEmpty(editText.getText())) {
            return null;
        }
        return new GregorianCalendar(Integer.parseInt(editText.getText().toString()), spinner.getSelectedItemPosition() - 1, ((Integer) spinner2.getSelectedItem()).intValue());
    }

    public final void b(int i) {
        Spinner spinner = (Spinner) findViewById(R.id.fm_birthday_day);
        if (i < spinner.getAdapter().getCount()) {
            spinner.setSelection(i);
        }
    }

    public final void c(int i) {
        Spinner spinner = (Spinner) findViewById(R.id.fm_birthday_month);
        int i2 = i + 1;
        if (i2 < spinner.getAdapter().getCount()) {
            spinner.setSelection(i2);
        }
    }

    public final void d() {
        Spinner spinner = (Spinner) findViewById(R.id.fm_birthday_month);
        EditText editText = (EditText) findViewById(R.id.fm_birthday_year);
        Spinner spinner2 = (Spinner) findViewById(R.id.fm_birthday_day);
        if (spinner.getSelectedItem() == null && TextUtils.isEmpty(editText.getText())) {
            return;
        }
        int actualMaximum = new GregorianCalendar(!TextUtils.isEmpty(editText.getText()) ? Integer.parseInt(editText.getText().toString()) : 2016, spinner.getSelectedItemPosition() - 1, 1).getActualMaximum(5);
        if (spinner2.getSelectedItem() != null && actualMaximum < ((Integer) spinner2.getSelectedItem()).intValue()) {
            spinner2.setSelection(0, true);
        }
        ((bchf) spinner2.getAdapter()).b = actualMaximum;
    }

    public DateSpinner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        f();
    }

    public DateSpinner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        f();
    }
}
