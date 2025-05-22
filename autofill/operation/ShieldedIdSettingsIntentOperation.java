package com.google.android.gms.autofill.operation;

import android.accounts.Account;
import android.content.Intent;
import com.google.android.gms.R;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.ajgh;
import defpackage.apzq;
import defpackage.aqlc;
import defpackage.auiq;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class ShieldedIdSettingsIntentOperation extends apzq {
    @Override // defpackage.apzq
    public final GoogleSettingsItem d(Account account) {
        if (!ajgh.f(account)) {
            return null;
        }
        Intent f = f("com.google.android.gms.accountsettings.action.VIEW_SETTINGS_SEARCH_RESULT");
        f.putExtra(":settings:fragment_args_key", "?resourceId=10764");
        GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(f, 8, R.string.autofill_datatype_shielded_email_title, aqlc.AUTOFILL_SHIELDED_ID_ITEM, auiq.DEFAULT_AUTOFILL);
        googleSettingsItem.j = true;
        googleSettingsItem.l = true;
        googleSettingsItem.m = "?resourceId=10764";
        for (String str : getResources().getStringArray(R.array.autofill_datatype_shielded_email_keywords)) {
            googleSettingsItem.a(str);
        }
        return googleSettingsItem;
    }
}
