package com.google.android.gms.chimera.container.boundservice;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.aoct;
import defpackage.bqon;
import defpackage.eike;
import defpackage.eito;
import defpackage.eits;
import defpackage.fmqj;
import defpackage.iln;
import java.util.Map;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class GmsProvidenceMigrationBroadcastReceiver extends TracingBroadcastReceiver {
    public static final eits a;
    static GmsProvidenceMigrationBroadcastReceiver b;
    private final Map c;

    static {
        eito eitoVar = new eito();
        eitoVar.i("com.google.android.gms.ads.AdRequestBrokerChimeraService", "com.google.android.gms.ads.AdRequestBrokerService");
        eitoVar.i("com.google.android.gms.ads.cache.CacheBrokerChimeraService", "com.google.android.gms.ads.cache.CacheBrokerService");
        eitoVar.i("com.google.android.gms.ads.measurement.GmpConversionTrackingBrokerChimeraService", "com.google.android.gms.ads.measurement.GmpConversionTrackingBrokerService");
        eitoVar.i("com.google.android.gms.appinvite.service.AppInviteChimeraService", "com.google.android.gms.appinvite.service.AppInviteService");
        eitoVar.i("com.google.android.gms.appstate.service.AppStateAndroidChimeraService", "com.google.android.gms.appstate.service.AppStateAndroidService");
        eitoVar.i("com.google.android.gms.auth.api.proxy.AuthChimeraService", "com.google.android.gms.auth.api.proxy.AuthService");
        eitoVar.i("com.google.android.gms.checkin.CheckinApiChimeraService", "com.google.android.gms.checkin.CheckinApiService");
        eitoVar.i("com.google.android.gms.fido.u2f.service.U2fChimeraService", "com.google.android.gms.fido.u2f.U2fService");
        eitoVar.i("com.google.android.gms.nearby.connection.service.NearbyConnectionsChimeraService", "com.google.android.gms.nearby.connection.service.NearbyConnectionsAndroidService");
        eitoVar.i("com.google.android.gms.googlehelp.service.GoogleHelpChimeraService", "com.google.android.gms.googlehelp.service.GoogleHelpService");
        eitoVar.i("com.google.android.gms.instantapps.service.InstantAppsChimeraService", "com.google.android.gms.instantapps.service.InstantAppsService");
        eitoVar.i("com.google.android.gms.measurement.service.ChimeraMeasurementApiService", "com.google.android.gms.measurement.service.MeasurementBrokerService");
        eitoVar.i("com.google.android.gms.wallet.service.PaymentChimeraService", "com.google.android.gms.wallet.service.PaymentService");
        eitoVar.i("com.google.firebase.auth.api.gms.service.FirebaseAuthChimeraService", "com.google.firebase.auth.api.gms.service.FirebaseAuthService");
        a = eitoVar.b();
        b = null;
    }

    private GmsProvidenceMigrationBroadcastReceiver() {
        super("container");
        this.c = bqon.a();
    }

    public static boolean b(Context context, String str, aoct aoctVar) {
        aoct aoctVar2;
        if (!fmqj.e()) {
            return true;
        }
        Context applicationContext = context.getApplicationContext();
        if (b == null) {
            GmsProvidenceMigrationBroadcastReceiver gmsProvidenceMigrationBroadcastReceiver = new GmsProvidenceMigrationBroadcastReceiver();
            b = gmsProvidenceMigrationBroadcastReceiver;
            iln.c(applicationContext, gmsProvidenceMigrationBroadcastReceiver, new IntentFilter("com.google.android.gms.core.PROVIDENCE_MIGRATION_UPDATE"), "com.google.android.gms.permission.INTERNAL_BROADCAST", null, 2);
        }
        if (!c(applicationContext, str, aoctVar) || ((aoctVar2 = (aoct) b.c.get(str)) != null && aoctVar2 != aoctVar)) {
            Log.i("ProvidenceMigrationBR", "Incorrect BoundService config state for ".concat(String.valueOf(str)));
            return false;
        }
        aoct aoctVar3 = (aoct) b.c.put(str, aoctVar);
        eike.a(aoctVar3 == null || aoctVar3 == aoctVar);
        return true;
    }

    private static boolean c(Context context, String str, aoct aoctVar) {
        String str2 = (String) a.get(str);
        eike.e(str2);
        try {
            int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, str2));
            if (componentEnabledSetting != 0) {
                if (componentEnabledSetting == 2) {
                    if (aoctVar != aoct.SHARED_BROKER) {
                        return false;
                    }
                } else if (componentEnabledSetting != 1 || aoctVar != aoct.DEDICATED_BROKER) {
                    return false;
                }
            }
            return true;
        } catch (IllegalArgumentException e) {
            Log.e("ProvidenceMigrationBR", "Cannot get proxy component status: ".concat(e.toString()));
            return true;
        }
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jz(Context context, Intent intent) {
        if (!"com.google.android.gms.core.PROVIDENCE_MIGRATION_UPDATE".equals(intent.getAction()) || !fmqj.e()) {
            Log.w("ProvidenceMigrationBR", "Skipping checking BoundService state");
            return;
        }
        for (Map.Entry entry : this.c.entrySet()) {
            if (!c(context, (String) entry.getKey(), (aoct) entry.getValue())) {
                Log.i("ProvidenceMigrationBR", "Killing process after changed BoundService config ".concat(String.valueOf((String) entry.getKey())));
                Process.killProcess(Process.myPid());
            }
        }
    }
}
