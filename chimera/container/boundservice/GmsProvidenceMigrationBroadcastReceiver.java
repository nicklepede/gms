package com.google.android.gms.chimera.container.boundservice;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.aqel;
import defpackage.bswd;
import defpackage.ekxj;
import defpackage.elgt;
import defpackage.elgx;
import defpackage.fpih;
import defpackage.ind;
import java.util.Map;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class GmsProvidenceMigrationBroadcastReceiver extends TracingBroadcastReceiver {
    public static final elgx a;
    static GmsProvidenceMigrationBroadcastReceiver b;
    private final Map c;

    static {
        elgt elgtVar = new elgt();
        elgtVar.i("com.google.android.gms.ads.AdRequestBrokerChimeraService", "com.google.android.gms.ads.AdRequestBrokerService");
        elgtVar.i("com.google.android.gms.ads.cache.CacheBrokerChimeraService", "com.google.android.gms.ads.cache.CacheBrokerService");
        elgtVar.i("com.google.android.gms.ads.measurement.GmpConversionTrackingBrokerChimeraService", "com.google.android.gms.ads.measurement.GmpConversionTrackingBrokerService");
        elgtVar.i("com.google.android.gms.appinvite.service.AppInviteChimeraService", "com.google.android.gms.appinvite.service.AppInviteService");
        elgtVar.i("com.google.android.gms.appstate.service.AppStateAndroidChimeraService", "com.google.android.gms.appstate.service.AppStateAndroidService");
        elgtVar.i("com.google.android.gms.auth.api.proxy.AuthChimeraService", "com.google.android.gms.auth.api.proxy.AuthService");
        elgtVar.i("com.google.android.gms.checkin.CheckinApiChimeraService", "com.google.android.gms.checkin.CheckinApiService");
        elgtVar.i("com.google.android.gms.fido.u2f.service.U2fChimeraService", "com.google.android.gms.fido.u2f.U2fService");
        elgtVar.i("com.google.android.gms.nearby.connection.service.NearbyConnectionsChimeraService", "com.google.android.gms.nearby.connection.service.NearbyConnectionsAndroidService");
        elgtVar.i("com.google.android.gms.googlehelp.service.GoogleHelpChimeraService", "com.google.android.gms.googlehelp.service.GoogleHelpService");
        elgtVar.i("com.google.android.gms.instantapps.service.InstantAppsChimeraService", "com.google.android.gms.instantapps.service.InstantAppsService");
        elgtVar.i("com.google.android.gms.measurement.service.ChimeraMeasurementApiService", "com.google.android.gms.measurement.service.MeasurementBrokerService");
        elgtVar.i("com.google.android.gms.wallet.service.PaymentChimeraService", "com.google.android.gms.wallet.service.PaymentService");
        elgtVar.i("com.google.firebase.auth.api.gms.service.FirebaseAuthChimeraService", "com.google.firebase.auth.api.gms.service.FirebaseAuthService");
        a = elgtVar.b();
        b = null;
    }

    private GmsProvidenceMigrationBroadcastReceiver() {
        super("container");
        this.c = bswd.a();
    }

    public static boolean b(Context context, String str, aqel aqelVar) {
        aqel aqelVar2;
        if (!fpih.e()) {
            return true;
        }
        Context applicationContext = context.getApplicationContext();
        if (b == null) {
            GmsProvidenceMigrationBroadcastReceiver gmsProvidenceMigrationBroadcastReceiver = new GmsProvidenceMigrationBroadcastReceiver();
            b = gmsProvidenceMigrationBroadcastReceiver;
            ind.c(applicationContext, gmsProvidenceMigrationBroadcastReceiver, new IntentFilter("com.google.android.gms.core.PROVIDENCE_MIGRATION_UPDATE"), "com.google.android.gms.permission.INTERNAL_BROADCAST", null, 2);
        }
        if (!c(applicationContext, str, aqelVar) || ((aqelVar2 = (aqel) b.c.get(str)) != null && aqelVar2 != aqelVar)) {
            Log.i("ProvidenceMigrationBR", "Incorrect BoundService config state for ".concat(String.valueOf(str)));
            return false;
        }
        aqel aqelVar3 = (aqel) b.c.put(str, aqelVar);
        ekxj.a(aqelVar3 == null || aqelVar3 == aqelVar);
        return true;
    }

    private static boolean c(Context context, String str, aqel aqelVar) {
        String str2 = (String) a.get(str);
        ekxj.e(str2);
        try {
            int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, str2));
            if (componentEnabledSetting != 0) {
                if (componentEnabledSetting == 2) {
                    if (aqelVar != aqel.SHARED_BROKER) {
                        return false;
                    }
                } else if (componentEnabledSetting != 1 || aqelVar != aqel.DEDICATED_BROKER) {
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
    public final void jP(Context context, Intent intent) {
        if (!"com.google.android.gms.core.PROVIDENCE_MIGRATION_UPDATE".equals(intent.getAction()) || !fpih.e()) {
            Log.w("ProvidenceMigrationBR", "Skipping checking BoundService state");
            return;
        }
        for (Map.Entry entry : this.c.entrySet()) {
            if (!c(context, (String) entry.getKey(), (aqel) entry.getValue())) {
                Log.i("ProvidenceMigrationBR", "Killing process after changed BoundService config ".concat(String.valueOf((String) entry.getKey())));
                Process.killProcess(Process.myPid());
            }
        }
    }
}
