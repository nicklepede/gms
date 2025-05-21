package com.google.android.gms.nearby.sharing.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.preference.Preference;
import com.google.android.gms.R;
import defpackage.crnv;
import defpackage.eitj;
import defpackage.kmp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class GoogleAccountAvatarPreference extends Preference {
    public GoogleAccountAvatarPreference(Context context) {
        super(context);
        this.B = R.layout.sharing_view_settings_change_account;
    }

    @Override // androidx.preference.Preference
    public final void a(kmp kmpVar) {
        super.a(kmpVar);
        GoogleAccountAvatar googleAccountAvatar = (GoogleAccountAvatar) kmpVar.D(R.id.sharing_settings_account_button_one_google_account_disc);
        TextView textView = (TextView) kmpVar.D(R.id.sharing_settings_account_button_name);
        TextView textView2 = (TextView) kmpVar.D(R.id.sharing_settings_account_button_email);
        TextView textView3 = (TextView) kmpVar.D(R.id.sharing_settings_account_button_phone_number);
        textView.setText(R.string.sharing_settings_button_account_name_not_found_title);
        textView2.setText(R.string.sharing_settings_button_account_name_not_found_description);
        eitj eitjVar = crnv.a;
        if (TextUtils.isEmpty(null)) {
            textView3.setVisibility(8);
        } else {
            textView3.setText((CharSequence) null);
            textView3.setVisibility(0);
        }
        googleAccountAvatar.a.m(null);
    }

    public GoogleAccountAvatarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.B = R.layout.sharing_view_settings_change_account;
    }
}
