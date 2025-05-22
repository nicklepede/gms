package com.google.android.gms.gcm.gmsproc;

import android.content.Intent;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.bkcw;
import defpackage.bkjx;
import defpackage.bkjy;
import defpackage.bqgd;
import defpackage.cauf;
import defpackage.dpya;
import defpackage.frbt;
import java.io.IOException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class GcmInGmsTaskChimeraService extends GmsTaskChimeraService {
    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        char c;
        String str = caufVar.a;
        int hashCode = str.hashCode();
        if (hashCode == -1877394740) {
            if (str.equals("groups_upload")) {
                c = 1;
            }
            c = 65535;
        } else if (hashCode != -1512919536) {
            if (hashCode == -1394514069 && str.equals("gms_registration")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (str.equals("direct_boot_registration")) {
                c = 2;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c == 1) {
                return !bkjy.a(this).c() ? 1 : 0;
            }
            if (c != 2) {
                Log.e("GCM-GMS", "Unknown task tag: ".concat(caufVar.a));
                return 2;
            }
            if (dpya.j()) {
                if (Log.isLoggable("GCM-GMS", 4)) {
                    Log.i("GCM-GMS", "Registering GMS for direct boot.");
                }
                try {
                    String c2 = bqgd.g(this).c(frbt.l(), frbt.a.lK().aa());
                    if (TextUtils.isEmpty(c2)) {
                        Log.w("GCM-GMS", "Failed to get direct boot token, it was empty");
                        return 1;
                    }
                    SharedPreferences.Editor edit = bkjx.a(this).edit();
                    edit.putString("gcm_local_directboot_token", c2);
                    edit.putLong("gcm_local_directboot_time", System.currentTimeMillis());
                    if (Log.isLoggable("GCM-GMS", 4)) {
                        Log.i("GCM-GMS", "Got GMS direct boot token.");
                    }
                    if (!edit.commit()) {
                        return 1;
                    }
                } catch (IOException e) {
                    if (Log.isLoggable("GCM-GMS", 5)) {
                        Log.w("GCM-GMS", "Failed to get direct boot token: ".concat(e.toString()));
                        return 1;
                    }
                }
            }
            return 0;
        }
        String l = frbt.l();
        Log.i("GCM-GMS", "Registering GMS ".concat(l));
        try {
            String c3 = bqgd.g(this).c(l, "GCM");
            Log.i("GCM-GMS", "Got GMS registration");
            SharedPreferences b = bkcw.b(this);
            String string = b.getString("regId", "");
            SharedPreferences.Editor edit2 = b.edit();
            edit2.putString("regId", c3);
            edit2.putString("sender", l);
            edit2.putInt("GCM_V", 251864004);
            edit2.putLong("reg_time", System.currentTimeMillis());
            if (!edit2.commit()) {
                Log.w("GCM-GMS", "Failed to write GMS registration");
            } else if (!c3.equals(string)) {
                Intent intent = new Intent("com.google.android.gms.gcm.REGISTERED");
                intent.setPackage("com.google.android.gms");
                sendBroadcast(intent);
            }
            return 0;
        } catch (IOException e2) {
            Log.w("GCM-GMS", "Failed to get registration: ".concat(e2.toString()));
        }
        return 1;
    }
}
