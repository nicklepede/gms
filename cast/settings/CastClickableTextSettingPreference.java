package com.google.android.gms.cast.settings;

import android.content.Context;
import android.text.SpannableString;
import android.view.View;
import android.widget.TextView;
import androidx.preference.Preference;
import com.google.android.gms.R;
import defpackage.aplw;
import defpackage.mfa;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
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
    public final void a(mfa mfaVar) {
        super.a(mfaVar);
        Context context = this.a;
        int i = this.c;
        View view = mfaVar.a;
        String string = context.getString(this.b, context.getString(i));
        TextView textView = (TextView) view.findViewById(R.id.text);
        if (textView == null) {
            return;
        }
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new aplw(), (string.length() - r1.length()) - 1, string.length(), 33);
        textView.setText(spannableString);
    }
}
