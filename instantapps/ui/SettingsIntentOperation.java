package com.google.android.gms.instantapps.ui;

import android.accounts.Account;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.R;
import com.google.android.gms.instantapps.internal.OptInInfo;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.anxy;
import defpackage.aojj;
import defpackage.aqxd;
import defpackage.asew;
import defpackage.asqh;
import defpackage.bodp;
import defpackage.bodr;
import defpackage.bofd;
import defpackage.boku;
import defpackage.dfaq;
import defpackage.dfbl;
import defpackage.fjul;
import defpackage.fpfx;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class SettingsIntentOperation extends anxy {
    @Override // defpackage.anxy
    public final GoogleSettingsItem b() {
        if (new boku(this).a()) {
            aqxd aqxdVar = bodp.a;
            dfaq c = new bodr(this).c();
            try {
                dfbl.n(c);
                Account[] accountArr = ((OptInInfo) c.i()).c;
                if (accountArr == null || accountArr.length == 0) {
                    Log.w("SettingsIntentOperation", "No accounts");
                }
                if (accountArr != null && accountArr.length > 0) {
                    Intent intent = new Intent("com.google.android.instantapps.supervisor.SETTINGS_ACTIVITY");
                    if (asqh.c() || fpfx.a.a().v()) {
                        String f = fpfx.f();
                        String e = fpfx.e();
                        if (TextUtils.isEmpty(f) || TextUtils.isEmpty(e)) {
                            Log.e("SettingsIntentOperation", String.format("Cannot find settings page in O+", new Object[0]));
                            return null;
                        }
                        intent.setClassName(f, e);
                    } else {
                        intent.setClassName("com.google.android.instantapps.supervisor", "com.google.android.instantapps.supervisor.SettingsActivity");
                        if (!bofd.b(this)) {
                            Log.e("SettingsIntentOperation", String.format("Cannot find settings page pre-O", new Object[0]));
                            return null;
                        }
                    }
                    if (fjul.h()) {
                        intent.addFlags(268435456);
                    }
                    GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(intent, 4, R.string.instantapps_module_display_name, aojj.INSTANT_APPS_ITEM, asew.DEFAULT_INSTANTAPPS);
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
