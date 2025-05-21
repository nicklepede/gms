package com.google.android.gms.cast.settings;

import android.content.Context;
import android.text.SpannableString;
import android.view.View;
import android.widget.TextView;
import androidx.preference.Preference;
import com.google.android.gms.R;
import defpackage.ankj;
import defpackage.kmp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class CastClickableTextSettingPreference extends Preference {
    private final Context a;
    private final int b;
    private final int c;

    public CastClickableTextSettingPreference(Context context, int i) {
        super(context);
        this.a = context;
        this.b = R.string.cast_settings_rcn_device_settings_text_open_app;
        this.c = i;
    }

    @Override // androidx.preference.Preference
    public final void a(kmp kmpVar) {
        super.a(kmpVar);
        Context context = this.a;
        int i = this.c;
        View view = kmpVar.a;
        String string = context.getString(this.b, context.getString(i));
        TextView textView = (TextView) view.findViewById(R.id.text);
        if (textView == null) {
            return;
        }
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new ankj(), (string.length() - r1.length()) - 1, string.length(), 33);
        textView.setText(spannableString);
    }
}
