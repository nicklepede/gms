package com.google.android.gms.wallet.service;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.byjl;
import defpackage.bykj;
import defpackage.byln;
import defpackage.efdv;
import defpackage.ftcw;
import defpackage.ftcz;
import java.util.Map;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class SetupWizardTaskService extends GmsTaskBoundService {
    public static final String a = "SetupWizardTaskService";

    public static void d(Context context) {
        long a2 = ftcw.a.a().a();
        bykj bykjVar = new bykj();
        bykjVar.w(a);
        bykjVar.e(a2, 1 + a2);
        bykjVar.y(2, 2);
        bykjVar.x(0, 1);
        bykjVar.i(true);
        bykjVar.q(a);
        bykjVar.v(0);
        byjl.a(context).f(bykjVar.b());
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("payments.setupWizardPrefs", 0);
        Map<String, ?> all = sharedPreferences.getAll();
        SharedPreferences.Editor edit = sharedPreferences.edit();
        boolean z = false;
        boolean z2 = false;
        for (String str : all.keySet()) {
            if (str.startsWith("initResponse")) {
                String string = sharedPreferences.getString(str, null);
                if (!TextUtils.isEmpty(string)) {
                    if (System.currentTimeMillis() - new efdv(string).a(0L) > ftcz.b()) {
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
