package com.google.android.gms.instantapps.ui;

import android.accounts.Account;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.R;
import com.google.android.gms.instantapps.internal.OptInInfo;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.apzq;
import defpackage.aqlc;
import defpackage.aszs;
import defpackage.auiq;
import defpackage.auub;
import defpackage.bqlf;
import defpackage.bqlh;
import defpackage.bqmt;
import defpackage.bqsk;
import defpackage.dhlw;
import defpackage.dhmr;
import defpackage.fmkm;
import defpackage.frzi;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class SettingsIntentOperation extends apzq {
    @Override // defpackage.apzq
    public final GoogleSettingsItem b() {
        if (new bqsk(this).a()) {
            aszs aszsVar = bqlf.a;
            dhlw c = new bqlh(this).c();
            try {
                dhmr.n(c);
                Account[] accountArr = ((OptInInfo) c.i()).c;
                if (accountArr == null || accountArr.length == 0) {
                    Log.w("SettingsIntentOperation", "No accounts");
                }
                if (accountArr != null && accountArr.length > 0) {
                    Intent intent = new Intent("com.google.android.instantapps.supervisor.SETTINGS_ACTIVITY");
                    if (auub.c() || frzi.a.lK().v()) {
                        String f = frzi.f();
                        String e = frzi.e();
                        if (TextUtils.isEmpty(f) || TextUtils.isEmpty(e)) {
                            Log.e("SettingsIntentOperation", String.format("Cannot find settings page in O+", new Object[0]));
                            return null;
                        }
                        intent.setClassName(f, e);
                    } else {
                        intent.setClassName("com.google.android.instantapps.supervisor", "com.google.android.instantapps.supervisor.SettingsActivity");
                        if (!bqmt.b(this)) {
                            Log.e("SettingsIntentOperation", String.format("Cannot find settings page pre-O", new Object[0]));
                            return null;
                        }
                    }
                    if (fmkm.g()) {
                        intent.addFlags(268435456);
                    }
                    GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(intent, 4, R.string.instantapps_module_display_name, aqlc.INSTANT_APPS_ITEM, auiq.DEFAULT_INSTANTAPPS);
                    googleSettingsItem.e = true;
                    googleSettingsItem.j = true;
                    googleSettingsItem.m = SettingsChimeraActivity.class.getName();
                    googleSettingsItem.l = true;
                    return googleSettingsItem;
                }
            } catch (InterruptedException | ExecutionException e2) {
                Log.e("SettingsIntentOperation", String.format("Cannot display Instant Apps settings.", new Object[0]), e2);
            }
        } else {
            Log.e("SettingsIntentOperation", String.format("Killed with a switch", new Object[0]));
        }
        return null;
    }
}
