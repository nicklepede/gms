package com.google.android.gms.phonesky.recovery;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.phonesky.recovery.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import com.google.android.gms.phonesky.recovery.service.EmergencyPlayStoreInstallIntentOperation;
import defpackage.asot;
import defpackage.byln;
import defpackage.cwhj;
import defpackage.eiig;
import defpackage.febw;
import defpackage.fecp;
import defpackage.fedk;
import defpackage.tuf;
import defpackage.tug;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class EmergencyPlayStoreInstallService extends GmsTaskBoundService {
    public static final /* synthetic */ int a = 0;

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        tuf tufVar;
        Bundle bundle = bylnVar.b;
        Context a2 = AppContextProvider.a();
        eiig.x(bundle);
        String string = bundle.getString("emergencyInstallConfig");
        if (string == null) {
            cwhj.b("emergencyInstallConfigString is null", new Object[0]);
            return 2;
        }
        byte[] decode = Base64.decode(string, 2);
        if (decode != null) {
            try {
                fecp y = fecp.y(tuf.a, decode, 0, decode.length, febw.a());
                fecp.M(y);
                tufVar = (tuf) y;
            } catch (fedk unused) {
                cwhj.b("Invalid protobuf", new Object[0]);
            }
            int b = tug.b(bundle.getInt("packageChange"));
            String string2 = bundle.getString("fixUuid");
            if (tufVar != null || b == 0 || string2 == null) {
                cwhj.b("Null variables", new Object[0]);
                return 2;
            }
            asot asotVar = EmergencyPlayStoreInstallIntentOperation.a;
            Intent startIntent = IntentOperation.getStartIntent(a2, EmergencyPlayStoreInstallIntentOperation.class, "com.google.android.gms.phonesky.recovery.ACTION");
            Intent putExtra = startIntent != null ? startIntent.putExtra("fixUuid", string2).putExtra("packageChange", tug.a(b)).putExtra("emergencyInstallConfig", tufVar.r()) : null;
            if (putExtra == null) {
                cwhj.b("Intent is null", new Object[0]);
                return 2;
            }
            a2.startService(putExtra);
            return 0;
        }
        cwhj.b("Config is null", new Object[0]);
        tufVar = null;
        int b2 = tug.b(bundle.getInt("packageChange"));
        String string22 = bundle.getString("fixUuid");
        if (tufVar != null) {
        }
        cwhj.b("Null variables", new Object[0]);
        return 2;
    }
}
