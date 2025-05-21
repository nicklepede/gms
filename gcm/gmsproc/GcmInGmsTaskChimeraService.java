package com.google.android.gms.gcm.gmsproc;

import android.content.Intent;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.bhyh;
import defpackage.bifi;
import defpackage.bifj;
import defpackage.bnyw;
import defpackage.byln;
import defpackage.dnnr;
import defpackage.fojc;
import java.io.IOException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class GcmInGmsTaskChimeraService extends GmsTaskChimeraService {
    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        char c;
        String str = bylnVar.a;
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
                return !bifj.a(this).c() ? 1 : 0;
            }
            if (c != 2) {
                Log.e("GCM-GMS", "Unknown task tag: ".concat(bylnVar.a));
                return 2;
            }
            if (dnnr.j()) {
                if (Log.isLoggable("GCM-GMS", 4)) {
                    Log.i("GCM-GMS", "Registering GMS for direct boot.");
                }
                try {
                    String c2 = bnyw.g(this).c(fojc.l(), fojc.a.a().Z());
                    if (TextUtils.isEmpty(c2)) {
                        Log.w("GCM-GMS", "Failed to get direct boot token, it was empty");
                        return 1;
                    }
                    SharedPreferences.Editor edit = bifi.a(this).edit();
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
        String l = fojc.l();
        Log.i("GCM-GMS", "Registering GMS ".concat(String.valueOf(l)));
        try {
            String c3 = bnyw.g(this).c(l, "GCM");
            Log.i("GCM-GMS", "Got GMS registration");
            SharedPreferences b = bhyh.b(this);
            String string = b.getString("regId", "");
            SharedPreferences.Editor edit2 = b.edit();
            edit2.putString("regId", c3);
            edit2.putString("sender", l);
            edit2.putInt("GCM_V", 251661004);
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
