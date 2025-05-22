package com.google.android.gms.mdm.services;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.location.Location;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.R;
import com.google.android.gms.mdm.receivers.ActivateDeviceAdminUponUnlockChimeraReceiver;
import defpackage.aued;
import defpackage.cfcf;
import defpackage.cfci;
import defpackage.cfco;
import defpackage.cfdb;
import defpackage.cfdi;
import defpackage.cfdl;
import defpackage.cfdn;
import defpackage.cfiv;
import defpackage.cfjb;
import defpackage.cfjc;
import defpackage.cfjg;
import defpackage.cfjh;
import defpackage.cfjj;
import defpackage.cfjk;
import defpackage.dhbk;
import defpackage.dhpk;
import defpackage.eqgl;
import defpackage.fkxo;
import defpackage.fkxp;
import defpackage.fkxt;
import defpackage.fkxw;
import defpackage.fkxy;
import defpackage.fkyc;
import defpackage.ilt;
import defpackage.jtg;
import defpackage.thb;
import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class GcmReceiverChimeraService extends cfdl {
    private boolean h;

    public GcmReceiverChimeraService() {
        super(cfcf.a());
    }

    @Override // defpackage.cfdl
    protected final eqgl b(fkxy[] fkxyVarArr, Location location, String str, fkxt fkxtVar) {
        cfci cfciVar = this.e;
        boolean v = cfdl.v(fkxyVarArr);
        fkxp fkxpVar = null;
        fkxo a = (!((cfdl) this).b || v) ? null : cfjc.a(this);
        if (this.h && !v(fkxyVarArr)) {
            fkxpVar = cfjb.b(this);
        }
        return cfciVar.a(fkxyVarArr, location, a, fkxpVar, str, fkxtVar, cfjb.a(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005b, code lost:
    
        if (r1 == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0037, code lost:
    
        if (((java.lang.Boolean) r5.invoke(r1, null)).booleanValue() != false) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0097  */
    @Override // defpackage.cfdl
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
            defpackage.cfjj.d(r1, r2)
            goto Lf
        L4b:
            java.lang.String r1 = "euicc"
            java.lang.Object r1 = r7.getSystemService(r1)
            android.telephony.euicc.EuiccManager r1 = defpackage.ckr$$ExternalSyntheticApiModelOutline0.m215m(r1)
            if (r1 == 0) goto Lf
            boolean r1 = defpackage.ckr$$ExternalSyntheticApiModelOutline0.m219m(r1)
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
            defpackage.cfjj.d(r1, r2)
            goto Lf
        L84:
            r1 = 4
        L85:
            java.lang.String r2 = "wipeEuiccFlag="
            java.lang.String r2 = defpackage.a.j(r1, r2)
            java.lang.Object[] r4 = new java.lang.Object[r3]
            defpackage.cfjj.c(r2, r4)
            boolean r2 = defpackage.auub.f()
            r4 = 1
            if (r2 == 0) goto Le0
            funx r0 = defpackage.funx.a
            funy r0 = r0.lK()
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
            defpackage.cfjj.c(r1, r0)
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
            defpackage.cfiv.m()
            return
        Le0:
            r1 = r1 | r4
            r0.wipeData(r1)     // Catch: java.lang.SecurityException -> Le8
            defpackage.cfiv.m()     // Catch: java.lang.SecurityException -> Le8
            return
        Le8:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r1 = "FMD does not own an active administrator that uses USES_POLICY_WIPE_DATA"
            defpackage.cfjj.d(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.mdm.services.GcmReceiverChimeraService.d():void");
    }

    @Override // defpackage.cfdl
    protected final void e(fkyc fkycVar) {
        cfdn.c();
        Intent a = cfdn.a(this, true, fkycVar);
        if (a != null) {
            startService(a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02c3  */
    @Override // defpackage.cfdl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void g(android.content.Intent r20) {
        /*
            Method dump skipped, instructions count: 1364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.mdm.services.GcmReceiverChimeraService.g(android.content.Intent):void");
    }

    @Override // defpackage.cfdl
    protected final void h(fkxw fkxwVar) {
        boolean z = fkxwVar.i;
        if (cfiv.k(this)) {
            e(fkyc.DEVICE_ADMIN_ALREADY_ENABLED);
            j(fkxy.REMIND_ALREADY_DEVICE_ADMINISTRATOR);
            cfjj.a("Device administrator is already enabled; not showing notification.", new Object[0]);
            return;
        }
        if (z) {
            ActivateDeviceAdminUponUnlockChimeraReceiver.a(true);
            j(fkxy.SUCCESS);
            return;
        }
        Intent intent = new Intent("com.google.android.gms.settings.ADM_SETTINGS");
        intent.setComponent(new ComponentName(this, "com.google.android.gms.mdm.settings.AdmSettingsActivity"));
        intent.putExtra("show_device_admin", true);
        PendingIntent b = cfdb.b(intent, this);
        cfjk.d(this);
        ilt b2 = cfjk.b(this);
        b2.r(getString(R.string.common_mdm_feature_name));
        b2.j(getString(R.string.mdm_reminder_notification_text));
        b2.g = b;
        b2.i(true);
        b2.y = "recommendation";
        b2.A();
        aued.f(this).w("mdm.notification_reminder", 1, dhpk.SECURITY_FINDMYDEVICE_REMIND, b2.b());
        j(fkxy.SUCCESS);
    }

    @Override // defpackage.cfdl
    protected final void i() {
        cfjj.a("removeUser() called, but not supported on this form factor", new Object[0]);
        j(fkxy.REMOVE_USER_NOT_SUPPORTED_FOR_DEVICE_TYPE);
    }

    @Override // defpackage.cfdl
    protected final void k(fkxw fkxwVar) {
        this.h = fkxwVar.k;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        if (r0 == 0) goto L16;
     */
    @Override // defpackage.cfdl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void l() {
        /*
            r7 = this;
            defpackage.cfjk.d(r7)
            aued r0 = defpackage.aued.f(r7)
            java.lang.String r1 = "DEVICES_REBRANDED"
            r2 = 0
            if (r0 == 0) goto L39
            boolean r3 = defpackage.auub.a()
            if (r3 != 0) goto L13
            goto L39
        L13:
            boolean r3 = r0.x()
            if (r3 != 0) goto L1a
            goto L2c
        L1a:
            boolean r3 = defpackage.auub.c()
            if (r3 == 0) goto L39
            android.app.NotificationChannel r0 = r0.c(r1)
            if (r0 == 0) goto L2c
            int r0 = defpackage.abnm$$ExternalSyntheticApiModelOutline0.m(r0)
            if (r0 != 0) goto L39
        L2c:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r1 = "updates notification channel blocked, not showing TOS PROMPT notification."
            defpackage.cfjj.c(r1, r0)
            fkxy r0 = defpackage.fkxy.UPDATE_NOTIFICATION_CHANNEL_MUTED
            r7.j(r0)
            return
        L39:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r2 = "Showing TOS PROMPT notification."
            defpackage.cfjj.c(r2, r0)
            android.content.Context r0 = r7.getApplicationContext()
            java.lang.String r2 = r7.a
            java.lang.String r3 = "com.google.android.gms.mdm.notifications.actions.tos_prompt_click"
            android.app.PendingIntent r0 = defpackage.cfdb.a(r3, r0, r2)
            android.content.Context r2 = r7.getApplicationContext()
            java.lang.String r3 = r7.a
            java.lang.String r4 = "com.google.android.gms.mdm.notifications.actions.tos_prompt_dismiss"
            android.app.PendingIntent r2 = defpackage.cfdb.a(r4, r2, r3)
            android.content.Context r3 = r7.getApplicationContext()
            java.lang.String r4 = r7.a
            java.lang.String r5 = "com.google.android.gms.mdm.notifications.actions.tos_prompt_positive_button"
            android.app.PendingIntent r3 = defpackage.cfdb.a(r5, r3, r4)
            android.content.Context r4 = r7.getApplicationContext()
            java.lang.String r5 = r7.a
            java.lang.String r6 = "com.google.android.gms.mdm.notifications.actions.tos_prompt_negative_button"
            android.app.PendingIntent r4 = defpackage.cfdb.a(r6, r4, r5)
            int r5 = defpackage.cfjk.a(r7)
            ilt r1 = defpackage.cfjk.c(r7, r1)
            r6 = 2132088389(0x7f151645, float:1.981706E38)
            java.lang.String r6 = r7.getString(r6)
            r1.r(r6)
            r6 = 2132088388(0x7f151644, float:1.9817058E38)
            java.lang.String r6 = r7.getString(r6)
            r1.j(r6)
            r1.g = r0
            r0 = 1
            r1.i(r0)
            r1.k(r2)
            java.lang.String r2 = "recommendation"
            r1.y = r2
            r1.A()
            r2 = 2132088387(0x7f151643, float:1.9817056E38)
            java.lang.String r2 = r7.getString(r2)
            r1.e(r5, r2, r3)
            r2 = 2132088386(0x7f151642, float:1.9817054E38)
            java.lang.String r2 = r7.getString(r2)
            r1.e(r5, r2, r4)
            android.app.Notification r1 = r1.b()
            aued r2 = defpackage.aued.f(r7)
            dhpk r3 = defpackage.dhpk.SECURITY_FINDMYDEVICE_REMIND
            java.lang.String r4 = "mdm.notification_tos_update"
            r2.w(r4, r0, r3, r1)
            fkxy r0 = defpackage.fkxy.SUCCESS
            r7.j(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.mdm.services.GcmReceiverChimeraService.l():void");
    }

    @Override // defpackage.cfdl
    protected final void m() {
        RingChimeraService.f(this, this.a, this.b, Boolean.valueOf(this.h), false);
    }

    @Override // defpackage.cfdl
    protected final void n() {
        RingChimeraService.f(this, this.a, false, Boolean.valueOf(this.h), true);
    }

    @Override // defpackage.cfdl
    protected final cfco p() {
        return new cfco();
    }

    @Override // defpackage.cfdl
    protected final void s() {
        cfjh a = cfjh.a();
        cfjg cfjgVar = new cfjg(this.a, this.b, this.h);
        ConcurrentHashMap concurrentHashMap = a.a;
        if (concurrentHashMap.size() < 10) {
            concurrentHashMap.put(cfjgVar.a, cfjgVar);
        } else if (!concurrentHashMap.containsKey(cfjgVar.a)) {
            cfjj.a("Too many pending locate requests, start throttling.", new Object[0]);
            t(fkxy.LOCATION_TIME_OUT);
            return;
        }
        String str = this.a;
        boolean z = this.b;
        boolean z2 = this.h;
        int i = LocateChimeraService.h;
        if (!cfdi.a.compareAndSet(false, true)) {
            Location location = (Location) cfjh.a().b.get();
            if (location != null) {
                int i2 = thb.a;
                u(fkxy.SUCCESS, location, this.a);
                return;
            }
            return;
        }
        Intent startIntent = IntentOperation.getStartIntent(this, LocateChimeraService.class, "com.google.android.gms.mdm.services.LOCATE");
        startIntent.putExtra("echo_server_token", str);
        startIntent.putExtra("includeBatteryStatus", z);
        startIntent.putExtra("includeConnectivityStatus", z2);
        startIntent.putExtra("timeout", 60000L);
        int i3 = dhbk.b;
        jtg.a(this, startIntent);
    }
}
