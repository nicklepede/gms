package com.google.android.gms.mdm.services;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.location.Location;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.R;
import com.google.android.gms.mdm.receivers.ActivateDeviceAdminUponUnlockChimeraReceiver;
import defpackage.asbo;
import defpackage.cctl;
import defpackage.ccto;
import defpackage.cctu;
import defpackage.ccuh;
import defpackage.ccuo;
import defpackage.ccur;
import defpackage.ccut;
import defpackage.cczv;
import defpackage.cdab;
import defpackage.cdac;
import defpackage.cdag;
import defpackage.cdah;
import defpackage.cdaj;
import defpackage.cdak;
import defpackage.deqh;
import defpackage.dfee;
import defpackage.enss;
import defpackage.fihr;
import defpackage.fihs;
import defpackage.fihw;
import defpackage.fihz;
import defpackage.fiib;
import defpackage.fiif;
import defpackage.ikd;
import defpackage.jmr;
import defpackage.rnx;
import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class GcmReceiverChimeraService extends ccur {
    private boolean h;

    public GcmReceiverChimeraService() {
        super(cctl.a());
    }

    @Override // defpackage.ccur
    protected final enss b(fiib[] fiibVarArr, Location location, String str, fihw fihwVar) {
        ccto cctoVar = this.e;
        boolean v = ccur.v(fiibVarArr);
        fihs fihsVar = null;
        fihr a = (!((ccur) this).b || v) ? null : cdac.a(this);
        if (this.h && !v(fiibVarArr)) {
            fihsVar = cdab.b(this);
        }
        return cctoVar.a(fiibVarArr, location, a, fihsVar, str, fihwVar, cdab.a(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005b, code lost:
    
        if (r1 == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0037, code lost:
    
        if (((java.lang.Boolean) r5.invoke(r1, null)).booleanValue() != false) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0097  */
    @Override // defpackage.ccur
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void d() {
        /*
            r7 = this;
            java.lang.String r0 = "device_policy"
            java.lang.Object r0 = r7.getSystemService(r0)
            android.app.admin.DevicePolicyManager r0 = (android.app.admin.DevicePolicyManager) r0
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            r3 = 0
            if (r1 >= r2) goto L12
        Lf:
            r1 = r3
            goto L85
        L12:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            r4 = 0
            if (r1 >= r2) goto L4b
            java.lang.String r1 = "euicc_service"
            java.lang.Object r1 = r7.getSystemService(r1)     // Catch: java.lang.Exception -> L3a
            if (r1 == 0) goto Lf
            java.lang.Class r5 = r1.getClass()     // Catch: java.lang.Exception -> L3a
            java.lang.String r6 = "isEnabled"
            java.lang.reflect.Method r5 = r5.getMethod(r6, r4)     // Catch: java.lang.Exception -> L3a
            if (r5 == 0) goto Lf
            java.lang.Object r1 = r5.invoke(r1, r4)     // Catch: java.lang.Exception -> L3a
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Exception -> L3a
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Exception -> L3a
            if (r1 == 0) goto Lf
            goto L5e
        L3a:
            r1 = move-exception
            java.lang.String r2 = "ReflectiveOperationException in isEuiccEnabled: "
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r2.concat(r1)
            java.lang.Object[] r2 = new java.lang.Object[r3]
            defpackage.cdaj.d(r1, r2)
            goto Lf
        L4b:
            java.lang.String r1 = "euicc"
            java.lang.Object r1 = r7.getSystemService(r1)
            android.telephony.euicc.EuiccManager r1 = defpackage.ckd$$ExternalSyntheticApiModelOutline0.m220m(r1)
            if (r1 == 0) goto Lf
            boolean r1 = defpackage.ckd$$ExternalSyntheticApiModelOutline0.m224m(r1)
            if (r1 != 0) goto L5e
            goto Lf
        L5e:
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 >= r2) goto L84
            java.lang.Class r1 = r0.getClass()     // Catch: java.lang.Exception -> L73
            java.lang.String r2 = "WIPE_EUICC"
            java.lang.reflect.Field r1 = r1.getField(r2)     // Catch: java.lang.Exception -> L73
            if (r1 == 0) goto Lf
            int r1 = r1.getInt(r4)     // Catch: java.lang.Exception -> L73
            goto L85
        L73:
            r1 = move-exception
            java.lang.String r2 = "ReflectiveOperationException: "
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r2.concat(r1)
            java.lang.Object[] r2 = new java.lang.Object[r3]
            defpackage.cdaj.d(r1, r2)
            goto Lf
        L84:
            r1 = 4
        L85:
            java.lang.String r2 = "wipeEuiccFlag="
            java.lang.String r2 = defpackage.a.j(r1, r2)
            java.lang.Object[] r4 = new java.lang.Object[r3]
            defpackage.cdaj.c(r2, r4)
            boolean r2 = defpackage.asqh.f()
            r4 = 1
            if (r2 == 0) goto Le0
            frte r0 = defpackage.frte.a
            frtf r0 = r0.a()
            boolean r0 = r0.q()
            if (r0 == 0) goto Lbc
            java.lang.String r0 = "user"
            java.lang.Object r0 = r7.getSystemService(r0)
            android.os.UserManager r0 = (android.os.UserManager) r0
            if (r0 != 0) goto Lae
            goto Lbc
        Lae:
            boolean r0 = r0.isSystemUser()
            if (r0 != 0) goto Lbc
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r1 = "Wipe refused as sdk is Q+ and user is not system user."
            defpackage.cdaj.c(r1, r0)
            return
        Lbc:
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.FACTORY_RESET"
            r0.<init>(r1)
            r1 = 285212672(0x11000000, float:1.009742E-28)
            r0.addFlags(r1)
            java.lang.String r1 = "android.intent.extra.REASON"
            java.lang.String r2 = "Find My Device wiping device remotely"
            r0.putExtra(r1, r2)
            java.lang.String r1 = "android.intent.extra.WIPE_EXTERNAL_STORAGE"
            r0.putExtra(r1, r4)
            java.lang.String r1 = "com.android.internal.intent.extra.WIPE_ESIMS"
            r0.putExtra(r1, r4)
            r7.sendBroadcast(r0)
            defpackage.cczv.m()
            return
        Le0:
            r1 = r1 | r4
            r0.wipeData(r1)     // Catch: java.lang.SecurityException -> Le8
            defpackage.cczv.m()     // Catch: java.lang.SecurityException -> Le8
            return
        Le8:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r1 = "FMD does not own an active administrator that uses USES_POLICY_WIPE_DATA"
            defpackage.cdaj.d(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.mdm.services.GcmReceiverChimeraService.d():void");
    }

    @Override // defpackage.ccur
    protected final void e(fiif fiifVar) {
        ccut.c();
        Intent a = ccut.a(this, true, fiifVar);
        if (a != null) {
            startService(a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02e1  */
    @Override // defpackage.ccur
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void g(android.content.Intent r21) {
        /*
            Method dump skipped, instructions count: 1400
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.mdm.services.GcmReceiverChimeraService.g(android.content.Intent):void");
    }

    @Override // defpackage.ccur
    protected final void h(fihz fihzVar) {
        boolean z = fihzVar.i;
        if (cczv.k(this)) {
            e(fiif.DEVICE_ADMIN_ALREADY_ENABLED);
            j(fiib.REMIND_ALREADY_DEVICE_ADMINISTRATOR);
            cdaj.a("Device administrator is already enabled; not showing notification.", new Object[0]);
            return;
        }
        if (z) {
            ActivateDeviceAdminUponUnlockChimeraReceiver.a(true);
            j(fiib.SUCCESS);
            return;
        }
        Intent intent = new Intent("com.google.android.gms.settings.ADM_SETTINGS");
        intent.setComponent(new ComponentName(this, "com.google.android.gms.mdm.settings.AdmSettingsActivity"));
        intent.putExtra("show_device_admin", true);
        PendingIntent b = ccuh.b(intent, this);
        cdak.d(this);
        ikd b2 = cdak.b(this);
        b2.m(getString(R.string.common_mdm_feature_name));
        b2.l(getString(R.string.mdm_reminder_notification_text));
        b2.g = b;
        b2.k(true);
        b2.y = "recommendation";
        b2.z();
        asbo.f(this).w("mdm.notification_reminder", 1, dfee.SECURITY_FINDMYDEVICE_REMIND, b2.b());
        j(fiib.SUCCESS);
    }

    @Override // defpackage.ccur
    protected final void i() {
        cdaj.a("removeUser() called, but not supported on this form factor", new Object[0]);
        j(fiib.REMOVE_USER_NOT_SUPPORTED_FOR_DEVICE_TYPE);
    }

    @Override // defpackage.ccur
    protected final void k(fihz fihzVar) {
        this.h = fihzVar.k;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        if (r0 == 0) goto L16;
     */
    @Override // defpackage.ccur
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void l() {
        /*
            r7 = this;
            defpackage.cdak.d(r7)
            asbo r0 = defpackage.asbo.f(r7)
            java.lang.String r1 = "DEVICES_REBRANDED"
            r2 = 0
            if (r0 == 0) goto L39
            boolean r3 = defpackage.asqh.a()
            if (r3 != 0) goto L13
            goto L39
        L13:
            boolean r3 = r0.x()
            if (r3 != 0) goto L1a
            goto L2c
        L1a:
            boolean r3 = defpackage.asqh.c()
            if (r3 == 0) goto L39
            android.app.NotificationChannel r0 = r0.c(r1)
            if (r0 == 0) goto L2c
            int r0 = defpackage.abnj$$ExternalSyntheticApiModelOutline0.m(r0)
            if (r0 != 0) goto L39
        L2c:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r1 = "updates notification channel blocked, not showing TOS PROMPT notification."
            defpackage.cdaj.c(r1, r0)
            fiib r0 = defpackage.fiib.UPDATE_NOTIFICATION_CHANNEL_MUTED
            r7.j(r0)
            return
        L39:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r2 = "Showing TOS PROMPT notification."
            defpackage.cdaj.c(r2, r0)
            android.content.Context r0 = r7.getApplicationContext()
            java.lang.String r2 = r7.a
            java.lang.String r3 = "com.google.android.gms.mdm.notifications.actions.tos_prompt_click"
            android.app.PendingIntent r0 = defpackage.ccuh.a(r3, r0, r2)
            android.content.Context r2 = r7.getApplicationContext()
            java.lang.String r3 = r7.a
            java.lang.String r4 = "com.google.android.gms.mdm.notifications.actions.tos_prompt_dismiss"
            android.app.PendingIntent r2 = defpackage.ccuh.a(r4, r2, r3)
            android.content.Context r3 = r7.getApplicationContext()
            java.lang.String r4 = r7.a
            java.lang.String r5 = "com.google.android.gms.mdm.notifications.actions.tos_prompt_positive_button"
            android.app.PendingIntent r3 = defpackage.ccuh.a(r5, r3, r4)
            android.content.Context r4 = r7.getApplicationContext()
            java.lang.String r5 = r7.a
            java.lang.String r6 = "com.google.android.gms.mdm.notifications.actions.tos_prompt_negative_button"
            android.app.PendingIntent r4 = defpackage.ccuh.a(r6, r4, r5)
            int r5 = defpackage.cdak.a(r7)
            ikd r1 = defpackage.cdak.c(r7, r1)
            r6 = 2132088267(0x7f1515cb, float:1.9816813E38)
            java.lang.String r6 = r7.getString(r6)
            r1.m(r6)
            r6 = 2132088266(0x7f1515ca, float:1.981681E38)
            java.lang.String r6 = r7.getString(r6)
            r1.l(r6)
            r1.g = r0
            r0 = 1
            r1.k(r0)
            r1.o(r2)
            java.lang.String r2 = "recommendation"
            r1.y = r2
            r1.z()
            r2 = 2132088265(0x7f1515c9, float:1.9816809E38)
            java.lang.String r2 = r7.getString(r2)
            r1.h(r5, r2, r3)
            r2 = 2132088264(0x7f1515c8, float:1.9816807E38)
            java.lang.String r2 = r7.getString(r2)
            r1.h(r5, r2, r4)
            android.app.Notification r1 = r1.b()
            asbo r2 = defpackage.asbo.f(r7)
            dfee r3 = defpackage.dfee.SECURITY_FINDMYDEVICE_REMIND
            java.lang.String r4 = "mdm.notification_tos_update"
            r2.w(r4, r0, r3, r1)
            fiib r0 = defpackage.fiib.SUCCESS
            r7.j(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.mdm.services.GcmReceiverChimeraService.l():void");
    }

    @Override // defpackage.ccur
    protected final void m() {
        RingChimeraService.f(this, this.a, this.b, Boolean.valueOf(this.h), false);
    }

    @Override // defpackage.ccur
    protected final void n() {
        RingChimeraService.f(this, this.a, false, Boolean.valueOf(this.h), true);
    }

    @Override // defpackage.ccur
    protected final cctu p() {
        return new cctu();
    }

    @Override // defpackage.ccur
    protected final void s() {
        cdah a = cdah.a();
        cdag cdagVar = new cdag(this.a, this.b, this.h);
        ConcurrentHashMap concurrentHashMap = a.a;
        if (concurrentHashMap.size() < 10) {
            concurrentHashMap.put(cdagVar.a, cdagVar);
        } else if (!concurrentHashMap.containsKey(cdagVar.a)) {
            cdaj.a("Too many pending locate requests, start throttling.", new Object[0]);
            t(fiib.LOCATION_TIME_OUT);
            return;
        }
        String str = this.a;
        boolean z = this.b;
        boolean z2 = this.h;
        int i = LocateChimeraService.h;
        if (!ccuo.a.compareAndSet(false, true)) {
            Location location = (Location) cdah.a().b.get();
            if (location != null) {
                int i2 = rnx.a;
                u(fiib.SUCCESS, location, this.a);
                return;
            }
            return;
        }
        Intent startIntent = IntentOperation.getStartIntent(this, LocateChimeraService.class, "com.google.android.gms.mdm.services.LOCATE");
        startIntent.putExtra("echo_server_token", str);
        startIntent.putExtra("includeBatteryStatus", z);
        startIntent.putExtra("includeConnectivityStatus", z2);
        startIntent.putExtra("timeout", 60000L);
        int i3 = deqh.b;
        jmr.a(this, startIntent);
    }
}
