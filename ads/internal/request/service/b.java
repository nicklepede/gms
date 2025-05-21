package com.google.android.gms.ads.internal.request.service;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.telephony.TelephonyManager;
import com.google.android.gms.ads.internal.config.p;
import com.google.android.gms.ads.internal.util.m;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.asqh;
import defpackage.fyuu;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class b {
    private int a;
    private int b;
    private boolean c;
    private boolean d;
    private String e;
    private boolean f;
    private final boolean g;
    private boolean h;
    private String i;
    private String j;
    private float k;
    private int l;
    private int m;
    private String n;

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(1:3)(1:34)|4|(1:6)|7|(3:28|29|(7:31|10|11|12|(1:14)|16|(2:20|21)(1:23)))|9|10|11|12|(0)|16|(1:24)(3:18|20|21)) */
    /* JADX WARN: Removed duplicated region for block: B:14:0x009a A[Catch: Exception -> 0x00b0, TRY_LEAVE, TryCatch #0 {Exception -> 0x00b0, blocks: (B:12:0x008c, B:14:0x009a), top: B:11:0x008c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b(android.content.Context r7) {
        /*
            r6 = this;
            r6.<init>()
            android.content.pm.PackageManager r0 = r7.getPackageManager()
            com.google.android.gms.ads.internal.config.p.c(r7)
            d(r7)
            r6.c(r7)
            e(r7)
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r2 = "geo:0,0?q=donuts"
            android.content.pm.ResolveInfo r2 = b(r0, r2)
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L23
            r2 = r3
            goto L24
        L23:
            r2 = r4
        L24:
            r6.c = r2
            java.lang.String r2 = "http://www.google.com"
            android.content.pm.ResolveInfo r2 = b(r0, r2)
            if (r2 == 0) goto L2f
            goto L30
        L2f:
            r3 = r4
        L30:
            r6.d = r3
            java.lang.String r2 = r1.getCountry()
            r6.e = r2
            com.google.android.gms.ads.internal.c.e()
            com.google.android.gms.ads.internal.client.u.b()
            boolean r2 = com.google.android.gms.ads.internal.util.client.f.i()
            r6.f = r2
            boolean r2 = defpackage.asoe.h(r7)
            r6.g = r2
            boolean r2 = defpackage.asoe.c(r7)
            r6.h = r2
            java.lang.String r1 = r1.getLanguage()
            r6.i = r1
            java.lang.String r1 = "market://details?id=com.google.android.gms.ads"
            android.content.pm.ResolveInfo r0 = b(r0, r1)
            java.lang.String r1 = "."
            r2 = 0
            if (r0 != 0) goto L63
        L61:
            r0 = r2
            goto L8a
        L63:
            android.content.pm.ActivityInfo r0 = r0.activityInfo
            if (r0 != 0) goto L68
            goto L61
        L68:
            assw r3 = defpackage.assx.b(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            java.lang.String r5 = r0.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            android.content.pm.PackageInfo r3 = r3.f(r5, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            if (r3 == 0) goto L61
            int r3 = r3.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            java.lang.String r0 = r0.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            r4.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            r4.append(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            r4.append(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            r4.append(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            java.lang.String r0 = r4.toString()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
        L8a:
            r6.j = r0
            assw r0 = defpackage.assx.b(r7)     // Catch: java.lang.Exception -> Lb0
            java.lang.String r3 = "com.android.vending"
            r4 = 128(0x80, float:1.8E-43)
            android.content.pm.PackageInfo r0 = r0.f(r3, r4)     // Catch: java.lang.Exception -> Lb0
            if (r0 == 0) goto Lb0
            int r3 = r0.versionCode     // Catch: java.lang.Exception -> Lb0
            java.lang.String r0 = r0.packageName     // Catch: java.lang.Exception -> Lb0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lb0
            r4.<init>()     // Catch: java.lang.Exception -> Lb0
            r4.append(r3)     // Catch: java.lang.Exception -> Lb0
            r4.append(r1)     // Catch: java.lang.Exception -> Lb0
            r4.append(r0)     // Catch: java.lang.Exception -> Lb0
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Exception -> Lb0
        Lb0:
            r6.n = r2
            android.content.res.Resources r7 = r7.getResources()
            if (r7 != 0) goto Lb9
            goto Lcb
        Lb9:
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            if (r7 == 0) goto Lcb
            float r0 = r7.density
            r6.k = r0
            int r0 = r7.widthPixels
            r6.l = r0
            int r7 = r7.heightPixels
            r6.m = r7
        Lcb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.request.service.b.<init>(android.content.Context):void");
    }

    private static ResolveInfo b(PackageManager packageManager, String str) {
        try {
            return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.c.d().d(th, "DeviceInfo.getResolveInfo");
            return null;
        }
    }

    private final void c(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        telephonyManager.getNetworkOperator();
        this.b = (asqh.g() && ((Boolean) p.bi.g()).booleanValue()) ? 0 : telephonyManager.getNetworkType();
        telephonyManager.getPhoneType();
        this.a = -2;
        com.google.android.gms.ads.internal.c.e();
        if (m.i(context, "android.permission.ACCESS_NETWORK_STATE")) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                this.a = activeNetworkInfo.getType();
                activeNetworkInfo.getDetailedState().ordinal();
            } else {
                this.a = -1;
            }
            connectivityManager.isActiveNetworkMetered();
        }
    }

    private static final void d(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            try {
                audioManager.getMode();
                audioManager.isMusicActive();
                audioManager.isSpeakerphoneOn();
                audioManager.getStreamVolume(3);
                audioManager.getRingerMode();
                audioManager.getStreamVolume(2);
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.c.d().d(th, "DeviceInfo.gatherAudioInfo");
            }
        }
    }

    private static final void e(Context context) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        ((Boolean) p.bw.g()).booleanValue();
        Intent registerReceiver = context.registerReceiver(null, intentFilter);
        if (registerReceiver != null) {
            registerReceiver.getIntExtra("status", -1);
            registerReceiver.getIntExtra("level", -1);
            registerReceiver.getIntExtra("scale", -1);
        }
    }

    public final c a() {
        return new c(this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.n, this.a, this.b, this.k, this.l, this.m);
    }

    public b(Context context, c cVar) {
        p.c(context);
        d(context);
        c(context);
        e(context);
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
            int i = 0;
            ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE);
            if (queryIntentActivities != null && resolveActivity != null) {
                while (true) {
                    if (i >= queryIntentActivities.size()) {
                        break;
                    }
                    if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i).activityInfo.name)) {
                        resolveActivity.activityInfo.packageName.equals(fyuu.a(context));
                        break;
                    }
                    i++;
                }
            }
        }
        this.c = cVar.a;
        this.d = cVar.b;
        this.e = cVar.c;
        this.f = cVar.d;
        this.g = cVar.e;
        this.h = cVar.f;
        this.i = cVar.g;
        this.j = cVar.h;
        this.n = cVar.i;
        this.k = cVar.l;
        this.l = cVar.m;
        this.m = cVar.n;
    }
}
