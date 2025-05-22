package com.google.android.gms.wallet.service;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.casd;
import defpackage.catb;
import defpackage.cauf;
import defpackage.ehqy;
import defpackage.fvyq;
import defpackage.fvyt;
import java.util.Map;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class SetupWizardTaskService extends GmsTaskBoundService {
    public static final String a = "SetupWizardTaskService";

    public static void d(Context context) {
        long a2 = fvyq.a.lK().a();
        catb catbVar = new catb();
        catbVar.w(a);
        catbVar.e(a2, 1 + a2);
        catbVar.y(2, 2);
        catbVar.x(0, 1);
        catbVar.i(true);
        catbVar.q(a);
        catbVar.v(0);
        casd.a(context).f(catbVar.b());
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("payments.setupWizardPrefs", 0);
        Map<String, ?> all = sharedPreferences.getAll();
        SharedPreferences.Editor edit = sharedPreferences.edit();
        boolean z = false;
        boolean z2 = false;
        for (String str : all.keySet()) {
            if (str.startsWith("initResponse")) {
                String string = sharedPreferences.getString(str, null);
                if (!TextUtils.isEmpty(string)) {
                    if (System.currentTimeMillis() - new ehqy(string).a(0L) > fvyt.b()) {
                        edit.remove(str);
                        z2 = false;
                        z = true;
                    } else {
                        z2 = true;
                    }
                }
            }
        }
        if (z) {
            edit.apply();
        }
        if (z2) {
            d(getApplicationContext());
        }
        return 0;
    }
}
