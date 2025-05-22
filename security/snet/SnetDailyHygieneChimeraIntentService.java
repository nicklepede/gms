package com.google.android.gms.security.snet;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import com.google.android.chimera.IntentOperation;
import defpackage.auid;
import defpackage.ausn;
import defpackage.dbhs;
import java.util.Map;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class SnetDailyHygieneChimeraIntentService extends IntentOperation {
    public static final /* synthetic */ int a = 0;

    static {
        ausn.b("snet_daily_hygiene", auid.SECURITY);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (intent != null && "com.google.android.gms.security.snet.ACTION_CLEAN_PREFS".equals(intent.getAction())) {
            dbhs dbhsVar = new dbhs(this);
            if (!dbhsVar.b.getBoolean("migrated_to_safetynet_preferences", false)) {
                SharedPreferences sharedPreferences = dbhsVar.a;
                SharedPreferences sharedPreferences2 = dbhsVar.a;
                Map<String, ?> all = sharedPreferences.getAll();
                SharedPreferences.Editor edit = sharedPreferences2.edit();
                for (String str : all.keySet()) {
                    if (str.startsWith("snet_attestation_request_times_ms") || str.startsWith("snet_saved_attestation_response")) {
                        edit.remove(str);
                    }
                }
                if (edit.commit()) {
                    SharedPreferences.Editor edit2 = dbhsVar.b.edit();
                    edit2.putBoolean("migrated_to_safetynet_preferences", true);
                    edit2.commit();
                }
            }
            SharedPreferences sharedPreferences3 = dbhsVar.b;
            SharedPreferences sharedPreferences4 = dbhsVar.b;
            Map<String, ?> all2 = sharedPreferences3.getAll();
            SharedPreferences.Editor edit3 = sharedPreferences4.edit();
            for (String str2 : all2.keySet()) {
                if (str2.startsWith("snet_attestation_request_times_ms")) {
                    try {
                        dbhsVar.c.getPackageInfo(str2.substring(34), 0);
                    } catch (PackageManager.NameNotFoundException unused) {
                        edit3.remove(str2);
                    }
                }
            }
            edit3.commit();
        }
    }
}
