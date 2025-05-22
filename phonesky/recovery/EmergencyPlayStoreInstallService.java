package com.google.android.gms.phonesky.recovery;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.phonesky.recovery.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import com.google.android.gms.phonesky.recovery.service.EmergencyPlayStoreInstallIntentOperation;
import defpackage.ausn;
import defpackage.cauf;
import defpackage.cyrg;
import defpackage.ekvl;
import defpackage.fgqp;
import defpackage.fgri;
import defpackage.fgsd;
import defpackage.vqf;
import defpackage.vqg;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class EmergencyPlayStoreInstallService extends GmsTaskBoundService {
    public static final /* synthetic */ int a = 0;

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        vqf vqfVar;
        Bundle bundle = caufVar.b;
        Context a2 = AppContextProvider.a();
        ekvl.y(bundle);
        String string = bundle.getString("emergencyInstallConfig");
        if (string == null) {
            cyrg.b("emergencyInstallConfigString is null", new Object[0]);
            return 2;
        }
        byte[] decode = Base64.decode(string, 2);
        if (decode != null) {
            try {
                fgri y = fgri.y(vqf.a, decode, 0, decode.length, fgqp.a());
                fgri.M(y);
                vqfVar = (vqf) y;
            } catch (fgsd unused) {
                cyrg.b("Invalid protobuf", new Object[0]);
            }
            int b = vqg.b(bundle.getInt("packageChange"));
            String string2 = bundle.getString("fixUuid");
            if (vqfVar != null || b == 0 || string2 == null) {
                cyrg.b("Null variables", new Object[0]);
                return 2;
            }
            ausn ausnVar = EmergencyPlayStoreInstallIntentOperation.a;
            Intent startIntent = IntentOperation.getStartIntent(a2, EmergencyPlayStoreInstallIntentOperation.class, "com.google.android.gms.phonesky.recovery.ACTION");
            Intent putExtra = startIntent != null ? startIntent.putExtra("fixUuid", string2).putExtra("packageChange", vqg.a(b)).putExtra("emergencyInstallConfig", vqfVar.r()) : null;
            if (putExtra == null) {
                cyrg.b("Intent is null", new Object[0]);
                return 2;
            }
            a2.startService(putExtra);
            return 0;
        }
        cyrg.b("Config is null", new Object[0]);
        vqfVar = null;
        int b2 = vqg.b(bundle.getInt("packageChange"));
        String string22 = bundle.getString("fixUuid");
        if (vqfVar != null) {
        }
        cyrg.b("Null variables", new Object[0]);
        return 2;
    }
}
