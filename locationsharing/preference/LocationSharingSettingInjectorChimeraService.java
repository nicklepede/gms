package com.google.android.gms.locationsharing.preference;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.preference.PreferenceManager;
import com.google.android.cast.JGCastService;
import com.google.android.chimera.SettingInjectorService;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.asxd;
import defpackage.auid;
import defpackage.auqx;
import defpackage.ausn;
import defpackage.autl;
import defpackage.auub;
import defpackage.bsxr;
import defpackage.eluo;
import defpackage.fsls;
import defpackage.ind;
import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class LocationSharingSettingInjectorChimeraService extends SettingInjectorService {
    public boolean b;
    public boolean c;
    public boolean d;
    public long e;
    public final Semaphore f;
    private String j;
    private Boolean k;
    private Boolean l;
    private final TracingBroadcastReceiver m;
    private static final ausn h = ausn.e(auid.LOCATION_SHARING);
    public static final String a = String.valueOf(LocationSharingSettingInjectorChimeraService.class.getName()).concat(".CALL_COMPLETE");
    private static final String i = String.valueOf(LocationSharingSettingInjectorChimeraService.class.getName()).concat(".request_id");
    public static bsxr g = null;

    public LocationSharingSettingInjectorChimeraService() {
        super("LocationSharingSettingInjectorService");
        this.k = null;
        this.l = null;
        this.f = new Semaphore(1, true);
        this.m = new TracingBroadcastReceiver() { // from class: com.google.android.gms.locationsharing.preference.LocationSharingSettingInjectorChimeraService.1
            @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
            public final void jP(Context context, Intent intent) {
                LocationSharingSettingInjectorChimeraService locationSharingSettingInjectorChimeraService = LocationSharingSettingInjectorChimeraService.this;
                if (locationSharingSettingInjectorChimeraService.a()) {
                    if (!LocationSharingSettingInjectorChimeraService.a.equals(intent.getAction())) {
                        return;
                    }
                    if (getResultCode() == 0) {
                        locationSharingSettingInjectorChimeraService.b = false;
                        locationSharingSettingInjectorChimeraService.c = intent.getBooleanExtra("is_effectively_sharing", false);
                        locationSharingSettingInjectorChimeraService.d = true;
                        locationSharingSettingInjectorChimeraService.e = System.currentTimeMillis();
                    } else {
                        locationSharingSettingInjectorChimeraService.b = true;
                    }
                }
                locationSharingSettingInjectorChimeraService.f.release();
                SettingInjectorService.refreshSettings(locationSharingSettingInjectorChimeraService.getApplicationContext());
            }
        };
    }

    private final void b() {
        if (a() && auub.f()) {
            List h2 = auqx.h(this, getPackageName());
            if (h2.size() != 1 || ((Account) h2.get(0)).name == null) {
                return;
            }
            String str = ((Account) h2.get(0)).name;
            try {
                if (this.f.tryAcquire(100L, TimeUnit.MILLISECONDS)) {
                    if (this.d) {
                        long currentTimeMillis = System.currentTimeMillis() - this.e;
                        if (!PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getBoolean("has_recently_viewed_location_sharing_settings:".concat(String.valueOf(str)), false) && currentTimeMillis < 2000) {
                            this.f.release();
                            return;
                        }
                    }
                    PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).edit().putBoolean("has_recently_viewed_location_sharing_settings:".concat(String.valueOf(str)), false).commit();
                    this.d = false;
                    this.b = false;
                    if (a()) {
                        PendingIntent broadcast = PendingIntent.getBroadcast(this, 0, new Intent(a).setPackage(getPackageName()), JGCastService.FLAG_PRIVATE_DISPLAY);
                        Intent intent = new Intent("com.google.android.gms.social.location.activity.service.START");
                        intent.setPackage("com.google.android.gms");
                        intent.putExtra("account_name", str);
                        intent.putExtra("extra_pending_intent", broadcast);
                        intent.putExtra(i, 0);
                        intent.putExtra("is_called_from_settings", true);
                        startService(intent);
                    }
                }
            } catch (InterruptedException e) {
                ((eluo) ((eluo) h.h()).s(e)).x("lookupSharingState interrupted: ");
            }
        }
    }

    private final synchronized boolean c() {
        if (this.k == null) {
            this.k = Boolean.valueOf(fsls.a.lK().b());
        }
        return this.k.booleanValue();
    }

    public final synchronized boolean a() {
        if (this.l == null) {
            this.l = Boolean.valueOf(fsls.d());
        }
        return this.l.booleanValue();
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        if (a()) {
            ind.b(this, this.m, new IntentFilter(a), 2);
            b();
        }
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        super.onDestroy();
        if (a()) {
            try {
                unregisterReceiver(this.m);
            } catch (IllegalArgumentException e) {
                ((eluo) ((eluo) h.h()).s(e)).x("onDestroy error in unregisterReceiver");
            }
        }
    }

    @Override // com.google.android.chimera.SettingInjectorService
    public final boolean onGetEnabled() {
        if (!autl.c(this)) {
            return false;
        }
        int i2 = auqx.a;
        return !asxd.g(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0091  */
    @Override // com.google.android.chimera.SettingInjectorService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String onGetSummary() {
        /*
            r8 = this;
            boolean r0 = r8.a()
            if (r0 == 0) goto L9
            r8.b()
        L9:
            boolean r0 = defpackage.auub.f()
            r1 = 0
            if (r0 == 0) goto L97
            boolean r0 = r8.a()
            if (r0 != 0) goto L18
            goto L97
        L18:
            java.lang.String r0 = r8.getPackageName()
            java.util.List r0 = defpackage.auqx.h(r8, r0)
            int r0 = r0.size()
            r2 = 1
            if (r0 == r2) goto L29
            goto L97
        L29:
            r0 = 0
            java.util.concurrent.Semaphore r3 = r8.f     // Catch: java.lang.Throwable -> L74 java.lang.InterruptedException -> L78
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L74 java.lang.InterruptedException -> L78
            r5 = 100
            boolean r0 = r3.tryAcquire(r5, r4)     // Catch: java.lang.Throwable -> L74 java.lang.InterruptedException -> L78
            if (r0 == 0) goto L97
            boolean r0 = r8.b     // Catch: java.lang.Throwable -> L70 java.lang.InterruptedException -> L72
            if (r0 == 0) goto L3e
        L3a:
            r3.release()
            goto L97
        L3e:
            boolean r0 = r8.c()     // Catch: java.lang.Throwable -> L70 java.lang.InterruptedException -> L72
            if (r0 == 0) goto L59
            boolean r0 = r8.c     // Catch: java.lang.Throwable -> L70 java.lang.InterruptedException -> L72
            if (r0 == 0) goto L50
            r0 = 2132084771(0x7f150823, float:1.9809722E38)
            java.lang.String r0 = r8.getString(r0)     // Catch: java.lang.Throwable -> L70 java.lang.InterruptedException -> L72
            goto L57
        L50:
            r0 = 2132084768(0x7f150820, float:1.9809716E38)
            java.lang.String r0 = r8.getString(r0)     // Catch: java.lang.Throwable -> L70 java.lang.InterruptedException -> L72
        L57:
            r1 = r0
            goto L3a
        L59:
            boolean r0 = r8.c     // Catch: java.lang.Throwable -> L70 java.lang.InterruptedException -> L72
            if (r0 == 0) goto L65
            r0 = 2132088094(0x7f15151e, float:1.9816462E38)
            java.lang.String r0 = r8.getString(r0)     // Catch: java.lang.Throwable -> L70 java.lang.InterruptedException -> L72
            goto L6c
        L65:
            r0 = 2132088093(0x7f15151d, float:1.981646E38)
            java.lang.String r0 = r8.getString(r0)     // Catch: java.lang.Throwable -> L70 java.lang.InterruptedException -> L72
        L6c:
            r1 = r0
            java.util.concurrent.Semaphore r0 = r8.f
            goto L8b
        L70:
            r0 = move-exception
            goto L8f
        L72:
            r0 = move-exception
            goto L7c
        L74:
            r1 = move-exception
            r2 = r0
            r0 = r1
            goto L8f
        L78:
            r2 = move-exception
            r7 = r2
            r2 = r0
            r0 = r7
        L7c:
            ausn r3 = com.google.android.gms.locationsharing.preference.LocationSharingSettingInjectorChimeraService.h     // Catch: java.lang.Throwable -> L70
            eltz r3 = r3.h()     // Catch: java.lang.Throwable -> L70
            java.lang.String r4 = "getSummary interrupted"
            defpackage.a.S(r3, r4, r0)     // Catch: java.lang.Throwable -> L70
            if (r2 == 0) goto L97
            java.util.concurrent.Semaphore r0 = r8.f
        L8b:
            r0.release()
            goto L97
        L8f:
            if (r2 == 0) goto L96
            java.util.concurrent.Semaphore r1 = r8.f
            r1.release()
        L96:
            throw r0
        L97:
            r8.j = r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.locationsharing.preference.LocationSharingSettingInjectorChimeraService.onGetSummary():java.lang.String");
    }
}
